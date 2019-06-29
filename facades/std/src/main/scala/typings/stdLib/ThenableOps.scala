package typings.stdLib

import scala.language.higherKinds
import scala.scalajs.js
import scala.scalajs.js.Thenable

object ThenableOps {
  case class WrapperException(jsError: Any) extends Exception

  implicit class ThenableToFutureOps[T](val thenable: js.Thenable[T]) {
    def asFuture: concurrent.Future[T] = {
      val p = concurrent.Promise[T]()

      thenable.`then`[Unit](
        (t: T) => p.success(t): Unit,
        js.defined({
          case util.control.NonFatal(th) => p.failure(th):                      Unit
          case other                     => p.failure(WrapperException(other)): Unit
        })
      )

      p.future
    }
  }

  /** A lot could be said about this.
    * I say that it has less maddening type inference than `Thenable.then`
    */
  @deprecated("Use `asFuture` instead for a sane API", "2019-07-30")
  @inline implicit final class ThenableOps[M[t] <: Thenable[t], T](val mt: M[T]) extends AnyVal {
    @inline def flatMap[U](f: js.Function1[T, Thenable[U]]): M[U] =
      mt.asInstanceOf[js.Dynamic].`then`(f).asInstanceOf[M[U]]

    @inline def map[U](f: js.Function1[T, U]): M[U] =
      mt.asInstanceOf[js.Dynamic].`then`(f).asInstanceOf[M[U]]

    @inline def foreach(f: js.Function1[T, Unit]): Unit =
      mt.asInstanceOf[js.Dynamic].`then`(f)

    @inline def assertType[U]: M[U] = mt.asInstanceOf[M[U]]
  }
}

package typings
package fpDashTsLib.libMonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libMonadMod.Monad1[M] {
  /** @deprecated */
  def fromEither[E, A](e: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.Kind[M, A]
  /** @deprecated */
  def fromOption[E, A](o: fpDashTsLib.libOptionMod.Option[A], e: E): fpDashTsLib.libHKTMod.Kind[M, A]
  def throwError[E, A](e: E): fpDashTsLib.libHKTMod.Kind[M, A]
}

object MonadThrow1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Kind[M, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind[M, js.Any]) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind[M, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[M, js.Any]]) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    fromEither: fpDashTsLib.libEitherMod.Either[js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    fromOption: (fpDashTsLib.libOptionMod.Option[js.Any], js.Any) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind[M, js.Any],
    throwError: js.Any => fpDashTsLib.libHKTMod.Kind[M, js.Any]
  ): MonadThrow1[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow1[M]]
  }
}


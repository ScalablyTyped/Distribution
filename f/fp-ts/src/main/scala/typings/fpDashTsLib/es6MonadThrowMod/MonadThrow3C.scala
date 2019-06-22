package typings
package fpDashTsLib.es6MonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow3C[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, E]
  extends fpDashTsLib.es6MonadMod.Monad3C[M, U, E] {
  /** @deprecated */
  def fromEither[A](e: fpDashTsLib.es6EitherMod.Either[E, A]): fpDashTsLib.es6HKTMod.Kind3[M, U, E, A]
  /** @deprecated */
  def fromOption[A](o: fpDashTsLib.es6OptionMod.Option[A], e: E): fpDashTsLib.es6HKTMod.Kind3[M, U, E, A]
  def throwError[A](e: E): fpDashTsLib.es6HKTMod.Kind3[M, U, E, A]
}

object MonadThrow3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, E](
    URI: M,
    _L: E,
    _U: U,
    ap: (fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any],
    fromEither: fpDashTsLib.es6EitherMod.Either[E, js.Any] => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any],
    fromOption: (fpDashTsLib.es6OptionMod.Option[js.Any], E) => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any],
    throwError: E => fpDashTsLib.es6HKTMod.Kind3[M, U, E, js.Any]
  ): MonadThrow3C[M, U, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow3C[M, U, E]]
  }
}


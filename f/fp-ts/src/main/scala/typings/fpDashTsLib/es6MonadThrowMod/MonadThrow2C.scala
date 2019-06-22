package typings
package fpDashTsLib.es6MonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow2C[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, E]
  extends fpDashTsLib.es6MonadMod.Monad2C[M, E] {
  /** @deprecated */
  def fromEither[A](e: fpDashTsLib.es6EitherMod.Either[E, A]): fpDashTsLib.es6HKTMod.Kind2[M, E, A]
  /** @deprecated */
  def fromOption[A](o: fpDashTsLib.es6OptionMod.Option[A], e: E): fpDashTsLib.es6HKTMod.Kind2[M, E, A]
  def throwError[A](e: E): fpDashTsLib.es6HKTMod.Kind2[M, E, A]
}

object MonadThrow2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS2 */, E](
    URI: M,
    _L: E,
    ap: (fpDashTsLib.es6HKTMod.Kind2[M, E, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any],
    fromEither: fpDashTsLib.es6EitherMod.Either[E, js.Any] => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any],
    fromOption: (fpDashTsLib.es6OptionMod.Option[js.Any], E) => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any],
    throwError: E => fpDashTsLib.es6HKTMod.Kind2[M, E, js.Any]
  ): MonadThrow2C[M, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow2C[M, E]]
  }
}


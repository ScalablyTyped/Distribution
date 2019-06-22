package typings
package fpDashTsLib.es6MonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow3[M /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6MonadMod.Monad3[M] {
  /** @deprecated */
  def fromEither[U, E, A](e: fpDashTsLib.es6EitherMod.Either[E, A]): fpDashTsLib.es6HKTMod.Kind3[M, U, E, A]
  /** @deprecated */
  def fromOption[U, E, A](o: fpDashTsLib.es6OptionMod.Option[A], e: E): fpDashTsLib.es6HKTMod.Kind3[M, U, E, A]
  def throwError[U, E, A](e: E): fpDashTsLib.es6HKTMod.Kind3[M, U, E, A]
}

object MonadThrow3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    fromEither: fpDashTsLib.es6EitherMod.Either[js.Any, js.Any] => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    fromOption: (fpDashTsLib.es6OptionMod.Option[js.Any], js.Any) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any],
    throwError: js.Any => fpDashTsLib.es6HKTMod.Kind3[M, js.Any, js.Any, js.Any]
  ): MonadThrow3[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow3[M]]
  }
}


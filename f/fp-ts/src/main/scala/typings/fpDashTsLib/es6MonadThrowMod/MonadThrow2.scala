package typings
package fpDashTsLib.es6MonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow2[M /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6MonadMod.Monad2[M] {
  def fromEither[E, A](e: fpDashTsLib.es6EitherMod.Either[E, A]): fpDashTsLib.es6HKTMod.Type2[M, E, A]
  def fromOption[E, A](o: fpDashTsLib.es6OptionMod.Option[A], e: E): fpDashTsLib.es6HKTMod.Type2[M, E, A]
  def throwError[E, A](e: E): fpDashTsLib.es6HKTMod.Type2[M, E, A]
}

object MonadThrow2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any],
    chain: (fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any],
    fromEither: fpDashTsLib.es6EitherMod.Either[js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any],
    fromOption: (fpDashTsLib.es6OptionMod.Option[js.Any], js.Any) => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any],
    map: (fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any],
    throwError: js.Any => fpDashTsLib.es6HKTMod.Type2[M, js.Any, js.Any]
  ): MonadThrow2[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow2[M]]
  }
}


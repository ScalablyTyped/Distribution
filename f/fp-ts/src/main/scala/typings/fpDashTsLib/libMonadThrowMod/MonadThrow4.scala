package typings
package fpDashTsLib.libMonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow4[M /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libMonadMod.Monad4[M] {
  /** @deprecated */
  def fromEither[X, U, E, A](e: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.Kind4[M, X, U, E, A]
  /** @deprecated */
  def fromOption[X, U, E, A](o: fpDashTsLib.libOptionMod.Option[A], e: E): fpDashTsLib.libHKTMod.Kind4[M, X, U, E, A]
  def throwError[X, U, E, A](e: E): fpDashTsLib.libHKTMod.Kind4[M, X, U, E, A]
}

object MonadThrow4 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    fromEither: fpDashTsLib.libEitherMod.Either[js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    fromOption: (fpDashTsLib.libOptionMod.Option[js.Any], js.Any) => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any],
    throwError: js.Any => fpDashTsLib.libHKTMod.Kind4[M, js.Any, js.Any, js.Any, js.Any]
  ): MonadThrow4[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow4[M]]
  }
}


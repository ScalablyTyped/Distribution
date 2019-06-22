package typings
package fpDashTsLib.libMonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libMonadMod.Monad2[M] {
  /** @deprecated */
  def fromEither[E, A](e: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.Kind2[M, E, A]
  /** @deprecated */
  def fromOption[E, A](o: fpDashTsLib.libOptionMod.Option[A], e: E): fpDashTsLib.libHKTMod.Kind2[M, E, A]
  def throwError[E, A](e: E): fpDashTsLib.libHKTMod.Kind2[M, E, A]
}

object MonadThrow2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    fromEither: fpDashTsLib.libEitherMod.Either[js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    fromOption: (fpDashTsLib.libOptionMod.Option[js.Any], js.Any) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any],
    throwError: js.Any => fpDashTsLib.libHKTMod.Kind2[M, js.Any, js.Any]
  ): MonadThrow2[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow2[M]]
  }
}


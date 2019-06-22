package typings
package fpDashTsLib.libMonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow[M]
  extends fpDashTsLib.libMonadMod.Monad[M] {
  /** @deprecated */
  def fromEither[E, A](e: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.HKT[M, A]
  /** @deprecated */
  def fromOption[E, A](o: fpDashTsLib.libOptionMod.Option[A], e: E): fpDashTsLib.libHKTMod.HKT[M, A]
  def throwError[E, A](e: E): fpDashTsLib.libHKTMod.HKT[M, A]
}

object MonadThrow {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.HKT[M, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.HKT[M, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    chain: (fpDashTsLib.libHKTMod.HKT[M, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    fromEither: fpDashTsLib.libEitherMod.Either[js.Any, js.Any] => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    fromOption: (fpDashTsLib.libOptionMod.Option[js.Any], js.Any) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.HKT[M, js.Any],
    throwError: js.Any => fpDashTsLib.libHKTMod.HKT[M, js.Any]
  ): MonadThrow[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow[M]]
  }
}


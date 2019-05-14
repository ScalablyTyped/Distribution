package typings
package fpDashTsLib.libMonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow[M] extends js.Object {
  val URI: M
  def ap[L, A, B](
    fab: fpDashTsLib.libHKTMod.HKT2[M, L, js.Function1[/* a */ A, B]],
    fa: fpDashTsLib.libHKTMod.HKT2[M, L, A]
  ): fpDashTsLib.libHKTMod.HKT2[M, L, B]
  def chain[L, A, B](
    fa: fpDashTsLib.libHKTMod.HKT2[M, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT2[M, L, B]]
  ): fpDashTsLib.libHKTMod.HKT2[M, L, B]
  def fromEither[E, A](e: fpDashTsLib.libEitherMod.Either[E, A]): fpDashTsLib.libHKTMod.HKT2[M, E, A]
  def fromOption[E, A](o: fpDashTsLib.libOptionMod.Option[A], e: E): fpDashTsLib.libHKTMod.HKT2[M, E, A]
  def map[L, A, B](fa: fpDashTsLib.libHKTMod.HKT2[M, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.HKT2[M, L, B]
  def of[L, A](a: A): fpDashTsLib.libHKTMod.HKT2[M, L, A]
  def throwError[E, A](e: E): fpDashTsLib.libHKTMod.HKT2[M, E, A]
}

object MonadThrow {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any],
    chain: (fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any],
    fromEither: fpDashTsLib.libEitherMod.Either[js.Any, js.Any] => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any],
    fromOption: (fpDashTsLib.libOptionMod.Option[js.Any], js.Any) => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any],
    map: (fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any],
    throwError: js.Any => fpDashTsLib.libHKTMod.HKT2[M, js.Any, js.Any]
  ): MonadThrow[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow[M]]
  }
}


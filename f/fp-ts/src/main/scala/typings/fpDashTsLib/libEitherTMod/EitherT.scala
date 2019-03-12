package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT[F]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[L, B]]],
    fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[L, A]]
  ): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[L, B]]
}

object EitherT {
  @scala.inline
  def apply[F](
    ap: (fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]]) => fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]],
    chain: (js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]],
    map: (fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]]
  ): EitherT[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[EitherT[F]]
  }
}


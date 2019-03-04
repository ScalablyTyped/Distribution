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
    ap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[
        F, 
        fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Function1[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]]
    ],
    chain: js.Function2[
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libEitherMod.URI, js.Any]]
    ]
  ): EitherT[F] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[EitherT[F]]
  }
}


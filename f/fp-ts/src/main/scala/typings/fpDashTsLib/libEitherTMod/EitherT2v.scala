package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2v[F]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, A, B](
    fa: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[L, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[L, B]]]
  ): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[L, B]]
}

object EitherT2v {
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
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
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
  ): EitherT2v[F] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[EitherT2v[F]]
  }
}


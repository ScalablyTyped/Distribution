package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition22[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, M, A, B](
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, B]]
    ],
    fa: fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, B]]
}

object EitherT2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[
        F, 
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Function1[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]
    ],
    chain: js.Function2[
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]
    ]
  ): EitherT2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[EitherT2[F]]
  }
}


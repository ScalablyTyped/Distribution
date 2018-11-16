package typings
package fpDashTsLib.libWitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wilt3C[W /* <: fpDashTsLib.libHKTMod.URIS3 */, WU, WL] extends js.Object {
  def apply[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[W, WU, WL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[W, _], fpDashTsLib.libHKTMod.Type3[W, WU, WL, _]]
    ]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[W, WU, WL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      F, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[W, _], fpDashTsLib.libHKTMod.Type3[W, WU, WL, _]]
    ]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[W, WU, WL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[W, _], fpDashTsLib.libHKTMod.Type3[W, WU, WL, _]]
    ]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[W, WU, WL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[W, _], fpDashTsLib.libHKTMod.Type3[W, WU, WL, _]]
    ]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[W, WU, WL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[W, _], fpDashTsLib.libHKTMod.Type3[W, WU, WL, _]]
    ]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[W, WU, WL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      FU, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.HKT[W, _], fpDashTsLib.libHKTMod.Type3[W, WU, WL, _]]
    ]
  ] = js.native
}


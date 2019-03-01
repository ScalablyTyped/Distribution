package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice[F]
  extends fpDashTsLib.libProfunctorMod.Profunctor[F] {
  def left[A, B, C](pab: fpDashTsLib.libHKTMod.HKT2[F, A, B]): fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[A, B, C](pbc: fpDashTsLib.libHKTMod.HKT2[F, B, C]): fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

object Choice {
  @scala.inline
  def apply[F](
    URI: F,
    left: js.Function1[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[
        F, 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
      ]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any]
    ],
    right: js.Function1[
      fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT2[
        F, 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
      ]
    ]
  ): Choice[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("promap")(promap)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Choice[F]]
  }
}


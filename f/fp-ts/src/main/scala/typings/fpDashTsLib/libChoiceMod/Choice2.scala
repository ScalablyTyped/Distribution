package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor2[F] {
  def left[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, A, B]): fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[A, B, C](pbc: fpDashTsLib.libHKTMod.Type2[F, B, C]): fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

object Choice2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    left: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[
        F, 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
      ]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    right: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[
        F, 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
      ]
    ]
  ): Choice2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("promap")(promap)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Choice2[F]]
  }
}


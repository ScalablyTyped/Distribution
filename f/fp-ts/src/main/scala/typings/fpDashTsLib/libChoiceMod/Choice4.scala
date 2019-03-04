package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor4[F] {
  def left[X, U, A, B, C](pab: fpDashTsLib.libHKTMod.Type4[F, X, U, A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[X, U, A, B, C](pbc: fpDashTsLib.libHKTMod.Type4[F, X, U, B, C]): fpDashTsLib.libHKTMod.Type4[F, X, U, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

object Choice4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    left: js.Function1[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[
        F, 
        js.Any, 
        js.Any, 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
      ]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    right: js.Function1[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[
        F, 
        js.Any, 
        js.Any, 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
        fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
      ]
    ]
  ): Choice4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = left, map = map, promap = promap, right = right)
  
    __obj.asInstanceOf[Choice4[F]]
  }
}


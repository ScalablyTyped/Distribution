package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor3[F] {
  def left[U, A, B, C](pab: fpDashTsLib.libHKTMod.Kind3[F, U, A, B]): fpDashTsLib.libHKTMod.Kind3[F, U, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[U, A, B, C](pbc: fpDashTsLib.libHKTMod.Kind3[F, U, B, C]): fpDashTsLib.libHKTMod.Kind3[F, U, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

object Choice3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    left: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind3[
      F, 
      js.Any, 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ],
    map: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any],
    right: fpDashTsLib.libHKTMod.Kind3[F, js.Any, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind3[
      F, 
      js.Any, 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ]
  ): Choice3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
  
    __obj.asInstanceOf[Choice3[F]]
  }
}


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
    left: fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.libHKTMod.Type4[
      F, 
      js.Any, 
      js.Any, 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ],
    map: (fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    right: fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.libHKTMod.Type4[
      F, 
      js.Any, 
      js.Any, 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ]
  ): Choice4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
  
    __obj.asInstanceOf[Choice4[F]]
  }
}


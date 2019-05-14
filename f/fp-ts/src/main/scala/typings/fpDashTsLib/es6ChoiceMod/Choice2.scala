package typings
package fpDashTsLib.es6ChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ProfunctorMod.Profunctor2[F] {
  def left[A, B, C](pab: fpDashTsLib.es6HKTMod.Type2[F, A, B]): fpDashTsLib.es6HKTMod.Type2[F, fpDashTsLib.es6EitherMod.Either[A, C], fpDashTsLib.es6EitherMod.Either[B, C]]
  def right[A, B, C](pbc: fpDashTsLib.es6HKTMod.Type2[F, B, C]): fpDashTsLib.es6HKTMod.Type2[F, fpDashTsLib.es6EitherMod.Either[A, B], fpDashTsLib.es6EitherMod.Either[A, C]]
}

object Choice2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    left: fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type2[
      F, 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]
    ],
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any],
    right: fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type2[
      F, 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]
    ]
  ): Choice2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
  
    __obj.asInstanceOf[Choice2[F]]
  }
}


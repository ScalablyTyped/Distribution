package typings
package fpDashTsLib.es6ChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6ProfunctorMod.Profunctor4[F] {
  def left[X, U, A, B, C](pab: fpDashTsLib.es6HKTMod.Type4[F, X, U, A, B]): fpDashTsLib.es6HKTMod.Type4[F, X, U, fpDashTsLib.es6EitherMod.Either[A, C], fpDashTsLib.es6EitherMod.Either[B, C]]
  def right[X, U, A, B, C](pbc: fpDashTsLib.es6HKTMod.Type4[F, X, U, B, C]): fpDashTsLib.es6HKTMod.Type4[F, X, U, fpDashTsLib.es6EitherMod.Either[A, B], fpDashTsLib.es6EitherMod.Either[A, C]]
}

object Choice4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    left: fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type4[
      F, 
      js.Any, 
      js.Any, 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]
    ],
    map: (fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    right: fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type4[
      F, 
      js.Any, 
      js.Any, 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]
    ]
  ): Choice4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
  
    __obj.asInstanceOf[Choice4[F]]
  }
}


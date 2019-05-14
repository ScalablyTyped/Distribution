package typings
package fpDashTsLib.es6StrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */]
  extends fpDashTsLib.es6ProfunctorMod.Profunctor4[F] {
  def first[X, U, A, B, C](pab: fpDashTsLib.es6HKTMod.Type4[F, X, U, A, B]): fpDashTsLib.es6HKTMod.Type4[F, X, U, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[X, U, A, B, C](pab: fpDashTsLib.es6HKTMod.Type4[F, X, U, B, C]): fpDashTsLib.es6HKTMod.Type4[F, X, U, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    first: fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any],
    second: fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Type4[F, js.Any, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
  ): Strong4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), second = js.Any.fromFunction1(second))
  
    __obj.asInstanceOf[Strong4[F]]
  }
}


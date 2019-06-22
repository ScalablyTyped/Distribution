package typings
package fpDashTsLib.es6StrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */]
  extends fpDashTsLib.es6ProfunctorMod.Profunctor3[F] {
  def first[U, A, B, C](pab: fpDashTsLib.es6HKTMod.Kind3[F, U, A, B]): fpDashTsLib.es6HKTMod.Kind3[F, U, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[U, A, B, C](pab: fpDashTsLib.es6HKTMod.Kind3[F, U, B, C]): fpDashTsLib.es6HKTMod.Kind3[F, U, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    first: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any],
    second: fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
  ): Strong3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), second = js.Any.fromFunction1(second))
  
    __obj.asInstanceOf[Strong3[F]]
  }
}


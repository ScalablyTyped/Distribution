package typings
package fpDashTsLib.es6StrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ProfunctorMod.Profunctor2[F] {
  def first[A, B, C](pab: fpDashTsLib.es6HKTMod.Kind2[F, A, B]): fpDashTsLib.es6HKTMod.Kind2[F, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[A, B, C](pab: fpDashTsLib.es6HKTMod.Kind2[F, B, C]): fpDashTsLib.es6HKTMod.Kind2[F, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    first: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Kind2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    promap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any],
    second: fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any] => fpDashTsLib.es6HKTMod.Kind2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
  ): Strong2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), second = js.Any.fromFunction1(second))
  
    __obj.asInstanceOf[Strong2[F]]
  }
}


package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor2[F] {
  def first[A, B, C](pab: fpDashTsLib.libHKTMod.Kind2[F, A, B]): fpDashTsLib.libHKTMod.Kind2[F, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[A, B, C](pab: fpDashTsLib.libHKTMod.Kind2[F, B, C]): fpDashTsLib.libHKTMod.Kind2[F, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    first: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    promap: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any],
    second: fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any] => fpDashTsLib.libHKTMod.Kind2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
  ): Strong2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), second = js.Any.fromFunction1(second))
  
    __obj.asInstanceOf[Strong2[F]]
  }
}


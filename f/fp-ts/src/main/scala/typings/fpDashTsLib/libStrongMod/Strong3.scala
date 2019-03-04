package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor3[F] {
  def first[U, A, B, C](pab: fpDashTsLib.libHKTMod.Type3[F, U, A, B]): fpDashTsLib.libHKTMod.Type3[F, U, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[U, A, B, C](pab: fpDashTsLib.libHKTMod.Type3[F, U, B, C]): fpDashTsLib.libHKTMod.Type3[F, U, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    first: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    second: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ]
  ): Strong3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = first, map = map, promap = promap, second = second)
  
    __obj.asInstanceOf[Strong3[F]]
  }
}


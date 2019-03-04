package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor2[F] {
  def first[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, A, B]): fpDashTsLib.libHKTMod.Type2[F, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, B, C]): fpDashTsLib.libHKTMod.Type2[F, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    first: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    second: js.Function1[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ]
  ): Strong2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = first, map = map, promap = promap, second = second)
  
    __obj.asInstanceOf[Strong2[F]]
  }
}


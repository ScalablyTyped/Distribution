package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong4[F /* <: fpDashTsLib.libHKTMod.URIS4 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor4[F] {
  def first[X, U, A, B, C](pab: fpDashTsLib.libHKTMod.Type4[F, X, U, A, B]): fpDashTsLib.libHKTMod.Type4[F, X, U, js.Tuple2[A, C], js.Tuple2[B, C]]
  def second[X, U, A, B, C](pab: fpDashTsLib.libHKTMod.Type4[F, X, U, B, C]): fpDashTsLib.libHKTMod.Type4[F, X, U, js.Tuple2[A, B], js.Tuple2[A, C]]
}

object Strong4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    first: js.Function1[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    promap: js.Function3[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any]
    ],
    second: js.Function1[
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type4[F, js.Any, js.Any, js.Tuple2[js.Any, js.Any], js.Tuple2[js.Any, js.Any]]
    ]
  ): Strong4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], first = first, map = map, promap = promap, second = second)
  
    __obj.asInstanceOf[Strong4[F]]
  }
}


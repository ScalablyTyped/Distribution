package typings
package glDashVec2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-vec2/forEach", JSImport.Namespace)
@js.native
object forEachMod extends js.Object {
  def apply(
    a: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function3[
      /* a */ js.Array[scala.Double], 
      /* b */ js.Array[scala.Double], 
      /* arg */ js.Object, 
      js.Array[scala.Double]
    ],
    arg: js.Object
  ): js.Array[scala.Double] = js.native
}


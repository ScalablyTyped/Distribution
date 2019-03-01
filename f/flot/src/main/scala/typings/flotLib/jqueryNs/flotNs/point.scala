package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait point extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[point]
  }
}


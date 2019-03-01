package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object Color {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, g: scala.Double, r: scala.Double): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[Color]
  }
}


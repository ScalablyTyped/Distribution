package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  var color: Color
  var position: scala.Double
}

object GradientStop {
  @scala.inline
  def apply(color: Color, position: scala.Double): GradientStop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GradientStop]
  }
}


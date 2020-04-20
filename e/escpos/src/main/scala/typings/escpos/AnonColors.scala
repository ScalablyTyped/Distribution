package typings.escpos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: Double
  var height: Double
  var width: Double
}

object AnonColors {
  @scala.inline
  def apply(colors: Double, height: Double, width: Double): AnonColors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}


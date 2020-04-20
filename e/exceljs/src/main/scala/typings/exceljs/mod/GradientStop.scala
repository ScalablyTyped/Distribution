package typings.exceljs.mod

import typings.exceljs.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  var color: PartialColor
  var position: Double
}

object GradientStop {
  @scala.inline
  def apply(color: PartialColor, position: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
}


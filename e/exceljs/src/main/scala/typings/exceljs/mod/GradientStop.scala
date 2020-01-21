package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  var color: Partial[Color]
  var position: Double
}

object GradientStop {
  @scala.inline
  def apply(color: Partial[Color], position: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GradientStop]
  }
}


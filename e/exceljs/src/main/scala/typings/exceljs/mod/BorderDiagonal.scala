package typings.exceljs.mod

import typings.exceljs.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderDiagonal extends Border {
  var down: Boolean
  var up: Boolean
}

object BorderDiagonal {
  @scala.inline
  def apply(color: PartialColor, down: Boolean, style: BorderStyle, up: Boolean): BorderDiagonal = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDiagonal]
  }
}


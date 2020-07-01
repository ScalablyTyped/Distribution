package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: Color
  var colorStyle: ColorStyle
  var style: BorderStyle
  var width: Double
}

object Border {
  @scala.inline
  def apply(color: Color, colorStyle: ColorStyle, style: BorderStyle, width: Double): Border = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorStyle = colorStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}


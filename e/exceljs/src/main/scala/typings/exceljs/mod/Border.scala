package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: PartialColor
  var style: BorderStyle
}

object Border {
  @scala.inline
  def apply(color: PartialColor, style: BorderStyle): Border = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}


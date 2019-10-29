package typings.exceljs.exceljsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: Partial[Color]
  var style: BorderStyle
}

object Border {
  @scala.inline
  def apply(color: Partial[Color], style: BorderStyle): Border = {
    val __obj = js.Dynamic.literal(color = color, style = style)
  
    __obj.asInstanceOf[Border]
  }
}


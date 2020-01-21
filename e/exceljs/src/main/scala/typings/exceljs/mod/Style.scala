package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var alignment: Partial[Alignment]
  var border: Partial[Borders]
  var fill: Fill
  var font: Partial[Font]
  var numFmt: String
  var protection: Partial[Protection]
}

object Style {
  @scala.inline
  def apply(
    alignment: Partial[Alignment],
    border: Partial[Borders],
    fill: Fill,
    font: Partial[Font],
    numFmt: String,
    protection: Partial[Protection]
  ): Style = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Style]
  }
}


package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichText extends js.Object {
  var font: js.UndefOr[Partial[Font]] = js.undefined
  var text: String
}

object RichText {
  @scala.inline
  def apply(text: String, font: Partial[Font] = null): RichText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichText]
  }
}


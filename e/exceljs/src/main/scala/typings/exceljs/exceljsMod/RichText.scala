package typings.exceljs.exceljsMod

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
    val __obj = js.Dynamic.literal(text = text)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[RichText]
  }
}


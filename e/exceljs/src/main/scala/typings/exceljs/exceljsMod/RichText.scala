package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichText extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var text: String
}

object RichText {
  @scala.inline
  def apply(text: String, font: Font = null): RichText = {
    val __obj = js.Dynamic.literal(text = text)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[RichText]
  }
}


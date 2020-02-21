package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageHyperlinkValue extends js.Object {
  var hyperlink: String
  var tooltip: js.UndefOr[String] = js.undefined
}

object ImageHyperlinkValue {
  @scala.inline
  def apply(hyperlink: String, tooltip: String = null): ImageHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageHyperlinkValue]
  }
}


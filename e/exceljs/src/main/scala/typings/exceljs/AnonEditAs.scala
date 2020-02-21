package typings.exceljs

import typings.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditAs extends js.Object {
  var editAs: js.UndefOr[String] = js.undefined
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.undefined
}

object AnonEditAs {
  @scala.inline
  def apply(editAs: String = null, hyperlinks: ImageHyperlinkValue = null): AnonEditAs = {
    val __obj = js.Dynamic.literal()
    if (editAs != null) __obj.updateDynamic("editAs")(editAs.asInstanceOf[js.Any])
    if (hyperlinks != null) __obj.updateDynamic("hyperlinks")(hyperlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditAs]
  }
}


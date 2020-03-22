package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomizeTextFormat extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* markerValue */ AnonValueTextString, String]] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object AnonCustomizeTextFormat {
  @scala.inline
  def apply(customizeText: /* markerValue */ AnonValueTextString => String = null, format: format = null): AnonCustomizeTextFormat = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomizeTextFormat]
  }
}


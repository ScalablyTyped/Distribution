package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizeTextFormat extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* markerValue */ ValueTextString, String]] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object CustomizeTextFormat {
  @scala.inline
  def apply(customizeText: /* markerValue */ ValueTextString => String = null, format: format = null): CustomizeTextFormat = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizeTextFormat]
  }
}


package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: js.UndefOr[dxFilterBuilderField] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonField {
  @scala.inline
  def apply(field: dxFilterBuilderField = null, value: String | Double | Date = null, valueText: String = null): AnonField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
}


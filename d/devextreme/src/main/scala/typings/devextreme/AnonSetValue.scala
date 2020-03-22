package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSetValue extends js.Object {
  var field: js.UndefOr[dxFilterBuilderField] = js.undefined
  var setValue: js.UndefOr[js.Function] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
}

object AnonSetValue {
  @scala.inline
  def apply(
    field: dxFilterBuilderField = null,
    setValue: js.Function = null,
    value: String | Double | Date = null
  ): AnonSetValue = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSetValue]
  }
}


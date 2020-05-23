package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetValue extends js.Object {
  var field: js.UndefOr[dxFilterBuilderField] = js.undefined
  var setValue: js.UndefOr[js.Function] = js.undefined
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
}

object SetValue {
  @scala.inline
  def apply(
    field: dxFilterBuilderField = null,
    setValue: js.Function = null,
    value: String | Double | typings.std.Date = null
  ): SetValue = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetValue]
  }
}


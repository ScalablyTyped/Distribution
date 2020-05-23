package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: js.UndefOr[dxFilterBuilderField] = js.undefined
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object Field {
  @scala.inline
  def apply(
    field: dxFilterBuilderField = null,
    value: String | Double | typings.std.Date = null,
    valueText: String = null
  ): Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}


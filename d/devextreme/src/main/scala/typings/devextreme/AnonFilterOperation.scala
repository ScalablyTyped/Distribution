package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterOperation extends js.Object {
  var field: js.UndefOr[this.type] = js.undefined
  var filterOperation: js.UndefOr[String] = js.undefined
  var setValue: js.UndefOr[js.Function] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
}

object AnonFilterOperation {
  @scala.inline
  def apply(
    field: AnonFilterOperation = null,
    filterOperation: String = null,
    setValue: js.Function = null,
    value: String | Double | Date = null
  ): AnonFilterOperation = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filterOperation != null) __obj.updateDynamic("filterOperation")(filterOperation.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterOperation]
  }
}


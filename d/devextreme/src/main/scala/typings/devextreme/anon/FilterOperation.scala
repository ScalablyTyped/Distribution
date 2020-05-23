package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperation extends js.Object {
  var field: js.UndefOr[this.type] = js.undefined
  var filterOperation: js.UndefOr[String] = js.undefined
  var setValue: js.UndefOr[js.Function] = js.undefined
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
}

object FilterOperation {
  @scala.inline
  def apply(
    field: FilterOperation = null,
    filterOperation: String = null,
    setValue: js.Function = null,
    value: String | Double | typings.std.Date = null
  ): FilterOperation = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filterOperation != null) __obj.updateDynamic("filterOperation")(filterOperation.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperation]
  }
}


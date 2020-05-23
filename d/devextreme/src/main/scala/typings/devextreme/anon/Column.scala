package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var formItem: js.UndefOr[js.Any] = js.undefined
  var rule: js.UndefOr[js.Any] = js.undefined
  var validator: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    column: js.Any = null,
    data: js.Any = null,
    formItem: js.Any = null,
    rule: js.Any = null,
    validator: js.Any = null,
    value: String | Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formItem != null) __obj.updateDynamic("formItem")(formItem.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}


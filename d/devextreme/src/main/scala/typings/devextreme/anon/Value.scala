package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(value: String | Double | typings.std.Date = null, valueText: String = null): Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}


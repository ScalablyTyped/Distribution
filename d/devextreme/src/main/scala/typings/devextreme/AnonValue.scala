package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var value: js.UndefOr[String | Double | Date] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(value: String | Double | Date = null, valueText: String = null): AnonValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}


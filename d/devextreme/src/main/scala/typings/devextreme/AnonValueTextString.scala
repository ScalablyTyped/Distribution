package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueTextString extends js.Object {
  var value: js.UndefOr[Date | Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonValueTextString {
  @scala.inline
  def apply(value: Date | Double = null, valueText: String = null): AnonValueTextString = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueTextString]
  }
}


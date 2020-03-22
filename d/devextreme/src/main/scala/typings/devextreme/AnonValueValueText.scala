package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueValueText extends js.Object {
  var value: js.UndefOr[Date | Double | String] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonValueValueText {
  @scala.inline
  def apply(value: Date | Double | String = null, valueText: String = null): AnonValueValueText = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueValueText]
  }
}


package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueValueText extends js.Object {
  var value: js.UndefOr[typings.std.Date | Double | String] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object ValueValueText {
  @scala.inline
  def apply(value: typings.std.Date | Double | String = null, valueText: String = null): ValueValueText = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValueText]
  }
}


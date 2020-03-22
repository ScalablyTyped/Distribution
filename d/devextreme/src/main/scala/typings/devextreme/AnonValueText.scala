package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueText extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonValueText {
  @scala.inline
  def apply(value: Int | Double = null, valueText: String = null): AnonValueText = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueText]
  }
}


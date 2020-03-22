package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply(index: Int | Double = null, value: Int | Double = null, valueText: String = null): AnonIndex = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}


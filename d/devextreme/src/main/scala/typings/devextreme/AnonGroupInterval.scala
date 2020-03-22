package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupInterval extends js.Object {
  var groupInterval: js.UndefOr[String | Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonGroupInterval {
  @scala.inline
  def apply(
    groupInterval: String | Double = null,
    target: String = null,
    value: String | Double | Date = null,
    valueText: String = null
  ): AnonGroupInterval = {
    val __obj = js.Dynamic.literal()
    if (groupInterval != null) __obj.updateDynamic("groupInterval")(groupInterval.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupInterval]
  }
}


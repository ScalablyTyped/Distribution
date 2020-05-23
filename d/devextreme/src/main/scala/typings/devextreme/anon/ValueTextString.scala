package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueTextString extends js.Object {
  var value: js.UndefOr[typings.std.Date | Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object ValueTextString {
  @scala.inline
  def apply(value: typings.std.Date | Double = null, valueText: String = null): ValueTextString = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTextString]
  }
}


package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameValue extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonNameValue {
  @scala.inline
  def apply(name: String = null, value: js.Any = null): AnonNameValue = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameValue]
  }
}


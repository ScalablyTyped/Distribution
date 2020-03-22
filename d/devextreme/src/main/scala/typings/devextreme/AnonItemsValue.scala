package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsValue extends js.Object {
  var items: js.UndefOr[js.Array[Double]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonItemsValue {
  @scala.inline
  def apply(items: js.Array[Double] = null, value: Int | Double = null): AnonItemsValue = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsValue]
  }
}


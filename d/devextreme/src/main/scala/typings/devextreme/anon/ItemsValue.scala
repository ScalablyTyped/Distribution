package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsValue extends js.Object {
  var items: js.UndefOr[js.Array[Double]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ItemsValue {
  @scala.inline
  def apply(items: js.Array[Double] = null, value: js.UndefOr[Double] = js.undefined): ItemsValue = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsValue]
  }
}


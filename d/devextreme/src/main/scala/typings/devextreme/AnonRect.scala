package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRect extends js.Object {
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var rect: js.UndefOr[js.Array[Double]] = js.undefined
  var sum: js.UndefOr[Double] = js.undefined
}

object AnonRect {
  @scala.inline
  def apply(items: js.Array[_] = null, rect: js.Array[Double] = null, sum: Int | Double = null): AnonRect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRect]
  }
}


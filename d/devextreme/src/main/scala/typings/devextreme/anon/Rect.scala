package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var rect: js.UndefOr[js.Array[Double]] = js.undefined
  var sum: js.UndefOr[Double] = js.undefined
}

object Rect {
  @scala.inline
  def apply(items: js.Array[_] = null, rect: js.Array[Double] = null, sum: js.UndefOr[Double] = js.undefined): Rect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
}


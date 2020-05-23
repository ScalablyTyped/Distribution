package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var isMeasuring: js.UndefOr[Boolean] = js.undefined
  var itemIdx: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    data: js.Any,
    isMeasuring: js.UndefOr[Boolean] = js.undefined,
    itemIdx: js.UndefOr[Double] = js.undefined
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeasuring)) __obj.updateDynamic("isMeasuring")(isMeasuring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemIdx)) __obj.updateDynamic("itemIdx")(itemIdx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}


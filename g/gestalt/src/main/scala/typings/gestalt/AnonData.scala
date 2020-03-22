package typings.gestalt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Any
  var isMeasuring: js.UndefOr[Boolean] = js.undefined
  var itemIdx: js.UndefOr[Double] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(data: js.Any, isMeasuring: js.UndefOr[Boolean] = js.undefined, itemIdx: Int | Double = null): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeasuring)) __obj.updateDynamic("isMeasuring")(isMeasuring.asInstanceOf[js.Any])
    if (itemIdx != null) __obj.updateDynamic("itemIdx")(itemIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}


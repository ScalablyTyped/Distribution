package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRangeMaxPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[Double] = js.undefined
  var rangeMinPoint: js.UndefOr[Double] = js.undefined
}

object AnonRangeMaxPoint {
  @scala.inline
  def apply(rangeMaxPoint: Int | Double = null, rangeMinPoint: Int | Double = null): AnonRangeMaxPoint = {
    val __obj = js.Dynamic.literal()
    if (rangeMaxPoint != null) __obj.updateDynamic("rangeMaxPoint")(rangeMaxPoint.asInstanceOf[js.Any])
    if (rangeMinPoint != null) __obj.updateDynamic("rangeMinPoint")(rangeMinPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangeMaxPoint]
  }
}


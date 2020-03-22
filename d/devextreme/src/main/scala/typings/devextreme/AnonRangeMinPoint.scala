package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRangeMinPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[String] = js.undefined
  var rangeMinPoint: js.UndefOr[String] = js.undefined
}

object AnonRangeMinPoint {
  @scala.inline
  def apply(rangeMaxPoint: String = null, rangeMinPoint: String = null): AnonRangeMinPoint = {
    val __obj = js.Dynamic.literal()
    if (rangeMaxPoint != null) __obj.updateDynamic("rangeMaxPoint")(rangeMaxPoint.asInstanceOf[js.Any])
    if (rangeMinPoint != null) __obj.updateDynamic("rangeMinPoint")(rangeMinPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangeMinPoint]
  }
}


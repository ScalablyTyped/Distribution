package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeMinPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[String] = js.undefined
  var rangeMinPoint: js.UndefOr[String] = js.undefined
}

object RangeMinPoint {
  @scala.inline
  def apply(rangeMaxPoint: String = null, rangeMinPoint: String = null): RangeMinPoint = {
    val __obj = js.Dynamic.literal()
    if (rangeMaxPoint != null) __obj.updateDynamic("rangeMaxPoint")(rangeMaxPoint.asInstanceOf[js.Any])
    if (rangeMinPoint != null) __obj.updateDynamic("rangeMinPoint")(rangeMinPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeMinPoint]
  }
}


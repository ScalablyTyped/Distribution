package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeMaxPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[Double] = js.undefined
  var rangeMinPoint: js.UndefOr[Double] = js.undefined
}

object RangeMaxPoint {
  @scala.inline
  def apply(rangeMaxPoint: js.UndefOr[Double] = js.undefined, rangeMinPoint: js.UndefOr[Double] = js.undefined): RangeMaxPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rangeMaxPoint)) __obj.updateDynamic("rangeMaxPoint")(rangeMaxPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeMinPoint)) __obj.updateDynamic("rangeMinPoint")(rangeMinPoint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeMaxPoint]
  }
}


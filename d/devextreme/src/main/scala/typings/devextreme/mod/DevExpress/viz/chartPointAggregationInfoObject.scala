package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chartPointAggregationInfoObject extends js.Object {
  /** @name chartPointAggregationInfoObject.aggregationInterval */
  var aggregationInterval: js.UndefOr[js.Any] = js.undefined
  /** @name chartPointAggregationInfoObject.data */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /** @name chartPointAggregationInfoObject.intervalEnd */
  var intervalEnd: js.UndefOr[js.Any] = js.undefined
  /** @name chartPointAggregationInfoObject.intervalStart */
  var intervalStart: js.UndefOr[js.Any] = js.undefined
}

object chartPointAggregationInfoObject {
  @scala.inline
  def apply(
    aggregationInterval: js.Any = null,
    data: js.Array[_] = null,
    intervalEnd: js.Any = null,
    intervalStart: js.Any = null
  ): chartPointAggregationInfoObject = {
    val __obj = js.Dynamic.literal()
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (intervalEnd != null) __obj.updateDynamic("intervalEnd")(intervalEnd.asInstanceOf[js.Any])
    if (intervalStart != null) __obj.updateDynamic("intervalStart")(intervalStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[chartPointAggregationInfoObject]
  }
}


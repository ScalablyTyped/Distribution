package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartPointAggregationInfoObject extends js.Object {
  /** @name chartPointAggregationInfoObject.aggregationInterval */
  var aggregationInterval: js.UndefOr[js.Any] = js.native
  /** @name chartPointAggregationInfoObject.data */
  var data: js.UndefOr[js.Array[_]] = js.native
  /** @name chartPointAggregationInfoObject.intervalEnd */
  var intervalEnd: js.UndefOr[js.Any] = js.native
  /** @name chartPointAggregationInfoObject.intervalStart */
  var intervalStart: js.UndefOr[js.Any] = js.native
}

object chartPointAggregationInfoObject {
  @scala.inline
  def apply(): chartPointAggregationInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[chartPointAggregationInfoObject]
  }
  @scala.inline
  implicit class chartPointAggregationInfoObjectOps[Self <: chartPointAggregationInfoObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregationInterval(value: js.Any): Self = this.set("aggregationInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationInterval: Self = this.set("aggregationInterval", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIntervalEnd(value: js.Any): Self = this.set("intervalEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalEnd: Self = this.set("intervalEnd", js.undefined)
    @scala.inline
    def setIntervalStart(value: js.Any): Self = this.set("intervalStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalStart: Self = this.set("intervalStart", js.undefined)
  }
  
}


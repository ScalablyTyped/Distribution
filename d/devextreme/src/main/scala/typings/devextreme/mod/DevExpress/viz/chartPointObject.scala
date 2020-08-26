package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartPointObject extends basePointObject {
  /** @name chartPointObject.aggregationInfo */
  var aggregationInfo: js.UndefOr[chartPointAggregationInfoObject] = js.native
  /** @name chartPointObject.originalCloseValue */
  var originalCloseValue: js.UndefOr[Double | String] = js.native
  /** @name chartPointObject.originalHighValue */
  var originalHighValue: js.UndefOr[Double | String] = js.native
  /** @name chartPointObject.originalLowValue */
  var originalLowValue: js.UndefOr[Double | String] = js.native
  /** @name chartPointObject.originalMinValue */
  var originalMinValue: js.UndefOr[String | Double | Date] = js.native
  /** @name chartPointObject.originalOpenValue */
  var originalOpenValue: js.UndefOr[Double | String] = js.native
  /** @name chartPointObject.size */
  var size: js.UndefOr[Double | String] = js.native
  /** @name chartPointObject.getBoundingRect() */
  def getBoundingRect(): js.Any = js.native
}

object chartPointObject {
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    getBoundingRect: () => js.Any,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    select: () => Unit,
    showTooltip: () => Unit
  ): chartPointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getBoundingRect = js.Any.fromFunction0(getBoundingRect), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction0(select), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[chartPointObject]
  }
  @scala.inline
  implicit class chartPointObjectOps[Self <: chartPointObject] (val x: Self) extends AnyVal {
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
    def setGetBoundingRect(value: () => js.Any): Self = this.set("getBoundingRect", js.Any.fromFunction0(value))
    @scala.inline
    def setAggregationInfo(value: chartPointAggregationInfoObject): Self = this.set("aggregationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationInfo: Self = this.set("aggregationInfo", js.undefined)
    @scala.inline
    def setOriginalCloseValue(value: Double | String): Self = this.set("originalCloseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalCloseValue: Self = this.set("originalCloseValue", js.undefined)
    @scala.inline
    def setOriginalHighValue(value: Double | String): Self = this.set("originalHighValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalHighValue: Self = this.set("originalHighValue", js.undefined)
    @scala.inline
    def setOriginalLowValue(value: Double | String): Self = this.set("originalLowValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalLowValue: Self = this.set("originalLowValue", js.undefined)
    @scala.inline
    def setOriginalMinValue(value: String | Double | Date): Self = this.set("originalMinValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalMinValue: Self = this.set("originalMinValue", js.undefined)
    @scala.inline
    def setOriginalOpenValue(value: Double | String): Self = this.set("originalOpenValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalOpenValue: Self = this.set("originalOpenValue", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}


package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chartPointObject extends basePointObject {
  /** @name chartPointObject.aggregationInfo */
  var aggregationInfo: chartPointAggregationInfoObject
  /** @name chartPointObject.originalCloseValue */
  var originalCloseValue: Double | String
  /** @name chartPointObject.originalHighValue */
  var originalHighValue: Double | String
  /** @name chartPointObject.originalLowValue */
  var originalLowValue: Double | String
  /** @name chartPointObject.originalMinValue */
  var originalMinValue: String | Double | Date
  /** @name chartPointObject.originalOpenValue */
  var originalOpenValue: Double | String
  /** @name chartPointObject.size */
  var size: Double | String
  /** @name chartPointObject.getBoundingRect() */
  def getBoundingRect(): js.Any
}

object chartPointObject {
  @scala.inline
  def apply(
    aggregationInfo: chartPointAggregationInfoObject,
    clearHover: () => Unit,
    clearSelection: () => Unit,
    data: js.Any,
    fullState: Double,
    getBoundingRect: () => js.Any,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    originalArgument: String | Double | Date,
    originalCloseValue: Double | String,
    originalHighValue: Double | String,
    originalLowValue: Double | String,
    originalMinValue: String | Double | Date,
    originalOpenValue: Double | String,
    originalValue: String | Double | Date,
    select: () => Unit,
    series: js.Any,
    showTooltip: () => Unit,
    size: Double | String,
    tag: js.Any
  ): chartPointObject = {
    val __obj = js.Dynamic.literal(aggregationInfo = aggregationInfo.asInstanceOf[js.Any], clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], getBoundingRect = js.Any.fromFunction0(getBoundingRect), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), originalArgument = originalArgument.asInstanceOf[js.Any], originalCloseValue = originalCloseValue.asInstanceOf[js.Any], originalHighValue = originalHighValue.asInstanceOf[js.Any], originalLowValue = originalLowValue.asInstanceOf[js.Any], originalMinValue = originalMinValue.asInstanceOf[js.Any], originalOpenValue = originalOpenValue.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), series = series.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction0(showTooltip), size = size.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[chartPointObject]
  }
}


package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chartPointObject extends basePointObject {
  /** Provides information about the aggregation interval and the data objects that fall within it. */
  var aggregationInfo: chartPointAggregationInfoObject
  /** Contains the close value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalCloseValue: Double | String
  /** Contains the high value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalHighValue: Double | String
  /** Contains the low value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalLowValue: Double | String
  /** Contains the first value of the point. This field is useful for points belonging to a series of the range area or range bar type only. */
  var originalMinValue: String | Double | Date
  /** Contains the open value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalOpenValue: Double | String
  /** Contains the size of the bubble as it was set in the data source. This field is useful for points belonging to a series of the bubble type only. */
  var size: Double | String
  /** Gets the parameters of the point's minimum bounding rectangle (MBR). */
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


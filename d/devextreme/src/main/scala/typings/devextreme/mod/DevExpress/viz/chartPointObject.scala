package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chartPointObject extends basePointObject {
  /** @name chartPointObject.aggregationInfo */
  var aggregationInfo: js.UndefOr[chartPointAggregationInfoObject] = js.undefined
  /** @name chartPointObject.originalCloseValue */
  var originalCloseValue: js.UndefOr[Double | String] = js.undefined
  /** @name chartPointObject.originalHighValue */
  var originalHighValue: js.UndefOr[Double | String] = js.undefined
  /** @name chartPointObject.originalLowValue */
  var originalLowValue: js.UndefOr[Double | String] = js.undefined
  /** @name chartPointObject.originalMinValue */
  var originalMinValue: js.UndefOr[String | Double | Date] = js.undefined
  /** @name chartPointObject.originalOpenValue */
  var originalOpenValue: js.UndefOr[Double | String] = js.undefined
  /** @name chartPointObject.size */
  var size: js.UndefOr[Double | String] = js.undefined
  /** @name chartPointObject.getBoundingRect() */
  def getBoundingRect(): js.Any
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
    showTooltip: () => Unit,
    aggregationInfo: chartPointAggregationInfoObject = null,
    data: js.Any = null,
    fullState: js.UndefOr[Double] = js.undefined,
    originalArgument: String | Double | Date = null,
    originalCloseValue: Double | String = null,
    originalHighValue: Double | String = null,
    originalLowValue: Double | String = null,
    originalMinValue: String | Double | Date = null,
    originalOpenValue: Double | String = null,
    originalValue: String | Double | Date = null,
    series: js.Any = null,
    size: Double | String = null,
    tag: js.Any = null
  ): chartPointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getBoundingRect = js.Any.fromFunction0(getBoundingRect), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction0(select), showTooltip = js.Any.fromFunction0(showTooltip))
    if (aggregationInfo != null) __obj.updateDynamic("aggregationInfo")(aggregationInfo.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(fullState)) __obj.updateDynamic("fullState")(fullState.get.asInstanceOf[js.Any])
    if (originalArgument != null) __obj.updateDynamic("originalArgument")(originalArgument.asInstanceOf[js.Any])
    if (originalCloseValue != null) __obj.updateDynamic("originalCloseValue")(originalCloseValue.asInstanceOf[js.Any])
    if (originalHighValue != null) __obj.updateDynamic("originalHighValue")(originalHighValue.asInstanceOf[js.Any])
    if (originalLowValue != null) __obj.updateDynamic("originalLowValue")(originalLowValue.asInstanceOf[js.Any])
    if (originalMinValue != null) __obj.updateDynamic("originalMinValue")(originalMinValue.asInstanceOf[js.Any])
    if (originalOpenValue != null) __obj.updateDynamic("originalOpenValue")(originalOpenValue.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[chartPointObject]
  }
}


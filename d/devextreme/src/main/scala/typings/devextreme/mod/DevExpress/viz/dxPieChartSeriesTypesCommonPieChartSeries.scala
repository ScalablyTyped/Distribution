package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ArgumentFormat
import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.GroupName
import typings.devextreme.anon.Hatching
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPieChartSeriesTypesCommonPieChartSeries extends js.Object {
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.argumentField */
  var argumentField: js.UndefOr[String] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.argumentType */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.border */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.hoverMode */
  var hoverMode: js.UndefOr[none | onlyPoint] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.hoverStyle */
  var hoverStyle: js.UndefOr[Hatching] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.label */
  var label: js.UndefOr[ArgumentFormat] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.maxLabelCount */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.minSegmentSize */
  var minSegmentSize: js.UndefOr[Double] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.selectionMode */
  var selectionMode: js.UndefOr[none | onlyPoint] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.selectionStyle */
  var selectionStyle: js.UndefOr[Hatching] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.smallValuesGrouping */
  var smallValuesGrouping: js.UndefOr[GroupName] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.tagField */
  var tagField: js.UndefOr[String] = js.undefined
  /** @name dxPieChartSeriesTypes.CommonPieChartSeries.valueField */
  var valueField: js.UndefOr[String] = js.undefined
}

object dxPieChartSeriesTypesCommonPieChartSeries {
  @scala.inline
  def apply(
    argumentField: String = null,
    argumentType: datetime | numeric | string_ = null,
    border: ColorDashStyle = null,
    color: String = null,
    hoverMode: none | onlyPoint = null,
    hoverStyle: Hatching = null,
    label: ArgumentFormat = null,
    maxLabelCount: js.UndefOr[Double] = js.undefined,
    minSegmentSize: js.UndefOr[Double] = js.undefined,
    selectionMode: none | onlyPoint = null,
    selectionStyle: Hatching = null,
    smallValuesGrouping: GroupName = null,
    tagField: String = null,
    valueField: String = null
  ): dxPieChartSeriesTypesCommonPieChartSeries = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (argumentType != null) __obj.updateDynamic("argumentType")(argumentType.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLabelCount)) __obj.updateDynamic("maxLabelCount")(maxLabelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSegmentSize)) __obj.updateDynamic("minSegmentSize")(minSegmentSize.get.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (smallValuesGrouping != null) __obj.updateDynamic("smallValuesGrouping")(smallValuesGrouping.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPieChartSeriesTypesCommonPieChartSeries]
  }
}


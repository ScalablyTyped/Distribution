package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonArgumentFormat
import typings.devextreme.AnonColorDashStyle
import typings.devextreme.AnonGroupName
import typings.devextreme.AnonHatching
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPieChartSeriesTypesCommonPieChartSeries extends js.Object {
  /** Specifies the data source field that provides arguments for series points. */
  var argumentField: js.UndefOr[String] = js.undefined
  /** Specifies the required type for series arguments. */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** An object defining the series border configuration options. */
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  /** Specifies a series color. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the chart elements to highlight when a series is hovered over. */
  var hoverMode: js.UndefOr[none | onlyPoint] = js.undefined
  /** An object defining configuration options for a hovered series. */
  var hoverStyle: js.UndefOr[AnonHatching] = js.undefined
  /** An object defining the label configuration options. */
  var label: js.UndefOr[AnonArgumentFormat] = js.undefined
  /** Specifies how many points are acceptable to be in a series to display all labels for these points. Otherwise, the labels will not be displayed. */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  /** Specifies a minimal size of a displayed pie segment. */
  var minSegmentSize: js.UndefOr[Double] = js.undefined
  /** Specifies the chart elements to highlight when the series is selected. */
  var selectionMode: js.UndefOr[none | onlyPoint] = js.undefined
  /** An object defining configuration options for the series when it is selected. */
  var selectionStyle: js.UndefOr[AnonHatching] = js.undefined
  /** Specifies chart segment grouping options. */
  var smallValuesGrouping: js.UndefOr[AnonGroupName] = js.undefined
  /** Specifies the name of the data source field that provides data about a point. */
  var tagField: js.UndefOr[String] = js.undefined
  /** Specifies the data source field that provides values for series points. */
  var valueField: js.UndefOr[String] = js.undefined
}

object dxPieChartSeriesTypesCommonPieChartSeries {
  @scala.inline
  def apply(
    argumentField: String = null,
    argumentType: datetime | numeric | string_ = null,
    border: AnonColorDashStyle = null,
    color: String = null,
    hoverMode: none | onlyPoint = null,
    hoverStyle: AnonHatching = null,
    label: AnonArgumentFormat = null,
    maxLabelCount: Int | Double = null,
    minSegmentSize: Int | Double = null,
    selectionMode: none | onlyPoint = null,
    selectionStyle: AnonHatching = null,
    smallValuesGrouping: AnonGroupName = null,
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
    if (maxLabelCount != null) __obj.updateDynamic("maxLabelCount")(maxLabelCount.asInstanceOf[js.Any])
    if (minSegmentSize != null) __obj.updateDynamic("minSegmentSize")(minSegmentSize.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (smallValuesGrouping != null) __obj.updateDynamic("smallValuesGrouping")(smallValuesGrouping.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPieChartSeriesTypesCommonPieChartSeries]
  }
}


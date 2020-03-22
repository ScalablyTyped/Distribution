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

trait PieChartSeries extends dxPieChartSeriesTypesCommonPieChartSeries {
  /** Specifies the name that identifies the series. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies data about a series. */
  var tag: js.UndefOr[js.Any] = js.undefined
}

object PieChartSeries {
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
    name: String = null,
    selectionMode: none | onlyPoint = null,
    selectionStyle: AnonHatching = null,
    smallValuesGrouping: AnonGroupName = null,
    tag: js.Any = null,
    tagField: String = null,
    valueField: String = null
  ): PieChartSeries = {
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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (smallValuesGrouping != null) __obj.updateDynamic("smallValuesGrouping")(smallValuesGrouping.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartSeries]
  }
}


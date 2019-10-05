package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxis extends js.Object {
  /** Specifies the position of the axis labels.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[LabelAlignment | String] = js.undefined
  /** Options for customizing vertical axis alternate grid band.
    */
  var alternateGridBand: js.UndefOr[PrimaryYAxisAlternateGridBand] = js.undefined
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[PrimaryYAxisAxisLine] = js.undefined
  /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
    * value of crossing axis, then axis will be placed at the opposite side.
    * @Default {null}
    */
  var crossesAt: js.UndefOr[Double] = js.undefined
  /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
    * axis or primary Y axis will be used for crossing
    * @Default {null}
    */
  var crossesInAxis: js.UndefOr[String] = js.undefined
  /** Options to customize the crosshair label.
    */
  var crosshairLabel: js.UndefOr[PrimaryYAxisCrosshairLabel] = js.undefined
  /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
    * @Default {null}
    */
  var desiredIntervals: js.UndefOr[Double] = js.undefined
  /** Specifies the position of labels at the edge of the axis.
    * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
    */
  var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.undefined
  /** Specifies the interval of the axis according to the zoomed data of the chart.
    * @Default {true}
    */
  var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the font of the axis Labels.
    */
  var font: js.UndefOr[PrimaryYAxisFont] = js.undefined
  /** Specifies the type of interval in date time axis.
    * @Default {null. See IntervalType}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.undefined
  /** Specifies whether to inverse the axis.
    * @Default {false}
    */
  var isInversed: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the border of the labels.
    */
  var labelBorder: js.UndefOr[PrimaryYAxisLabelBorder] = js.undefined
  /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
    * @Default {null}
    */
  var labelFormat: js.UndefOr[String] = js.undefined
  /** Specifies the action to take when the axis labels are overlapping with each other.
    * @Default {ej.datavisualization.Chart.LabelIntersectAction.None}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
  /** Specifies the placement of labels.
    * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
  /** Specifies the position of the axis labels.
    * @Default {outside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | String] = js.undefined
  /** Logarithmic base value. This is applicable only for logarithmic axis.
    * @Default {10}
    */
  var logBase: js.UndefOr[Double] = js.undefined
  /** Options for customizing major gird lines.
    */
  var majorGridLines: js.UndefOr[PrimaryYAxisMajorGridLines] = js.undefined
  /** Options for customizing the major tick lines.
    */
  var majorTickLines: js.UndefOr[PrimaryYAxisMajorTickLines] = js.undefined
  /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
    * @Default {ej.datavisualization.Chart.maximumLabelWidth type {int}}
    */
  var maximumLabelWidth: js.UndefOr[Double] = js.undefined
  /** Maximum number of labels to be displayed in every 100 pixels.
    * @Default {3}
    */
  var maximumLabels: js.UndefOr[Double] = js.undefined
  /** Options for customizing the minor grid lines.
    */
  var minorGridLines: js.UndefOr[PrimaryYAxisMinorGridLines] = js.undefined
  /** Options for customizing the minor tick lines.
    */
  var minorTickLines: js.UndefOr[PrimaryYAxisMinorTickLines] = js.undefined
  /** Specifies the number of minor ticks per interval.
    * @Default {null}
    */
  var minorTicksPerInterval: js.UndefOr[Double] = js.undefined
  /** Options for customizing the multi level labels.
    * @Default {[ ]}
    */
  var multiLevelLabels: js.UndefOr[js.Array[PrimaryYAxisMultiLevelLabel]] = js.undefined
  /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies whether to render the axis at the opposite side of its default position.
    * @Default {false}
    */
  var opposedPosition: js.UndefOr[Boolean] = js.undefined
  /** Specifies the orientation of the axis line in the chart.
    * @Default {Vertical}
    */
  var orientation: js.UndefOr[AxisOrientation | String] = js.undefined
  /** Specifies the padding for the plot area.
    * @Default {10}
    */
  var plotOffset: js.UndefOr[Double] = js.undefined
  /** Options to customize the range of the axis.
    */
  var range: js.UndefOr[PrimaryYAxisRange] = js.undefined
  /** Specifies the padding for the axis range.
    * @Default {ej.datavisualization.Chart.RangePadding.None. See RangePadding}
    */
  var rangePadding: js.UndefOr[RangePadding | String] = js.undefined
  /** Rounds the number to the given number of decimals.
    * @Default {null}
    */
  var roundingPlaces: js.UndefOr[Double] = js.undefined
  /** Specifies the index of the row to which the axis is associated, when the chart area is divided into multiple plot areas by using rowDefinitions.
    * @Default {null}
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the number of row or plot areas an axis has to span vertically.
    * @Default {null}
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
  /** Options for customizing the axis scrollbar.
    */
  var scrollbarSettings: js.UndefOr[PrimaryYAxisScrollbarSettings] = js.undefined
  /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
    * @Default {true}
    */
  var showNextToAxisLine: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the strip lines.
    * @Default {[ ]}
    */
  var stripLine: js.UndefOr[js.Array[PrimaryYAxisStripLine]] = js.undefined
  /** Specifies the position of the axis tick lines.
    * @Default {outside. See TickLinesPosition}
    */
  var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.undefined
  /** Options for customizing the axis title.
    */
  var title: js.UndefOr[PrimaryYAxisTitle] = js.undefined
  /** Specifies the type of data the axis is handling.
    * @Default {null. See ValueType}
    */
  var valueType: js.UndefOr[ValueType | String] = js.undefined
  /** Show/hides the axis.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Values ranges from 0 to 1.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
  /** Position of the zoomed axis. Value ranges from 0 to 1
    * @Default {0}
    */
  var zoomPosition: js.UndefOr[Double] = js.undefined
}

object PrimaryYAxis {
  @scala.inline
  def apply(
    alignment: LabelAlignment | String = null,
    alternateGridBand: PrimaryYAxisAlternateGridBand = null,
    axisLine: PrimaryYAxisAxisLine = null,
    crossesAt: Int | Double = null,
    crossesInAxis: String = null,
    crosshairLabel: PrimaryYAxisCrosshairLabel = null,
    desiredIntervals: Int | Double = null,
    edgeLabelPlacement: EdgeLabelPlacement | String = null,
    enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.undefined,
    enableTrim: js.UndefOr[Boolean] = js.undefined,
    font: PrimaryYAxisFont = null,
    intervalType: IntervalType | String = null,
    isInversed: js.UndefOr[Boolean] = js.undefined,
    labelBorder: PrimaryYAxisLabelBorder = null,
    labelFormat: String = null,
    labelIntersectAction: LabelIntersectAction | String = null,
    labelPlacement: LabelPlacement | String = null,
    labelPosition: LabelPosition | String = null,
    logBase: Int | Double = null,
    majorGridLines: PrimaryYAxisMajorGridLines = null,
    majorTickLines: PrimaryYAxisMajorTickLines = null,
    maximumLabelWidth: Int | Double = null,
    maximumLabels: Int | Double = null,
    minorGridLines: PrimaryYAxisMinorGridLines = null,
    minorTickLines: PrimaryYAxisMinorTickLines = null,
    minorTicksPerInterval: Int | Double = null,
    multiLevelLabels: js.Array[PrimaryYAxisMultiLevelLabel] = null,
    name: String = null,
    opposedPosition: js.UndefOr[Boolean] = js.undefined,
    orientation: AxisOrientation | String = null,
    plotOffset: Int | Double = null,
    range: PrimaryYAxisRange = null,
    rangePadding: RangePadding | String = null,
    roundingPlaces: Int | Double = null,
    rowIndex: Int | Double = null,
    rowSpan: Int | Double = null,
    scrollbarSettings: PrimaryYAxisScrollbarSettings = null,
    showNextToAxisLine: js.UndefOr[Boolean] = js.undefined,
    stripLine: js.Array[PrimaryYAxisStripLine] = null,
    tickLinesPosition: TickLinesPosition | String = null,
    title: PrimaryYAxisTitle = null,
    valueType: ValueType | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomFactor: Int | Double = null,
    zoomPosition: Int | Double = null
  ): PrimaryYAxis = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (alternateGridBand != null) __obj.updateDynamic("alternateGridBand")(alternateGridBand)
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine)
    if (crossesAt != null) __obj.updateDynamic("crossesAt")(crossesAt.asInstanceOf[js.Any])
    if (crossesInAxis != null) __obj.updateDynamic("crossesInAxis")(crossesInAxis)
    if (crosshairLabel != null) __obj.updateDynamic("crosshairLabel")(crosshairLabel)
    if (desiredIntervals != null) __obj.updateDynamic("desiredIntervals")(desiredIntervals.asInstanceOf[js.Any])
    if (edgeLabelPlacement != null) __obj.updateDynamic("edgeLabelPlacement")(edgeLabelPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoIntervalOnZooming)) __obj.updateDynamic("enableAutoIntervalOnZooming")(enableAutoIntervalOnZooming)
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim)
    if (font != null) __obj.updateDynamic("font")(font)
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType.asInstanceOf[js.Any])
    if (!js.isUndefined(isInversed)) __obj.updateDynamic("isInversed")(isInversed)
    if (labelBorder != null) __obj.updateDynamic("labelBorder")(labelBorder)
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat)
    if (labelIntersectAction != null) __obj.updateDynamic("labelIntersectAction")(labelIntersectAction.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (logBase != null) __obj.updateDynamic("logBase")(logBase.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTickLines != null) __obj.updateDynamic("majorTickLines")(majorTickLines)
    if (maximumLabelWidth != null) __obj.updateDynamic("maximumLabelWidth")(maximumLabelWidth.asInstanceOf[js.Any])
    if (maximumLabels != null) __obj.updateDynamic("maximumLabels")(maximumLabels.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTickLines != null) __obj.updateDynamic("minorTickLines")(minorTickLines)
    if (minorTicksPerInterval != null) __obj.updateDynamic("minorTicksPerInterval")(minorTicksPerInterval.asInstanceOf[js.Any])
    if (multiLevelLabels != null) __obj.updateDynamic("multiLevelLabels")(multiLevelLabels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(opposedPosition)) __obj.updateDynamic("opposedPosition")(opposedPosition)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (plotOffset != null) __obj.updateDynamic("plotOffset")(plotOffset.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (rangePadding != null) __obj.updateDynamic("rangePadding")(rangePadding.asInstanceOf[js.Any])
    if (roundingPlaces != null) __obj.updateDynamic("roundingPlaces")(roundingPlaces.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (scrollbarSettings != null) __obj.updateDynamic("scrollbarSettings")(scrollbarSettings)
    if (!js.isUndefined(showNextToAxisLine)) __obj.updateDynamic("showNextToAxisLine")(showNextToAxisLine)
    if (stripLine != null) __obj.updateDynamic("stripLine")(stripLine)
    if (tickLinesPosition != null) __obj.updateDynamic("tickLinesPosition")(tickLinesPosition.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    if (zoomPosition != null) __obj.updateDynamic("zoomPosition")(zoomPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxis]
  }
}


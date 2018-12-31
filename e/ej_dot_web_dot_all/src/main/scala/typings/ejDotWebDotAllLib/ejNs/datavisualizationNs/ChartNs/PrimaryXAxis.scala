package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxis extends js.Object {
  /** Specifies the position of the axis labels.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[LabelAlignment | java.lang.String] = js.undefined
  /** Options for customizing horizontal axis alternate grid band.
    */
  var alternateGridBand: js.UndefOr[PrimaryXAxisAlternateGridBand] = js.undefined
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[PrimaryXAxisAxisLine] = js.undefined
  /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
    * @Default {null}
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the number of columns or plot areas an axis has to span horizontally.
    * @Default {null}
    */
  var columnSpan: js.UndefOr[scala.Double] = js.undefined
  /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
    * value of crossing axis, then axis will be placed at the opposite side.
    * @Default {null}
    */
  var crossesAt: js.UndefOr[scala.Double] = js.undefined
  /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
    * axis or primary Y axis will be used for crossing
    * @Default {null}
    */
  var crossesInAxis: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the crosshair label.
    */
  var crosshairLabel: js.UndefOr[PrimaryXAxisCrosshairLabel] = js.undefined
  /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
    * @Default {null}
    */
  var desiredIntervals: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position of labels at the edge of the axis.
    * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
    */
  var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | java.lang.String] = js.undefined
  /** Specifies the interval of the axis according to the zoomed data of the chart.
    * @Default {true}
    */
  var enableAutoIntervalOnZooming: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the font of the axis Labels.
    */
  var font: js.UndefOr[PrimaryXAxisFont] = js.undefined
  /** Specifies the type of interval in date time axis.
    * @Default {null. See IntervalType}
    */
  var intervalType: js.UndefOr[IntervalType | java.lang.String] = js.undefined
  /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
    * @Default {false}
    */
  var isIndexed: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to inverse the axis.
    * @Default {false}
    */
  var isInversed: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the border of the labels.
    */
  var labelBorder: js.UndefOr[PrimaryXAxisLabelBorder] = js.undefined
  /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
    * @Default {null}
    */
  var labelFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the action to take when the axis labels are overlapping with each other.
    * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | java.lang.String] = js.undefined
  /** Specifies the placement of labels.
    * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | java.lang.String] = js.undefined
  /** Specifies the position of the axis labels.
    * @Default {outside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | java.lang.String] = js.undefined
  /** Angle in degrees to rotate the axis labels.
    * @Default {null}
    */
  var labelRotation: js.UndefOr[scala.Double] = js.undefined
  /** Logarithmic base value. This is applicable only for logarithmic axis.
    * @Default {10}
    */
  var logBase: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing major gird lines.
    */
  var majorGridLines: js.UndefOr[PrimaryXAxisMajorGridLines] = js.undefined
  /** Options for customizing the major tick lines.
    */
  var majorTickLines: js.UndefOr[PrimaryXAxisMajorTickLines] = js.undefined
  /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
    * @Default {34}
    */
  var maximumLabelWidth: js.UndefOr[scala.Double] = js.undefined
  /** Maximum number of labels to be displayed in every 100 pixels.
    * @Default {3}
    */
  var maximumLabels: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the minor grid lines.
    */
  var minorGridLines: js.UndefOr[PrimaryXAxisMinorGridLines] = js.undefined
  /** Options for customizing the minor tick lines.
    */
  var minorTickLines: js.UndefOr[PrimaryXAxisMinorTickLines] = js.undefined
  /** Specifies the number of minor ticks per interval.
    * @Default {null}
    */
  var minorTicksPerInterval: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the multi level labels.
    * @Default {[ ]}
    */
  var multiLevelLabels: js.UndefOr[js.Array[PrimaryXAxisMultiLevelLabel]] = js.undefined
  /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
    * @Default {null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether to render the axis at the opposite side of its default position.
    * @Default {false}
    */
  var opposedPosition: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the orientation of the axis line
    * @Default {Horizontal}
    */
  var orientation: js.UndefOr[AxisOrientation | java.lang.String] = js.undefined
  /** Specifies the padding for the plot area.
    * @Default {10}
    */
  var plotOffset: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the range of the axis.
    */
  var range: js.UndefOr[PrimaryXAxisRange] = js.undefined
  /** Specifies the padding for the axis range.
    * @Default {None. See RangePadding}
    */
  var rangePadding: js.UndefOr[RangePadding | java.lang.String] = js.undefined
  /** Rounds the number to the given number of decimals.
    * @Default {null}
    */
  var roundingPlaces: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the axis scrollbar
    */
  var scrollbarSettings: js.UndefOr[PrimaryXAxisScrollbarSettings] = js.undefined
  /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
    * @Default {true}
    */
  var showNextToAxisLine: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the strip lines.
    * @Default {[ ]}
    */
  var stripLine: js.UndefOr[js.Array[PrimaryXAxisStripLine]] = js.undefined
  /** Specifies the position of the axis tick lines.
    * @Default {outside. See TickLinesPosition}
    */
  var tickLinesPosition: js.UndefOr[TickLinesPosition | java.lang.String] = js.undefined
  /** Options for customizing the axis title.
    */
  var title: js.UndefOr[PrimaryXAxisTitle] = js.undefined
  /** Specifies the type of data the axis is handling.
    * @Default {null. See ValueType}
    */
  var valueType: js.UndefOr[ValueType | java.lang.String] = js.undefined
  /** Show/hides the axis.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
  /** Position of the zoomed axis. Value ranges from 0 to 1.
    * @Default {0}
    */
  var zoomPosition: js.UndefOr[scala.Double] = js.undefined
}


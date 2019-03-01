package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptions extends js.Object {
  /** Specifies animation duration for series rendering
    * @Default {null}
    */
  var animationDuration: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the border of all the series.
    */
  var border: js.UndefOr[CommonSeriesOptionsBorder] = js.undefined
  /** Quartile calculation has been performed in three different formulas to render the box and whisker series.
    * @Default {exclusive}
    */
  var boxPlotMode: js.UndefOr[boxPlotMode | java.lang.String] = js.undefined
  /** Options for customizing the bubble options of the Bubble series
    */
  var bubbleOptions: js.UndefOr[CommonSeriesOptionsBubbleOptions] = js.undefined
  /** Specifies spline tension value for cardinal spline type. Value ranges from 0 to 1.
    * @Default {0.5}
    */
  var cardinalSplineTension: js.UndefOr[scala.Double] = js.undefined
  /** Name of the property in the datasource that contains close value for the series.
    * @Default {null}
    */
  var close: js.UndefOr[java.lang.String] = js.undefined
  /** To render the column and bar type series in rectangle/cylinder shape. See
    * @Default {rectangle}
    */
  var columnFacet: js.UndefOr[ColumnFacet | java.lang.String] = js.undefined
  /** Spacing between columns of different series. Value ranges from 0 to 1
    * @Default {0}
    */
  var columnSpacing: js.UndefOr[scala.Double] = js.undefined
  /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
    * @Default {0.7}
    */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the waterfall connector line.
    */
  var connectorLine: js.UndefOr[CommonSeriesOptionsConnectorLine] = js.undefined
  /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
    */
  var cornerRadius: js.UndefOr[CommonSeriesOptionsCornerRadius] = js.undefined
  /** Pattern of dashes and gaps used to stroke all the line type series.
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Set the dataSource for all series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1
    * @Default {0.4}
    */
  var doughnutCoefficient: js.UndefOr[scala.Double] = js.undefined
  /** Controls the size of the doughnut series. Value ranges from 0 to 1.
    * @Default {0.8}
    */
  var doughnutSize: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the drag and drop in series.
    */
  var dragSettings: js.UndefOr[CommonSeriesOptionsDragSettings] = js.undefined
  /** Specifies the type of series to be drawn in radar or polar series.
    * @Default {line. See DrawType}
    */
  var drawType: js.UndefOr[DrawType | java.lang.String] = js.undefined
  /** Options for customizing the empty point in the series.
    */
  var emptyPointSettings: js.UndefOr[CommonSeriesOptionsEmptyPointSettings] = js.undefined
  /** Enable/disable the animation for all the series.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** To avoid overlapping of data labels smartly.
    * @Default {true}
    */
  var enableSmartLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Start angle of pie/doughnut series.
    * @Default {null}
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the error bar in series.
    */
  var errorBar: js.UndefOr[CommonSeriesOptionsErrorBar] = js.undefined
  /** Explodes the pie/doughnut slices on mouse move.
    * @Default {false}
    */
  var explode: js.UndefOr[scala.Boolean] = js.undefined
  /** Explodes all the slice of pie/doughnut on render.
    * @Default {false}
    */
  var explodeAll: js.UndefOr[scala.Boolean] = js.undefined
  /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
    * @Default {null}
    */
  var explodeIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the distance of the slice from the center, when it is exploded.
    * @Default {0.4}
    */
  var explodeOffset: js.UndefOr[scala.Double] = js.undefined
  /** Fill color for all the series.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the font of all the series.
    */
  var font: js.UndefOr[CommonSeriesOptionsFont] = js.undefined
  /** Sets the height of the funnel in funnel series. Values can be either pixel or percentage.
    * @Default {32.7%}
    */
  var funnelHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the width of the funnel in funnel series. Values can be either pixel or percentage.
    * @Default {11.6%}
    */
  var funnelWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Gap between the slices in pyramid and funnel series.
    * @Default {0}
    */
  var gapRatio: js.UndefOr[scala.Double] = js.undefined
  /** Distance between the two pie's in pieOfPie series.
    * @Default {50}
    */
  var gapWidth: js.UndefOr[scala.Double] = js.undefined
  /** Name of the property in the datasource that contains high value for the series.
    * @Default {null}
    */
  var high: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the appearance of the series or data point while highlighting.
    */
  var highlightSettings: js.UndefOr[CommonSeriesOptionsHighlightSettings] = js.undefined
  /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
    * @Default {true}
    */
  var isClosed: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to stack the column series in polar/radar charts.
    * @Default {false}
    */
  var isStacking: js.UndefOr[scala.Boolean] = js.undefined
  /** Renders the chart vertically. This is applicable only for Cartesian type series.
    * @Default {false}
    */
  var isTransposed: js.UndefOr[scala.Boolean] = js.undefined
  /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
    * @Default {inside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | java.lang.String] = js.undefined
  /** Specifies the line cap of the series.
    * @Default {butt. See LineCap}
    */
  var lineCap: js.UndefOr[LineCap | java.lang.String] = js.undefined
  /** Specifies the type of shape to be used where two lines meet.
    * @Default {round. See LineJoin}
    */
  var lineJoin: js.UndefOr[LineJoin | java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains low value for the series.
    * @Default {null}
    */
  var low: js.UndefOr[java.lang.String] = js.undefined
  /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
    */
  var marker: js.UndefOr[CommonSeriesOptionsMarker] = js.undefined
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Name of the property in the datasource that contains open value for the series.
    * @Default {null}
    */
  var open: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the outlier of the series.
    */
  var outlierSettings: js.UndefOr[CommonSeriesOptionsOutlierSettings] = js.undefined
  /** Name of a field in data source, where the fill color for all the data points is generated.
    */
  var palette: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the size of pie series. Value ranges from 0 to 1.
    * @Default {0.8}
    */
  var pieCoefficient: js.UndefOr[scala.Double] = js.undefined
  /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
    * @Default {0.6}
    */
  var pieOfPieCoefficient: js.UndefOr[scala.Double] = js.undefined
  /** Name of the property in the datasource that contains fill color for the series.
    * @Default {null}
    */
  var pointColorMappingName: js.UndefOr[java.lang.String] = js.undefined
  /** Fill color for the positive column of the waterfall.
    * @Default {null}
    */
  var positiveFill: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of the pyramid series.
    * @Default {linear. See PyramidMode}
    */
  var pyramidMode: js.UndefOr[PyramidMode | java.lang.String] = js.undefined
  /** Options for customizing the appearance of the series/data point on selection.
    */
  var selectionSettings: js.UndefOr[CommonSeriesOptionsSelectionSettings] = js.undefined
  /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
    * @Default {true}
    */
  var showMedian: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the property in the datasource that contains the size value for the bubble series.
    * @Default {null}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** To render the spline series curve in different forms.
    * @Default {natural. See SplineType}
    */
  var splineType: js.UndefOr[SplineType | java.lang.String] = js.undefined
  /** Specifies the mode for splitting the data points in pieOfPie series.
    * @Default {value. See SplitMode}
    */
  var splitMode: js.UndefOr[SplitMode | java.lang.String] = js.undefined
  /** Split Value of pieOfPie series.
    * @Default {null}
    */
  var splitValue: js.UndefOr[java.lang.String] = js.undefined
  /** Group of the stacking collection series.
    */
  var stackingGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Start angle from where the pie/doughnut series renders. By default it starts from 0.
    * @Default {null}
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the tooltip of chart.
    */
  var tooltip: js.UndefOr[CommonSeriesOptionsTooltip] = js.undefined
  /** Option to add the trendlines to chart.
    */
  var trendlines: js.UndefOr[js.Array[CommonSeriesOptionsTrendline]] = js.undefined
  /** Specifies the type of the series to render in chart.
    * @Default {column. See Type}
    */
  var `type`: js.UndefOr[Type | java.lang.String] = js.undefined
  /** Enables or disables the visibility of legend item.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
    * @Default {null}
    */
  var xAxisName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
    * @Default {null}
    */
  var yAxisName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[java.lang.String] = js.undefined
  /** Z-order of the series.
    * @Default {0}
    */
  var zOrder: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptions {
  @scala.inline
  def apply(
    animationDuration: java.lang.String = null,
    border: CommonSeriesOptionsBorder = null,
    boxPlotMode: boxPlotMode | java.lang.String = null,
    bubbleOptions: CommonSeriesOptionsBubbleOptions = null,
    cardinalSplineTension: scala.Int | scala.Double = null,
    close: java.lang.String = null,
    columnFacet: ColumnFacet | java.lang.String = null,
    columnSpacing: scala.Int | scala.Double = null,
    columnWidth: scala.Int | scala.Double = null,
    connectorLine: CommonSeriesOptionsConnectorLine = null,
    cornerRadius: CommonSeriesOptionsCornerRadius = null,
    dashArray: java.lang.String = null,
    dataSource: js.Any = null,
    doughnutCoefficient: scala.Int | scala.Double = null,
    doughnutSize: scala.Int | scala.Double = null,
    dragSettings: CommonSeriesOptionsDragSettings = null,
    drawType: DrawType | java.lang.String = null,
    emptyPointSettings: CommonSeriesOptionsEmptyPointSettings = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableSmartLabels: js.UndefOr[scala.Boolean] = js.undefined,
    endAngle: scala.Int | scala.Double = null,
    errorBar: CommonSeriesOptionsErrorBar = null,
    explode: js.UndefOr[scala.Boolean] = js.undefined,
    explodeAll: js.UndefOr[scala.Boolean] = js.undefined,
    explodeIndex: scala.Int | scala.Double = null,
    explodeOffset: scala.Int | scala.Double = null,
    fill: java.lang.String = null,
    font: CommonSeriesOptionsFont = null,
    funnelHeight: java.lang.String = null,
    funnelWidth: java.lang.String = null,
    gapRatio: scala.Int | scala.Double = null,
    gapWidth: scala.Int | scala.Double = null,
    high: java.lang.String = null,
    highlightSettings: CommonSeriesOptionsHighlightSettings = null,
    isClosed: js.UndefOr[scala.Boolean] = js.undefined,
    isStacking: js.UndefOr[scala.Boolean] = js.undefined,
    isTransposed: js.UndefOr[scala.Boolean] = js.undefined,
    labelPosition: LabelPosition | java.lang.String = null,
    lineCap: LineCap | java.lang.String = null,
    lineJoin: LineJoin | java.lang.String = null,
    low: java.lang.String = null,
    marker: CommonSeriesOptionsMarker = null,
    opacity: scala.Int | scala.Double = null,
    open: java.lang.String = null,
    outlierSettings: CommonSeriesOptionsOutlierSettings = null,
    palette: java.lang.String = null,
    pieCoefficient: scala.Int | scala.Double = null,
    pieOfPieCoefficient: scala.Int | scala.Double = null,
    pointColorMappingName: java.lang.String = null,
    positiveFill: java.lang.String = null,
    pyramidMode: PyramidMode | java.lang.String = null,
    selectionSettings: CommonSeriesOptionsSelectionSettings = null,
    showMedian: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    splineType: SplineType | java.lang.String = null,
    splitMode: SplitMode | java.lang.String = null,
    splitValue: java.lang.String = null,
    stackingGroup: java.lang.String = null,
    startAngle: scala.Int | scala.Double = null,
    tooltip: CommonSeriesOptionsTooltip = null,
    trendlines: js.Array[CommonSeriesOptionsTrendline] = null,
    `type`: Type | java.lang.String = null,
    visibleOnLegend: java.lang.String = null,
    xAxisName: java.lang.String = null,
    xName: java.lang.String = null,
    yAxisName: java.lang.String = null,
    yName: java.lang.String = null,
    zOrder: scala.Int | scala.Double = null
  ): CommonSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration)
    if (border != null) __obj.updateDynamic("border")(border)
    if (boxPlotMode != null) __obj.updateDynamic("boxPlotMode")(boxPlotMode.asInstanceOf[js.Any])
    if (bubbleOptions != null) __obj.updateDynamic("bubbleOptions")(bubbleOptions)
    if (cardinalSplineTension != null) __obj.updateDynamic("cardinalSplineTension")(cardinalSplineTension.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close)
    if (columnFacet != null) __obj.updateDynamic("columnFacet")(columnFacet.asInstanceOf[js.Any])
    if (columnSpacing != null) __obj.updateDynamic("columnSpacing")(columnSpacing.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (connectorLine != null) __obj.updateDynamic("connectorLine")(connectorLine)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (doughnutCoefficient != null) __obj.updateDynamic("doughnutCoefficient")(doughnutCoefficient.asInstanceOf[js.Any])
    if (doughnutSize != null) __obj.updateDynamic("doughnutSize")(doughnutSize.asInstanceOf[js.Any])
    if (dragSettings != null) __obj.updateDynamic("dragSettings")(dragSettings)
    if (drawType != null) __obj.updateDynamic("drawType")(drawType.asInstanceOf[js.Any])
    if (emptyPointSettings != null) __obj.updateDynamic("emptyPointSettings")(emptyPointSettings)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableSmartLabels)) __obj.updateDynamic("enableSmartLabels")(enableSmartLabels)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (errorBar != null) __obj.updateDynamic("errorBar")(errorBar)
    if (!js.isUndefined(explode)) __obj.updateDynamic("explode")(explode)
    if (!js.isUndefined(explodeAll)) __obj.updateDynamic("explodeAll")(explodeAll)
    if (explodeIndex != null) __obj.updateDynamic("explodeIndex")(explodeIndex.asInstanceOf[js.Any])
    if (explodeOffset != null) __obj.updateDynamic("explodeOffset")(explodeOffset.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (funnelHeight != null) __obj.updateDynamic("funnelHeight")(funnelHeight)
    if (funnelWidth != null) __obj.updateDynamic("funnelWidth")(funnelWidth)
    if (gapRatio != null) __obj.updateDynamic("gapRatio")(gapRatio.asInstanceOf[js.Any])
    if (gapWidth != null) __obj.updateDynamic("gapWidth")(gapWidth.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high)
    if (highlightSettings != null) __obj.updateDynamic("highlightSettings")(highlightSettings)
    if (!js.isUndefined(isClosed)) __obj.updateDynamic("isClosed")(isClosed)
    if (!js.isUndefined(isStacking)) __obj.updateDynamic("isStacking")(isStacking)
    if (!js.isUndefined(isTransposed)) __obj.updateDynamic("isTransposed")(isTransposed)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (outlierSettings != null) __obj.updateDynamic("outlierSettings")(outlierSettings)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (pieCoefficient != null) __obj.updateDynamic("pieCoefficient")(pieCoefficient.asInstanceOf[js.Any])
    if (pieOfPieCoefficient != null) __obj.updateDynamic("pieOfPieCoefficient")(pieOfPieCoefficient.asInstanceOf[js.Any])
    if (pointColorMappingName != null) __obj.updateDynamic("pointColorMappingName")(pointColorMappingName)
    if (positiveFill != null) __obj.updateDynamic("positiveFill")(positiveFill)
    if (pyramidMode != null) __obj.updateDynamic("pyramidMode")(pyramidMode.asInstanceOf[js.Any])
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings)
    if (!js.isUndefined(showMedian)) __obj.updateDynamic("showMedian")(showMedian)
    if (size != null) __obj.updateDynamic("size")(size)
    if (splineType != null) __obj.updateDynamic("splineType")(splineType.asInstanceOf[js.Any])
    if (splitMode != null) __obj.updateDynamic("splitMode")(splitMode.asInstanceOf[js.Any])
    if (splitValue != null) __obj.updateDynamic("splitValue")(splitValue)
    if (stackingGroup != null) __obj.updateDynamic("stackingGroup")(stackingGroup)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (trendlines != null) __obj.updateDynamic("trendlines")(trendlines)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visibleOnLegend != null) __obj.updateDynamic("visibleOnLegend")(visibleOnLegend)
    if (xAxisName != null) __obj.updateDynamic("xAxisName")(xAxisName)
    if (xName != null) __obj.updateDynamic("xName")(xName)
    if (yAxisName != null) __obj.updateDynamic("yAxisName")(yAxisName)
    if (yName != null) __obj.updateDynamic("yName")(yName)
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptions]
  }
}


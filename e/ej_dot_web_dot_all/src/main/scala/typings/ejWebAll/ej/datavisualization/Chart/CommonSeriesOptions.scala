package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonSeriesOptions extends js.Object {
  
  /** Specifies animation duration for series rendering
    * @Default {null}
    */
  var animationDuration: js.UndefOr[String] = js.native
  
  /** Options to customize the border of all the series.
    */
  var border: js.UndefOr[CommonSeriesOptionsBorder] = js.native
  
  /** Quartile calculation has been performed in three different formulas to render the box and whisker series.
    * @Default {exclusive}
    */
  var boxPlotMode: js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.boxPlotMode | String] = js.native
  
  /** Options for customizing the bubble options of the Bubble series
    */
  var bubbleOptions: js.UndefOr[CommonSeriesOptionsBubbleOptions] = js.native
  
  /** Specifies spline tension value for cardinal spline type. Value ranges from 0 to 1.
    * @Default {0.5}
    */
  var cardinalSplineTension: js.UndefOr[Double] = js.native
  
  /** Name of the property in the datasource that contains close value for the series.
    * @Default {null}
    */
  var close: js.UndefOr[String] = js.native
  
  /** To render the column and bar type series in rectangle/cylinder shape. See
    * @Default {rectangle}
    */
  var columnFacet: js.UndefOr[ColumnFacet | String] = js.native
  
  /** Spacing between columns of different series. Value ranges from 0 to 1
    * @Default {0}
    */
  var columnSpacing: js.UndefOr[Double] = js.native
  
  /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
    * @Default {0.7}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  
  /** Options for customizing the waterfall connector line.
    */
  var connectorLine: js.UndefOr[CommonSeriesOptionsConnectorLine] = js.native
  
  /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
    */
  var cornerRadius: js.UndefOr[CommonSeriesOptionsCornerRadius] = js.native
  
  /** Pattern of dashes and gaps used to stroke all the line type series.
    */
  var dashArray: js.UndefOr[String] = js.native
  
  /** Set the dataSource for all series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1
    * @Default {0.4}
    */
  var doughnutCoefficient: js.UndefOr[Double] = js.native
  
  /** Controls the size of the doughnut series. Value ranges from 0 to 1.
    * @Default {0.8}
    */
  var doughnutSize: js.UndefOr[Double] = js.native
  
  /** Options to customize the drag and drop in series.
    */
  var dragSettings: js.UndefOr[CommonSeriesOptionsDragSettings] = js.native
  
  /** Specifies the type of series to be drawn in radar or polar series.
    * @Default {line. See DrawType}
    */
  var drawType: js.UndefOr[DrawType | String] = js.native
  
  /** Options for customizing the empty point in the series.
    */
  var emptyPointSettings: js.UndefOr[CommonSeriesOptionsEmptyPointSettings] = js.native
  
  /** Enable/disable the animation for all the series.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** To avoid overlapping of data labels smartly.
    * @Default {true}
    */
  var enableSmartLabels: js.UndefOr[Boolean] = js.native
  
  /** Start angle of pie/doughnut series.
    * @Default {null}
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /** Options to customize the error bar in series.
    */
  var errorBar: js.UndefOr[CommonSeriesOptionsErrorBar] = js.native
  
  /** Explodes the pie/doughnut slices on mouse move.
    * @Default {false}
    */
  var explode: js.UndefOr[Boolean] = js.native
  
  /** Explodes all the slice of pie/doughnut on render.
    * @Default {false}
    */
  var explodeAll: js.UndefOr[Boolean] = js.native
  
  /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
    * @Default {null}
    */
  var explodeIndex: js.UndefOr[Double] = js.native
  
  /** Specifies the distance of the slice from the center, when it is exploded.
    * @Default {0.4}
    */
  var explodeOffset: js.UndefOr[Double] = js.native
  
  /** Fill color for all the series.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** Options for customizing the font of all the series.
    */
  var font: js.UndefOr[CommonSeriesOptionsFont] = js.native
  
  /** Sets the height of the funnel in funnel series. Values can be either pixel or percentage.
    * @Default {32.7%}
    */
  var funnelHeight: js.UndefOr[String] = js.native
  
  /** Sets the width of the funnel in funnel series. Values can be either pixel or percentage.
    * @Default {11.6%}
    */
  var funnelWidth: js.UndefOr[String] = js.native
  
  /** Gap between the slices in pyramid and funnel series.
    * @Default {0}
    */
  var gapRatio: js.UndefOr[Double] = js.native
  
  /** Distance between the two pie's in pieOfPie series.
    * @Default {50}
    */
  var gapWidth: js.UndefOr[Double] = js.native
  
  /** Name of the property in the datasource that contains high value for the series.
    * @Default {null}
    */
  var high: js.UndefOr[String] = js.native
  
  /** Options for customizing the appearance of the series or data point while highlighting.
    */
  var highlightSettings: js.UndefOr[CommonSeriesOptionsHighlightSettings] = js.native
  
  /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
    * @Default {true}
    */
  var isClosed: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to stack the column series in polar/radar charts.
    * @Default {false}
    */
  var isStacking: js.UndefOr[Boolean] = js.native
  
  /** Renders the chart vertically. This is applicable only for Cartesian type series.
    * @Default {false}
    */
  var isTransposed: js.UndefOr[Boolean] = js.native
  
  /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
    * @Default {inside. See LabelPosition}
    */
  var labelPosition: js.UndefOr[LabelPosition | String] = js.native
  
  /** Specifies the line cap of the series.
    * @Default {butt. See LineCap}
    */
  var lineCap: js.UndefOr[LineCap | String] = js.native
  
  /** Specifies the type of shape to be used where two lines meet.
    * @Default {round. See LineJoin}
    */
  var lineJoin: js.UndefOr[LineJoin | String] = js.native
  
  /** Name of the property in the datasource that contains low value for the series.
    * @Default {null}
    */
  var low: js.UndefOr[String] = js.native
  
  /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
    */
  var marker: js.UndefOr[CommonSeriesOptionsMarker] = js.native
  
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Name of the property in the datasource that contains open value for the series.
    * @Default {null}
    */
  var open: js.UndefOr[String] = js.native
  
  /** Options for customizing the outlier of the series.
    */
  var outlierSettings: js.UndefOr[CommonSeriesOptionsOutlierSettings] = js.native
  
  /** Name of a field in data source, where the fill color for all the data points is generated.
    */
  var palette: js.UndefOr[String] = js.native
  
  /** Controls the size of pie series. Value ranges from 0 to 1.
    * @Default {0.8}
    */
  var pieCoefficient: js.UndefOr[Double] = js.native
  
  /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
    * @Default {0.6}
    */
  var pieOfPieCoefficient: js.UndefOr[Double] = js.native
  
  /** Name of the property in the datasource that contains fill color for the series.
    * @Default {null}
    */
  var pointColorMappingName: js.UndefOr[String] = js.native
  
  /** Fill color for the positive column of the waterfall.
    * @Default {null}
    */
  var positiveFill: js.UndefOr[String] = js.native
  
  /** Specifies the mode of the pyramid series.
    * @Default {linear. See PyramidMode}
    */
  var pyramidMode: js.UndefOr[PyramidMode | String] = js.native
  
  /** Options for customizing the appearance of the series/data point on selection.
    */
  var selectionSettings: js.UndefOr[CommonSeriesOptionsSelectionSettings] = js.native
  
  /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
    * @Default {true}
    */
  var showMedian: js.UndefOr[Boolean] = js.native
  
  /** Name of the property in the datasource that contains the size value for the bubble series.
    * @Default {null}
    */
  var size: js.UndefOr[String] = js.native
  
  /** To render the spline series curve in different forms.
    * @Default {natural. See SplineType}
    */
  var splineType: js.UndefOr[SplineType | String] = js.native
  
  /** Specifies the mode for splitting the data points in pieOfPie series.
    * @Default {value. See SplitMode}
    */
  var splitMode: js.UndefOr[SplitMode | String] = js.native
  
  /** Split Value of pieOfPie series.
    * @Default {null}
    */
  var splitValue: js.UndefOr[String] = js.native
  
  /** Group of the stacking collection series.
    */
  var stackingGroup: js.UndefOr[String] = js.native
  
  /** Start angle from where the pie/doughnut series renders. By default it starts from 0.
    * @Default {null}
    */
  var startAngle: js.UndefOr[Double] = js.native
  
  /** Options for customizing the tooltip of chart.
    */
  var tooltip: js.UndefOr[CommonSeriesOptionsTooltip] = js.native
  
  /** Option to add the trendlines to chart.
    */
  var trendlines: js.UndefOr[js.Array[CommonSeriesOptionsTrendline]] = js.native
  
  /** Specifies the type of the series to render in chart.
    * @Default {column. See Type}
    */
  var `type`: js.UndefOr[Type | String] = js.native
  
  /** Enables or disables the visibility of legend item.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.native
  
  /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
    * @Default {null}
    */
  var xAxisName: js.UndefOr[String] = js.native
  
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.native
  
  /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
    * @Default {null}
    */
  var yAxisName: js.UndefOr[String] = js.native
  
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.native
  
  /** Z-order of the series.
    * @Default {0}
    */
  var zOrder: js.UndefOr[Double] = js.native
}
object CommonSeriesOptions {
  
  @scala.inline
  def apply(): CommonSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptions]
  }
  
  @scala.inline
  implicit class CommonSeriesOptionsOps[Self <: CommonSeriesOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: String): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setBorder(value: CommonSeriesOptionsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBoxPlotMode(value: boxPlotMode | String): Self = this.set("boxPlotMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxPlotMode: Self = this.set("boxPlotMode", js.undefined)
    
    @scala.inline
    def setBubbleOptions(value: CommonSeriesOptionsBubbleOptions): Self = this.set("bubbleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleOptions: Self = this.set("bubbleOptions", js.undefined)
    
    @scala.inline
    def setCardinalSplineTension(value: Double): Self = this.set("cardinalSplineTension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardinalSplineTension: Self = this.set("cardinalSplineTension", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setColumnFacet(value: ColumnFacet | String): Self = this.set("columnFacet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFacet: Self = this.set("columnFacet", js.undefined)
    
    @scala.inline
    def setColumnSpacing(value: Double): Self = this.set("columnSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSpacing: Self = this.set("columnSpacing", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setConnectorLine(value: CommonSeriesOptionsConnectorLine): Self = this.set("connectorLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorLine: Self = this.set("connectorLine", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: CommonSeriesOptionsCornerRadius): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setDashArray(value: String): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDoughnutCoefficient(value: Double): Self = this.set("doughnutCoefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoughnutCoefficient: Self = this.set("doughnutCoefficient", js.undefined)
    
    @scala.inline
    def setDoughnutSize(value: Double): Self = this.set("doughnutSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoughnutSize: Self = this.set("doughnutSize", js.undefined)
    
    @scala.inline
    def setDragSettings(value: CommonSeriesOptionsDragSettings): Self = this.set("dragSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragSettings: Self = this.set("dragSettings", js.undefined)
    
    @scala.inline
    def setDrawType(value: DrawType | String): Self = this.set("drawType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawType: Self = this.set("drawType", js.undefined)
    
    @scala.inline
    def setEmptyPointSettings(value: CommonSeriesOptionsEmptyPointSettings): Self = this.set("emptyPointSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyPointSettings: Self = this.set("emptyPointSettings", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnableSmartLabels(value: Boolean): Self = this.set("enableSmartLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSmartLabels: Self = this.set("enableSmartLabels", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setErrorBar(value: CommonSeriesOptionsErrorBar): Self = this.set("errorBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorBar: Self = this.set("errorBar", js.undefined)
    
    @scala.inline
    def setExplode(value: Boolean): Self = this.set("explode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplode: Self = this.set("explode", js.undefined)
    
    @scala.inline
    def setExplodeAll(value: Boolean): Self = this.set("explodeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplodeAll: Self = this.set("explodeAll", js.undefined)
    
    @scala.inline
    def setExplodeIndex(value: Double): Self = this.set("explodeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplodeIndex: Self = this.set("explodeIndex", js.undefined)
    
    @scala.inline
    def setExplodeOffset(value: Double): Self = this.set("explodeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplodeOffset: Self = this.set("explodeOffset", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFont(value: CommonSeriesOptionsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFunnelHeight(value: String): Self = this.set("funnelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunnelHeight: Self = this.set("funnelHeight", js.undefined)
    
    @scala.inline
    def setFunnelWidth(value: String): Self = this.set("funnelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunnelWidth: Self = this.set("funnelWidth", js.undefined)
    
    @scala.inline
    def setGapRatio(value: Double): Self = this.set("gapRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapRatio: Self = this.set("gapRatio", js.undefined)
    
    @scala.inline
    def setGapWidth(value: Double): Self = this.set("gapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapWidth: Self = this.set("gapWidth", js.undefined)
    
    @scala.inline
    def setHigh(value: String): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setHighlightSettings(value: CommonSeriesOptionsHighlightSettings): Self = this.set("highlightSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSettings: Self = this.set("highlightSettings", js.undefined)
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = this.set("isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClosed: Self = this.set("isClosed", js.undefined)
    
    @scala.inline
    def setIsStacking(value: Boolean): Self = this.set("isStacking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStacking: Self = this.set("isStacking", js.undefined)
    
    @scala.inline
    def setIsTransposed(value: Boolean): Self = this.set("isTransposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTransposed: Self = this.set("isTransposed", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: LabelPosition | String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLineCap(value: LineCap | String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setLineJoin(value: LineJoin | String): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setLow(value: String): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setMarker(value: CommonSeriesOptionsMarker): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOutlierSettings(value: CommonSeriesOptionsOutlierSettings): Self = this.set("outlierSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlierSettings: Self = this.set("outlierSettings", js.undefined)
    
    @scala.inline
    def setPalette(value: String): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPieCoefficient(value: Double): Self = this.set("pieCoefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieCoefficient: Self = this.set("pieCoefficient", js.undefined)
    
    @scala.inline
    def setPieOfPieCoefficient(value: Double): Self = this.set("pieOfPieCoefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieOfPieCoefficient: Self = this.set("pieOfPieCoefficient", js.undefined)
    
    @scala.inline
    def setPointColorMappingName(value: String): Self = this.set("pointColorMappingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointColorMappingName: Self = this.set("pointColorMappingName", js.undefined)
    
    @scala.inline
    def setPositiveFill(value: String): Self = this.set("positiveFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositiveFill: Self = this.set("positiveFill", js.undefined)
    
    @scala.inline
    def setPyramidMode(value: PyramidMode | String): Self = this.set("pyramidMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePyramidMode: Self = this.set("pyramidMode", js.undefined)
    
    @scala.inline
    def setSelectionSettings(value: CommonSeriesOptionsSelectionSettings): Self = this.set("selectionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionSettings: Self = this.set("selectionSettings", js.undefined)
    
    @scala.inline
    def setShowMedian(value: Boolean): Self = this.set("showMedian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMedian: Self = this.set("showMedian", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSplineType(value: SplineType | String): Self = this.set("splineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplineType: Self = this.set("splineType", js.undefined)
    
    @scala.inline
    def setSplitMode(value: SplitMode | String): Self = this.set("splitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitMode: Self = this.set("splitMode", js.undefined)
    
    @scala.inline
    def setSplitValue(value: String): Self = this.set("splitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitValue: Self = this.set("splitValue", js.undefined)
    
    @scala.inline
    def setStackingGroup(value: String): Self = this.set("stackingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackingGroup: Self = this.set("stackingGroup", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setTooltip(value: CommonSeriesOptionsTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTrendlinesVarargs(value: CommonSeriesOptionsTrendline*): Self = this.set("trendlines", js.Array(value :_*))
    
    @scala.inline
    def setTrendlines(value: js.Array[CommonSeriesOptionsTrendline]): Self = this.set("trendlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendlines: Self = this.set("trendlines", js.undefined)
    
    @scala.inline
    def setType(value: Type | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisibleOnLegend(value: String): Self = this.set("visibleOnLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleOnLegend: Self = this.set("visibleOnLegend", js.undefined)
    
    @scala.inline
    def setXAxisName(value: String): Self = this.set("xAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisName: Self = this.set("xAxisName", js.undefined)
    
    @scala.inline
    def setXName(value: String): Self = this.set("xName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXName: Self = this.set("xName", js.undefined)
    
    @scala.inline
    def setYAxisName(value: String): Self = this.set("yAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisName: Self = this.set("yAxisName", js.undefined)
    
    @scala.inline
    def setYName(value: String): Self = this.set("yName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYName: Self = this.set("yName", js.undefined)
    
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZOrder: Self = this.set("zOrder", js.undefined)
  }
}

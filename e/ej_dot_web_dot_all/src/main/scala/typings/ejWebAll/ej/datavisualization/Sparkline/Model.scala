package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires, on clicking the sparkline.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Options for customizing the color,dashArray and width of the axisLine.
    */
  var axisLineSettings: js.UndefOr[AxisLineSettings] = js.native
  
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  
  /** Options for customizing the color, opacity and width of the sparkline border.
    */
  var border: js.UndefOr[Border] = js.native
  
  /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Fires, on double clicking the sparkline.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  
  /** Controls whether Sparkline has to be rendered as Canvas or SVG.Canvas rendering supports all functionalities in SVG rendering.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[Boolean] = js.native
  
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  
  /** Color for series end point.
    * @Default {null}
    */
  var endPointColor: js.UndefOr[String] = js.native
  
  /** Fill color for the sparkline series.
    * @Default {#33ccff}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** Color for series high point.
    * @Default {null}
    */
  var highPointColor: js.UndefOr[String] = js.native
  
  /** Controls whether sparkline has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Fires before loading the sparkline.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Fires after loaded the sparkline.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
  
  /** Name of the culture based on which sparkline should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Color for series low point.
    * @Default {null}
    */
  var lowPointColor: js.UndefOr[String] = js.native
  
  /** Options for displaying and customizing marker for a data point.
    */
  var markerSettings: js.UndefOr[MarkerSettings] = js.native
  
  /** Color for series negative point.
    * @Default {null}
    */
  var negativePointColor: js.UndefOr[String] = js.native
  
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Gap or padding for sparkline.
    * @Default {8}
    */
  var padding: js.UndefOr[Double] = js.native
  
  /** Name of a field in data source, where the fill color for all the data points is generated.
    */
  var palette: js.UndefOr[String] = js.native
  
  /** Fires on clicking a point in sparkline. You can use this event to handle clicks made on points.
    */
  var pointRegionMouseClick: js.UndefOr[js.Function1[/* e */ PointRegionMouseClickEventArgs, Unit]] = js.native
  
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.native
  
  /** Options for customizing the color, opacity of the sparkline start and end range.
    */
  var rangeBandSettings: js.UndefOr[RangeBandSettings] = js.native
  
  /** Fires, on right clicking the sparkline.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  
  /** Fires before rendering a series. This event is fired for each series in Sparkline.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, Unit]] = js.native
  
  /** Options to customize the Sparkline size.
    */
  var size: js.UndefOr[Size] = js.native
  
  /** Fires on moving mouse outside the sparkline.
    */
  var sparklineMouseLeave: js.UndefOr[js.Function1[/* e */ SparklineMouseLeaveEventArgs, Unit]] = js.native
  
  /** Fires on moving mouse over the sparkline.
    */
  var sparklineMouseMove: js.UndefOr[js.Function1[/* e */ SparklineMouseMoveEventArgs, Unit]] = js.native
  
  /** Color for series start point.
    * @Default {null}
    */
  var startPointColor: js.UndefOr[String] = js.native
  
  /** Border color of the series.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.native
  
  /** Specifies the theme for Sparkline.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[Theme | String] = js.native
  
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.native
  
  /** Specifies the type of the series to render in sparkline.
    * @Default {line. See Type}
    */
  var `type`: js.UndefOr[Type | String] = js.native
  
  /** Border width of the series.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
  
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.native
  
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("Click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    
    @scala.inline
    def setAxisLineSettings(value: AxisLineSettings): Self = this.set("axisLineSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLineSettings: Self = this.set("axisLineSettings", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: Border): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    
    @scala.inline
    def setEnableCanvasRendering(value: Boolean): Self = this.set("enableCanvasRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCanvasRendering: Self = this.set("enableCanvasRendering", js.undefined)
    
    @scala.inline
    def setEnableGroupSeparator(value: Boolean): Self = this.set("enableGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroupSeparator: Self = this.set("enableGroupSeparator", js.undefined)
    
    @scala.inline
    def setEndPointColor(value: String): Self = this.set("endPointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPointColor: Self = this.set("endPointColor", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHighPointColor(value: String): Self = this.set("highPointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighPointColor: Self = this.set("highPointColor", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLowPointColor(value: String): Self = this.set("lowPointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowPointColor: Self = this.set("lowPointColor", js.undefined)
    
    @scala.inline
    def setMarkerSettings(value: MarkerSettings): Self = this.set("markerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerSettings: Self = this.set("markerSettings", js.undefined)
    
    @scala.inline
    def setNegativePointColor(value: String): Self = this.set("negativePointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativePointColor: Self = this.set("negativePointColor", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPalette(value: String): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPointRegionMouseClick(value: /* e */ PointRegionMouseClickEventArgs => Unit): Self = this.set("pointRegionMouseClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionMouseClick: Self = this.set("pointRegionMouseClick", js.undefined)
    
    @scala.inline
    def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = this.set("pointRegionMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionMouseMove: Self = this.set("pointRegionMouseMove", js.undefined)
    
    @scala.inline
    def setRangeBandSettings(value: RangeBandSettings): Self = this.set("rangeBandSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeBandSettings: Self = this.set("rangeBandSettings", js.undefined)
    
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    
    @scala.inline
    def setSeriesRendering(value: /* e */ SeriesRenderingEventArgs => Unit): Self = this.set("seriesRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesRendering: Self = this.set("seriesRendering", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSparklineMouseLeave(value: /* e */ SparklineMouseLeaveEventArgs => Unit): Self = this.set("sparklineMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSparklineMouseLeave: Self = this.set("sparklineMouseLeave", js.undefined)
    
    @scala.inline
    def setSparklineMouseMove(value: /* e */ SparklineMouseMoveEventArgs => Unit): Self = this.set("sparklineMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSparklineMouseMove: Self = this.set("sparklineMouseMove", js.undefined)
    
    @scala.inline
    def setStartPointColor(value: String): Self = this.set("startPointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPointColor: Self = this.set("startPointColor", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = this.set("tooltipInitialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltipInitialize: Self = this.set("tooltipInitialize", js.undefined)
    
    @scala.inline
    def setType(value: Type | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXName(value: String): Self = this.set("xName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXName: Self = this.set("xName", js.undefined)
    
    @scala.inline
    def setYName(value: String): Self = this.set("yName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYName: Self = this.set("yName", js.undefined)
  }
}

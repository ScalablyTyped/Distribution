package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Sparkline.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sparkline
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Sparkline: Model = js.native
  
  /** Redraws the entire sparkline. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
object Sparkline {
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Italic
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Lighter
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Regular
      extends StObject
         with FontWeight
  }
  
  @js.native
  sealed trait Theme extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    //string
    @js.native
    sealed trait Azure
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait Azuredark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait FlatDark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait FlatLight
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait GradientDark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait GradientLight
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait Lime
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait LimeDark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait Saffron
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait SaffronDark
      extends StObject
         with Theme
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    //string
    @js.native
    sealed trait Area
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Column
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Line
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Pie
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait WinLoss
      extends StObject
         with Type
  }
  
  trait AxisLineSettings extends StObject {
    
    /** Color of the axis line.
      * @Default {'#111111'}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Dash array of the axis line.
      * @Default {1}
      */
    var dashArray: js.UndefOr[Double] = js.undefined
    
    /** Controls the visibility of the axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxisLineSettings {
    
    inline def apply(): AxisLineSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLineSettings]
    }
    
    extension [Self <: AxisLineSettings](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: Double): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Border extends StObject {
    
    /** Border color of the sparkline.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Width of the Sparkline border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Border {
    
    inline def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    extension [Self <: Border](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    extension [Self <: ClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DoubleClickEventArgs {
    
    inline def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    extension [Self <: DoubleClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    extension [Self <: LoadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadedEventArgs {
    
    inline def apply(): LoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadedEventArgs]
    }
    
    extension [Self <: LoadedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MarkerSettings extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[MarkerSettingsBorder] = js.undefined
    
    /** Color of the marker shape.
      * @Default {white}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Controls the opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** width of the marker shape.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object MarkerSettings {
    
    inline def apply(): MarkerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerSettings]
    }
    
    extension [Self <: MarkerSettings](x: Self) {
      
      inline def setBorder(value: MarkerSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MarkerSettingsBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Controls the opacity of the marker border.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Border width of the marker shape.
      * @Default {null}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object MarkerSettingsBorder {
    
    inline def apply(): MarkerSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerSettingsBorder]
    }
    
    extension [Self <: MarkerSettingsBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the sparkline.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Options for customizing the color,dashArray and width of the axisLine.
      */
    var axisLineSettings: js.UndefOr[AxisLineSettings] = js.undefined
    
    /** Background color of the plot area.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the color, opacity and width of the sparkline border.
      */
    var border: js.UndefOr[Border] = js.undefined
    
    /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Fires, on double clicking the sparkline.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Controls whether Sparkline has to be rendered as Canvas or SVG.Canvas rendering supports all functionalities in SVG rendering.
      * @Default {false}
      */
    var enableCanvasRendering: js.UndefOr[Boolean] = js.undefined
    
    /** Specify to convert the date object to string, using locale settings.
      * @Default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Color for series end point.
      * @Default {null}
      */
    var endPointColor: js.UndefOr[String] = js.undefined
    
    /** Fill color for the sparkline series.
      * @Default {#33ccff}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Color for series high point.
      * @Default {null}
      */
    var highPointColor: js.UndefOr[String] = js.undefined
    
    /** Controls whether sparkline has to be responsive or not.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Fires before loading the sparkline.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Fires after loaded the sparkline.
      */
    var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.undefined
    
    /** Name of the culture based on which sparkline should be localized.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Color for series low point.
      * @Default {null}
      */
    var lowPointColor: js.UndefOr[String] = js.undefined
    
    /** Options for displaying and customizing marker for a data point.
      */
    var markerSettings: js.UndefOr[MarkerSettings] = js.undefined
    
    /** Color for series negative point.
      * @Default {null}
      */
    var negativePointColor: js.UndefOr[String] = js.undefined
    
    /** Opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Gap or padding for sparkline.
      * @Default {8}
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /** Name of a field in data source, where the fill color for all the data points is generated.
      */
    var palette: js.UndefOr[String] = js.undefined
    
    /** Fires on clicking a point in sparkline. You can use this event to handle clicks made on points.
      */
    var pointRegionMouseClick: js.UndefOr[js.Function1[/* e */ PointRegionMouseClickEventArgs, Unit]] = js.undefined
    
    /** Fires when mouse is moved over a point.
      */
    var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.undefined
    
    /** Options for customizing the color, opacity of the sparkline start and end range.
      */
    var rangeBandSettings: js.UndefOr[RangeBandSettings] = js.undefined
    
    /** Fires, on right clicking the sparkline.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Fires before rendering a series. This event is fired for each series in Sparkline.
      */
    var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, Unit]] = js.undefined
    
    /** Options to customize the Sparkline size.
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /** Fires on moving mouse outside the sparkline.
      */
    var sparklineMouseLeave: js.UndefOr[js.Function1[/* e */ SparklineMouseLeaveEventArgs, Unit]] = js.undefined
    
    /** Fires on moving mouse over the sparkline.
      */
    var sparklineMouseMove: js.UndefOr[js.Function1[/* e */ SparklineMouseMoveEventArgs, Unit]] = js.undefined
    
    /** Color for series start point.
      * @Default {null}
      */
    var startPointColor: js.UndefOr[String] = js.undefined
    
    /** Border color of the series.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the theme for Sparkline.
      * @Default {Flatlight. See Theme}
      */
    var theme: js.UndefOr[typings.ejWebAll.ej.Sparkline.Theme | String] = js.undefined
    
    /** Options to customize the tooltip.
      */
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
      */
    var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.undefined
    
    /** Specifies the type of the series to render in sparkline.
      * @Default {line. See Type}
      */
    var `type`: js.UndefOr[typings.ejWebAll.ej.Sparkline.Type | String] = js.undefined
    
    /** Border width of the series.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.Sparkline.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Sparkline.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.datavisualization.Sparkline.Model](x: Self) {
      
      inline def setAxisLineSettings(value: AxisLineSettings): Self = StObject.set(x, "axisLineSettings", value.asInstanceOf[js.Any])
      
      inline def setAxisLineSettingsUndefined: Self = StObject.set(x, "axisLineSettings", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setEnableCanvasRendering(value: Boolean): Self = StObject.set(x, "enableCanvasRendering", value.asInstanceOf[js.Any])
      
      inline def setEnableCanvasRenderingUndefined: Self = StObject.set(x, "enableCanvasRendering", js.undefined)
      
      inline def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      inline def setEndPointColor(value: String): Self = StObject.set(x, "endPointColor", value.asInstanceOf[js.Any])
      
      inline def setEndPointColorUndefined: Self = StObject.set(x, "endPointColor", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHighPointColor(value: String): Self = StObject.set(x, "highPointColor", value.asInstanceOf[js.Any])
      
      inline def setHighPointColorUndefined: Self = StObject.set(x, "highPointColor", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLowPointColor(value: String): Self = StObject.set(x, "lowPointColor", value.asInstanceOf[js.Any])
      
      inline def setLowPointColorUndefined: Self = StObject.set(x, "lowPointColor", js.undefined)
      
      inline def setMarkerSettings(value: MarkerSettings): Self = StObject.set(x, "markerSettings", value.asInstanceOf[js.Any])
      
      inline def setMarkerSettingsUndefined: Self = StObject.set(x, "markerSettings", js.undefined)
      
      inline def setNegativePointColor(value: String): Self = StObject.set(x, "negativePointColor", value.asInstanceOf[js.Any])
      
      inline def setNegativePointColorUndefined: Self = StObject.set(x, "negativePointColor", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPointRegionMouseClick(value: /* e */ PointRegionMouseClickEventArgs => Unit): Self = StObject.set(x, "pointRegionMouseClick", js.Any.fromFunction1(value))
      
      inline def setPointRegionMouseClickUndefined: Self = StObject.set(x, "pointRegionMouseClick", js.undefined)
      
      inline def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = StObject.set(x, "pointRegionMouseMove", js.Any.fromFunction1(value))
      
      inline def setPointRegionMouseMoveUndefined: Self = StObject.set(x, "pointRegionMouseMove", js.undefined)
      
      inline def setRangeBandSettings(value: RangeBandSettings): Self = StObject.set(x, "rangeBandSettings", value.asInstanceOf[js.Any])
      
      inline def setRangeBandSettingsUndefined: Self = StObject.set(x, "rangeBandSettings", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setSeriesRendering(value: /* e */ SeriesRenderingEventArgs => Unit): Self = StObject.set(x, "seriesRendering", js.Any.fromFunction1(value))
      
      inline def setSeriesRenderingUndefined: Self = StObject.set(x, "seriesRendering", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSparklineMouseLeave(value: /* e */ SparklineMouseLeaveEventArgs => Unit): Self = StObject.set(x, "sparklineMouseLeave", js.Any.fromFunction1(value))
      
      inline def setSparklineMouseLeaveUndefined: Self = StObject.set(x, "sparklineMouseLeave", js.undefined)
      
      inline def setSparklineMouseMove(value: /* e */ SparklineMouseMoveEventArgs => Unit): Self = StObject.set(x, "sparklineMouseMove", js.Any.fromFunction1(value))
      
      inline def setSparklineMouseMoveUndefined: Self = StObject.set(x, "sparklineMouseMove", js.undefined)
      
      inline def setStartPointColor(value: String): Self = StObject.set(x, "startPointColor", value.asInstanceOf[js.Any])
      
      inline def setStartPointColorUndefined: Self = StObject.set(x, "startPointColor", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTheme(value: typings.ejWebAll.ej.Sparkline.Theme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = StObject.set(x, "tooltipInitialize", js.Any.fromFunction1(value))
      
      inline def setTooltipInitializeUndefined: Self = StObject.set(x, "tooltipInitialize", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: typings.ejWebAll.ej.Sparkline.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
    }
  }
  
  trait PointRegionMouseClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** X-coordinate of point in pixel
      */
    var locationX: js.UndefOr[Double] = js.undefined
    
    /** Y-coordinate of point in pixel
      */
    var locationY: js.UndefOr[Double] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Index of the point in series
      */
    var pointIndex: js.UndefOr[Double] = js.undefined
    
    /** Type of the series
      */
    var seriesType: js.UndefOr[String] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionMouseClickEventArgs {
    
    inline def apply(): PointRegionMouseClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseClickEventArgs]
    }
    
    extension [Self <: PointRegionMouseClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      inline def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
      
      inline def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      inline def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
      
      inline def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
      
      inline def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
      
      inline def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PointRegionMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** X-coordinate of point in pixel
      */
    var locationX: js.UndefOr[Double] = js.undefined
    
    /** Y-coordinate of point in pixel
      */
    var locationY: js.UndefOr[Double] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Index of the point in series
      */
    var pointIndex: js.UndefOr[Double] = js.undefined
    
    /** Type of the series
      */
    var seriesType: js.UndefOr[String] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionMouseMoveEventArgs {
    
    inline def apply(): PointRegionMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
    }
    
    extension [Self <: PointRegionMouseMoveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      inline def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
      
      inline def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      inline def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
      
      inline def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
      
      inline def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
      
      inline def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RangeBandSettings extends StObject {
    
    /** Range band color of the series.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** End value of the range band.
      * @Default {null}
      */
    var endRange: js.UndefOr[Double] = js.undefined
    
    /** Range band opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Start value of the range band.
      * @Default {null}
      */
    var startRange: js.UndefOr[Double] = js.undefined
  }
  object RangeBandSettings {
    
    inline def apply(): RangeBandSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeBandSettings]
    }
    
    extension [Self <: RangeBandSettings](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEndRange(value: Double): Self = StObject.set(x, "endRange", value.asInstanceOf[js.Any])
      
      inline def setEndRangeUndefined: Self = StObject.set(x, "endRange", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setStartRange(value: Double): Self = StObject.set(x, "startRange", value.asInstanceOf[js.Any])
      
      inline def setStartRangeUndefined: Self = StObject.set(x, "startRange", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    extension [Self <: RightClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SeriesRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Maximum x value of the data point
      */
    var maxX: js.UndefOr[Any] = js.undefined
    
    /** Maximum y value of the data point
      */
    var maxY: js.UndefOr[Any] = js.undefined
    
    /** Minimum x value of the data point
      */
    var minX: js.UndefOr[Any] = js.undefined
    
    /** Minimum y value of the data point
      */
    var minY: js.UndefOr[Any] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SeriesRenderingEventArgs {
    
    inline def apply(): SeriesRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesRenderingEventArgs]
    }
    
    extension [Self <: SeriesRenderingEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setMaxX(value: Any): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxXUndefined: Self = StObject.set(x, "maxX", js.undefined)
      
      inline def setMaxY(value: Any): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMaxYUndefined: Self = StObject.set(x, "maxY", js.undefined)
      
      inline def setMinX(value: Any): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Any): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    /** Height of the Sparkline. Height can be specified in either pixel or percentage.
      * @Default {''}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Width of the Sparkline. Width can be specified in either pixel or percentage.
      * @Default {''}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Size {
    
    inline def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SparklineMouseLeaveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SparklineMouseLeaveEventArgs {
    
    inline def apply(): SparklineMouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineMouseLeaveEventArgs]
    }
    
    extension [Self <: SparklineMouseLeaveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SparklineMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SparklineMouseMoveEventArgs {
    
    inline def apply(): SparklineMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineMouseMoveEventArgs]
    }
    
    extension [Self <: SparklineMouseMoveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Tooltip extends StObject {
    
    /** Options for customizing the border of the tooltip.
      */
    var border: js.UndefOr[TooltipBorder] = js.undefined
    
    /** Fill color for the sparkline tooltip.
      * @Default {white}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the font of the tooltip.
      */
    var font: js.UndefOr[TooltipFont] = js.undefined
    
    /** Custom template to the tooltip.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Show/hides the tooltip visibility.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Tooltip {
    
    inline def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    extension [Self <: Tooltip](x: Self) {
      
      inline def setBorder(value: TooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: TooltipFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TooltipBorder extends StObject {
    
    /** Border color of the tooltip.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TooltipBorder {
    
    inline def apply(): TooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipBorder]
    }
    
    extension [Self <: TooltipBorder](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TooltipFont extends StObject {
    
    /** Font color of the text in the tooltip.
      * @Default {#111111}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font Family for the tooltip.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the font Style for the tooltip.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[typings.ejWebAll.ej.Sparkline.FontStyle | String] = js.undefined
    
    /** Specifies the font weight for the tooltip.
      * @Default {Regular}
      */
    var fontWeight: js.UndefOr[typings.ejWebAll.ej.Sparkline.FontWeight | String] = js.undefined
    
    /** Opacity for text in the tooltip.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for text in the tooltip.
      * @Default {8px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object TooltipFont {
    
    inline def apply(): TooltipFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipFont]
    }
    
    extension [Self <: TooltipFont](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: typings.ejWebAll.ej.Sparkline.FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: typings.ejWebAll.ej.Sparkline.FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TooltipInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip
      */
    var currentText: js.UndefOr[String] = js.undefined
    
    /** X Location of the trackball tooltip in pixels
      */
    var locationX: js.UndefOr[Any] = js.undefined
    
    /** Y Location of the trackball tooltip in pixels
      */
    var locationY: js.UndefOr[Any] = js.undefined
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Index of the point for which trackball tooltip is displayed
      */
    var pointIndex: js.UndefOr[Double] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TooltipInitializeEventArgs {
    
    inline def apply(): TooltipInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInitializeEventArgs]
    }
    
    extension [Self <: TooltipInitializeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
      
      inline def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
      
      inline def setLocationX(value: Any): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      inline def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
      
      inline def setLocationY(value: Any): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      inline def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
      
      inline def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

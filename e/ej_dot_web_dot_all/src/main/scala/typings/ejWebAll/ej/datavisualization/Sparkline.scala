package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Sparkline.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sparkline extends Widget_ {
  
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
    sealed trait Italic extends FontStyle
    
    //string
    @js.native
    sealed trait Normal extends FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold extends FontWeight
    
    //string
    @js.native
    sealed trait Lighter extends FontWeight
    
    //string
    @js.native
    sealed trait Regular extends FontWeight
  }
  
  @js.native
  sealed trait Theme extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    //string
    @js.native
    sealed trait Azure extends Theme
    
    //string
    @js.native
    sealed trait Azuredark extends Theme
    
    //string
    @js.native
    sealed trait FlatDark extends Theme
    
    //string
    @js.native
    sealed trait FlatLight extends Theme
    
    //string
    @js.native
    sealed trait GradientDark extends Theme
    
    //string
    @js.native
    sealed trait GradientLight extends Theme
    
    //string
    @js.native
    sealed trait Lime extends Theme
    
    //string
    @js.native
    sealed trait LimeDark extends Theme
    
    //string
    @js.native
    sealed trait Saffron extends Theme
    
    //string
    @js.native
    sealed trait SaffronDark extends Theme
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("ej.datavisualization.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    //string
    @js.native
    sealed trait Area extends Type
    
    //string
    @js.native
    sealed trait Column extends Type
    
    //string
    @js.native
    sealed trait Line extends Type
    
    //string
    @js.native
    sealed trait Pie extends Type
    
    //string
    @js.native
    sealed trait WinLoss extends Type
  }
  
  @js.native
  trait AxisLineSettings extends StObject {
    
    /** Color of the axis line.
      * @Default {'#111111'}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Dash array of the axis line.
      * @Default {1}
      */
    var dashArray: js.UndefOr[Double] = js.native
    
    /** Controls the visibility of the axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxisLineSettings {
    
    @scala.inline
    def apply(): AxisLineSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLineSettings]
    }
    
    @scala.inline
    implicit class AxisLineSettingsMutableBuilder[Self <: AxisLineSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: Double): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Border extends StObject {
    
    /** Border color of the sparkline.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Width of the Sparkline border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Border {
    
    @scala.inline
    def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LoadedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadedEventArgs {
    
    @scala.inline
    def apply(): LoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadedEventArgs]
    }
    
    @scala.inline
    implicit class LoadedEventArgsMutableBuilder[Self <: LoadedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MarkerSettings extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[MarkerSettingsBorder] = js.native
    
    /** Color of the marker shape.
      * @Default {white}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Controls the opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** width of the marker shape.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object MarkerSettings {
    
    @scala.inline
    def apply(): MarkerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerSettings]
    }
    
    @scala.inline
    implicit class MarkerSettingsMutableBuilder[Self <: MarkerSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: MarkerSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MarkerSettingsBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Controls the opacity of the marker border.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Border width of the marker shape.
      * @Default {null}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object MarkerSettingsBorder {
    
    @scala.inline
    def apply(): MarkerSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerSettingsBorder]
    }
    
    @scala.inline
    implicit class MarkerSettingsBorderMutableBuilder[Self <: MarkerSettingsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
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
    var theme: js.UndefOr[typings.ejWebAll.ej.Sparkline.Theme | String] = js.native
    
    /** Options to customize the tooltip.
      */
    var tooltip: js.UndefOr[Tooltip] = js.native
    
    /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
      */
    var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.native
    
    /** Specifies the type of the series to render in sparkline.
      * @Default {line. See Type}
      */
    var `type`: js.UndefOr[typings.ejWebAll.ej.Sparkline.Type | String] = js.native
    
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
    def apply(): typings.ejWebAll.ej.datavisualization.Sparkline.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Sparkline.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.Sparkline.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxisLineSettings(value: AxisLineSettings): Self = StObject.set(x, "axisLineSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLineSettingsUndefined: Self = StObject.set(x, "axisLineSettings", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setEnableCanvasRendering(value: Boolean): Self = StObject.set(x, "enableCanvasRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCanvasRenderingUndefined: Self = StObject.set(x, "enableCanvasRendering", js.undefined)
      
      @scala.inline
      def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      @scala.inline
      def setEndPointColor(value: String): Self = StObject.set(x, "endPointColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPointColorUndefined: Self = StObject.set(x, "endPointColor", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHighPointColor(value: String): Self = StObject.set(x, "highPointColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighPointColorUndefined: Self = StObject.set(x, "highPointColor", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLowPointColor(value: String): Self = StObject.set(x, "lowPointColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowPointColorUndefined: Self = StObject.set(x, "lowPointColor", js.undefined)
      
      @scala.inline
      def setMarkerSettings(value: MarkerSettings): Self = StObject.set(x, "markerSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerSettingsUndefined: Self = StObject.set(x, "markerSettings", js.undefined)
      
      @scala.inline
      def setNegativePointColor(value: String): Self = StObject.set(x, "negativePointColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativePointColorUndefined: Self = StObject.set(x, "negativePointColor", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPointRegionMouseClick(value: /* e */ PointRegionMouseClickEventArgs => Unit): Self = StObject.set(x, "pointRegionMouseClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionMouseClickUndefined: Self = StObject.set(x, "pointRegionMouseClick", js.undefined)
      
      @scala.inline
      def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = StObject.set(x, "pointRegionMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionMouseMoveUndefined: Self = StObject.set(x, "pointRegionMouseMove", js.undefined)
      
      @scala.inline
      def setRangeBandSettings(value: RangeBandSettings): Self = StObject.set(x, "rangeBandSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeBandSettingsUndefined: Self = StObject.set(x, "rangeBandSettings", js.undefined)
      
      @scala.inline
      def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      @scala.inline
      def setSeriesRendering(value: /* e */ SeriesRenderingEventArgs => Unit): Self = StObject.set(x, "seriesRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeriesRenderingUndefined: Self = StObject.set(x, "seriesRendering", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSparklineMouseLeave(value: /* e */ SparklineMouseLeaveEventArgs => Unit): Self = StObject.set(x, "sparklineMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSparklineMouseLeaveUndefined: Self = StObject.set(x, "sparklineMouseLeave", js.undefined)
      
      @scala.inline
      def setSparklineMouseMove(value: /* e */ SparklineMouseMoveEventArgs => Unit): Self = StObject.set(x, "sparklineMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSparklineMouseMoveUndefined: Self = StObject.set(x, "sparklineMouseMove", js.undefined)
      
      @scala.inline
      def setStartPointColor(value: String): Self = StObject.set(x, "startPointColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPointColorUndefined: Self = StObject.set(x, "startPointColor", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setTheme(value: typings.ejWebAll.ej.Sparkline.Theme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = StObject.set(x, "tooltipInitialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipInitializeUndefined: Self = StObject.set(x, "tooltipInitialize", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: typings.ejWebAll.ej.Sparkline.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      @scala.inline
      def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
    }
  }
  
  @js.native
  trait PointRegionMouseClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** X-coordinate of point in pixel
      */
    var locationX: js.UndefOr[Double] = js.native
    
    /** Y-coordinate of point in pixel
      */
    var locationY: js.UndefOr[Double] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Index of the point in series
      */
    var pointIndex: js.UndefOr[Double] = js.native
    
    /** Type of the series
      */
    var seriesType: js.UndefOr[String] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PointRegionMouseClickEventArgs {
    
    @scala.inline
    def apply(): PointRegionMouseClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseClickEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionMouseClickEventArgsMutableBuilder[Self <: PointRegionMouseClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
      
      @scala.inline
      def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
      
      @scala.inline
      def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PointRegionMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** X-coordinate of point in pixel
      */
    var locationX: js.UndefOr[Double] = js.native
    
    /** Y-coordinate of point in pixel
      */
    var locationY: js.UndefOr[Double] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Index of the point in series
      */
    var pointIndex: js.UndefOr[Double] = js.native
    
    /** Type of the series
      */
    var seriesType: js.UndefOr[String] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PointRegionMouseMoveEventArgs {
    
    @scala.inline
    def apply(): PointRegionMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionMouseMoveEventArgsMutableBuilder[Self <: PointRegionMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
      
      @scala.inline
      def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
      
      @scala.inline
      def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RangeBandSettings extends StObject {
    
    /** Range band color of the series.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** End value of the range band.
      * @Default {null}
      */
    var endRange: js.UndefOr[Double] = js.native
    
    /** Range band opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Start value of the range band.
      * @Default {null}
      */
    var startRange: js.UndefOr[Double] = js.native
  }
  object RangeBandSettings {
    
    @scala.inline
    def apply(): RangeBandSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeBandSettings]
    }
    
    @scala.inline
    implicit class RangeBandSettingsMutableBuilder[Self <: RangeBandSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEndRange(value: Double): Self = StObject.set(x, "endRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndRangeUndefined: Self = StObject.set(x, "endRange", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setStartRange(value: Double): Self = StObject.set(x, "startRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRangeUndefined: Self = StObject.set(x, "startRange", js.undefined)
    }
  }
  
  @js.native
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RightClickEventArgs {
    
    @scala.inline
    def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit class RightClickEventArgsMutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SeriesRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Maximum x value of the data point
      */
    var maxX: js.UndefOr[js.Any] = js.native
    
    /** Maximum y value of the data point
      */
    var maxY: js.UndefOr[js.Any] = js.native
    
    /** Minimum x value of the data point
      */
    var minX: js.UndefOr[js.Any] = js.native
    
    /** Minimum y value of the data point
      */
    var minY: js.UndefOr[js.Any] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SeriesRenderingEventArgs {
    
    @scala.inline
    def apply(): SeriesRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesRenderingEventArgs]
    }
    
    @scala.inline
    implicit class SeriesRenderingEventArgsMutableBuilder[Self <: SeriesRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setMaxX(value: js.Any): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxXUndefined: Self = StObject.set(x, "maxX", js.undefined)
      
      @scala.inline
      def setMaxY(value: js.Any): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxYUndefined: Self = StObject.set(x, "maxY", js.undefined)
      
      @scala.inline
      def setMinX(value: js.Any): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      @scala.inline
      def setMinY(value: js.Any): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    /** Height of the Sparkline. Height can be specified in either pixel or percentage.
      * @Default {''}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Width of the Sparkline. Width can be specified in either pixel or percentage.
      * @Default {''}
      */
    var width: js.UndefOr[String] = js.native
  }
  object Size {
    
    @scala.inline
    def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SparklineMouseLeaveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SparklineMouseLeaveEventArgs {
    
    @scala.inline
    def apply(): SparklineMouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineMouseLeaveEventArgs]
    }
    
    @scala.inline
    implicit class SparklineMouseLeaveEventArgsMutableBuilder[Self <: SparklineMouseLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SparklineMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SparklineMouseMoveEventArgs {
    
    @scala.inline
    def apply(): SparklineMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class SparklineMouseMoveEventArgsMutableBuilder[Self <: SparklineMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Tooltip extends StObject {
    
    /** Options for customizing the border of the tooltip.
      */
    var border: js.UndefOr[TooltipBorder] = js.native
    
    /** Fill color for the sparkline tooltip.
      * @Default {white}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the font of the tooltip.
      */
    var font: js.UndefOr[TooltipFont] = js.native
    
    /** Custom template to the tooltip.
      */
    var template: js.UndefOr[String] = js.native
    
    /** Show/hides the tooltip visibility.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: TooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: TooltipFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TooltipBorder extends StObject {
    
    /** Border color of the tooltip.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object TooltipBorder {
    
    @scala.inline
    def apply(): TooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipBorder]
    }
    
    @scala.inline
    implicit class TooltipBorderMutableBuilder[Self <: TooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TooltipFont extends StObject {
    
    /** Font color of the text in the tooltip.
      * @Default {#111111}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font Family for the tooltip.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the font Style for the tooltip.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[typings.ejWebAll.ej.Sparkline.FontStyle | String] = js.native
    
    /** Specifies the font weight for the tooltip.
      * @Default {Regular}
      */
    var fontWeight: js.UndefOr[typings.ejWebAll.ej.Sparkline.FontWeight | String] = js.native
    
    /** Opacity for text in the tooltip.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for text in the tooltip.
      * @Default {8px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object TooltipFont {
    
    @scala.inline
    def apply(): TooltipFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipFont]
    }
    
    @scala.inline
    implicit class TooltipFontMutableBuilder[Self <: TooltipFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: typings.ejWebAll.ej.Sparkline.FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: typings.ejWebAll.ej.Sparkline.FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TooltipInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip
      */
    var currentText: js.UndefOr[String] = js.native
    
    /** X Location of the trackball tooltip in pixels
      */
    var locationX: js.UndefOr[js.Any] = js.native
    
    /** Y Location of the trackball tooltip in pixels
      */
    var locationY: js.UndefOr[js.Any] = js.native
    
    /** Instance of the sparkline model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Index of the point for which trackball tooltip is displayed
      */
    var pointIndex: js.UndefOr[Double] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TooltipInitializeEventArgs {
    
    @scala.inline
    def apply(): TooltipInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInitializeEventArgs]
    }
    
    @scala.inline
    implicit class TooltipInitializeEventArgsMutableBuilder[Self <: TooltipInitializeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
      
      @scala.inline
      def setLocationX(value: js.Any): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
      
      @scala.inline
      def setLocationY(value: js.Any): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

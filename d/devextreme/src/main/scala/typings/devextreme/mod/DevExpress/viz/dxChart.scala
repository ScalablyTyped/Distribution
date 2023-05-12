package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.ZoomPanAction
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseChart.PointInteractionInfo
import typings.devextreme.mod.DevExpress.viz.BaseChart.TooltipInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChart
  extends StObject
     with BaseChart[dxChartOptions]
     with _VizWidget {
  
  /**
    * Gets the argument axis.
    */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /**
    * Gets a value axis.
    */
  def getValueAxis(): chartAxisObject = js.native
  /**
    * Gets a value axis with the specified name.
    */
  def getValueAxis(name: String): chartAxisObject = js.native
  
  /**
    * Resets the visual ranges of both axes to the data range or to the whole range if it is within the data range.
    */
  def resetVisualRange(): Unit = js.native
  
  def zoomArgument(startValue: String, endValue: String): Unit = js.native
  def zoomArgument(startValue: String, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: String, endValue: Double): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: String): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Double, endValue: String): Unit = js.native
  def zoomArgument(startValue: Double, endValue: js.Date): Unit = js.native
  /**
    * Sets the argument axis&apos; start and end values.
    */
  def zoomArgument(startValue: Double, endValue: Double): Unit = js.native
}
object dxChart {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.betweenTicks
    - typings.devextreme.devextremeStrings.crossTicks
  */
  trait AggregatedPointsPosition extends StObject
  object AggregatedPointsPosition {
    
    inline def betweenTicks: typings.devextreme.devextremeStrings.betweenTicks = "betweenTicks".asInstanceOf[typings.devextreme.devextremeStrings.betweenTicks]
    
    inline def crossTicks: typings.devextreme.devextremeStrings.crossTicks = "crossTicks".asInstanceOf[typings.devextreme.devextremeStrings.crossTicks]
  }
  
  trait ArgumentAxisClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val argument: js.Date | Double | String
  }
  object ArgumentAxisClickEvent {
    
    inline def apply(argument: js.Date | Double | String, component: dxChart, element: DxElement_[HTMLElement]): ArgumentAxisClickEvent = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgumentAxisClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgumentAxisClickEvent] (val x: Self) extends AnyVal {
      
      inline def setArgument(value: js.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.avg
    - typings.devextreme.devextremeStrings.custom
  */
  trait ChartBubbleSeriesAggregationMethod extends StObject
  object ChartBubbleSeriesAggregationMethod {
    
    inline def avg: typings.devextreme.devextremeStrings.avg = "avg".asInstanceOf[typings.devextreme.devextremeStrings.avg]
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.ohlc
    - typings.devextreme.devextremeStrings.custom
  */
  trait ChartFinancialSeriesAggregationMethod extends StObject
  object ChartFinancialSeriesAggregationMethod {
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
    
    inline def ohlc: typings.devextreme.devextremeStrings.ohlc = "ohlc".asInstanceOf[typings.devextreme.devextremeStrings.ohlc]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.rotate
    - typings.devextreme.devextremeStrings.stagger
    - typings.devextreme.devextremeStrings.standard
  */
  trait ChartLabelDisplayMode extends StObject
  object ChartLabelDisplayMode {
    
    inline def rotate: typings.devextreme.devextremeStrings.rotate = "rotate".asInstanceOf[typings.devextreme.devextremeStrings.rotate]
    
    inline def stagger: typings.devextreme.devextremeStrings.stagger = "stagger".asInstanceOf[typings.devextreme.devextremeStrings.stagger]
    
    inline def standard: typings.devextreme.devextremeStrings.standard = "standard".asInstanceOf[typings.devextreme.devextremeStrings.standard]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.range
    - typings.devextreme.devextremeStrings.custom
  */
  trait ChartRangeSeriesAggregationMethod extends StObject
  object ChartRangeSeriesAggregationMethod {
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
    
    inline def range: typings.devextreme.devextremeStrings.range = "range".asInstanceOf[typings.devextreme.devextremeStrings.range]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.avg
    - typings.devextreme.devextremeStrings.count
    - typings.devextreme.devextremeStrings.max
    - typings.devextreme.devextremeStrings.min
    - typings.devextreme.devextremeStrings.ohlc
    - typings.devextreme.devextremeStrings.range
    - typings.devextreme.devextremeStrings.sum
    - typings.devextreme.devextremeStrings.custom
  */
  trait ChartSeriesAggregationMethod extends StObject
  object ChartSeriesAggregationMethod {
    
    inline def avg: typings.devextreme.devextremeStrings.avg = "avg".asInstanceOf[typings.devextreme.devextremeStrings.avg]
    
    inline def count: typings.devextreme.devextremeStrings.count = "count".asInstanceOf[typings.devextreme.devextremeStrings.count]
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
    
    inline def max: typings.devextreme.devextremeStrings.max = "max".asInstanceOf[typings.devextreme.devextremeStrings.max]
    
    inline def min: typings.devextreme.devextremeStrings.min = "min".asInstanceOf[typings.devextreme.devextremeStrings.min]
    
    inline def ohlc: typings.devextreme.devextremeStrings.ohlc = "ohlc".asInstanceOf[typings.devextreme.devextremeStrings.ohlc]
    
    inline def range: typings.devextreme.devextremeStrings.range = "range".asInstanceOf[typings.devextreme.devextremeStrings.range]
    
    inline def sum: typings.devextreme.devextremeStrings.sum = "sum".asInstanceOf[typings.devextreme.devextremeStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.avg
    - typings.devextreme.devextremeStrings.count
    - typings.devextreme.devextremeStrings.max
    - typings.devextreme.devextremeStrings.min
    - typings.devextreme.devextremeStrings.sum
    - typings.devextreme.devextremeStrings.custom
  */
  trait ChartSingleValueSeriesAggregationMethod extends StObject
  object ChartSingleValueSeriesAggregationMethod {
    
    inline def avg: typings.devextreme.devextremeStrings.avg = "avg".asInstanceOf[typings.devextreme.devextremeStrings.avg]
    
    inline def count: typings.devextreme.devextremeStrings.count = "count".asInstanceOf[typings.devextreme.devextremeStrings.count]
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
    
    inline def max: typings.devextreme.devextremeStrings.max = "max".asInstanceOf[typings.devextreme.devextremeStrings.max]
    
    inline def min: typings.devextreme.devextremeStrings.min = "min".asInstanceOf[typings.devextreme.devextremeStrings.min]
    
    inline def sum: typings.devextreme.devextremeStrings.sum = "sum".asInstanceOf[typings.devextreme.devextremeStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.center
    - typings.devextreme.devextremeStrings.edge
  */
  trait ChartTooltipLocation extends StObject
  object ChartTooltipLocation {
    
    inline def center: typings.devextreme.devextremeStrings.center = "center".asInstanceOf[typings.devextreme.devextremeStrings.center]
    
    inline def edge: typings.devextreme.devextremeStrings.edge = "edge".asInstanceOf[typings.devextreme.devextremeStrings.edge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.both
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.pan
    - typings.devextreme.devextremeStrings.zoom
  */
  trait ChartZoomAndPanMode extends StObject
  object ChartZoomAndPanMode {
    
    inline def both: typings.devextreme.devextremeStrings.both = "both".asInstanceOf[typings.devextreme.devextremeStrings.both]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def pan: typings.devextreme.devextremeStrings.pan = "pan".asInstanceOf[typings.devextreme.devextremeStrings.pan]
    
    inline def zoom: typings.devextreme.devextremeStrings.zoom = "zoom".asInstanceOf[typings.devextreme.devextremeStrings.zoom]
  }
  
  type DisposingEvent = EventInfo[dxChart]
  
  type DoneEvent = EventInfo[dxChart]
  
  type DrawnEvent = EventInfo[dxChart]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.alt
    - typings.devextreme.devextremeStrings.ctrl
    - typings.devextreme.devextremeStrings.meta
    - typings.devextreme.devextremeStrings.shift
  */
  trait EventKeyModifier extends StObject
  object EventKeyModifier {
    
    inline def alt: typings.devextreme.devextremeStrings.alt = "alt".asInstanceOf[typings.devextreme.devextremeStrings.alt]
    
    inline def ctrl: typings.devextreme.devextremeStrings.ctrl = "ctrl".asInstanceOf[typings.devextreme.devextremeStrings.ctrl]
    
    inline def meta: typings.devextreme.devextremeStrings.meta = "meta".asInstanceOf[typings.devextreme.devextremeStrings.meta]
    
    inline def shift: typings.devextreme.devextremeStrings.shift = "shift".asInstanceOf[typings.devextreme.devextremeStrings.shift]
  }
  
  type ExportedEvent = EventInfo[dxChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxChart]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.close
    - typings.devextreme.devextremeStrings.high
    - typings.devextreme.devextremeStrings.low
    - typings.devextreme.devextremeStrings.open
  */
  trait FinancialChartReductionLevel extends StObject
  object FinancialChartReductionLevel {
    
    inline def close: typings.devextreme.devextremeStrings.close = "close".asInstanceOf[typings.devextreme.devextremeStrings.close]
    
    inline def high: typings.devextreme.devextremeStrings.high = "high".asInstanceOf[typings.devextreme.devextremeStrings.high]
    
    inline def low: typings.devextreme.devextremeStrings.low = "low".asInstanceOf[typings.devextreme.devextremeStrings.low]
    
    inline def open: typings.devextreme.devextremeStrings.open = "open".asInstanceOf[typings.devextreme.devextremeStrings.open]
  }
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxChart]
  
  trait LegendClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val target: chartSeriesObject
  }
  object LegendClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendClickEvent] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait PointClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  type Properties = dxChartOptions
  
  trait SeriesClickEvent
    extends StObject
       with NativeEventInfo[dxChart, MouseEvent | PointerEvent] {
    
    val target: chartSeriesObject
  }
  object SeriesClickEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesClickEvent] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesHoverChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with SeriesInteractionInfo
  object SeriesHoverChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesHoverChangedEvent]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait SeriesInteractionInfo extends StObject {
    
    var target: chartSeriesObject
  }
  object SeriesInteractionInfo {
    
    inline def apply(target: chartSeriesObject): SeriesInteractionInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesInteractionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesInteractionInfo] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: chartSeriesObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeriesSelectionChangedEvent
    extends StObject
       with EventInfo[dxChart]
       with SeriesInteractionInfo
  object SeriesSelectionChangedEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement], target: chartSeriesObject): SeriesSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeriesSelectionChangedEvent]
    }
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
  
  trait ZoomEndEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | TouchEvent] {
    
    val actionType: ZoomPanAction
    
    val axis: chartAxisObject
    
    val previousRange: typings.devextreme.mod.DevExpress.common.charts.VisualRange
    
    val range: typings.devextreme.mod.DevExpress.common.charts.VisualRange
    
    val rangeEnd: js.Date | Double
    
    val rangeStart: js.Date | Double
    
    val shift: Double
    
    val zoomFactor: Double
  }
  object ZoomEndEvent {
    
    inline def apply(
      actionType: ZoomPanAction,
      axis: chartAxisObject,
      component: dxChart,
      element: DxElement_[HTMLElement],
      previousRange: typings.devextreme.mod.DevExpress.common.charts.VisualRange,
      range: typings.devextreme.mod.DevExpress.common.charts.VisualRange,
      rangeEnd: js.Date | Double,
      rangeStart: js.Date | Double,
      shift: Double,
      zoomFactor: Double
    ): ZoomEndEvent = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousRange = previousRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomEndEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomEndEvent] (val x: Self) extends AnyVal {
      
      inline def setActionType(value: ZoomPanAction): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setPreviousRange(value: typings.devextreme.mod.DevExpress.common.charts.VisualRange): Self = StObject.set(x, "previousRange", value.asInstanceOf[js.Any])
      
      inline def setRange(value: typings.devextreme.mod.DevExpress.common.charts.VisualRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeEnd(value: js.Date | Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
      
      inline def setRangeStart(value: js.Date | Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZoomStartEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxChart, MouseEvent | TouchEvent] {
    
    val actionType: js.UndefOr[ZoomPanAction] = js.undefined
    
    val axis: chartAxisObject
    
    val range: typings.devextreme.mod.DevExpress.common.charts.VisualRange
  }
  object ZoomStartEvent {
    
    inline def apply(
      axis: chartAxisObject,
      component: dxChart,
      element: DxElement_[HTMLElement],
      range: typings.devextreme.mod.DevExpress.common.charts.VisualRange
    ): ZoomStartEvent = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomStartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomStartEvent] (val x: Self) extends AnyVal {
      
      inline def setActionType(value: ZoomPanAction): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
      
      inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setRange(value: typings.devextreme.mod.DevExpress.common.charts.VisualRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
}

package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChart
  extends StObject
     with BaseChart[dxPieChartOptions]
     with _VizWidget {
  
  /**
    * Gets the radius of the doughnut hole in pixels. Applies only when the type is &apos;doughnut&apos; or &apos;donut&apos;.
    */
  def getInnerRadius(): Double = js.native
}
object dxPieChart {
  
  type DisposingEvent = EventInfo[dxPieChart]
  
  type DoneEvent = EventInfo[dxPieChart]
  
  type DrawnEvent = EventInfo[dxPieChart]
  
  type ExportedEvent = EventInfo[dxPieChart]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxPieChart]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxPieChart]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxPieChart]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPieChart]
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxPieChart, MouseEvent | PointerEvent] {
    
    val points: js.Array[piePointObject]
    
    val target: String | Double
  }
  object LegendClickEvent {
    
    inline def apply(
      component: dxPieChart,
      element: DxElement_[HTMLElement],
      points: js.Array[piePointObject],
      target: String | Double
    ): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
    
    extension [Self <: LegendClickEvent](x: Self) {
      
      inline def setPoints(value: js.Array[piePointObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: piePointObject*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTarget(value: String | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type LegendItem = PieChartLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.center
    - typings.devextreme.devextremeStrings.edge
  */
  trait PieChartAnnotationLocation extends StObject
  object PieChartAnnotationLocation {
    
    inline def center: typings.devextreme.devextremeStrings.center = "center".asInstanceOf[typings.devextreme.devextremeStrings.center]
    
    inline def edge: typings.devextreme.devextremeStrings.edge = "edge".asInstanceOf[typings.devextreme.devextremeStrings.edge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.hide
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.shift
  */
  trait PieChartLabelOverlap extends StObject
  object PieChartLabelOverlap {
    
    inline def hide: typings.devextreme.devextremeStrings.hide = "hide".asInstanceOf[typings.devextreme.devextremeStrings.hide]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def shift: typings.devextreme.devextremeStrings.shift = "shift".asInstanceOf[typings.devextreme.devextremeStrings.shift]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.allArgumentPoints
  */
  trait PieChartLegendHoverMode extends StObject
  object PieChartLegendHoverMode {
    
    inline def allArgumentPoints: typings.devextreme.devextremeStrings.allArgumentPoints = "allArgumentPoints".asInstanceOf[typings.devextreme.devextremeStrings.allArgumentPoints]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.anticlockwise
    - typings.devextreme.devextremeStrings.clockwise
  */
  trait PieChartSegmentDirection extends StObject
  object PieChartSegmentDirection {
    
    inline def anticlockwise: typings.devextreme.devextremeStrings.anticlockwise = "anticlockwise".asInstanceOf[typings.devextreme.devextremeStrings.anticlockwise]
    
    inline def clockwise: typings.devextreme.devextremeStrings.clockwise = "clockwise".asInstanceOf[typings.devextreme.devextremeStrings.clockwise]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.onlyPoint
  */
  trait PieChartSeriesInteractionMode extends StObject
  object PieChartSeriesInteractionMode {
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def onlyPoint: typings.devextreme.devextremeStrings.onlyPoint = "onlyPoint".asInstanceOf[typings.devextreme.devextremeStrings.onlyPoint]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.donut
    - typings.devextreme.devextremeStrings.doughnut
    - typings.devextreme.devextremeStrings.pie
  */
  trait PieChartType extends StObject
  object PieChartType {
    
    inline def donut: typings.devextreme.devextremeStrings.donut = "donut".asInstanceOf[typings.devextreme.devextremeStrings.donut]
    
    inline def doughnut: typings.devextreme.devextremeStrings.doughnut = "doughnut".asInstanceOf[typings.devextreme.devextremeStrings.doughnut]
    
    inline def pie: typings.devextreme.devextremeStrings.pie = "pie".asInstanceOf[typings.devextreme.devextremeStrings.pie]
  }
  
  trait PointClickEvent
    extends StObject
       with NativeEventInfo[dxPieChart, MouseEvent | PointerEvent]
       with PointInteractionInfo
  object PointClickEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointClickEvent]
    }
  }
  
  trait PointHoverChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with PointInteractionInfo
  object PointHoverChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointHoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointHoverChangedEvent]
    }
  }
  
  trait PointSelectionChangedEvent
    extends StObject
       with EventInfo[dxPieChart]
       with PointInteractionInfo
  object PointSelectionChangedEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement], target: basePointObject): PointSelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSelectionChangedEvent]
    }
  }
  
  type Properties = dxPieChartOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.smallValueThreshold
    - typings.devextreme.devextremeStrings.topN
  */
  trait SmallValuesGroupingMode extends StObject
  object SmallValuesGroupingMode {
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def smallValueThreshold: typings.devextreme.devextremeStrings.smallValueThreshold = "smallValueThreshold".asInstanceOf[typings.devextreme.devextremeStrings.smallValueThreshold]
    
    inline def topN: typings.devextreme.devextremeStrings.topN = "topN".asInstanceOf[typings.devextreme.devextremeStrings.topN]
  }
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxPieChart]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxPieChart]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxPieChart, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
}

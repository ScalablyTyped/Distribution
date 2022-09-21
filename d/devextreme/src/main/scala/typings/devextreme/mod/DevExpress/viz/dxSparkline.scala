package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSparkline
  extends StObject
     with BaseSparkline[dxSparklineOptions]
     with _VizWidget {
  
  def getDataSource(): DataSource[Any, Any] = js.native
}
object dxSparkline {
  
  type DisposingEvent = EventInfo[dxSparkline]
  
  type DrawnEvent = EventInfo[dxSparkline]
  
  type ExportedEvent = EventInfo[dxSparkline]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxSparkline]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxSparkline]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxSparkline]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxSparkline]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSparkline]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSparkline, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSparklineOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.area
    - typings.devextreme.devextremeStrings.bar
    - typings.devextreme.devextremeStrings.line
    - typings.devextreme.devextremeStrings.spline
    - typings.devextreme.devextremeStrings.splinearea
    - typings.devextreme.devextremeStrings.steparea
    - typings.devextreme.devextremeStrings.stepline
    - typings.devextreme.devextremeStrings.winloss
  */
  trait SparklineType extends StObject
  object SparklineType {
    
    inline def area: typings.devextreme.devextremeStrings.area = "area".asInstanceOf[typings.devextreme.devextremeStrings.area]
    
    inline def bar: typings.devextreme.devextremeStrings.bar = "bar".asInstanceOf[typings.devextreme.devextremeStrings.bar]
    
    inline def line: typings.devextreme.devextremeStrings.line = "line".asInstanceOf[typings.devextreme.devextremeStrings.line]
    
    inline def spline: typings.devextreme.devextremeStrings.spline = "spline".asInstanceOf[typings.devextreme.devextremeStrings.spline]
    
    inline def splinearea: typings.devextreme.devextremeStrings.splinearea = "splinearea".asInstanceOf[typings.devextreme.devextremeStrings.splinearea]
    
    inline def steparea: typings.devextreme.devextremeStrings.steparea = "steparea".asInstanceOf[typings.devextreme.devextremeStrings.steparea]
    
    inline def stepline: typings.devextreme.devextremeStrings.stepline = "stepline".asInstanceOf[typings.devextreme.devextremeStrings.stepline]
    
    inline def winloss: typings.devextreme.devextremeStrings.winloss = "winloss".asInstanceOf[typings.devextreme.devextremeStrings.winloss]
  }
  
  type TooltipHiddenEvent = EventInfo[dxSparkline]
  
  type TooltipShownEvent = EventInfo[dxSparkline]
}

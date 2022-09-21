package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
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
trait dxBarGauge
  extends StObject
     with BaseWidget[dxBarGaugeOptions]
     with _VizWidget {
  
  /**
    * Gets all the values.
    */
  def values(): js.Array[Double] = js.native
  /**
    * Updates all the values.
    */
  def values(values: js.Array[Double]): Unit = js.native
}
object dxBarGauge {
  
  type DisposingEvent = EventInfo[dxBarGauge]
  
  type DrawnEvent = EventInfo[dxBarGauge]
  
  type ExportedEvent = EventInfo[dxBarGauge]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxBarGauge]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxBarGauge, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxBarGauge]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxBarGauge]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxBarGauge, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxBarGauge]
  
  type LegendItem = BarGaugeLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxBarGauge]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxBarGauge, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxBarGaugeOptions
  
  trait TooltipHiddenEvent
    extends StObject
       with EventInfo[dxBarGauge]
       with TooltipInfo
  object TooltipHiddenEvent {
    
    inline def apply(component: dxBarGauge, element: DxElement_[HTMLElement]): TooltipHiddenEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHiddenEvent]
    }
  }
  
  trait TooltipInfo extends StObject {
    
    var target: js.UndefOr[Any] = js.undefined
  }
  object TooltipInfo {
    
    inline def apply(): TooltipInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TooltipShownEvent
    extends StObject
       with EventInfo[dxBarGauge]
       with TooltipInfo
  object TooltipShownEvent {
    
    inline def apply(component: dxBarGauge, element: DxElement_[HTMLElement]): TooltipShownEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipShownEvent]
    }
  }
}

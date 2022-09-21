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

object dxBullet {
  
  type DisposingEvent = EventInfo[dxBullet]
  
  type DrawnEvent = EventInfo[dxBullet]
  
  type ExportedEvent = EventInfo[dxBullet]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxBullet]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxBullet, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxBullet]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxBullet]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxBullet, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxBullet]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxBullet]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxBullet, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxBulletOptions
  
  type TooltipHiddenEvent = EventInfo[dxBullet]
  
  type TooltipShownEvent = EventInfo[dxBullet]
}

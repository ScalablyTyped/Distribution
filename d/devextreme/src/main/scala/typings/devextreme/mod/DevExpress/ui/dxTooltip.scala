package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxTooltip {
  
  type ContentReadyEvent = EventInfo[dxTooltip]
  
  type DisposingEvent = EventInfo[dxTooltip]
  
  type HiddenEvent = EventInfo[dxTooltip]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxTooltip]
  object HidingEvent {
    
    inline def apply(component: dxTooltip, element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxTooltip]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTooltip]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTooltip, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxTooltipOptions
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxTooltip]
  object ShowingEvent {
    
    inline def apply(component: dxTooltip, element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  type ShownEvent = EventInfo[dxTooltip]
}

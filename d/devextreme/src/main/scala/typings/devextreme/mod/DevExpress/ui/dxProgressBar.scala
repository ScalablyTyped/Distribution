package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxProgressBar {
  
  type CompleteEvent = NativeEventInfo[dxProgressBar, Event]
  
  type ContentReadyEvent = EventInfo[dxProgressBar]
  
  type DisposingEvent = EventInfo[dxProgressBar]
  
  type InitializedEvent = InitializedEventInfo[dxProgressBar]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxProgressBar]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxProgressBar, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxProgressBarOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxProgressBar, Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxProgressBar, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxLoadIndicator {
  
  type ContentReadyEvent = EventInfo[dxLoadIndicator]
  
  type DisposingEvent = EventInfo[dxLoadIndicator]
  
  type InitializedEvent = InitializedEventInfo[dxLoadIndicator]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxLoadIndicator]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxLoadIndicator, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxLoadIndicatorOptions
}

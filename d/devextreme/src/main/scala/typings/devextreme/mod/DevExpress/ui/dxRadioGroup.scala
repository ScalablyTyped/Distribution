package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRadioGroup
  extends StObject
     with Editor[dxRadioGroupOptions] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
}
object dxRadioGroup {
  
  type ContentReadyEvent = EventInfo[dxRadioGroup]
  
  type DisposingEvent = EventInfo[dxRadioGroup]
  
  type InitializedEvent = InitializedEventInfo[dxRadioGroup]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxRadioGroup]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxRadioGroup, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxRadioGroupOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxRadioGroup, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxRadioGroup, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

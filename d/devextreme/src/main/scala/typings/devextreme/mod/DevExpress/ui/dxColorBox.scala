package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.UIEventtargetHTMLInputEle
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxColorBox {
  
  type ChangeEvent = NativeEventInfo[dxColorBox, Event]
  
  type ClosedEvent = EventInfo[dxColorBox]
  
  type CopyEvent = NativeEventInfo[dxColorBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxColorBox, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxColorBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxColorBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxColorBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxColorBox]
  
  type InputEvent = NativeEventInfo[dxColorBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxColorBox, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxColorBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxColorBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxColorBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxColorBox, ClipboardEvent]
  
  type Properties = dxColorBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxColorBox, KeyboardEvent | MouseEvent | PointerEvent | UIEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxColorBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

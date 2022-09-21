package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.UIEventtargetHTMLInputEle
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxNumberBox {
  
  type ChangeEvent = NativeEventInfo[dxNumberBox, Event]
  
  type ContentReadyEvent = EventInfo[dxNumberBox]
  
  type CopyEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxNumberBox]
  
  type EnterKeyEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxNumberBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxNumberBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxNumberBox]
  
  type InputEvent = NativeEventInfo[dxNumberBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxNumberBox, KeyboardEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.clear
    - typings.devextreme.devextremeStrings.spins
  */
  trait NumberBoxPredefinedButton extends StObject
  object NumberBoxPredefinedButton {
    
    inline def clear: typings.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typings.devextreme.devextremeStrings.clear]
    
    inline def spins: typings.devextreme.devextremeStrings.spins = "spins".asInstanceOf[typings.devextreme.devextremeStrings.spins]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.number
    - typings.devextreme.devextremeStrings.text
    - typings.devextreme.devextremeStrings.tel
  */
  trait NumberBoxType extends StObject
  object NumberBoxType {
    
    inline def number: typings.devextreme.devextremeStrings.number = "number".asInstanceOf[typings.devextreme.devextremeStrings.number]
    
    inline def tel: typings.devextreme.devextremeStrings.tel = "tel".asInstanceOf[typings.devextreme.devextremeStrings.tel]
    
    inline def text: typings.devextreme.devextremeStrings.text = "text".asInstanceOf[typings.devextreme.devextremeStrings.text]
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxNumberBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxNumberBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxNumberBox, ClipboardEvent]
  
  type Properties = dxNumberBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxNumberBox, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxNumberBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

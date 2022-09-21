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

object dxTextBox {
  
  type ChangeEvent = NativeEventInfo[dxTextBox[Properties], Event]
  
  type ContentReadyEvent = EventInfo[dxTextBox[Properties]]
  
  type CopyEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxTextBox[Properties]]
  
  type EnterKeyEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxTextBox[Properties], FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxTextBox[Properties], FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxTextBox[Properties]]
  
  type InputEvent = NativeEventInfo[dxTextBox[Properties], UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxTextBox[Properties], KeyboardEvent]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTextBox[Properties]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTextBox[Properties], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxTextBox[Properties], ClipboardEvent]
  
  type Properties = dxTextBoxOptions[TextBoxInstance]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  @js.native
  trait TextBoxInstance
    extends StObject
       with dxTextEditor[Properties]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.email
    - typings.devextreme.devextremeStrings.password
    - typings.devextreme.devextremeStrings.search
    - typings.devextreme.devextremeStrings.tel
    - typings.devextreme.devextremeStrings.text
    - typings.devextreme.devextremeStrings.url
  */
  trait TextBoxType extends StObject
  object TextBoxType {
    
    inline def email: typings.devextreme.devextremeStrings.email = "email".asInstanceOf[typings.devextreme.devextremeStrings.email]
    
    inline def password: typings.devextreme.devextremeStrings.password = "password".asInstanceOf[typings.devextreme.devextremeStrings.password]
    
    inline def search: typings.devextreme.devextremeStrings.search = "search".asInstanceOf[typings.devextreme.devextremeStrings.search]
    
    inline def tel: typings.devextreme.devextremeStrings.tel = "tel".asInstanceOf[typings.devextreme.devextremeStrings.tel]
    
    inline def text: typings.devextreme.devextremeStrings.text = "text".asInstanceOf[typings.devextreme.devextremeStrings.text]
    
    inline def url: typings.devextreme.devextremeStrings.url = "url".asInstanceOf[typings.devextreme.devextremeStrings.url]
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[
          dxTextBox[Properties], 
          KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event
        ]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxTextBox[Properties], element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

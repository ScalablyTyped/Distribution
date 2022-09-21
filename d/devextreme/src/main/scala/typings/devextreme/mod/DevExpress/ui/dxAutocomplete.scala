package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.UIEventtargetHTMLInputEle
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxDropDownEditor.DropDownButtonTemplateDataModel
import typings.devextreme.mod.DevExpress.ui.dxDropDownList.SelectionChangedInfo
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxAutocomplete {
  
  type ChangeEvent = NativeEventInfo[dxAutocomplete, Event]
  
  type ClosedEvent = EventInfo[dxAutocomplete]
  
  type ContentReadyEvent = EventInfo[dxAutocomplete]
  
  type CopyEvent = NativeEventInfo[dxAutocomplete, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxAutocomplete, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxAutocomplete]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxAutocomplete, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxAutocomplete, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxAutocomplete, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxAutocomplete]
  
  type InputEvent = NativeEventInfo[dxAutocomplete, UIEventtargetHTMLInputEle]
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxAutocomplete, KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[Any]
  object ItemClickEvent {
    
    inline def apply(
      component: dxAutocomplete,
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  type KeyDownEvent = NativeEventInfo[dxAutocomplete, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxAutocomplete, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxAutocomplete, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxAutocomplete]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxAutocomplete]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxAutocomplete, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxAutocomplete, ClipboardEvent]
  
  type Properties = dxAutocompleteOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxAutocomplete]
       with SelectionChangedInfo[Any]
  object SelectionChangedEvent {
    
    inline def apply(component: dxAutocomplete, element: DxElement_[HTMLElement], selectedItem: Any): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxAutocomplete, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxAutocomplete, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.UIEventtargetHTMLInputEle
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownBox
  extends StObject
     with dxDropDownEditor[dxDropDownBoxOptions] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
}
object dxDropDownBox {
  
  type ChangeEvent = NativeEventInfo[dxDropDownBox, Event]
  
  type ClosedEvent = EventInfo[dxDropDownBox]
  
  trait ContentTemplateData extends StObject {
    
    var component: dxDropDownBox
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object ContentTemplateData {
    
    inline def apply(component: dxDropDownBox): ContentTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentTemplateData]
    }
    
    extension [Self <: ContentTemplateData](x: Self) {
      
      inline def setComponent(value: dxDropDownBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type CopyEvent = NativeEventInfo[dxDropDownBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxDropDownBox, ClipboardEvent]
  
  type DisposingEvent = EventInfo[dxDropDownBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxDropDownBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxDropDownBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxDropDownBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxDropDownBox]
  
  type InputEvent = NativeEventInfo[dxDropDownBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxDropDownBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxDropDownBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxDropDownBox, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxDropDownBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDropDownBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDropDownBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxDropDownBox, ClipboardEvent]
  
  type Properties = dxDropDownBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxDropDownBox, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxDropDownBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

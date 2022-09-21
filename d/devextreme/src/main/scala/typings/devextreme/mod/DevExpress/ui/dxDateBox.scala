package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.UIEventtargetHTMLInputEle
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxCalendar.ComponentDisabledDate
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
trait dxDateBox
  extends StObject
     with dxDropDownEditor[dxDateBoxOptions]
object dxDateBox {
  
  type ChangeEvent = NativeEventInfo[dxDateBox, Event]
  
  type ClosedEvent = EventInfo[dxDateBox]
  
  type ContentReadyEvent = EventInfo[dxDateBox]
  
  type CopyEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type CutEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.calendar
    - typings.devextreme.devextremeStrings.list
    - typings.devextreme.devextremeStrings.native
    - typings.devextreme.devextremeStrings.rollers
  */
  trait DatePickerType extends StObject
  object DatePickerType {
    
    inline def calendar: typings.devextreme.devextremeStrings.calendar = "calendar".asInstanceOf[typings.devextreme.devextremeStrings.calendar]
    
    inline def list: typings.devextreme.devextremeStrings.list = "list".asInstanceOf[typings.devextreme.devextremeStrings.list]
    
    inline def native: typings.devextreme.devextremeStrings.native = "native".asInstanceOf[typings.devextreme.devextremeStrings.native]
    
    inline def rollers: typings.devextreme.devextremeStrings.rollers = "rollers".asInstanceOf[typings.devextreme.devextremeStrings.rollers]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.date
    - typings.devextreme.devextremeStrings.datetime
    - typings.devextreme.devextremeStrings.time
  */
  trait DateType extends StObject
  object DateType {
    
    inline def date: typings.devextreme.devextremeStrings.date = "date".asInstanceOf[typings.devextreme.devextremeStrings.date]
    
    inline def datetime: typings.devextreme.devextremeStrings.datetime = "datetime".asInstanceOf[typings.devextreme.devextremeStrings.datetime]
    
    inline def time: typings.devextreme.devextremeStrings.time = "time".asInstanceOf[typings.devextreme.devextremeStrings.time]
  }
  
  type DisabledDate = ComponentDisabledDate[dxDateBox]
  
  type DisposingEvent = EventInfo[dxDateBox]
  
  type DropDownButtonTemplateData = DropDownButtonTemplateDataModel
  
  type EnterKeyEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type FocusInEvent = NativeEventInfo[dxDateBox, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxDateBox, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxDateBox]
  
  type InputEvent = NativeEventInfo[dxDateBox, UIEventtargetHTMLInputEle]
  
  type KeyDownEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type KeyPressEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type KeyUpEvent = NativeEventInfo[dxDateBox, KeyboardEvent]
  
  type OpenedEvent = EventInfo[dxDateBox]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDateBox]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDateBox, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PasteEvent = NativeEventInfo[dxDateBox, ClipboardEvent]
  
  type Properties = dxDateBoxOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxDateBox, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxDateBox, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

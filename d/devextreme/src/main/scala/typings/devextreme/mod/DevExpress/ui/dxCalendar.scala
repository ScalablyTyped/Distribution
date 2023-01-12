package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
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
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxCalendar {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.century
    - typings.devextreme.devextremeStrings.decade
    - typings.devextreme.devextremeStrings.month
    - typings.devextreme.devextremeStrings.year
  */
  trait CalendarZoomLevel extends StObject
  object CalendarZoomLevel {
    
    inline def century: typings.devextreme.devextremeStrings.century = "century".asInstanceOf[typings.devextreme.devextremeStrings.century]
    
    inline def decade: typings.devextreme.devextremeStrings.decade = "decade".asInstanceOf[typings.devextreme.devextremeStrings.decade]
    
    inline def month: typings.devextreme.devextremeStrings.month = "month".asInstanceOf[typings.devextreme.devextremeStrings.month]
    
    inline def year: typings.devextreme.devextremeStrings.year = "year".asInstanceOf[typings.devextreme.devextremeStrings.year]
  }
  
  trait CellTemplateData extends StObject {
    
    val date: js.Date
    
    val text: js.UndefOr[String] = js.undefined
    
    val view: String
  }
  object CellTemplateData {
    
    inline def apply(date: js.Date, view: String): CellTemplateData = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellTemplateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellTemplateData] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentDisabledDate[T] extends StObject {
    
    var component: T
    
    val date: js.Date
    
    val view: String
  }
  object ComponentDisabledDate {
    
    inline def apply[T](component: T, date: js.Date, view: String): ComponentDisabledDate[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDisabledDate[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentDisabledDate[?], T] (val x: Self & ComponentDisabledDate[T]) extends AnyVal {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxCalendar]
  
  type DisabledDate = ComponentDisabledDate[dxCalendar]
  
  type DisposingEvent = EventInfo[dxCalendar]
  
  type InitializedEvent = InitializedEventInfo[dxCalendar]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxCalendar]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxCalendar, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxCalendarOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxCalendar, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxCalendar, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

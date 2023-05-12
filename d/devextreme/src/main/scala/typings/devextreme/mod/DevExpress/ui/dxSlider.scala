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
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxSlider {
  
  type ContentReadyEvent = EventInfo[dxSlider]
  
  type DisposingEvent = EventInfo[dxSlider]
  
  type InitializedEvent = InitializedEventInfo[dxSlider]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSlider]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSlider, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSliderOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.onHandleMove
    - typings.devextreme.devextremeStrings.onHandleRelease
  */
  trait ValueChangeMode extends StObject
  object ValueChangeMode {
    
    inline def onHandleMove: typings.devextreme.devextremeStrings.onHandleMove = "onHandleMove".asInstanceOf[typings.devextreme.devextremeStrings.onHandleMove]
    
    inline def onHandleRelease: typings.devextreme.devextremeStrings.onHandleRelease = "onHandleRelease".asInstanceOf[typings.devextreme.devextremeStrings.onHandleRelease]
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxSlider, KeyboardEvent | MouseEvent | PointerEvent | TouchEvent | UIEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxSlider, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}

package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxToast {
  
  type ContentReadyEvent = EventInfo[dxToast]
  
  type DisposingEvent = EventInfo[dxToast]
  
  type HiddenEvent = EventInfo[dxToast]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxToast]
  object HidingEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxToast]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxToast]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxToastOptions
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxToast]
  object ShowingEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  type ShownEvent = EventInfo[dxToast]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.custom
    - typings.devextreme.devextremeStrings.error
    - typings.devextreme.devextremeStrings.info
    - typings.devextreme.devextremeStrings.success
    - typings.devextreme.devextremeStrings.warning
  */
  trait ToastType extends StObject
  object ToastType {
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
    
    inline def error: typings.devextreme.devextremeStrings.error = "error".asInstanceOf[typings.devextreme.devextremeStrings.error]
    
    inline def info: typings.devextreme.devextremeStrings.info = "info".asInstanceOf[typings.devextreme.devextremeStrings.info]
    
    inline def success: typings.devextreme.devextremeStrings.success = "success".asInstanceOf[typings.devextreme.devextremeStrings.success]
    
    inline def warning: typings.devextreme.devextremeStrings.warning = "warning".asInstanceOf[typings.devextreme.devextremeStrings.warning]
  }
}

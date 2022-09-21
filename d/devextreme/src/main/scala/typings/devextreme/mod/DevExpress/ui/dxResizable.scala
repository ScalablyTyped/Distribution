package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxResizable {
  
  type DisposingEvent = EventInfo[dxResizable]
  
  type InitializedEvent = InitializedEventInfo[dxResizable]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxResizable]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxResizableOptions
  
  trait ResizeEndEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEndEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], height: Double, width: Double): ResizeEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEndEvent]
    }
  }
  
  trait ResizeEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], height: Double, width: Double): ResizeEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.bottom
    - typings.devextreme.devextremeStrings.left
    - typings.devextreme.devextremeStrings.right
    - typings.devextreme.devextremeStrings.top
    - typings.devextreme.devextremeStrings.all
  */
  trait ResizeHandle extends StObject
  object ResizeHandle {
    
    inline def all: typings.devextreme.devextremeStrings.all = "all".asInstanceOf[typings.devextreme.devextremeStrings.all]
    
    inline def bottom: typings.devextreme.devextremeStrings.bottom = "bottom".asInstanceOf[typings.devextreme.devextremeStrings.bottom]
    
    inline def left: typings.devextreme.devextremeStrings.left = "left".asInstanceOf[typings.devextreme.devextremeStrings.left]
    
    inline def right: typings.devextreme.devextremeStrings.right = "right".asInstanceOf[typings.devextreme.devextremeStrings.right]
    
    inline def top: typings.devextreme.devextremeStrings.top = "top".asInstanceOf[typings.devextreme.devextremeStrings.top]
  }
  
  trait ResizeInfo extends StObject {
    
    val height: Double
    
    val width: Double
  }
  object ResizeInfo {
    
    inline def apply(height: Double, width: Double): ResizeInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeInfo]
    }
    
    extension [Self <: ResizeInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeStartEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeStartEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], height: Double, width: Double): ResizeStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeStartEvent]
    }
  }
}

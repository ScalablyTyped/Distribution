package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDraggable
  extends StObject
     with DOMComponent[dxDraggableOptions]
     with DraggableBase
object dxDraggable {
  
  type DisposingEvent = EventInfo[dxDraggable]
  
  trait DragEndEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxDraggable, PointerEvent | MouseEvent | TouchEvent] {
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object DragEndEvent {
    
    inline def apply(
      component: dxDraggable,
      element: DxElement_[HTMLElement],
      fromComponent: dxSortable | dxDraggable,
      toComponent: dxSortable | dxDraggable
    ): DragEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragEndEvent]
    }
    
    extension [Self <: DragEndEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  trait DragMoveEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxDraggable, PointerEvent | MouseEvent | TouchEvent] {
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object DragMoveEvent {
    
    inline def apply(
      component: dxDraggable,
      element: DxElement_[HTMLElement],
      fromComponent: dxSortable | dxDraggable,
      toComponent: dxSortable | dxDraggable
    ): DragMoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragMoveEvent]
    }
    
    extension [Self <: DragMoveEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  trait DragStartEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxDraggable, PointerEvent | MouseEvent | TouchEvent] {
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    var itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object DragStartEvent {
    
    inline def apply(component: dxDraggable, element: DxElement_[HTMLElement]): DragStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragStartEvent]
    }
    
    extension [Self <: DragStartEvent](x: Self) {
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    }
  }
  
  trait DragTemplateData extends StObject {
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
  object DragTemplateData {
    
    inline def apply(itemElement: DxElement_[HTMLElement]): DragTemplateData = {
      val __obj = js.Dynamic.literal(itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragTemplateData]
    }
    
    extension [Self <: DragTemplateData](x: Self) {
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxDraggable]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDraggable]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDraggable, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDraggableOptions
}

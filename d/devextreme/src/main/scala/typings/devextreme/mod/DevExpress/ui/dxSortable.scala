package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.PromiseLike
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSortable
  extends StObject
     with DOMComponent[dxSortableOptions]
     with DraggableBase {
  
  /**
    * Updates Sortable&apos;s dimensions. Call this method after items are added or their dimensions are changed during dragging.
    */
  def update(): Unit = js.native
}
object dxSortable {
  
  trait AddEvent extends StObject {
    
    val component: dxSortable
    
    val dropInsideItem: Boolean
    
    val element: DxElement_[HTMLElement]
    
    val event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val model: js.UndefOr[Any] = js.undefined
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object AddEvent {
    
    inline def apply(
      component: dxSortable,
      dropInsideItem: Boolean,
      element: DxElement_[HTMLElement],
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): AddEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddEvent] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: dxSortable): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxSortable]
  
  trait DragChangeEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxSortable, PointerEvent | MouseEvent | TouchEvent] {
    
    val dropInsideItem: js.UndefOr[Boolean] = js.undefined
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: js.UndefOr[Double] = js.undefined
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: js.UndefOr[Double] = js.undefined
  }
  object DragChangeEvent {
    
    inline def apply(component: dxSortable, element: DxElement_[HTMLElement], itemElement: DxElement_[HTMLElement]): DragChangeEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItemUndefined: Self = StObject.set(x, "dropInsideItem", js.undefined)
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
      
      inline def setToIndexUndefined: Self = StObject.set(x, "toIndex", js.undefined)
    }
  }
  
  trait DragEndEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxSortable, PointerEvent | MouseEvent | TouchEvent] {
    
    val dropInsideItem: Boolean
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object DragEndEvent {
    
    inline def apply(
      component: dxSortable,
      dropInsideItem: Boolean,
      element: DxElement_[HTMLElement],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): DragEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragEndEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragEndEvent] (val x: Self) extends AnyVal {
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragMoveEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxSortable, PointerEvent | MouseEvent | TouchEvent] {
    
    val dropInsideItem: Boolean
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object DragMoveEvent {
    
    inline def apply(
      component: dxSortable,
      dropInsideItem: Boolean,
      element: DxElement_[HTMLElement],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): DragMoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragMoveEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragMoveEvent] (val x: Self) extends AnyVal {
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragStartEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxSortable, PointerEvent | MouseEvent | TouchEvent] {
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    var itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
  object DragStartEvent {
    
    inline def apply(
      component: dxSortable,
      element: DxElement_[HTMLElement],
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement]
    ): DragStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragStartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragStartEvent] (val x: Self) extends AnyVal {
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragTemplateData extends StObject {
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
  object DragTemplateData {
    
    inline def apply(fromIndex: Double, itemElement: DxElement_[HTMLElement]): DragTemplateData = {
      val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragTemplateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragTemplateData] (val x: Self) extends AnyVal {
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxSortable]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSortable]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSortable, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSortableOptions
  
  trait RemoveEvent
    extends StObject
       with NativeEventInfo[dxSortable, PointerEvent | MouseEvent | TouchEvent] {
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RemoveEvent {
    
    inline def apply(
      component: dxSortable,
      element: DxElement_[HTMLElement],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RemoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveEvent] (val x: Self) extends AnyVal {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReorderEvent
    extends StObject
       with NativeEventInfo[dxSortable, PointerEvent | MouseEvent | TouchEvent] {
    
    val dropInsideItem: Boolean
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object ReorderEvent {
    
    inline def apply(
      component: dxSortable,
      dropInsideItem: Boolean,
      element: DxElement_[HTMLElement],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): ReorderEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReorderEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReorderEvent] (val x: Self) extends AnyVal {
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
}

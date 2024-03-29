package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownButton
  extends StObject
     with Widget[dxDropDownButtonOptions] {
  
  /**
    * Closes the drop-down menu.
    */
  def close(): js.Promise[Unit] = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Opens the drop-down menu.
    */
  def open(): js.Promise[Unit] = js.native
  
  /**
    * Opens or closes the drop-down menu, reversing the current state.
    */
  def toggle(): js.Promise[Unit] = js.native
  /**
    * Opens or closes the drop-down menu, depending on the argument.
    */
  def toggle(visibility: Boolean): js.Promise[Unit] = js.native
}
object dxDropDownButton {
  
  trait ButtonClickEvent
    extends StObject
       with NativeEventInfo[dxDropDownButton, KeyboardEvent | MouseEvent | PointerEvent] {
    
    val selectedItem: js.UndefOr[Any] = js.undefined
  }
  object ButtonClickEvent {
    
    inline def apply(component: dxDropDownButton, element: DxElement_[HTMLElement]): ButtonClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonClickEvent] (val x: Self) extends AnyVal {
      
      inline def setSelectedItem(value: Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    }
  }
  
  type ContentReadyEvent = EventInfo[dxDropDownButton]
  
  type DisposingEvent = EventInfo[dxDropDownButton]
  
  type InitializedEvent = InitializedEventInfo[dxDropDownButton]
  
  type Item = dxDropDownButtonItem
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxDropDownButton, KeyboardEvent | MouseEvent | PointerEvent] {
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
  object ItemClickEvent {
    
    inline def apply(
      component: dxDropDownButton,
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement]
    ): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemClickEvent] (val x: Self) extends AnyVal {
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDropDownButton]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDropDownButton, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDropDownButtonOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxDropDownButton] {
    
    val item: Any
    
    val previousItem: Any
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxDropDownButton, element: DxElement_[HTMLElement], item: Any, previousItem: Any): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPreviousItem(value: Any): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    }
  }
}

package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxActionSheet.ItemLike
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxActionSheet[TItem /* <: ItemLike[TKey] */, TKey]
  extends StObject
     with CollectionWidget[dxActionSheetOptions[TItem, TKey], TItem, TKey] {
  
  /**
    * Hides the UI component.
    */
  def hide(): js.Promise[Unit] = js.native
  
  /**
    * Shows the UI component.
    */
  def show(): js.Promise[Unit] = js.native
  
  /**
    * Shows or hides the UI component depending on the argument.
    */
  def toggle(showing: Boolean): js.Promise[Unit] = js.native
}
object dxActionSheet {
  
  trait CancelClickEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxActionSheet[TItem, TKey]]
  object CancelClickEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](component: dxActionSheet[TItem, TKey], element: DxElement_[HTMLElement]): CancelClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelClickEvent[TItem, TKey]]
    }
  }
  
  type ContentReadyEvent[TItem /* <: ItemLike[TKey] */, TKey] = EventInfo[dxActionSheet[TItem, TKey]]
  
  type DisposingEvent[TItem /* <: ItemLike[TKey] */, TKey] = EventInfo[dxActionSheet[TItem, TKey]]
  
  trait ExplicitTypes[TItem /* <: ItemLike[TKey] */, TKey] extends StObject {
    
    var CancelClickEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.CancelClickEvent[TItem, TKey]
    
    var ContentReadyEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.DisposingEvent[TItem, TKey]
    
    var InitializedEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.ItemClickEvent[TItem, TKey]
    
    var ItemContextMenuEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.ItemContextMenuEvent[TItem, TKey]
    
    var ItemHoldEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.ItemHoldEvent[TItem, TKey]
    
    var ItemRenderedEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.ItemRenderedEvent[TItem, TKey]
    
    var OptionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxActionSheet.OptionChangedEvent[TItem, TKey]
    
    var Properties: typings.devextreme.mod.DevExpress.ui.dxActionSheet.Properties[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      CancelClickEvent: CancelClickEvent[TItem, TKey],
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TItem, TKey],
      ItemHoldEvent: ItemHoldEvent[TItem, TKey],
      ItemRenderedEvent: ItemRenderedEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      Properties: Properties[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(CancelClickEvent = CancelClickEvent.asInstanceOf[js.Any], ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike[TKey] */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setCancelClickEvent(value: CancelClickEvent[TItem, TKey]): Self = StObject.set(x, "CancelClickEvent", value.asInstanceOf[js.Any])
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TItem, TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TItem, TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike[TKey] */, TKey] = InitializedEventInfo[dxActionSheet[TItem, TKey]]
  
  type Item[TKey] = dxActionSheetItem[TKey]
  
  trait ItemClickEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with NativeEventInfo[dxActionSheet[TItem, TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxActionSheet[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with NativeEventInfo[dxActionSheet[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemContextMenuEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxActionSheet[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemContextMenuEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TItem, TKey]]
    }
  }
  
  trait ItemHoldEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with NativeEventInfo[dxActionSheet[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemHoldEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxActionSheet[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemHoldEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TItem, TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ItemLike[TKey] = String | Item[TKey] | Any
  
  trait ItemRenderedEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with EventInfo[dxActionSheet[TItem, TKey]]
       with ItemInfo[TItem]
  object ItemRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxActionSheet[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TItem, TKey]]
    }
  }
  
  trait OptionChangedEvent[TItem /* <: ItemLike[TKey] */, TKey]
    extends StObject
       with EventInfo[dxActionSheet[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike[TKey] */, TKey](
      component: dxActionSheet[TItem, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  type Properties[TItem /* <: ItemLike[TKey] */, TKey] = dxActionSheetOptions[TItem, TKey]
}

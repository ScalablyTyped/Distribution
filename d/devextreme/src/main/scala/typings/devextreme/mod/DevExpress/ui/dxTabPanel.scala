package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.CollectionWidget.SelectionChangedInfo
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxTabPanel {
  
  type ContentReadyEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxTabPanel[TItem, TKey]]
  
  type DisposingEvent[TItem /* <: ItemLike */, TKey] = EventInfo[dxTabPanel[TItem, TKey]]
  
  trait ExplicitTypes[TItem /* <: ItemLike */, TKey] extends StObject {
    
    var ContentReadyEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.ContentReadyEvent[TItem, TKey]
    
    var DisposingEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.DisposingEvent[TItem, TKey]
    
    var InitializedEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.InitializedEvent[TItem, TKey]
    
    var ItemClickEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.ItemClickEvent[TItem, TKey]
    
    var ItemContextMenuEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.ItemContextMenuEvent[TItem, TKey]
    
    var ItemHoldEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.ItemHoldEvent[TItem, TKey]
    
    var ItemRenderedEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.ItemRenderedEvent[TItem, TKey]
    
    var OptionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.OptionChangedEvent[TItem, TKey]
    
    var Properties: typings.devextreme.mod.DevExpress.ui.dxTabPanel.Properties[TItem, TKey]
    
    var SelectionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.SelectionChangedEvent[TItem, TKey]
    
    var TitleClickEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.TitleClickEvent[TItem, TKey]
    
    var TitleHoldEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.TitleHoldEvent[TItem, TKey]
    
    var TitleRenderedEvent: typings.devextreme.mod.DevExpress.ui.dxTabPanel.TitleRenderedEvent[TItem, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      ContentReadyEvent: ContentReadyEvent[TItem, TKey],
      DisposingEvent: DisposingEvent[TItem, TKey],
      InitializedEvent: InitializedEvent[TItem, TKey],
      ItemClickEvent: ItemClickEvent[TItem, TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TItem, TKey],
      ItemHoldEvent: ItemHoldEvent[TItem, TKey],
      ItemRenderedEvent: ItemRenderedEvent[TItem, TKey],
      OptionChangedEvent: OptionChangedEvent[TItem, TKey],
      Properties: Properties[TItem, TKey],
      SelectionChangedEvent: SelectionChangedEvent[TItem, TKey],
      TitleClickEvent: TitleClickEvent[TItem, TKey],
      TitleHoldEvent: TitleHoldEvent[TItem, TKey],
      TitleRenderedEvent: TitleRenderedEvent[TItem, TKey]
    ): ExplicitTypes[TItem, TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], TitleClickEvent = TitleClickEvent.asInstanceOf[js.Any], TitleHoldEvent = TitleHoldEvent.asInstanceOf[js.Any], TitleRenderedEvent = TitleRenderedEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TItem, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (ExplicitTypes[TItem, TKey])) {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TItem, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TItem, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TItem, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TItem, TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TItem, TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TItem, TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TItem, TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TItem, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TItem, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TItem, TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setTitleClickEvent(value: TitleClickEvent[TItem, TKey]): Self = StObject.set(x, "TitleClickEvent", value.asInstanceOf[js.Any])
      
      inline def setTitleHoldEvent(value: TitleHoldEvent[TItem, TKey]): Self = StObject.set(x, "TitleHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setTitleRenderedEvent(value: TitleRenderedEvent[TItem, TKey]): Self = StObject.set(x, "TitleRenderedEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TItem /* <: ItemLike */, TKey] = InitializedEventInfo[dxTabPanel[TItem, TKey]]
  
  type Item = dxTabPanelItem
  
  trait ItemClickEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTabPanel[TItem, TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[TItem]
  object ItemClickEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTabPanel[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TItem, TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTabPanel[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemContextMenuEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTabPanel[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemContextMenuEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TItem, TKey]]
    }
  }
  
  trait ItemHoldEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTabPanel[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TItem]
  object ItemHoldEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTabPanel[TItem, TKey],
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
  type ItemLike = String | Item | Any
  
  trait ItemRenderedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxTabPanel[TItem, TKey]]
       with ItemInfo[TItem]
  object ItemRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTabPanel[TItem, TKey],
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TItem, TKey]]
    }
  }
  
  trait OptionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxTabPanel[TItem, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      component: dxTabPanel[TItem, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TItem, TKey]]
    }
  }
  
  type Properties[TItem /* <: ItemLike */, TKey] = dxTabPanelOptions[TItem, TKey]
  
  trait SelectionChangedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxTabPanel[TItem, TKey]]
       with SelectionChangedInfo[TItem]
  object SelectionChangedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](
      addedItems: js.Array[TItem],
      component: dxTabPanel[TItem, TKey],
      element: DxElement_[HTMLElement],
      removedItems: js.Array[TItem]
    ): SelectionChangedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TItem, TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait TabPanelItemInfo[TItem /* <: ItemLike */] extends StObject {
    
    val itemData: js.UndefOr[TItem] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object TabPanelItemInfo {
    
    inline def apply[TItem /* <: ItemLike */](): TabPanelItemInfo[TItem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelItemInfo[TItem]]
    }
    
    extension [Self <: TabPanelItemInfo[?], TItem /* <: ItemLike */](x: Self & TabPanelItemInfo[TItem]) {
      
      inline def setItemData(value: TItem): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    }
  }
  
  trait TitleClickEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTabPanel[TItem, TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with TabPanelItemInfo[TItem]
  object TitleClickEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](component: dxTabPanel[TItem, TKey], element: DxElement_[HTMLElement]): TitleClickEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleClickEvent[TItem, TKey]]
    }
  }
  
  trait TitleHoldEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with NativeEventInfo[dxTabPanel[TItem, TKey], MouseEvent | PointerEvent | TouchEvent]
       with TabPanelItemInfo[TItem]
  object TitleHoldEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](component: dxTabPanel[TItem, TKey], element: DxElement_[HTMLElement]): TitleHoldEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleHoldEvent[TItem, TKey]]
    }
  }
  
  trait TitleRenderedEvent[TItem /* <: ItemLike */, TKey]
    extends StObject
       with EventInfo[dxTabPanel[TItem, TKey]]
       with TabPanelItemInfo[TItem]
  object TitleRenderedEvent {
    
    inline def apply[TItem /* <: ItemLike */, TKey](component: dxTabPanel[TItem, TKey], element: DxElement_[HTMLElement]): TitleRenderedEvent[TItem, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleRenderedEvent[TItem, TKey]]
    }
  }
}

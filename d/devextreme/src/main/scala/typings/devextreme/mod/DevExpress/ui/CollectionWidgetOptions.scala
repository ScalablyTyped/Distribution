package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.CollectionWidget.ItemLike
import typings.devextreme.mod.DevExpress.ui.CollectionWidget.SelectionChangedInfo
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionWidgetOptions[TComponent /* <: (CollectionWidget[Any, TItem, TKey]) | Any */, TItem /* <: ItemLike */, TKey]
  extends StObject
     with WidgetOptions[TComponent] {
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[TItem, TKey]) | Null] = js.undefined
  
  /**
    * The time period in milliseconds before the onItemHold event is raised.
    */
  var itemHoldTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for items.
    */
  var itemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ TItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * An array of items displayed by the UI component.
    */
  var items: js.UndefOr[js.Array[TItem]] = js.undefined
  
  /**
    * Specifies the key property that provides key values to access data items. Each key value must be unique.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the text or HTML markup displayed by the UI component if the item collection is empty.
    */
  var noDataText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when a collection item is clicked or tapped.
    */
  var onItemClick: js.UndefOr[
    (js.Function1[
      /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent]) & ItemInfo[TItem], 
      Unit
    ]) | String
  ] = js.undefined
  
  /**
    * A function that is executed when a collection item is right-clicked or pressed.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[TItem], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is executed when a collection item has been held for a specified period.
    */
  var onItemHold: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[TItem], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is executed after a collection item is rendered.
    */
  var onItemRendered: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & ItemInfo[TItem], Unit]] = js.undefined
  
  /**
    * A function that is executed when a collection item is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & SelectionChangedInfo[TItem], Unit]] = js.undefined
  
  /**
    * The index of the currently selected UI component item.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The selected item object.
    */
  var selectedItem: js.UndefOr[TItem] = js.undefined
  
  /**
    * Specifies an array of currently selected item keys.
    */
  var selectedItemKeys: js.UndefOr[js.Array[TKey]] = js.undefined
  
  /**
    * An array of currently selected item objects.
    */
  var selectedItems: js.UndefOr[js.Array[TItem]] = js.undefined
}
object CollectionWidgetOptions {
  
  inline def apply[TComponent /* <: (CollectionWidget[Any, TItem, TKey]) | Any */, TItem /* <: ItemLike */, TKey](): CollectionWidgetOptions[TComponent, TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionWidgetOptions[TComponent, TItem, TKey]]
  }
  
  extension [Self <: CollectionWidgetOptions[?, ?, ?], TComponent /* <: (CollectionWidget[Any, TItem, TKey]) | Any */, TItem /* <: ItemLike */, TKey](x: Self & (CollectionWidgetOptions[TComponent, TItem, TKey])) {
    
    inline def setDataSource(value: DataSourceLike[TItem, TKey]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: TItem*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setItemHoldTimeout(value: Double): Self = StObject.set(x, "itemHoldTimeout", value.asInstanceOf[js.Any])
    
    inline def setItemHoldTimeoutUndefined: Self = StObject.set(x, "itemHoldTimeout", js.undefined)
    
    inline def setItemTemplate(
      value: template | (js.Function3[
          /* itemData */ TItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateFunction3(
      value: (/* itemData */ TItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction3(value))
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setItems(value: js.Array[TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnItemClick(
      value: (js.Function1[
          /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent]) & ItemInfo[TItem], 
          Unit
        ]) | String
    ): Self = StObject.set(x, "onItemClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemClickFunction1(value: /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent]) & ItemInfo[TItem] => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemContextMenu(
      value: /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[TItem] => Unit
    ): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    inline def setOnItemHold(
      value: /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[TItem] => Unit
    ): Self = StObject.set(x, "onItemHold", js.Any.fromFunction1(value))
    
    inline def setOnItemHoldUndefined: Self = StObject.set(x, "onItemHold", js.undefined)
    
    inline def setOnItemRendered(value: /* e */ EventInfo[TComponent] & ItemInfo[TItem] => Unit): Self = StObject.set(x, "onItemRendered", js.Any.fromFunction1(value))
    
    inline def setOnItemRenderedUndefined: Self = StObject.set(x, "onItemRendered", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ EventInfo[TComponent] & SelectionChangedInfo[TItem] => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedItem(value: TItem): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedItems(value: js.Array[TItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: TItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}

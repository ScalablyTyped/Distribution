package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItems
import typings.devextreme.anon.Event
import typings.devextreme.anon.ItemData
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionWidgetOptions[T] extends WidgetOptions[T] {
  
  /**
    * [descr:CollectionWidget.Options.dataSource]
    */
  var dataSource: js.UndefOr[
    String | (js.Array[String | CollectionWidgetItem]) | DataSource | DataSourceOptions
  ] = js.native
  
  /**
    * [descr:CollectionWidget.Options.itemHoldTimeout]
    */
  var itemHoldTimeout: js.UndefOr[Double] = js.native
  
  /**
    * [descr:CollectionWidget.Options.itemTemplate]
    */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:CollectionWidget.Options.items]
    */
  var items: js.UndefOr[js.Array[String | CollectionWidgetItem | _]] = js.native
  
  /**
    * [descr:CollectionWidget.Options.keyExpr]
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:CollectionWidget.Options.noDataText]
    */
  var noDataText: js.UndefOr[String] = js.native
  
  /**
    * [descr:CollectionWidget.Options.onItemClick]
    */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ Event[T], _]) | String] = js.native
  
  /**
    * [descr:CollectionWidget.Options.onItemContextMenu]
    */
  var onItemContextMenu: js.UndefOr[js.Function1[/* e */ Event[T], _]] = js.native
  
  /**
    * [descr:CollectionWidget.Options.onItemHold]
    */
  var onItemHold: js.UndefOr[js.Function1[/* e */ Event[T], _]] = js.native
  
  /**
    * [descr:CollectionWidget.Options.onItemRendered]
    */
  var onItemRendered: js.UndefOr[js.Function1[/* e */ ItemData[T], _]] = js.native
  
  /**
    * [descr:CollectionWidget.Options.onSelectionChanged]
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AddedItems[T], _]] = js.native
  
  /**
    * [descr:CollectionWidget.Options.selectedIndex]
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:CollectionWidget.Options.selectedItem]
    */
  var selectedItem: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:CollectionWidget.Options.selectedItemKeys]
    */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:CollectionWidget.Options.selectedItems]
    */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
}
object CollectionWidgetOptions {
  
  @scala.inline
  def apply[T](): CollectionWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionWidgetOptions[T]]
  }
  
  @scala.inline
  implicit class CollectionWidgetOptionsOps[Self <: CollectionWidgetOptions[_], T] (val x: Self with CollectionWidgetOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceVarargs(value: (String | CollectionWidgetItem)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | CollectionWidgetItem]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemHoldTimeout(value: Double): Self = this.set("itemHoldTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHoldTimeout: Self = this.set("itemHoldTimeout", js.undefined)
    
    @scala.inline
    def setItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("itemTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | CollectionWidgetItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | CollectionWidgetItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnItemClickFunction1(value: /* e */ Event[T] => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemClick(value: (js.Function1[/* e */ Event[T], _]) | String): Self = this.set("onItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(value: /* e */ Event[T] => _): Self = this.set("onItemContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemContextMenu: Self = this.set("onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemHold(value: /* e */ Event[T] => _): Self = this.set("onItemHold", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemHold: Self = this.set("onItemHold", js.undefined)
    
    @scala.inline
    def setOnItemRendered(value: /* e */ ItemData[T] => _): Self = this.set("onItemRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemRendered: Self = this.set("onItemRendered", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: /* e */ AddedItems[T] => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    
    @scala.inline
    def setSelectedItemKeysVarargs(value: js.Any*): Self = this.set("selectedItemKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItemKeys(value: js.Array[_]): Self = this.set("selectedItemKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItemKeys: Self = this.set("selectedItemKeys", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
  }
}

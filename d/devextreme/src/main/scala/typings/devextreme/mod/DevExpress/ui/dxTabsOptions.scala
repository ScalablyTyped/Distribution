package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTabsOptions[T] extends CollectionWidgetOptions[T] {
  
  /**
    * [descr:dxTabs.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxTabsOptions: js.UndefOr[String | (js.Array[String | dxTabsItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxTabs.Options.items]
    */
  @JSName("items")
  var items_dxTabsOptions: js.UndefOr[js.Array[String | dxTabsItem | _]] = js.native
  
  /**
    * [descr:dxTabs.Options.repaintChangesOnly]
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTabs.Options.scrollByContent]
    */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTabs.Options.scrollingEnabled]
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTabs.Options.selectedItems]
    */
  @JSName("selectedItems")
  var selectedItems_dxTabsOptions: js.UndefOr[js.Array[String | Double | _]] = js.native
  
  /**
    * [descr:dxTabs.Options.selectionMode]
    */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  
  /**
    * [descr:dxTabs.Options.showNavButtons]
    */
  var showNavButtons: js.UndefOr[Boolean] = js.native
}
object dxTabsOptions {
  
  @scala.inline
  def apply[T](): dxTabsOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabsOptions[T]]
  }
  
  @scala.inline
  implicit class dxTabsOptionsOps[Self <: dxTabsOptions[_], T] (val x: Self with dxTabsOptions[T]) extends AnyVal {
    
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
    def setDataSourceVarargs(value: (String | dxTabsItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxTabsItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxTabsItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxTabsItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setRepaintChangesOnly(value: Boolean): Self = this.set("repaintChangesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepaintChangesOnly: Self = this.set("repaintChangesOnly", js.undefined)
    
    @scala.inline
    def setScrollByContent(value: Boolean): Self = this.set("scrollByContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByContent: Self = this.set("scrollByContent", js.undefined)
    
    @scala.inline
    def setScrollingEnabled(value: Boolean): Self = this.set("scrollingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingEnabled: Self = this.set("scrollingEnabled", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: (String | Double | js.Any)*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[String | Double | _]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: multiple | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowNavButtons(value: Boolean): Self = this.set("showNavButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavButtons: Self = this.set("showNavButtons", js.undefined)
  }
}

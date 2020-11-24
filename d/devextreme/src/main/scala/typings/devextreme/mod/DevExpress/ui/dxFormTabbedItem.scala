package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AlignItemLabels
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFormTabbedItem extends js.Object {
  
  /**
    * [descr:dxFormTabbedItem.colSpan]
    */
  var colSpan: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFormTabbedItem.cssClass]
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFormTabbedItem.itemType]
    */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.native
  
  /**
    * [descr:dxFormTabbedItem.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFormTabbedItem.tabPanelOptions]
    */
  var tabPanelOptions: js.UndefOr[dxTabPanelOptions] = js.native
  
  /**
    * [descr:dxFormTabbedItem.tabs]
    */
  var tabs: js.UndefOr[js.Array[AlignItemLabels]] = js.native
  
  /**
    * [descr:dxFormTabbedItem.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFormTabbedItem.visibleIndex]
    */
  var visibleIndex: js.UndefOr[Double] = js.native
}
object dxFormTabbedItem {
  
  @scala.inline
  def apply(): dxFormTabbedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormTabbedItem]
  }
  
  @scala.inline
  implicit class dxFormTabbedItemOps[Self <: dxFormTabbedItem] (val x: Self) extends AnyVal {
    
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
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setItemType(value: empty | group | simple | tabbed | button): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTabPanelOptions(value: dxTabPanelOptions): Self = this.set("tabPanelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabPanelOptions: Self = this.set("tabPanelOptions", js.undefined)
    
    @scala.inline
    def setTabsVarargs(value: AlignItemLabels*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[AlignItemLabels]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleIndex: Self = this.set("visibleIndex", js.undefined)
  }
}

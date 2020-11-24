package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inMenu
import typings.devextreme.devextremeStrings.never
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxToolbarItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxToolbarItem.cssClass]
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxToolbarItem.locateInMenu]
    */
  var locateInMenu: js.UndefOr[always | auto | never] = js.native
  
  /**
    * [descr:dxToolbarItem.location]
    */
  var location: js.UndefOr[after | before | center] = js.native
  
  /**
    * [descr:dxToolbarItem.menuItemTemplate]
    */
  var menuItemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxToolbarItem.options]
    */
  var options: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxToolbarItem.showText]
    */
  var showText: js.UndefOr[always | inMenu] = js.native
  
  /**
    * [descr:dxToolbarItem.widget]
    */
  var widget: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton
  ] = js.native
}
object dxToolbarItem {
  
  @scala.inline
  def apply(): dxToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarItem]
  }
  
  @scala.inline
  implicit class dxToolbarItemOps[Self <: dxToolbarItem] (val x: Self) extends AnyVal {
    
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
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setLocateInMenu(value: always | auto | never): Self = this.set("locateInMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocateInMenu: Self = this.set("locateInMenu", js.undefined)
    
    @scala.inline
    def setLocation(value: after | before | center): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMenuItemTemplateFunction0(value: () => String | Element | JQuery): Self = this.set("menuItemTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMenuItemTemplate(value: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])): Self = this.set("menuItemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItemTemplate: Self = this.set("menuItemTemplate", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setShowText(value: always | inMenu): Self = this.set("showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
    
    @scala.inline
    def setWidget(
      value: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton
    ): Self = this.set("widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
  }
}

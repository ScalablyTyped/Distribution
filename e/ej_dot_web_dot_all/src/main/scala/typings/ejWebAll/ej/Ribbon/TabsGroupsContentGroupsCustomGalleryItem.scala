package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsGroupsContentGroupsCustomGalleryItem extends js.Object {
  
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.native
  
  /** Specifies the type as ej.Ribbon.CustomItemType.Menu or ej.Ribbon.CustomItemType.Button to render Syncfusion button and menu.
    * @Default {ej.Ribbon.CustomItemType.Button}
    */
  var customItemType: js.UndefOr[CustomItemType | String] = js.native
  
  /** Specifies the custom tooltip for gallery extra item's button. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.native
  
  /** Specifies the UL list id to render menu as gallery extra item.
    * @Default {null}
    */
  var menuId: js.UndefOr[String] = js.native
  
  /** Specifies the Syncfusion menu members, events by using menuSettings.
    * @Default {Object}
    */
  var menuSettings: js.UndefOr[js.Any] = js.native
  
  /** Specifies the text for gallery extra item's button.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the tooltip for gallery extra item's button.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
}
object TabsGroupsContentGroupsCustomGalleryItem {
  
  @scala.inline
  def apply(): TabsGroupsContentGroupsCustomGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomGalleryItem]
  }
  
  @scala.inline
  implicit class TabsGroupsContentGroupsCustomGalleryItemOps[Self <: TabsGroupsContentGroupsCustomGalleryItem] (val x: Self) extends AnyVal {
    
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
    def setButtonSettings(value: js.Any): Self = this.set("buttonSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonSettings: Self = this.set("buttonSettings", js.undefined)
    
    @scala.inline
    def setCustomItemType(value: CustomItemType | String): Self = this.set("customItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomItemType: Self = this.set("customItemType", js.undefined)
    
    @scala.inline
    def setCustomToolTip(value: js.Any): Self = this.set("customToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolTip: Self = this.set("customToolTip", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = this.set("menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuId: Self = this.set("menuId", js.undefined)
    
    @scala.inline
    def setMenuSettings(value: js.Any): Self = this.set("menuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuSettings: Self = this.set("menuSettings", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
  }
}

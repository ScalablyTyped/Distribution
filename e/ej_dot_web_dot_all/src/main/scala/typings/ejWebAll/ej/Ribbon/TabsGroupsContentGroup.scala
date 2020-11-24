package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsGroupsContentGroup extends js.Object {
  
  /** Specifies the Syncfusion button members, events by using this buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.native
  
  /** It is used to set the count of gallery contents in a row.
    * @Default {null}
    */
  var columns: js.UndefOr[Double] = js.native
  
  /** Specifies the custom items such as div, table, controls as custom controls with the type &quot;ej.Ribbon.Type.Custom&quot; in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.native
  
  /** Specifies the CSS class property to apply styles to the button, split, dropdown controls in the groups.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Specifies the Syncfusion button and menu as gallery extra items.
    * @Default {Array}
    */
  var customGalleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsCustomGalleryItem]] = js.native
  
  /** Provides custom tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups. Text and HTML support are also provided for title and content.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[TabsGroupsContentGroupsCustomToolTip] = js.native
  
  /** Specifies the Syncfusion dropdown list members, events by using this dropdownSettings.
    * @Default {Object}
    */
  var dropdownSettings: js.UndefOr[js.Any] = js.native
  
  /** Specifies the separator to the control that is in row type group. The separator separates the control from the next control in the group. Set &quot;true&quot; to enable the
    * separator.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.native
  
  /** Sets the count of gallery contents in a row, when the gallery is in expanded state.
    * @Default {null}
    */
  var expandedColumns: js.UndefOr[Double] = js.native
  
  /** Defines each gallery content.
    * @Default {Array}
    */
  var galleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsGalleryItem]] = js.native
  
  /** Specifies the Id for button, split button, dropdown list, toggle button, gallery, custom controls in the sub groups.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  
  /** Specifies the size for button, split button controls. Set &quot;true&quot; for big size and &quot;false&quot; for small size.
    * @Default {null}
    */
  var isBig: js.UndefOr[Boolean] = js.native
  
  /** When isMobileOnly is true,its shows in mobile toolbar.isResponsive should be true for using this property.
    * @Default {false}
    */
  var isMobileOnly: js.UndefOr[Boolean] = js.native
  
  /** Sets the height of each gallery content.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[String | Double] = js.native
  
  /** Sets the width of each gallery content.
    * @Default {null}
    */
  var itemWidth: js.UndefOr[String | Double] = js.native
  
  /** To add,show and hide controls in Quick Access toolbar.
    * @Default {ej.Ribbon.QuickAccessMode.None}
    */
  var quickAccessMode: js.UndefOr[QuickAccessMode | String] = js.native
  
  /** Specifies the Syncfusion split button members, events by using this splitButtonSettings.
    * @Default {Object}
    */
  var splitButtonSettings: js.UndefOr[js.Any] = js.native
  
  /** Specifies the text for button, split button, toggle button controls in the sub groups.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the Syncfusion toggle button members, events by using toggleButtonSettings.
    * @Default {Object}
    */
  var toggleButtonSettings: js.UndefOr[js.Any] = js.native
  
  /** Specifies the tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
  
  /** Specifies the type as &quot;ej.Ribbon.Type.Button&quot; or &quot;ej.Ribbon.Type.SplitButton&quot; or &quot;ej.Ribbon.Type.DropDownList&quot; or
    * &quot;ej.Ribbon.Type.ToggleButton&quot; or &quot;ej.Ribbon.Type.Custom&quot; or &quot;ej.Ribbon.Type.Gallery&quot; to render button, split, dropdown, toggle button, gallery,
    * custom controls.
    * @Default {ej.Ribbon.Type.Button}
    */
  var `type`: js.UndefOr[Type | String] = js.native
}
object TabsGroupsContentGroup {
  
  @scala.inline
  def apply(): TabsGroupsContentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroup]
  }
  
  @scala.inline
  implicit class TabsGroupsContentGroupOps[Self <: TabsGroupsContentGroup] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setContentID(value: String): Self = this.set("contentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentID: Self = this.set("contentID", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCustomGalleryItemsVarargs(value: TabsGroupsContentGroupsCustomGalleryItem*): Self = this.set("customGalleryItems", js.Array(value :_*))
    
    @scala.inline
    def setCustomGalleryItems(value: js.Array[TabsGroupsContentGroupsCustomGalleryItem]): Self = this.set("customGalleryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomGalleryItems: Self = this.set("customGalleryItems", js.undefined)
    
    @scala.inline
    def setCustomToolTip(value: TabsGroupsContentGroupsCustomToolTip): Self = this.set("customToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolTip: Self = this.set("customToolTip", js.undefined)
    
    @scala.inline
    def setDropdownSettings(value: js.Any): Self = this.set("dropdownSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownSettings: Self = this.set("dropdownSettings", js.undefined)
    
    @scala.inline
    def setEnableSeparator(value: Boolean): Self = this.set("enableSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSeparator: Self = this.set("enableSeparator", js.undefined)
    
    @scala.inline
    def setExpandedColumns(value: Double): Self = this.set("expandedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedColumns: Self = this.set("expandedColumns", js.undefined)
    
    @scala.inline
    def setGalleryItemsVarargs(value: TabsGroupsContentGroupsGalleryItem*): Self = this.set("galleryItems", js.Array(value :_*))
    
    @scala.inline
    def setGalleryItems(value: js.Array[TabsGroupsContentGroupsGalleryItem]): Self = this.set("galleryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGalleryItems: Self = this.set("galleryItems", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsBig(value: Boolean): Self = this.set("isBig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBig: Self = this.set("isBig", js.undefined)
    
    @scala.inline
    def setIsMobileOnly(value: Boolean): Self = this.set("isMobileOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobileOnly: Self = this.set("isMobileOnly", js.undefined)
    
    @scala.inline
    def setItemHeight(value: String | Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setItemWidth(value: String | Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setQuickAccessMode(value: QuickAccessMode | String): Self = this.set("quickAccessMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickAccessMode: Self = this.set("quickAccessMode", js.undefined)
    
    @scala.inline
    def setSplitButtonSettings(value: js.Any): Self = this.set("splitButtonSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitButtonSettings: Self = this.set("splitButtonSettings", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setToggleButtonSettings(value: js.Any): Self = this.set("toggleButtonSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleButtonSettings: Self = this.set("toggleButtonSettings", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
    
    @scala.inline
    def setType(value: Type | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

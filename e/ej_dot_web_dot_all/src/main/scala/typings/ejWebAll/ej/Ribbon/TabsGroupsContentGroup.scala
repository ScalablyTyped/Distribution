package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentGroup extends js.Object {
  /** Specifies the Syncfusion button members, events by using this buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.undefined
  /** It is used to set the count of gallery contents in a row.
    * @Default {null}
    */
  var columns: js.UndefOr[Double] = js.undefined
  /** Specifies the custom items such as div, table, controls as custom controls with the type &quot;ej.Ribbon.Type.Custom&quot; in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.undefined
  /** Specifies the CSS class property to apply styles to the button, split, dropdown controls in the groups.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the Syncfusion button and menu as gallery extra items.
    * @Default {Array}
    */
  var customGalleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsCustomGalleryItem]] = js.undefined
  /** Provides custom tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups. Text and HTML support are also provided for title and content.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[TabsGroupsContentGroupsCustomToolTip] = js.undefined
  /** Specifies the Syncfusion dropdown list members, events by using this dropdownSettings.
    * @Default {Object}
    */
  var dropdownSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the separator to the control that is in row type group. The separator separates the control from the next control in the group. Set &quot;true&quot; to enable the
    * separator.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.undefined
  /** Sets the count of gallery contents in a row, when the gallery is in expanded state.
    * @Default {null}
    */
  var expandedColumns: js.UndefOr[Double] = js.undefined
  /** Defines each gallery content.
    * @Default {Array}
    */
  var galleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsGalleryItem]] = js.undefined
  /** Specifies the Id for button, split button, dropdown list, toggle button, gallery, custom controls in the sub groups.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Specifies the size for button, split button controls. Set &quot;true&quot; for big size and &quot;false&quot; for small size.
    * @Default {null}
    */
  var isBig: js.UndefOr[Boolean] = js.undefined
  /** When isMobileOnly is true,its shows in mobile toolbar.isResponsive should be true for using this property.
    * @Default {false}
    */
  var isMobileOnly: js.UndefOr[Boolean] = js.undefined
  /** Sets the height of each gallery content.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[String | Double] = js.undefined
  /** Sets the width of each gallery content.
    * @Default {null}
    */
  var itemWidth: js.UndefOr[String | Double] = js.undefined
  /** To add,show and hide controls in Quick Access toolbar.
    * @Default {ej.Ribbon.QuickAccessMode.None}
    */
  var quickAccessMode: js.UndefOr[QuickAccessMode | String] = js.undefined
  /** Specifies the Syncfusion split button members, events by using this splitButtonSettings.
    * @Default {Object}
    */
  var splitButtonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the text for button, split button, toggle button controls in the sub groups.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the Syncfusion toggle button members, events by using toggleButtonSettings.
    * @Default {Object}
    */
  var toggleButtonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.undefined
  /** Specifies the type as &quot;ej.Ribbon.Type.Button&quot; or &quot;ej.Ribbon.Type.SplitButton&quot; or &quot;ej.Ribbon.Type.DropDownList&quot; or
    * &quot;ej.Ribbon.Type.ToggleButton&quot; or &quot;ej.Ribbon.Type.Custom&quot; or &quot;ej.Ribbon.Type.Gallery&quot; to render button, split, dropdown, toggle button, gallery,
    * custom controls.
    * @Default {ej.Ribbon.Type.Button}
    */
  var `type`: js.UndefOr[Type | String] = js.undefined
}

object TabsGroupsContentGroup {
  @scala.inline
  def apply(
    buttonSettings: js.Any = null,
    columns: js.UndefOr[Double] = js.undefined,
    contentID: String = null,
    cssClass: String = null,
    customGalleryItems: js.Array[TabsGroupsContentGroupsCustomGalleryItem] = null,
    customToolTip: TabsGroupsContentGroupsCustomToolTip = null,
    dropdownSettings: js.Any = null,
    enableSeparator: js.UndefOr[Boolean] = js.undefined,
    expandedColumns: js.UndefOr[Double] = js.undefined,
    galleryItems: js.Array[TabsGroupsContentGroupsGalleryItem] = null,
    id: String = null,
    isBig: js.UndefOr[Boolean] = js.undefined,
    isMobileOnly: js.UndefOr[Boolean] = js.undefined,
    itemHeight: String | Double = null,
    itemWidth: String | Double = null,
    quickAccessMode: QuickAccessMode | String = null,
    splitButtonSettings: js.Any = null,
    text: String = null,
    toggleButtonSettings: js.Any = null,
    toolTip: String = null,
    `type`: Type | String = null
  ): TabsGroupsContentGroup = {
    val __obj = js.Dynamic.literal()
    if (buttonSettings != null) __obj.updateDynamic("buttonSettings")(buttonSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (contentID != null) __obj.updateDynamic("contentID")(contentID.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customGalleryItems != null) __obj.updateDynamic("customGalleryItems")(customGalleryItems.asInstanceOf[js.Any])
    if (customToolTip != null) __obj.updateDynamic("customToolTip")(customToolTip.asInstanceOf[js.Any])
    if (dropdownSettings != null) __obj.updateDynamic("dropdownSettings")(dropdownSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeparator)) __obj.updateDynamic("enableSeparator")(enableSeparator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedColumns)) __obj.updateDynamic("expandedColumns")(expandedColumns.get.asInstanceOf[js.Any])
    if (galleryItems != null) __obj.updateDynamic("galleryItems")(galleryItems.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isBig)) __obj.updateDynamic("isBig")(isBig.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobileOnly)) __obj.updateDynamic("isMobileOnly")(isMobileOnly.get.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (quickAccessMode != null) __obj.updateDynamic("quickAccessMode")(quickAccessMode.asInstanceOf[js.Any])
    if (splitButtonSettings != null) __obj.updateDynamic("splitButtonSettings")(splitButtonSettings.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (toggleButtonSettings != null) __obj.updateDynamic("toggleButtonSettings")(toggleButtonSettings.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsGroupsContentGroup]
  }
}


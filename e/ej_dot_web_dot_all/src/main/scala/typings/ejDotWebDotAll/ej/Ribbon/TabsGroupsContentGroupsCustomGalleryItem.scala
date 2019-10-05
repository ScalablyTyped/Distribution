package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentGroupsCustomGalleryItem extends js.Object {
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the type as ej.Ribbon.CustomItemType.Menu or ej.Ribbon.CustomItemType.Button to render Syncfusion button and menu.
    * @Default {ej.Ribbon.CustomItemType.Button}
    */
  var customItemType: js.UndefOr[CustomItemType | String] = js.undefined
  /** Specifies the custom tooltip for gallery extra item's button. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.undefined
  /** Specifies the UL list id to render menu as gallery extra item.
    * @Default {null}
    */
  var menuId: js.UndefOr[String] = js.undefined
  /** Specifies the Syncfusion menu members, events by using menuSettings.
    * @Default {Object}
    */
  var menuSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the text for gallery extra item's button.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the tooltip for gallery extra item's button.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.undefined
}

object TabsGroupsContentGroupsCustomGalleryItem {
  @scala.inline
  def apply(
    buttonSettings: js.Any = null,
    customItemType: CustomItemType | String = null,
    customToolTip: js.Any = null,
    menuId: String = null,
    menuSettings: js.Any = null,
    text: String = null,
    toolTip: String = null
  ): TabsGroupsContentGroupsCustomGalleryItem = {
    val __obj = js.Dynamic.literal()
    if (buttonSettings != null) __obj.updateDynamic("buttonSettings")(buttonSettings)
    if (customItemType != null) __obj.updateDynamic("customItemType")(customItemType.asInstanceOf[js.Any])
    if (customToolTip != null) __obj.updateDynamic("customToolTip")(customToolTip)
    if (menuId != null) __obj.updateDynamic("menuId")(menuId)
    if (menuSettings != null) __obj.updateDynamic("menuSettings")(menuSettings)
    if (text != null) __obj.updateDynamic("text")(text)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomGalleryItem]
  }
}


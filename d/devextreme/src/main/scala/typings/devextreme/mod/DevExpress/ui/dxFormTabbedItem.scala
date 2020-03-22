package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAlignItemLabels
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormTabbedItem extends js.Object {
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the item's type. Set it to "tabbed" to create a tabbed item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.undefined
  /** Holds a configuration object for the TabPanel widget used to display the current form item. */
  var tabPanelOptions: js.UndefOr[dxTabPanelOptions] = js.undefined
  /** An array of tab configuration objects. */
  var tabs: js.UndefOr[js.Array[AnonAlignItemLabels]] = js.undefined
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormTabbedItem {
  @scala.inline
  def apply(
    colSpan: Int | Double = null,
    cssClass: String = null,
    itemType: empty | group | simple | tabbed | button = null,
    name: String = null,
    tabPanelOptions: dxTabPanelOptions = null,
    tabs: js.Array[AnonAlignItemLabels] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null
  ): dxFormTabbedItem = {
    val __obj = js.Dynamic.literal()
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tabPanelOptions != null) __obj.updateDynamic("tabPanelOptions")(tabPanelOptions.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormTabbedItem]
  }
}


package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAddedItems
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonDelayName
import typings.devextreme.AnonElement
import typings.devextreme.AnonEvent
import typings.devextreme.AnonHide
import typings.devextreme.AnonItemData
import typings.devextreme.AnonItemElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelRootItem
import typings.devextreme.AnonName
import typings.devextreme.AnonRootItem
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.leftOrTop
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.rightOrBottom
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxMenuOptions extends dxMenuBaseOptions[dxMenu] {
  /** Specifies whether adaptive widget rendering is enabled on small screens. Applies only if the orientation is "horizontal". */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxMenuOptions: js.UndefOr[String | js.Array[dxMenuItem] | DataSource | DataSourceOptions] = js.undefined
  /** Specifies whether or not the submenu is hidden when the mouse pointer leaves it. */
  var hideSubmenuOnMouseLeave: js.UndefOr[Boolean] = js.undefined
  /** Holds an array of menu items. */
  @JSName("items")
  var items_dxMenuOptions: js.UndefOr[js.Array[dxMenuItem]] = js.undefined
  /** A function that is executed after a submenu is hidden. */
  var onSubmenuHidden: js.UndefOr[js.Function1[/* e */ AnonRootItem, _]] = js.undefined
  /** A function that is executed before a submenu is hidden. */
  var onSubmenuHiding: js.UndefOr[js.Function1[/* e */ AnonModelRootItem, _]] = js.undefined
  /** A function that is executed before a submenu is displayed. */
  var onSubmenuShowing: js.UndefOr[js.Function1[/* e */ AnonRootItem, _]] = js.undefined
  /** A function that is executed after a submenu is displayed. */
  var onSubmenuShown: js.UndefOr[js.Function1[/* e */ AnonRootItem, _]] = js.undefined
  /** Specifies whether the menu has horizontal or vertical orientation. */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  /** Specifies options for showing and hiding the first level submenu. */
  var showFirstSubmenuMode: js.UndefOr[AnonDelayName | onClick | onHover] = js.undefined
  /** Specifies the direction at which the submenus are displayed. */
  var submenuDirection: js.UndefOr[auto | leftOrTop | rightOrBottom] = js.undefined
}

object dxMenuOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    adaptivityEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: AnonHide = null,
    bindingOptions: js.Any = null,
    cssClass: String = null,
    dataSource: String | js.Array[dxMenuItem] | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledExpr: String | js.Function = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hideSubmenuOnMouseLeave: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[dxMenuItem] = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxMenu] => _ = null,
    onDisposing: /* e */ AnonModel[dxMenu] => _ = null,
    onInitialized: /* e */ AnonElement[dxMenu] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxMenu], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxMenu] => _ = null,
    onItemHold: /* e */ AnonItemData[dxMenu] => _ = null,
    onItemRendered: /* e */ AnonItemElement[dxMenu] => _ = null,
    onOptionChanged: /* e */ AnonName[dxMenu] => _ = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxMenu] => _ = null,
    onSubmenuHidden: /* e */ AnonRootItem => _ = null,
    onSubmenuHiding: /* e */ AnonModelRootItem => _ = null,
    onSubmenuShowing: /* e */ AnonRootItem => _ = null,
    onSubmenuShown: /* e */ AnonRootItem => _ = null,
    orientation: horizontal | vertical = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectByClick: js.UndefOr[Boolean] = js.undefined,
    selectedExpr: String | js.Function = null,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: none | single_ = null,
    showFirstSubmenuMode: AnonDelayName | onClick | onHover = null,
    showSubmenuMode: AnonDelayName | onClick | onHover = null,
    submenuDirection: auto | leftOrTop | rightOrBottom = null,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptivityEnabled)) __obj.updateDynamic("adaptivityEnabled")(adaptivityEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledExpr != null) __obj.updateDynamic("disabledExpr")(disabledExpr.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSubmenuOnMouseLeave)) __obj.updateDynamic("hideSubmenuOnMouseLeave")(hideSubmenuOnMouseLeave.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1(onItemContextMenu))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1(onItemHold))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1(onItemRendered))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onSubmenuHidden != null) __obj.updateDynamic("onSubmenuHidden")(js.Any.fromFunction1(onSubmenuHidden))
    if (onSubmenuHiding != null) __obj.updateDynamic("onSubmenuHiding")(js.Any.fromFunction1(onSubmenuHiding))
    if (onSubmenuShowing != null) __obj.updateDynamic("onSubmenuShowing")(js.Any.fromFunction1(onSubmenuShowing))
    if (onSubmenuShown != null) __obj.updateDynamic("onSubmenuShown")(js.Any.fromFunction1(onSubmenuShown))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selectByClick)) __obj.updateDynamic("selectByClick")(selectByClick.asInstanceOf[js.Any])
    if (selectedExpr != null) __obj.updateDynamic("selectedExpr")(selectedExpr.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showFirstSubmenuMode != null) __obj.updateDynamic("showFirstSubmenuMode")(showFirstSubmenuMode.asInstanceOf[js.Any])
    if (showSubmenuMode != null) __obj.updateDynamic("showSubmenuMode")(showSubmenuMode.asInstanceOf[js.Any])
    if (submenuDirection != null) __obj.updateDynamic("submenuDirection")(submenuDirection.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxMenuOptions]
  }
}


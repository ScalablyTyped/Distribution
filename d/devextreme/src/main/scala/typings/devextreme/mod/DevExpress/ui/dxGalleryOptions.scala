package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAddedItems
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonEvent
import typings.devextreme.AnonItemData
import typings.devextreme.AnonItemElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxGalleryOptions extends CollectionWidgetOptions[dxGallery] {
  /** The time, in milliseconds, spent on slide animation. */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /** Specifies whether or not to animate the displayed item change. */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxGalleryOptions: js.UndefOr[String | (js.Array[String | dxGalleryItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** A Boolean value specifying whether or not to allow users to switch between items by clicking an indicator. */
  var indicatorEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of an area used to display a single image. */
  var initialItemWidth: js.UndefOr[Double] = js.undefined
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxGalleryOptions: js.UndefOr[js.Array[String | dxGalleryItem | _]] = js.undefined
  /** A Boolean value specifying whether or not to scroll back to the first item after the last item is swiped. */
  var loop: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not to display an indicator that points to the selected gallery item. */
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value that specifies the availability of the "Forward" and "Back" navigation buttons. */
  var showNavButtons: js.UndefOr[Boolean] = js.undefined
  /** The time interval in milliseconds, after which the gallery switches to the next item. */
  var slideshowDelay: js.UndefOr[Double] = js.undefined
  /** Specifies if the widget stretches images to fit the total gallery width. */
  var stretchImages: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not to allow users to switch between items by swiping. */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not to display parts of previous and next images along the sides of the current image. */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}

object dxGalleryOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    dataSource: String | (js.Array[String | dxGalleryItem | _]) | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    indicatorEnabled: js.UndefOr[Boolean] = js.undefined,
    initialItemWidth: Int | Double = null,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[String | dxGalleryItem | _] = null,
    keyExpr: String | js.Function = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxGallery] => _ = null,
    onDisposing: /* e */ AnonModel[dxGallery] => _ = null,
    onInitialized: /* e */ AnonElement[dxGallery] => _ = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxGallery], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxGallery] => _ = null,
    onItemHold: /* e */ AnonItemData[dxGallery] => _ = null,
    onItemRendered: /* e */ AnonItemElement[dxGallery] => _ = null,
    onOptionChanged: /* e */ AnonName[dxGallery] => _ = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxGallery] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    showIndicator: js.UndefOr[Boolean] = js.undefined,
    showNavButtons: js.UndefOr[Boolean] = js.undefined,
    slideshowDelay: Int | Double = null,
    stretchImages: js.UndefOr[Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): dxGalleryOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorEnabled)) __obj.updateDynamic("indicatorEnabled")(indicatorEnabled.asInstanceOf[js.Any])
    if (initialItemWidth != null) __obj.updateDynamic("initialItemWidth")(initialItemWidth.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicator)) __obj.updateDynamic("showIndicator")(showIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavButtons)) __obj.updateDynamic("showNavButtons")(showNavButtons.asInstanceOf[js.Any])
    if (slideshowDelay != null) __obj.updateDynamic("slideshowDelay")(slideshowDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchImages)) __obj.updateDynamic("stretchImages")(stretchImages.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxGalleryOptions]
  }
}


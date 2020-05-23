package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.EventJQueryEvent
import typings.devextreme.anon.ItemIndexModel
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDropDownMenuOptions extends WidgetOptions[dxDropDownMenu] {
  /** @name dxDropDownMenu.Options.buttonIcon */
  var buttonIcon: js.UndefOr[String] = js.undefined
  /** @name dxDropDownMenu.Options.buttonText */
  var buttonText: js.UndefOr[String] = js.undefined
  /** @name dxDropDownMenu.Options.dataSource */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  /** @name dxDropDownMenu.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxDropDownMenu.Options.items */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** @name dxDropDownMenu.Options.onButtonClick */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ EventJQueryEvent, _]) | String] = js.undefined
  /** @name dxDropDownMenu.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ ItemIndexModel, _]) | String] = js.undefined
  /** @name dxDropDownMenu.Options.opened */
  var opened: js.UndefOr[Boolean] = js.undefined
  /** @name dxDropDownMenu.Options.popupHeight */
  var popupHeight: js.UndefOr[Double | String | js.Function] = js.undefined
  /** @name dxDropDownMenu.Options.popupWidth */
  var popupWidth: js.UndefOr[Double | String | js.Function] = js.undefined
  /** @name dxDropDownMenu.Options.usePopover */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}

object dxDropDownMenuOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttonIcon: String = null,
    buttonText: String = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[_] = null,
    onButtonClick: (js.Function1[/* e */ EventJQueryEvent, _]) | String = null,
    onContentReady: /* e */ ComponentElement[dxDropDownMenu] => _ = null,
    onDisposing: /* e */ Model[dxDropDownMenu] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxDropDownMenu] => _ = null,
    onItemClick: (js.Function1[/* e */ ItemIndexModel, _]) | String = null,
    onOptionChanged: /* e */ Name[dxDropDownMenu] => _ = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    popupHeight: Double | String | js.Function = null,
    popupWidth: Double | String | js.Function = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    usePopover: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDropDownMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttonIcon != null) __obj.updateDynamic("buttonIcon")(buttonIcon.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(onButtonClick.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopover)) __obj.updateDynamic("usePopover")(usePopover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDropDownMenuOptions]
  }
}


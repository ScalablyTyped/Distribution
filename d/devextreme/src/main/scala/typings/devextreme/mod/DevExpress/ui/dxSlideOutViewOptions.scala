package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.inverted
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSlideOutViewOptions extends WidgetOptions[dxSlideOutView] {
  /** @name dxSlideOutView.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _])
  ] = js.undefined
  /** @name dxSlideOutView.Options.menuPosition */
  var menuPosition: js.UndefOr[inverted | normal] = js.undefined
  /** @name dxSlideOutView.Options.menuTemplate */
  var menuTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _])
  ] = js.undefined
  /** @name dxSlideOutView.Options.menuVisible */
  var menuVisible: js.UndefOr[Boolean] = js.undefined
  /** @name dxSlideOutView.Options.swipeEnabled */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxSlideOutViewOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    contentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    menuPosition: inverted | normal = null,
    menuTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _]) = null,
    menuVisible: js.UndefOr[Boolean] = js.undefined,
    onContentReady: /* e */ AnonComponentElement[dxSlideOutView] => _ = null,
    onDisposing: /* e */ AnonModel[dxSlideOutView] => _ = null,
    onInitialized: /* e */ AnonElement[dxSlideOutView] => _ = null,
    onOptionChanged: /* e */ AnonName[dxSlideOutView] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSlideOutViewOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (menuTemplate != null) __obj.updateDynamic("menuTemplate")(menuTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(menuVisible)) __obj.updateDynamic("menuVisible")(menuVisible.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSlideOutViewOptions]
  }
}


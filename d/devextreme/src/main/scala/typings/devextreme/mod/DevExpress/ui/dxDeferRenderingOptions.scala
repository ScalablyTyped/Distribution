package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDxDeferRendering
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.mod.DevExpress.animationConfig
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDeferRenderingOptions extends WidgetOptions[dxDeferRendering] {
  /** @name dxDeferRendering.Options.animation */
  var animation: js.UndefOr[animationConfig] = js.undefined
  /** @name dxDeferRendering.Options.onRendered */
  var onRendered: js.UndefOr[js.Function1[/* e */ ComponentDxDeferRendering, _]] = js.undefined
  /** @name dxDeferRendering.Options.onShown */
  var onShown: js.UndefOr[js.Function1[/* e */ ComponentDxDeferRendering, _]] = js.undefined
  /** @name dxDeferRendering.Options.renderWhen */
  var renderWhen: js.UndefOr[Promise[Unit] | JQueryPromise[Unit] | Boolean] = js.undefined
  /** @name dxDeferRendering.Options.showLoadIndicator */
  var showLoadIndicator: js.UndefOr[Boolean] = js.undefined
  /** @name dxDeferRendering.Options.staggerItemSelector */
  var staggerItemSelector: js.UndefOr[String] = js.undefined
}

object dxDeferRenderingOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: animationConfig = null,
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    onContentReady: /* e */ ComponentElement[dxDeferRendering] => _ = null,
    onDisposing: /* e */ Model[dxDeferRendering] => _ = null,
    onInitialized: /* e */ Element[dxDeferRendering] => _ = null,
    onOptionChanged: /* e */ Name[dxDeferRendering] => _ = null,
    onRendered: /* e */ ComponentDxDeferRendering => _ = null,
    onShown: /* e */ ComponentDxDeferRendering => _ = null,
    renderWhen: Promise[Unit] | JQueryPromise[Unit] | Boolean = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showLoadIndicator: js.UndefOr[Boolean] = js.undefined,
    staggerItemSelector: String = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDeferRenderingOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction1(onRendered))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (renderWhen != null) __obj.updateDynamic("renderWhen")(renderWhen.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadIndicator)) __obj.updateDynamic("showLoadIndicator")(showLoadIndicator.get.asInstanceOf[js.Any])
    if (staggerItemSelector != null) __obj.updateDynamic("staggerItemSelector")(staggerItemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDeferRenderingOptions]
  }
}


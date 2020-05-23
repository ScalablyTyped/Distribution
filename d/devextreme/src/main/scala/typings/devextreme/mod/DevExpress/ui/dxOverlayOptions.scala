package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.CancelComponentElementModel
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.ElementDxElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxOverlayOptions[T] extends WidgetOptions[T] {
  /** @name dxOverlay.Options.animation */
  var animation: js.UndefOr[dxOverlayAnimation] = js.undefined
  /** @name dxOverlay.Options.closeOnOutsideClick */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.undefined
  /** @name dxOverlay.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxOverlay.Options.deferRendering */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  /** @name dxOverlay.Options.dragEnabled */
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxOverlay.Options.maxHeight */
  var maxHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name dxOverlay.Options.maxWidth */
  var maxWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name dxOverlay.Options.minHeight */
  var minHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name dxOverlay.Options.minWidth */
  var minWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** @name dxOverlay.Options.onHidden */
  var onHidden: js.UndefOr[js.Function1[/* e */ ElementDxElement[T], _]] = js.undefined
  /** @name dxOverlay.Options.onHiding */
  var onHiding: js.UndefOr[js.Function1[/* e */ CancelComponentElementModel[T], _]] = js.undefined
  /** @name dxOverlay.Options.onShowing */
  var onShowing: js.UndefOr[js.Function1[/* e */ ElementDxElement[T], _]] = js.undefined
  /** @name dxOverlay.Options.onShown */
  var onShown: js.UndefOr[js.Function1[/* e */ ElementDxElement[T], _]] = js.undefined
  /** @name dxOverlay.Options.position */
  var position: js.UndefOr[js.Any] = js.undefined
  /** @name dxOverlay.Options.shading */
  var shading: js.UndefOr[Boolean] = js.undefined
  /** @name dxOverlay.Options.shadingColor */
  var shadingColor: js.UndefOr[String] = js.undefined
}

object dxOverlayOptions {
  @scala.inline
  def apply[T](
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: dxOverlayAnimation = null,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    contentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery]) = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Double | String | (js.Function0[Double | String]) = null,
    maxWidth: Double | String | (js.Function0[Double | String]) = null,
    minHeight: Double | String | (js.Function0[Double | String]) = null,
    minWidth: Double | String | (js.Function0[Double | String]) = null,
    onContentReady: /* e */ ComponentElement[T] => _ = null,
    onDisposing: /* e */ Model[T] => _ = null,
    onHidden: /* e */ ElementDxElement[T] => _ = null,
    onHiding: /* e */ CancelComponentElementModel[T] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[T] => _ = null,
    onOptionChanged: /* e */ Name[T] => _ = null,
    onShowing: /* e */ ElementDxElement[T] => _ = null,
    onShown: /* e */ ElementDxElement[T] => _ = null,
    position: js.Any = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    shadingColor: String = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxOverlayOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction1(onHidden))
    if (onHiding != null) __obj.updateDynamic("onHiding")(js.Any.fromFunction1(onHiding))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction1(onShowing))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.get.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxOverlayOptions[T]]
  }
}


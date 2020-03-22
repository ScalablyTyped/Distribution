package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonCancelComponentElementModel
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementDxElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxOverlayOptions[T] extends WidgetOptions[T] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  var animation: js.UndefOr[dxOverlayAnimation] = js.undefined
  /** Specifies whether to close the widget if a user clicks outside it. */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.undefined
  /** Specifies a custom template for the widget content. */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies whether to render the widget's content when it is displayed. If false, the content is rendered immediately. */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not an end-user can drag the widget. */
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the maximum height the widget can reach while resizing. */
  var maxHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** Specifies the maximum width the widget can reach while resizing. */
  var maxWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** Specifies the minimum height the widget can reach while resizing. */
  var minHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** Specifies the minimum width the widget can reach while resizing. */
  var minWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  /** A function that is executed after the widget is hidden. */
  var onHidden: js.UndefOr[js.Function1[/* e */ AnonElementDxElement[T], _]] = js.undefined
  /** A function that is executed before the widget is hidden. */
  var onHiding: js.UndefOr[js.Function1[/* e */ AnonCancelComponentElementModel[T], _]] = js.undefined
  /** A function that is executed before the widget is displayed. */
  var onShowing: js.UndefOr[js.Function1[/* e */ AnonElementDxElement[T], _]] = js.undefined
  /** A function that is executed after the widget is displayed. */
  var onShown: js.UndefOr[js.Function1[/* e */ AnonElementDxElement[T], _]] = js.undefined
  /** Positions the widget. */
  var position: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether to shade the background when the widget is active. */
  var shading: js.UndefOr[Boolean] = js.undefined
  /** Specifies the shading color. */
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
    onContentReady: /* e */ AnonComponentElement[T] => _ = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onHidden: /* e */ AnonElementDxElement[T] => _ = null,
    onHiding: /* e */ AnonCancelComponentElementModel[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onShowing: /* e */ AnonElementDxElement[T] => _ = null,
    onShown: /* e */ AnonElementDxElement[T] => _ = null,
    position: js.Any = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    shadingColor: String = null,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxOverlayOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxOverlayOptions[T]]
  }
}


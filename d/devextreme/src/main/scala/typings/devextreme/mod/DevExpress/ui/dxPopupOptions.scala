package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonCancelComponentElementModel
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementDxElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelAny
import typings.devextreme.AnonModelTitleElement
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.`left bottom`
import typings.devextreme.devextremeStrings.`left top`
import typings.devextreme.devextremeStrings.`right bottom`
import typings.devextreme.devextremeStrings.`right top`
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPopupOptions[T] extends dxOverlayOptions[T] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  @JSName("animation")
  var animation_dxPopupOptions: js.UndefOr[dxPopupAnimation] = js.undefined
  /** Specifies the container in which to place the widget. */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** A Boolean value specifying whether or not to display the widget in full-screen mode. */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed each time the widget is resized by one pixel. */
  var onResize: js.UndefOr[js.Function1[/* e */ AnonModelAny[T], _]] = js.undefined
  /** A function that is executed when resizing ends. */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ AnonModelAny[T], _]] = js.undefined
  /** A function that is executed when resizing starts. */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ AnonModelAny[T], _]] = js.undefined
  /** A function that is executed when the widget's title is rendered. */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ AnonModelTitleElement[T], _]] = js.undefined
  /** Positions the widget. */
  @JSName("position")
  var position_dxPopupOptions: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.undefined
  /** Specifies whether or not an end user can resize the widget. */
  var resizeEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the widget displays the Close button. */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not to display the title in the popup window. */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  /** The title in the overlay window. */
  var title: js.UndefOr[String] = js.undefined
  /** Specifies a custom template for the widget title. Does not apply if the title is defined. */
  var titleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Configures toolbar items. */
  var toolbarItems: js.UndefOr[js.Array[dxPopupToolbarItem]] = js.undefined
}

object dxPopupOptions {
  @scala.inline
  def apply[T](
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: dxPopupAnimation = null,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    container: String | Element | JQuery = null,
    contentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery]) = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
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
    onResize: /* e */ AnonModelAny[T] => _ = null,
    onResizeEnd: /* e */ AnonModelAny[T] => _ = null,
    onResizeStart: /* e */ AnonModelAny[T] => _ = null,
    onShowing: /* e */ AnonElementDxElement[T] => _ = null,
    onShown: /* e */ AnonElementDxElement[T] => _ = null,
    onTitleRendered: /* e */ AnonModelTitleElement[T] => _ = null,
    position: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function = null,
    resizeEnabled: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    shadingColor: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    titleTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery]) = null,
    toolbarItems: js.Array[dxPopupToolbarItem] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPopupOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
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
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1(onResizeEnd))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction1(onResizeStart))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction1(onShowing))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (onTitleRendered != null) __obj.updateDynamic("onTitleRendered")(js.Any.fromFunction1(onTitleRendered))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeEnabled)) __obj.updateDynamic("resizeEnabled")(resizeEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (toolbarItems != null) __obj.updateDynamic("toolbarItems")(toolbarItems.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPopupOptions[T]]
  }
}


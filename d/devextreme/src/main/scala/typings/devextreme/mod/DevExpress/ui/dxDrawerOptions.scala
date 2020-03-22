package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.expand
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.overlap
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.shrink
import typings.devextreme.devextremeStrings.slide
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDrawerOptions extends WidgetOptions[dxDrawer] {
  /** Specifies the duration of the drawer's opening and closing animation (in milliseconds). Applies only if animationEnabled is true. */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /** Specifies whether to use an opening and closing animation. */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to close the drawer if a user clicks or taps the view area. */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.undefined
  /** Specifies the drawer's width or height (depending on the drawer's position) in the opened state. */
  var maxSize: js.UndefOr[Double] = js.undefined
  /** Specifies the drawer's width or height (depending on the drawer's position) in the closed state. */
  var minSize: js.UndefOr[Double] = js.undefined
  /** Specifies whether the drawer is opened. */
  var opened: js.UndefOr[Boolean] = js.undefined
  /** Specifies how the drawer interacts with the view in the opened state. */
  var openedStateMode: js.UndefOr[overlap | shrink | push] = js.undefined
  /** Specifies the drawer's position in relation to the view. */
  var position: js.UndefOr[left | right | top | bottom | before | after] = js.undefined
  /** Specifies the drawer's reveal mode. */
  var revealMode: js.UndefOr[slide | expand] = js.undefined
  /** Specifies whether to shade the view when the drawer is opened. */
  var shading: js.UndefOr[Boolean] = js.undefined
  /** Specifies a CSS selector for the element in which the drawer should be rendered. Applies only when the openedStateMode is "overlap". */
  var target: js.UndefOr[String | Element | JQuery] = js.undefined
  /** Specifies the drawer's content. */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _])
  ] = js.undefined
}

object dxDrawerOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    onContentReady: /* e */ AnonComponentElement[dxDrawer] => _ = null,
    onDisposing: /* e */ AnonModel[dxDrawer] => _ = null,
    onInitialized: /* e */ AnonElement[dxDrawer] => _ = null,
    onOptionChanged: /* e */ AnonName[dxDrawer] => _ = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    openedStateMode: overlap | shrink | push = null,
    position: left | right | top | bottom | before | after = null,
    revealMode: slide | expand = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    target: String | Element | JQuery = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (openedStateMode != null) __obj.updateDynamic("openedStateMode")(openedStateMode.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (revealMode != null) __obj.updateDynamic("revealMode")(revealMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDrawerOptions]
  }
}


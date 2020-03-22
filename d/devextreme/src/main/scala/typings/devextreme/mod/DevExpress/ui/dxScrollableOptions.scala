package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonReachedRight
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.onScroll
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxScrollableOptions[T] extends DOMComponentOptions[T] {
  /** A Boolean value specifying whether to enable or disable the bounce-back effect. */
  var bounceEnabled: js.UndefOr[Boolean] = js.undefined
  /** A string value specifying the available scrolling directions. */
  var direction: js.UndefOr[both | horizontal | vertical] = js.undefined
  /** A Boolean value specifying whether or not the widget can respond to user interaction. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed on each scroll gesture. */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedRight[T], _]] = js.undefined
  /** A function that is executed each time the widget is updated. */
  var onUpdated: js.UndefOr[js.Function1[/* e */ AnonReachedRight[T], _]] = js.undefined
  /** A Boolean value specifying whether or not an end-user can scroll the widget content swiping it up or down. Applies only if useNative is false */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not an end-user can scroll the widget content using the scrollbar. */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  /** Specifies when the widget shows the scrollbar. */
  var showScrollbar: js.UndefOr[onScroll | onHover | always | never] = js.undefined
  /** Indicates whether to use native or simulated scrolling. */
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object dxScrollableOptions {
  @scala.inline
  def apply[T](
    bindingOptions: js.Any = null,
    bounceEnabled: js.UndefOr[Boolean] = js.undefined,
    direction: both | horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onScroll: /* e */ AnonReachedRight[T] => _ = null,
    onUpdated: /* e */ AnonReachedRight[T] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    showScrollbar: onScroll | onHover | always | never = null,
    useNative: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxScrollableOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceEnabled)) __obj.updateDynamic("bounceEnabled")(bounceEnabled.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction1(onUpdated))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxScrollableOptions[T]]
  }
}


package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDxScrollView
import typings.devextreme.anon.Element
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.ReachedRight
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.onScroll
import typings.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxScrollViewOptions extends dxScrollableOptions[dxScrollView] {
  /** @name dxScrollView.Options.onPullDown */
  var onPullDown: js.UndefOr[js.Function1[/* e */ ComponentDxScrollView, _]] = js.undefined
  /** @name dxScrollView.Options.onReachBottom */
  var onReachBottom: js.UndefOr[js.Function1[/* e */ ComponentDxScrollView, _]] = js.undefined
  /** @name dxScrollView.Options.pulledDownText */
  var pulledDownText: js.UndefOr[String] = js.undefined
  /** @name dxScrollView.Options.pullingDownText */
  var pullingDownText: js.UndefOr[String] = js.undefined
  /** @name dxScrollView.Options.reachBottomText */
  var reachBottomText: js.UndefOr[String] = js.undefined
  /** @name dxScrollView.Options.refreshingText */
  var refreshingText: js.UndefOr[String] = js.undefined
}

object dxScrollViewOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    bounceEnabled: js.UndefOr[Boolean] = js.undefined,
    direction: both | horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ Model[dxScrollView] => _ = null,
    onInitialized: /* e */ Element[dxScrollView] => _ = null,
    onOptionChanged: /* e */ Name[dxScrollView] => _ = null,
    onPullDown: /* e */ ComponentDxScrollView => _ = null,
    onReachBottom: /* e */ ComponentDxScrollView => _ = null,
    onScroll: /* e */ ReachedRight[dxScrollView] => _ = null,
    onUpdated: /* e */ ReachedRight[dxScrollView] => _ = null,
    pulledDownText: String = null,
    pullingDownText: String = null,
    reachBottomText: String = null,
    refreshingText: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    showScrollbar: onScroll | onHover | always | never = null,
    useNative: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceEnabled)) __obj.updateDynamic("bounceEnabled")(bounceEnabled.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPullDown != null) __obj.updateDynamic("onPullDown")(js.Any.fromFunction1(onPullDown))
    if (onReachBottom != null) __obj.updateDynamic("onReachBottom")(js.Any.fromFunction1(onReachBottom))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction1(onUpdated))
    if (pulledDownText != null) __obj.updateDynamic("pulledDownText")(pulledDownText.asInstanceOf[js.Any])
    if (pullingDownText != null) __obj.updateDynamic("pullingDownText")(pullingDownText.asInstanceOf[js.Any])
    if (reachBottomText != null) __obj.updateDynamic("reachBottomText")(reachBottomText.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.get.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxScrollViewOptions]
  }
}


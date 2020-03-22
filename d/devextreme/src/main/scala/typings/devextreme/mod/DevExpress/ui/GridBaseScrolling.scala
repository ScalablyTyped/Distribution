package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.onScroll
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseScrolling extends js.Object {
  /** Specifies the rendering mode for columns. Applies when columns are left outside the viewport. Requires the columnWidth, columnAutoWidth, or width (for all columns) option specified. */
  var columnRenderingMode: js.UndefOr[standard | virtual] = js.undefined
  /** Specifies whether the widget should load adjacent pages. Applies only if scrolling.mode is "virtual" or "infinite". */
  var preloadEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rendering mode for loaded rows. */
  var rowRenderingMode: js.UndefOr[standard | virtual] = js.undefined
  /** Specifies whether a user can scroll the content with a swipe gesture. Applies only if useNative is false. */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can scroll the content with the scrollbar. Applies only if useNative is false. */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  /** Specifies when to show scrollbars. Applies only if useNative is false. */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.undefined
  /** Specifies whether the widget should use native or simulated scrolling. */
  var useNative: js.UndefOr[Boolean | auto] = js.undefined
}

object GridBaseScrolling {
  @scala.inline
  def apply(
    columnRenderingMode: standard | virtual = null,
    preloadEnabled: js.UndefOr[Boolean] = js.undefined,
    rowRenderingMode: standard | virtual = null,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    showScrollbar: always | never | onHover | onScroll = null,
    useNative: Boolean | auto = null
  ): GridBaseScrolling = {
    val __obj = js.Dynamic.literal()
    if (columnRenderingMode != null) __obj.updateDynamic("columnRenderingMode")(columnRenderingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadEnabled)) __obj.updateDynamic("preloadEnabled")(preloadEnabled.asInstanceOf[js.Any])
    if (rowRenderingMode != null) __obj.updateDynamic("rowRenderingMode")(rowRenderingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (useNative != null) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseScrolling]
  }
}


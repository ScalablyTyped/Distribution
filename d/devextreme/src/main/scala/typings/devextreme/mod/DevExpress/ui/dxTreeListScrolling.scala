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

trait dxTreeListScrolling extends GridBaseScrolling {
  /** @name dxTreeList.Options.scrolling.mode */
  var mode: js.UndefOr[standard | virtual] = js.undefined
}

object dxTreeListScrolling {
  @scala.inline
  def apply(
    columnRenderingMode: standard | virtual = null,
    mode: standard | virtual = null,
    preloadEnabled: js.UndefOr[Boolean] = js.undefined,
    rowRenderingMode: standard | virtual = null,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    showScrollbar: always | never | onHover | onScroll = null,
    useNative: Boolean | auto = null
  ): dxTreeListScrolling = {
    val __obj = js.Dynamic.literal()
    if (columnRenderingMode != null) __obj.updateDynamic("columnRenderingMode")(columnRenderingMode.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadEnabled)) __obj.updateDynamic("preloadEnabled")(preloadEnabled.asInstanceOf[js.Any])
    if (rowRenderingMode != null) __obj.updateDynamic("rowRenderingMode")(rowRenderingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (useNative != null) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListScrolling]
  }
}


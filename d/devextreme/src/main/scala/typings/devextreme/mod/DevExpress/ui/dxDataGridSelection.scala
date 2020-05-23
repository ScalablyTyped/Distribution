package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.allPages
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onLongTap
import typings.devextreme.devextremeStrings.page
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridSelection extends GridBaseSelection {
  /** @name dxDataGrid.Options.selection.deferred */
  var deferred: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGrid.Options.selection.selectAllMode */
  var selectAllMode: js.UndefOr[allPages | page] = js.undefined
  /** @name dxDataGrid.Options.selection.showCheckBoxesMode */
  var showCheckBoxesMode: js.UndefOr[always | none | onClick | onLongTap] = js.undefined
}

object dxDataGridSelection {
  @scala.inline
  def apply(
    allowSelectAll: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    mode: multiple | none | single_ = null,
    selectAllMode: allPages | page = null,
    showCheckBoxesMode: always | none | onClick | onLongTap = null
  ): dxDataGridSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSelectAll)) __obj.updateDynamic("allowSelectAll")(allowSelectAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (selectAllMode != null) __obj.updateDynamic("selectAllMode")(selectAllMode.asInstanceOf[js.Any])
    if (showCheckBoxesMode != null) __obj.updateDynamic("showCheckBoxesMode")(showCheckBoxesMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridSelection]
  }
}


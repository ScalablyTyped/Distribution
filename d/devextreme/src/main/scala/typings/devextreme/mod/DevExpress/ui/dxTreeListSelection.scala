package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListSelection extends GridBaseSelection {
  /** Specifies whether selection is recursive. */
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object dxTreeListSelection {
  @scala.inline
  def apply(
    allowSelectAll: js.UndefOr[Boolean] = js.undefined,
    mode: multiple | none | single_ = null,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSelectAll)) __obj.updateDynamic("allowSelectAll")(allowSelectAll.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListSelection]
  }
}


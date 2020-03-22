package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseSelection extends js.Object {
  /** Specifies whether a user can select all rows at once. */
  var allowSelectAll: js.UndefOr[Boolean] = js.undefined
  /** Specifies the selection mode. */
  var mode: js.UndefOr[multiple | none | single_] = js.undefined
}

object GridBaseSelection {
  @scala.inline
  def apply(allowSelectAll: js.UndefOr[Boolean] = js.undefined, mode: multiple | none | single_ = null): GridBaseSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSelectAll)) __obj.updateDynamic("allowSelectAll")(allowSelectAll.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseSelection]
  }
}


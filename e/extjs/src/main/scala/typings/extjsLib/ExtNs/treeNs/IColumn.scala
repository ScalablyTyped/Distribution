package typings
package extjsLib.ExtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn
  extends extjsLib.ExtNs.gridNs.columnNs.IColumn

object IColumn {
  @scala.inline
  def apply(
    IColumn: extjsLib.ExtNs.gridNs.columnNs.IColumn = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hideable: js.UndefOr[scala.Boolean] = js.undefined,
    lockable: js.UndefOr[scala.Boolean] = js.undefined,
    tdCls: java.lang.String = null
  ): IColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hideable)) __obj.updateDynamic("hideable")(hideable)
    if (!js.isUndefined(lockable)) __obj.updateDynamic("lockable")(lockable)
    if (tdCls != null) __obj.updateDynamic("tdCls")(tdCls)
    __obj.asInstanceOf[IColumn]
  }
}


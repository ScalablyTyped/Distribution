package typings
package extjsLib.ExtNs.gridNs.columnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowNumberer extends IColumn

object IRowNumberer {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    align: java.lang.String = null,
    cls: java.lang.String = null,
    dataIndex: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hideable: js.UndefOr[scala.Boolean] = js.undefined,
    lockable: js.UndefOr[scala.Boolean] = js.undefined,
    menuDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    tdCls: java.lang.String = null,
    text: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): IRowNumberer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (align != null) __obj.updateDynamic("align")(align)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hideable)) __obj.updateDynamic("hideable")(hideable)
    if (!js.isUndefined(lockable)) __obj.updateDynamic("lockable")(lockable)
    if (!js.isUndefined(menuDisabled)) __obj.updateDynamic("menuDisabled")(menuDisabled)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (tdCls != null) __obj.updateDynamic("tdCls")(tdCls)
    if (text != null) __obj.updateDynamic("text")(text)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowNumberer]
  }
}


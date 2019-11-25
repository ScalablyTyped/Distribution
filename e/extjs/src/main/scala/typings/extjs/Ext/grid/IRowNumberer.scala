package typings.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowNumberer
  extends typings.extjs.Ext.grid.column.IColumn

object IRowNumberer {
  @scala.inline
  def apply(IColumn: typings.extjs.Ext.grid.column.IColumn = null): IRowNumberer = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    __obj.asInstanceOf[IRowNumberer]
  }
}


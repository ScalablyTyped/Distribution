package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowNumberer extends IColumn

object IRowNumberer {
  @scala.inline
  def apply(IColumn: IColumn = null): IRowNumberer = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    __obj.asInstanceOf[IRowNumberer]
  }
}


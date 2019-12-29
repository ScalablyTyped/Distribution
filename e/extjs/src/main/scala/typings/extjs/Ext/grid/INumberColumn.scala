package typings.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}

object INumberColumn {
  @scala.inline
  def apply(IColumn: typings.extjs.Ext.grid.column.IColumn = null, format: String = null): INumberColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumberColumn]
  }
}


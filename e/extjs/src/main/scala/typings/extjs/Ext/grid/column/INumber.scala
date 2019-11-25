package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber
  extends typings.extjs.Ext.grid.column.IColumn {
  /** [Config Option] (String) */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object INumber {
  @scala.inline
  def apply(IColumn: typings.extjs.Ext.grid.column.IColumn = null, format: java.lang.String = null): INumber = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
}


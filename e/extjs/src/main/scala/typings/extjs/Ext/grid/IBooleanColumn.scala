package typings.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  /** [Config Option] (String) */
  var falseText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var trueText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[java.lang.String] = js.undefined
}

object IBooleanColumn {
  @scala.inline
  def apply(
    IColumn: typings.extjs.Ext.grid.column.IColumn = null,
    falseText: java.lang.String = null,
    trueText: java.lang.String = null,
    undefinedText: java.lang.String = null
  ): IBooleanColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (undefinedText != null) __obj.updateDynamic("undefinedText")(undefinedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBooleanColumn]
  }
}


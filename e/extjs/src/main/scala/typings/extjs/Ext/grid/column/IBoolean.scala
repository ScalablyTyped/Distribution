package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoolean
  extends typings.extjs.Ext.grid.column.IColumn {
  /** [Config Option] (String) */
  var falseText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var trueText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[java.lang.String] = js.undefined
}

object IBoolean {
  @scala.inline
  def apply(
    IColumn: typings.extjs.Ext.grid.column.IColumn = null,
    falseText: java.lang.String = null,
    trueText: java.lang.String = null,
    undefinedText: java.lang.String = null
  ): IBoolean = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (falseText != null) __obj.updateDynamic("falseText")(falseText)
    if (trueText != null) __obj.updateDynamic("trueText")(trueText)
    if (undefinedText != null) __obj.updateDynamic("undefinedText")(undefinedText)
    __obj.asInstanceOf[IBoolean]
  }
}


package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoolean extends IColumn {
  /** [Config Option] (String) */
  var falseText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var trueText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[String] = js.undefined
}

object IBoolean {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    falseText: String = null,
    trueText: String = null,
    undefinedText: String = null
  ): IBoolean = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (undefinedText != null) __obj.updateDynamic("undefinedText")(undefinedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoolean]
  }
}


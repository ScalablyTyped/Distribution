package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.custom
import typings.exceljs.exceljsStrings.date
import typings.exceljs.exceljsStrings.decimal
import typings.exceljs.exceljsStrings.list
import typings.exceljs.exceljsStrings.textLength
import typings.exceljs.exceljsStrings.whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValidation extends js.Object {
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var errorStyle: js.UndefOr[String] = js.undefined
  var errorTitle: js.UndefOr[String] = js.undefined
  var formulae: js.Array[_]
  var operator: js.UndefOr[DataValidationOperator] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var promptTitle: js.UndefOr[String] = js.undefined
  var showErrorMessage: js.UndefOr[Boolean] = js.undefined
  var showInputMessage: js.UndefOr[Boolean] = js.undefined
  var `type`: list | whole | decimal | date | textLength | custom
}

object DataValidation {
  @scala.inline
  def apply(
    formulae: js.Array[_],
    `type`: list | whole | decimal | date | textLength | custom,
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    errorStyle: String = null,
    errorTitle: String = null,
    operator: DataValidationOperator = null,
    prompt: String = null,
    promptTitle: String = null,
    showErrorMessage: js.UndefOr[Boolean] = js.undefined,
    showInputMessage: js.UndefOr[Boolean] = js.undefined
  ): DataValidation = {
    val __obj = js.Dynamic.literal(formulae = formulae)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorTitle != null) __obj.updateDynamic("errorTitle")(errorTitle)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (promptTitle != null) __obj.updateDynamic("promptTitle")(promptTitle)
    if (!js.isUndefined(showErrorMessage)) __obj.updateDynamic("showErrorMessage")(showErrorMessage)
    if (!js.isUndefined(showInputMessage)) __obj.updateDynamic("showInputMessage")(showInputMessage)
    __obj.asInstanceOf[DataValidation]
  }
}


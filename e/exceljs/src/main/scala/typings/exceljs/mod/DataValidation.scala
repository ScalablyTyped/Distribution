package typings.exceljs.mod

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
    val __obj = js.Dynamic.literal(formulae = formulae.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorTitle != null) __obj.updateDynamic("errorTitle")(errorTitle.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (promptTitle != null) __obj.updateDynamic("promptTitle")(promptTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrorMessage)) __obj.updateDynamic("showErrorMessage")(showErrorMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInputMessage)) __obj.updateDynamic("showInputMessage")(showInputMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidation]
  }
}


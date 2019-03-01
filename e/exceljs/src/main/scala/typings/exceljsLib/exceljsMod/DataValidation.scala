package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValidation extends js.Object {
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var errorStyle: js.UndefOr[java.lang.String] = js.undefined
  var errorTitle: js.UndefOr[java.lang.String] = js.undefined
  var formulae: js.Array[_]
  var operator: js.UndefOr[DataValidationOperator] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var promptTitle: js.UndefOr[java.lang.String] = js.undefined
  var showErrorMessage: js.UndefOr[scala.Boolean] = js.undefined
  var showInputMessage: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: exceljsLib.exceljsLibStrings.list | exceljsLib.exceljsLibStrings.whole | exceljsLib.exceljsLibStrings.decimal | exceljsLib.exceljsLibStrings.date | exceljsLib.exceljsLibStrings.textLength | exceljsLib.exceljsLibStrings.custom
}

object DataValidation {
  @scala.inline
  def apply(
    formulae: js.Array[_],
    `type`: exceljsLib.exceljsLibStrings.list | exceljsLib.exceljsLibStrings.whole | exceljsLib.exceljsLibStrings.decimal | exceljsLib.exceljsLibStrings.date | exceljsLib.exceljsLibStrings.textLength | exceljsLib.exceljsLibStrings.custom,
    allowBlank: js.UndefOr[scala.Boolean] = js.undefined,
    error: java.lang.String = null,
    errorStyle: java.lang.String = null,
    errorTitle: java.lang.String = null,
    operator: DataValidationOperator = null,
    prompt: java.lang.String = null,
    promptTitle: java.lang.String = null,
    showErrorMessage: js.UndefOr[scala.Boolean] = js.undefined,
    showInputMessage: js.UndefOr[scala.Boolean] = js.undefined
  ): DataValidation = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("formulae")(formulae)
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


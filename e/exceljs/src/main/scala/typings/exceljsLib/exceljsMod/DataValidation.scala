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


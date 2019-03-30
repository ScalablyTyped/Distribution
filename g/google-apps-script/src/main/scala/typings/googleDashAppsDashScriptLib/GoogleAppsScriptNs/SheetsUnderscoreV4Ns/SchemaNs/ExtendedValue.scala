package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedValue extends js.Object {
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  var errorValue: js.UndefOr[ErrorValue] = js.undefined
  var formulaValue: js.UndefOr[java.lang.String] = js.undefined
  var numberValue: js.UndefOr[stdLib.Number] = js.undefined
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object ExtendedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    errorValue: ErrorValue = null,
    formulaValue: java.lang.String = null,
    numberValue: stdLib.Number = null,
    stringValue: java.lang.String = null
  ): ExtendedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (errorValue != null) __obj.updateDynamic("errorValue")(errorValue)
    if (formulaValue != null) __obj.updateDynamic("formulaValue")(formulaValue)
    if (numberValue != null) __obj.updateDynamic("numberValue")(numberValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[ExtendedValue]
  }
}


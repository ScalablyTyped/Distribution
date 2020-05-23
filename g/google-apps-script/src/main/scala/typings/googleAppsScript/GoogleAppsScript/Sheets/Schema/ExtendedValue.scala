package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedValue extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.undefined
  var errorValue: js.UndefOr[ErrorValue] = js.undefined
  var formulaValue: js.UndefOr[String] = js.undefined
  var numberValue: js.UndefOr[Double] = js.undefined
  var stringValue: js.UndefOr[String] = js.undefined
}

object ExtendedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    errorValue: ErrorValue = null,
    formulaValue: String = null,
    numberValue: js.UndefOr[Double] = js.undefined,
    stringValue: String = null
  ): ExtendedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.get.asInstanceOf[js.Any])
    if (errorValue != null) __obj.updateDynamic("errorValue")(errorValue.asInstanceOf[js.Any])
    if (formulaValue != null) __obj.updateDynamic("formulaValue")(formulaValue.asInstanceOf[js.Any])
    if (!js.isUndefined(numberValue)) __obj.updateDynamic("numberValue")(numberValue.get.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedValue]
  }
}


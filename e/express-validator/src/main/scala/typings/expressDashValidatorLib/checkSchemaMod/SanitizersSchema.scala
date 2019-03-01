package typings
package expressDashValidatorLib.checkSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizersSchema extends js.Object {
  var blacklist: js.UndefOr[SanitizerSchemaOptions[_]] = js.undefined
  var escape: js.UndefOr[expressDashValidatorLib.expressDashValidatorLibNumbers.`true`] = js.undefined
  var ltrim: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var normalizeEmail: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var rtrim: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var stripLow: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var toBoolean: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var toDate: js.UndefOr[expressDashValidatorLib.expressDashValidatorLibNumbers.`true`] = js.undefined
  var toFloat: js.UndefOr[expressDashValidatorLib.expressDashValidatorLibNumbers.`true`] = js.undefined
  var toInt: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var trim: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
  var unescape: js.UndefOr[expressDashValidatorLib.expressDashValidatorLibNumbers.`true`] = js.undefined
  var whitelist: js.UndefOr[
    expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_]
  ] = js.undefined
}

object SanitizersSchema {
  @scala.inline
  def apply(
    blacklist: SanitizerSchemaOptions[_] = null,
    escape: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    ltrim: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    normalizeEmail: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    rtrim: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    stripLow: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    toBoolean: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    toDate: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    toFloat: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    toInt: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    trim: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    unescape: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    whitelist: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null
  ): SanitizersSchema = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (ltrim != null) __obj.updateDynamic("ltrim")(ltrim.asInstanceOf[js.Any])
    if (normalizeEmail != null) __obj.updateDynamic("normalizeEmail")(normalizeEmail.asInstanceOf[js.Any])
    if (rtrim != null) __obj.updateDynamic("rtrim")(rtrim.asInstanceOf[js.Any])
    if (stripLow != null) __obj.updateDynamic("stripLow")(stripLow.asInstanceOf[js.Any])
    if (toBoolean != null) __obj.updateDynamic("toBoolean")(toBoolean.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate)
    if (toFloat != null) __obj.updateDynamic("toFloat")(toFloat)
    if (toInt != null) __obj.updateDynamic("toInt")(toInt.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (unescape != null) __obj.updateDynamic("unescape")(unescape)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizersSchema]
  }
}


package typings.expressValidator.schemaMod

import typings.expressValidator.expressValidatorStrings.blacklist
import typings.expressValidator.expressValidatorStrings.customSanitizer
import typings.expressValidator.expressValidatorStrings.escape
import typings.expressValidator.expressValidatorStrings.ltrim
import typings.expressValidator.expressValidatorStrings.normalizeEmail
import typings.expressValidator.expressValidatorStrings.rtrim
import typings.expressValidator.expressValidatorStrings.stripLow
import typings.expressValidator.expressValidatorStrings.toArray
import typings.expressValidator.expressValidatorStrings.toBoolean
import typings.expressValidator.expressValidatorStrings.toDate
import typings.expressValidator.expressValidatorStrings.toFloat
import typings.expressValidator.expressValidatorStrings.toInt
import typings.expressValidator.expressValidatorStrings.trim
import typings.expressValidator.expressValidatorStrings.unescape
import typings.expressValidator.expressValidatorStrings.whitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>} */
trait SanitizersSchema extends js.Object {
  var blacklist: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.blacklist]
  ] = js.undefined
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.customSanitizer]
  ] = js.undefined
  var escape: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.escape]] = js.undefined
  var ltrim: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.ltrim]] = js.undefined
  var normalizeEmail: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.normalizeEmail]
  ] = js.undefined
  var rtrim: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.rtrim]] = js.undefined
  var stripLow: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.stripLow]
  ] = js.undefined
  var toArray: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toArray]] = js.undefined
  var toBoolean: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toBoolean]
  ] = js.undefined
  var toDate: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toDate]] = js.undefined
  var toFloat: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toFloat]] = js.undefined
  var toInt: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toInt]] = js.undefined
  var trim: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.trim]] = js.undefined
  var unescape: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.unescape]
  ] = js.undefined
  var whitelist: js.UndefOr[
    SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.whitelist]
  ] = js.undefined
}

object SanitizersSchema {
  @scala.inline
  def apply(
    blacklist: SanitizerSchemaOptions[blacklist] = null,
    customSanitizer: SanitizerSchemaOptions[customSanitizer] = null,
    escape: SanitizerSchemaOptions[escape] = null,
    ltrim: SanitizerSchemaOptions[ltrim] = null,
    normalizeEmail: SanitizerSchemaOptions[normalizeEmail] = null,
    rtrim: SanitizerSchemaOptions[rtrim] = null,
    stripLow: SanitizerSchemaOptions[stripLow] = null,
    toArray: SanitizerSchemaOptions[toArray] = null,
    toBoolean: SanitizerSchemaOptions[toBoolean] = null,
    toDate: SanitizerSchemaOptions[toDate] = null,
    toFloat: SanitizerSchemaOptions[toFloat] = null,
    toInt: SanitizerSchemaOptions[toInt] = null,
    trim: SanitizerSchemaOptions[trim] = null,
    unescape: SanitizerSchemaOptions[unescape] = null,
    whitelist: SanitizerSchemaOptions[whitelist] = null
  ): SanitizersSchema = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (customSanitizer != null) __obj.updateDynamic("customSanitizer")(customSanitizer.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (ltrim != null) __obj.updateDynamic("ltrim")(ltrim.asInstanceOf[js.Any])
    if (normalizeEmail != null) __obj.updateDynamic("normalizeEmail")(normalizeEmail.asInstanceOf[js.Any])
    if (rtrim != null) __obj.updateDynamic("rtrim")(rtrim.asInstanceOf[js.Any])
    if (stripLow != null) __obj.updateDynamic("stripLow")(stripLow.asInstanceOf[js.Any])
    if (toArray != null) __obj.updateDynamic("toArray")(toArray.asInstanceOf[js.Any])
    if (toBoolean != null) __obj.updateDynamic("toBoolean")(toBoolean.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (toFloat != null) __obj.updateDynamic("toFloat")(toFloat.asInstanceOf[js.Any])
    if (toInt != null) __obj.updateDynamic("toInt")(toInt.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (unescape != null) __obj.updateDynamic("unescape")(unescape.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizersSchema]
  }
}


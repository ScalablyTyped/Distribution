package typings
package expressDashValidatorLib.checkSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationParamSchema
  extends ValidatorsSchema
     with SanitizersSchema {
  var custom: js.UndefOr[ValidatorSchemaOptions[expressDashValidatorLib.checkCheckMod.CustomValidator]] = js.undefined
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[expressDashValidatorLib.filterSanitizeMod.CustomSanitizer]
  ] = js.undefined
  var errorMessage: js.UndefOr[js.Any] = js.undefined
  var exists: js.UndefOr[
    ValidatorSchemaOptions[expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.ExistsOptions]
  ] = js.undefined
  var in: expressDashValidatorLib.checkLocationMod.Location | js.Array[expressDashValidatorLib.checkLocationMod.Location]
  var optional: js.UndefOr[
    scala.Boolean | expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.OptionalOptions
  ] = js.undefined
}

object ValidationParamSchema {
  @scala.inline
  def apply(
    in: expressDashValidatorLib.checkLocationMod.Location | js.Array[expressDashValidatorLib.checkLocationMod.Location],
    blacklist: SanitizerSchemaOptions[_] = null,
    contains: ValidatorSchemaOptions[_] = null,
    custom: ValidatorSchemaOptions[expressDashValidatorLib.checkCheckMod.CustomValidator] = null,
    customSanitizer: SanitizerSchemaOptions[expressDashValidatorLib.filterSanitizeMod.CustomSanitizer] = null,
    equals: ValidatorSchemaOptions[_] = null,
    errorMessage: js.Any = null,
    escape: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    exists: ValidatorSchemaOptions[expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.ExistsOptions] = null,
    isAfter: ValidatorSchemaOptions[_] = null,
    isAlpha: ValidatorSchemaOptions[_] = null,
    isAlphanumeric: ValidatorSchemaOptions[_] = null,
    isArray: ValidatorSchemaOptions[_] = null,
    isAscii: ValidatorSchemaOptions[_] = null,
    isBase64: ValidatorSchemaOptions[_] = null,
    isBefore: ValidatorSchemaOptions[_] = null,
    isBoolean: ValidatorSchemaOptions[_] = null,
    isByteLength: ValidatorSchemaOptions[_] = null,
    isCreditCard: ValidatorSchemaOptions[_] = null,
    isCurrency: ValidatorSchemaOptions[_] = null,
    isDataURI: ValidatorSchemaOptions[_] = null,
    isDecimal: ValidatorSchemaOptions[_] = null,
    isDivisibleBy: ValidatorSchemaOptions[_] = null,
    isEmail: ValidatorSchemaOptions[_] = null,
    isEmpty: ValidatorSchemaOptions[_] = null,
    isFQDN: ValidatorSchemaOptions[_] = null,
    isFloat: ValidatorSchemaOptions[_] = null,
    isFullWidth: ValidatorSchemaOptions[_] = null,
    isHalfWidth: ValidatorSchemaOptions[_] = null,
    isHash: ValidatorSchemaOptions[_] = null,
    isHexColor: ValidatorSchemaOptions[_] = null,
    isHexadecimal: ValidatorSchemaOptions[_] = null,
    isIP: ValidatorSchemaOptions[_] = null,
    isIPRange: ValidatorSchemaOptions[_] = null,
    isISBN: ValidatorSchemaOptions[_] = null,
    isISIN: ValidatorSchemaOptions[_] = null,
    isISO31661Alpha2: ValidatorSchemaOptions[_] = null,
    isISO31661Alpha3: ValidatorSchemaOptions[_] = null,
    isISO8601: ValidatorSchemaOptions[_] = null,
    isISRC: ValidatorSchemaOptions[_] = null,
    isISSN: ValidatorSchemaOptions[_] = null,
    isIn: ValidatorSchemaOptions[_] = null,
    isInt: ValidatorSchemaOptions[_] = null,
    isJSON: ValidatorSchemaOptions[_] = null,
    isLatLong: ValidatorSchemaOptions[_] = null,
    isLength: ValidatorSchemaOptions[_] = null,
    isLowercase: ValidatorSchemaOptions[_] = null,
    isMACAddress: ValidatorSchemaOptions[_] = null,
    isMD5: ValidatorSchemaOptions[_] = null,
    isMimeType: ValidatorSchemaOptions[_] = null,
    isMobilePhone: ValidatorSchemaOptions[_] = null,
    isMongoId: ValidatorSchemaOptions[_] = null,
    isMultibyte: ValidatorSchemaOptions[_] = null,
    isNumeric: ValidatorSchemaOptions[_] = null,
    isPort: ValidatorSchemaOptions[_] = null,
    isPostalCode: ValidatorSchemaOptions[_] = null,
    isString: ValidatorSchemaOptions[_] = null,
    isSurrogatePair: ValidatorSchemaOptions[_] = null,
    isURL: ValidatorSchemaOptions[_] = null,
    isUUID: ValidatorSchemaOptions[_] = null,
    isUppercase: ValidatorSchemaOptions[_] = null,
    isVariableWidth: ValidatorSchemaOptions[_] = null,
    isWhitelisted: ValidatorSchemaOptions[_] = null,
    ltrim: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    matches: ValidatorSchemaOptions[_] = null,
    normalizeEmail: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    optional: scala.Boolean | expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.OptionalOptions = null,
    rtrim: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    stripLow: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    toBoolean: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    toDate: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    toFloat: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    toInt: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    trim: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null,
    unescape: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null,
    whitelist: expressDashValidatorLib.expressDashValidatorLibNumbers.`true` | SanitizerSchemaOptions[_] = null
  ): ValidationParamSchema = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (customSanitizer != null) __obj.updateDynamic("customSanitizer")(customSanitizer)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (exists != null) __obj.updateDynamic("exists")(exists)
    if (isAfter != null) __obj.updateDynamic("isAfter")(isAfter)
    if (isAlpha != null) __obj.updateDynamic("isAlpha")(isAlpha)
    if (isAlphanumeric != null) __obj.updateDynamic("isAlphanumeric")(isAlphanumeric)
    if (isArray != null) __obj.updateDynamic("isArray")(isArray)
    if (isAscii != null) __obj.updateDynamic("isAscii")(isAscii)
    if (isBase64 != null) __obj.updateDynamic("isBase64")(isBase64)
    if (isBefore != null) __obj.updateDynamic("isBefore")(isBefore)
    if (isBoolean != null) __obj.updateDynamic("isBoolean")(isBoolean)
    if (isByteLength != null) __obj.updateDynamic("isByteLength")(isByteLength)
    if (isCreditCard != null) __obj.updateDynamic("isCreditCard")(isCreditCard)
    if (isCurrency != null) __obj.updateDynamic("isCurrency")(isCurrency)
    if (isDataURI != null) __obj.updateDynamic("isDataURI")(isDataURI)
    if (isDecimal != null) __obj.updateDynamic("isDecimal")(isDecimal)
    if (isDivisibleBy != null) __obj.updateDynamic("isDivisibleBy")(isDivisibleBy)
    if (isEmail != null) __obj.updateDynamic("isEmail")(isEmail)
    if (isEmpty != null) __obj.updateDynamic("isEmpty")(isEmpty)
    if (isFQDN != null) __obj.updateDynamic("isFQDN")(isFQDN)
    if (isFloat != null) __obj.updateDynamic("isFloat")(isFloat)
    if (isFullWidth != null) __obj.updateDynamic("isFullWidth")(isFullWidth)
    if (isHalfWidth != null) __obj.updateDynamic("isHalfWidth")(isHalfWidth)
    if (isHash != null) __obj.updateDynamic("isHash")(isHash)
    if (isHexColor != null) __obj.updateDynamic("isHexColor")(isHexColor)
    if (isHexadecimal != null) __obj.updateDynamic("isHexadecimal")(isHexadecimal)
    if (isIP != null) __obj.updateDynamic("isIP")(isIP)
    if (isIPRange != null) __obj.updateDynamic("isIPRange")(isIPRange)
    if (isISBN != null) __obj.updateDynamic("isISBN")(isISBN)
    if (isISIN != null) __obj.updateDynamic("isISIN")(isISIN)
    if (isISO31661Alpha2 != null) __obj.updateDynamic("isISO31661Alpha2")(isISO31661Alpha2)
    if (isISO31661Alpha3 != null) __obj.updateDynamic("isISO31661Alpha3")(isISO31661Alpha3)
    if (isISO8601 != null) __obj.updateDynamic("isISO8601")(isISO8601)
    if (isISRC != null) __obj.updateDynamic("isISRC")(isISRC)
    if (isISSN != null) __obj.updateDynamic("isISSN")(isISSN)
    if (isIn != null) __obj.updateDynamic("isIn")(isIn)
    if (isInt != null) __obj.updateDynamic("isInt")(isInt)
    if (isJSON != null) __obj.updateDynamic("isJSON")(isJSON)
    if (isLatLong != null) __obj.updateDynamic("isLatLong")(isLatLong)
    if (isLength != null) __obj.updateDynamic("isLength")(isLength)
    if (isLowercase != null) __obj.updateDynamic("isLowercase")(isLowercase)
    if (isMACAddress != null) __obj.updateDynamic("isMACAddress")(isMACAddress)
    if (isMD5 != null) __obj.updateDynamic("isMD5")(isMD5)
    if (isMimeType != null) __obj.updateDynamic("isMimeType")(isMimeType)
    if (isMobilePhone != null) __obj.updateDynamic("isMobilePhone")(isMobilePhone)
    if (isMongoId != null) __obj.updateDynamic("isMongoId")(isMongoId)
    if (isMultibyte != null) __obj.updateDynamic("isMultibyte")(isMultibyte)
    if (isNumeric != null) __obj.updateDynamic("isNumeric")(isNumeric)
    if (isPort != null) __obj.updateDynamic("isPort")(isPort)
    if (isPostalCode != null) __obj.updateDynamic("isPostalCode")(isPostalCode)
    if (isString != null) __obj.updateDynamic("isString")(isString)
    if (isSurrogatePair != null) __obj.updateDynamic("isSurrogatePair")(isSurrogatePair)
    if (isURL != null) __obj.updateDynamic("isURL")(isURL)
    if (isUUID != null) __obj.updateDynamic("isUUID")(isUUID)
    if (isUppercase != null) __obj.updateDynamic("isUppercase")(isUppercase)
    if (isVariableWidth != null) __obj.updateDynamic("isVariableWidth")(isVariableWidth)
    if (isWhitelisted != null) __obj.updateDynamic("isWhitelisted")(isWhitelisted)
    if (ltrim != null) __obj.updateDynamic("ltrim")(ltrim.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (normalizeEmail != null) __obj.updateDynamic("normalizeEmail")(normalizeEmail.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (rtrim != null) __obj.updateDynamic("rtrim")(rtrim.asInstanceOf[js.Any])
    if (stripLow != null) __obj.updateDynamic("stripLow")(stripLow.asInstanceOf[js.Any])
    if (toBoolean != null) __obj.updateDynamic("toBoolean")(toBoolean.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate)
    if (toFloat != null) __obj.updateDynamic("toFloat")(toFloat)
    if (toInt != null) __obj.updateDynamic("toInt")(toInt.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (unescape != null) __obj.updateDynamic("unescape")(unescape)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationParamSchema]
  }
}


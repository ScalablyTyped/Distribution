package typings
package expressDashValidatorLib.expressDashValidatorMod.ExpressValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationSchemaParamOptions extends js.Object {
  var contains: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  // Additional Validators provided by validator.js
  @JSName("equals")
  var equals_FValidationSchemaParamOptions: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var errorMessage: js.UndefOr[js.Any] = js.undefined
  var in: js.UndefOr[expressDashValidatorLib.checkLocationMod.Location] = js.undefined
  var isAfter: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isAlpha: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isAlphanumeric: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isAscii: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isBase64: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isBefore: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isBoolean: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isByteLength: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isCreditCard: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isCurrency: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isDataURI: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isDecimal: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isDivisibleBy: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  // exported from validator.js
  var isEmail: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isEmpty: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isFQDN: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isFloat: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isFullWidth: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isHalfWidth: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isHash: js.UndefOr[ValidationSchemaParamOptions] = js.undefined
  var isHexColor: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isHexadecimal: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isIP: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isISBN: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isISIN: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isISO31661Alpha2: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isISO8601: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isISRC: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isISSN: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isIn: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isInt: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isJSON: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isLatLong: js.UndefOr[ValidationSchemaParamOptions] = js.undefined
  var isLength: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isLowercase: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isMACAddress: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isMD5: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isMimeType: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isMobilePhone: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isMongoId: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isMultibyte: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isNumeric: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isPort: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isPostalCode: js.UndefOr[ValidationSchemaParamOptions] = js.undefined
  var isSurrogatePair: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isURL: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isUUID: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isUppercase: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isVariableWidth: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var isWhitelisted: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var len: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var matches: js.UndefOr[ValidatorSchemaOptions] = js.undefined
  var notEmpty: js.UndefOr[scala.Boolean | expressDashValidatorLib.Anon_ErrorMessageString] = js.undefined
  // Additional ValidatorChain.prototype.* validators
  var optional: js.UndefOr[
    scala.Boolean | expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.OptionalOptions
  ] = js.undefined
}

object ValidationSchemaParamOptions {
  @scala.inline
  def apply(
    contains: ValidatorSchemaOptions = null,
    equals: ValidatorSchemaOptions = null,
    errorMessage: js.Any = null,
    in: expressDashValidatorLib.checkLocationMod.Location = null,
    isAfter: ValidatorSchemaOptions = null,
    isAlpha: ValidatorSchemaOptions = null,
    isAlphanumeric: ValidatorSchemaOptions = null,
    isAscii: ValidatorSchemaOptions = null,
    isBase64: ValidatorSchemaOptions = null,
    isBefore: ValidatorSchemaOptions = null,
    isBoolean: ValidatorSchemaOptions = null,
    isByteLength: ValidatorSchemaOptions = null,
    isCreditCard: ValidatorSchemaOptions = null,
    isCurrency: ValidatorSchemaOptions = null,
    isDataURI: ValidatorSchemaOptions = null,
    isDecimal: ValidatorSchemaOptions = null,
    isDivisibleBy: ValidatorSchemaOptions = null,
    isEmail: ValidatorSchemaOptions = null,
    isEmpty: ValidatorSchemaOptions = null,
    isFQDN: ValidatorSchemaOptions = null,
    isFloat: ValidatorSchemaOptions = null,
    isFullWidth: ValidatorSchemaOptions = null,
    isHalfWidth: ValidatorSchemaOptions = null,
    isHash: ValidationSchemaParamOptions = null,
    isHexColor: ValidatorSchemaOptions = null,
    isHexadecimal: ValidatorSchemaOptions = null,
    isIP: ValidatorSchemaOptions = null,
    isISBN: ValidatorSchemaOptions = null,
    isISIN: ValidatorSchemaOptions = null,
    isISO31661Alpha2: ValidatorSchemaOptions = null,
    isISO8601: ValidatorSchemaOptions = null,
    isISRC: ValidatorSchemaOptions = null,
    isISSN: ValidatorSchemaOptions = null,
    isIn: ValidatorSchemaOptions = null,
    isInt: ValidatorSchemaOptions = null,
    isJSON: ValidatorSchemaOptions = null,
    isLatLong: ValidationSchemaParamOptions = null,
    isLength: ValidatorSchemaOptions = null,
    isLowercase: ValidatorSchemaOptions = null,
    isMACAddress: ValidatorSchemaOptions = null,
    isMD5: ValidatorSchemaOptions = null,
    isMimeType: ValidatorSchemaOptions = null,
    isMobilePhone: ValidatorSchemaOptions = null,
    isMongoId: ValidatorSchemaOptions = null,
    isMultibyte: ValidatorSchemaOptions = null,
    isNumeric: ValidatorSchemaOptions = null,
    isPort: ValidatorSchemaOptions = null,
    isPostalCode: ValidationSchemaParamOptions = null,
    isSurrogatePair: ValidatorSchemaOptions = null,
    isURL: ValidatorSchemaOptions = null,
    isUUID: ValidatorSchemaOptions = null,
    isUppercase: ValidatorSchemaOptions = null,
    isVariableWidth: ValidatorSchemaOptions = null,
    isWhitelisted: ValidatorSchemaOptions = null,
    len: ValidatorSchemaOptions = null,
    matches: ValidatorSchemaOptions = null,
    notEmpty: scala.Boolean | expressDashValidatorLib.Anon_ErrorMessageString = null,
    optional: scala.Boolean | expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.OptionalOptions = null
  ): ValidationSchemaParamOptions = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (in != null) __obj.updateDynamic("in")(in)
    if (isAfter != null) __obj.updateDynamic("isAfter")(isAfter)
    if (isAlpha != null) __obj.updateDynamic("isAlpha")(isAlpha)
    if (isAlphanumeric != null) __obj.updateDynamic("isAlphanumeric")(isAlphanumeric)
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
    if (isISBN != null) __obj.updateDynamic("isISBN")(isISBN)
    if (isISIN != null) __obj.updateDynamic("isISIN")(isISIN)
    if (isISO31661Alpha2 != null) __obj.updateDynamic("isISO31661Alpha2")(isISO31661Alpha2)
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
    if (isSurrogatePair != null) __obj.updateDynamic("isSurrogatePair")(isSurrogatePair)
    if (isURL != null) __obj.updateDynamic("isURL")(isURL)
    if (isUUID != null) __obj.updateDynamic("isUUID")(isUUID)
    if (isUppercase != null) __obj.updateDynamic("isUppercase")(isUppercase)
    if (isVariableWidth != null) __obj.updateDynamic("isVariableWidth")(isVariableWidth)
    if (isWhitelisted != null) __obj.updateDynamic("isWhitelisted")(isWhitelisted)
    if (len != null) __obj.updateDynamic("len")(len)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (notEmpty != null) __obj.updateDynamic("notEmpty")(notEmpty.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSchemaParamOptions]
  }
}


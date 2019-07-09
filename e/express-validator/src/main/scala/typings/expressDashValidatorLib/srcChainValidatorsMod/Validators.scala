package typings
package expressDashValidatorLib.srcChainValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validators[Return] extends js.Object {
  def contains(elem: js.Any): Return = js.native
  def custom(validator: expressDashValidatorLib.srcBaseMod.CustomValidator): Return = js.native
  def equals(comparison: java.lang.String): Return = js.native
  def exists(): Return = js.native
  def exists(options: expressDashValidatorLib.Anon_CheckFalsy): Return = js.native
  def isAfter(): Return = js.native
  def isAfter(date: java.lang.String): Return = js.native
  def isAlpha(): Return = js.native
  def isAlpha(locale: expressDashValidatorLib.srcOptionsMod.AlphaLocale): Return = js.native
  def isAlphanumeric(): Return = js.native
  def isAlphanumeric(locale: expressDashValidatorLib.srcOptionsMod.AlphanumericLocale): Return = js.native
  def isArray(): Return = js.native
  def isAscii(): Return = js.native
  def isBase32(): Return = js.native
  def isBase64(): Return = js.native
  def isBefore(): Return = js.native
  def isBefore(date: java.lang.String): Return = js.native
  def isBoolean(): Return = js.native
  def isByteLength(options: expressDashValidatorLib.srcOptionsMod.MinMaxExtendedOptions): Return = js.native
  def isCreditCard(): Return = js.native
  def isCurrency(): Return = js.native
  def isCurrency(options: expressDashValidatorLib.srcOptionsMod.IsCurrencyOptions): Return = js.native
  def isDataURI(): Return = js.native
  def isDecimal(): Return = js.native
  def isDecimal(options: expressDashValidatorLib.srcOptionsMod.IsDecimalOptions): Return = js.native
  def isDivisibleBy(number: scala.Double): Return = js.native
  def isEmail(): Return = js.native
  def isEmail(options: expressDashValidatorLib.srcOptionsMod.IsEmailOptions): Return = js.native
  def isEmpty(): Return = js.native
  def isEmpty(options: expressDashValidatorLib.srcOptionsMod.IsEmptyOptions): Return = js.native
  def isFQDN(): Return = js.native
  def isFQDN(options: expressDashValidatorLib.srcOptionsMod.IsFQDNOptions): Return = js.native
  def isFloat(): Return = js.native
  def isFloat(options: expressDashValidatorLib.srcOptionsMod.IsFloatOptions): Return = js.native
  def isFullWidth(): Return = js.native
  def isHalfWidth(): Return = js.native
  def isHash(algorithm: expressDashValidatorLib.srcOptionsMod.HashAlgorithm): Return = js.native
  def isHexColor(): Return = js.native
  def isHexadecimal(): Return = js.native
  def isIP(): Return = js.native
  def isIP(version: expressDashValidatorLib.srcOptionsMod.IPVersion): Return = js.native
  def isIPRange(): Return = js.native
  def isISBN(): Return = js.native
  def isISBN(version: scala.Double): Return = js.native
  def isISIN(): Return = js.native
  def isISO31661Alpha2(): Return = js.native
  def isISO31661Alpha3(): Return = js.native
  def isISO8601(): Return = js.native
  def isISO8601(options: expressDashValidatorLib.srcOptionsMod.IsISO8601Options): Return = js.native
  def isISRC(): Return = js.native
  def isISSN(): Return = js.native
  def isISSN(options: expressDashValidatorLib.srcOptionsMod.IsISSNOptions): Return = js.native
  def isIdentityCard(): Return = js.native
  @JSName("isIdentityCard")
  def isIdentityCard_ES(locale: js.Array[expressDashValidatorLib.expressDashValidatorLibStrings.ES]): Return = js.native
  @JSName("isIdentityCard")
  def isIdentityCard_any(locale: expressDashValidatorLib.expressDashValidatorLibStrings.any): Return = js.native
  def isIn(values: js.Array[_]): Return = js.native
  def isInt(): Return = js.native
  def isInt(options: expressDashValidatorLib.srcOptionsMod.IsIntOptions): Return = js.native
  def isJSON(): Return = js.native
  def isJWT(): Return = js.native
  def isLatLong(): Return = js.native
  def isLength(options: expressDashValidatorLib.srcOptionsMod.MinMaxOptions): Return = js.native
  def isLowercase(): Return = js.native
  def isMACAddress(): Return = js.native
  def isMACAddress(options: expressDashValidatorLib.srcOptionsMod.IsMACAddressOptions): Return = js.native
  def isMD5(): Return = js.native
  def isMagnetURI(): Return = js.native
  def isMimeType(): Return = js.native
  def isMobilePhone(locale: expressDashValidatorLib.srcOptionsMod.MobilePhoneLocale): Return = js.native
  def isMobilePhone(
    locale: expressDashValidatorLib.srcOptionsMod.MobilePhoneLocale,
    options: expressDashValidatorLib.srcOptionsMod.IsMobilePhoneOptions
  ): Return = js.native
  def isMongoId(): Return = js.native
  def isMultibyte(): Return = js.native
  def isNumeric(): Return = js.native
  def isNumeric(options: expressDashValidatorLib.srcOptionsMod.IsNumericOptions): Return = js.native
  def isPort(): Return = js.native
  def isPostalCode(locale: expressDashValidatorLib.srcOptionsMod.PostalCodeLocale): Return = js.native
  def isRFC3339(): Return = js.native
  def isString(): Return = js.native
  def isSurrogatePair(): Return = js.native
  def isURL(): Return = js.native
  def isURL(options: expressDashValidatorLib.srcOptionsMod.IsURLOptions): Return = js.native
  def isUUID(): Return = js.native
  def isUUID(version: expressDashValidatorLib.srcOptionsMod.UUIDVersion): Return = js.native
  def isUppercase(): Return = js.native
  def isVariableWidth(): Return = js.native
  def isWhitelisted(chars: java.lang.String): Return = js.native
  def isWhitelisted(chars: js.Array[java.lang.String]): Return = js.native
  def matches(pattern: java.lang.String): Return = js.native
  def matches(pattern: java.lang.String, modifiers: java.lang.String): Return = js.native
  def matches(pattern: stdLib.RegExp): Return = js.native
  def matches(pattern: stdLib.RegExp, modifiers: java.lang.String): Return = js.native
  def not(): Return = js.native
  def withMessage(message: expressDashValidatorLib.srcBaseMod.DynamicMessageCreator): Return = js.native
  def withMessage(message: js.Any): Return = js.native
}


package typings
package expressDashValidatorLib.checkCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  def contains(str: java.lang.String): this.type = js.native
  def equals(equals: js.Any): this.type = js.native
  def exists(): this.type = js.native
  def exists(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.ExistsOptions): this.type = js.native
  def isAfter(): this.type = js.native
  def isAfter(date: java.lang.String): this.type = js.native
  def isAlpha(): this.type = js.native
  def isAlpha(locale: AlphaLocale): this.type = js.native
  def isAlphanumeric(): this.type = js.native
  def isAlphanumeric(locale: AlphanumericLocale): this.type = js.native
  def isArray(): this.type = js.native
  def isAscii(): this.type = js.native
  def isBase64(): this.type = js.native
  def isBefore(): this.type = js.native
  def isBefore(date: java.lang.String): this.type = js.native
  def isBoolean(): this.type = js.native
  def isByteLength(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.MinMaxOptions): this.type = js.native
  def isCreditCard(): this.type = js.native
  def isCurrency(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsCurrencyOptions): this.type = js.native
  def isDataURI(): this.type = js.native
  def isDecimal(): this.type = js.native
  def isDecimal(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsDecimalOptions): this.type = js.native
  def isDivisibleBy(num: scala.Double): this.type = js.native
  def isEmail(): this.type = js.native
  def isEmail(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsEmailOptions): this.type = js.native
  def isEmpty(): this.type = js.native
  def isFQDN(): this.type = js.native
  def isFQDN(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsFQDNOptions): this.type = js.native
  def isFloat(): this.type = js.native
  def isFloat(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsFloatOptions): this.type = js.native
  def isFullWidth(): this.type = js.native
  def isHalfWidth(): this.type = js.native
  def isHash(algorithm: HashAlgorithm): this.type = js.native
  def isHexColor(): this.type = js.native
  def isHexadecimal(): this.type = js.native
  def isIP(): this.type = js.native
  def isIP(version: IPVersion): this.type = js.native
  def isIPRange(): this.type = js.native
  def isISBN(): this.type = js.native
  def isISBN(version: scala.Double): this.type = js.native
  def isISIN(): this.type = js.native
  def isISO31661Alpha2(): this.type = js.native
  def isISO31661Alpha3(): this.type = js.native
  def isISO8601(): this.type = js.native
  def isISRC(): this.type = js.native
  def isISSN(): this.type = js.native
  def isISSN(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsISSNOptions): this.type = js.native
  def isIn(options: java.lang.String): this.type = js.native
  def isIn(options: js.Array[java.lang.String]): this.type = js.native
  def isInt(): this.type = js.native
  def isInt(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsIntOptions): this.type = js.native
  def isJSON(): this.type = js.native
  def isLatLong(): this.type = js.native
  def isLength(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.MinMaxOptions): this.type = js.native
  def isLowercase(): this.type = js.native
  def isMACAddress(): this.type = js.native
  def isMD5(): this.type = js.native
  def isMimeType(): this.type = js.native
  def isMobilePhone(locale: MobilePhoneLocal): this.type = js.native
  def isMobilePhone(
    locale: MobilePhoneLocal,
    options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsMobilePhoneOptions
  ): this.type = js.native
  def isMobilePhone(locale: js.Array[MobilePhoneLocal]): this.type = js.native
  def isMobilePhone(
    locale: js.Array[MobilePhoneLocal],
    options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsMobilePhoneOptions
  ): this.type = js.native
  def isMongoId(): this.type = js.native
  def isMultibyte(): this.type = js.native
  def isNumeric(): this.type = js.native
  def isPort(): this.type = js.native
  def isPostalCode(locale: PostalCodeLocale): this.type = js.native
  def isString(): this.type = js.native
  def isSurrogatePair(): this.type = js.native
  def isURL(): this.type = js.native
  def isURL(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.IsURLOptions): this.type = js.native
  def isUUID(): this.type = js.native
  def isUUID(version: UUIDVersion): this.type = js.native
  def isUppercase(): this.type = js.native
  def isVariableWidth(): this.type = js.native
  def isWhitelisted(chars: java.lang.String): this.type = js.native
  def isWhitelisted(chars: js.Array[java.lang.String]): this.type = js.native
  def matches(pattern: java.lang.String): this.type = js.native
  def matches(pattern: java.lang.String, modifiers: java.lang.String): this.type = js.native
  def matches(pattern: stdLib.RegExp): this.type = js.native
  def matches(pattern: stdLib.RegExp, modifiers: java.lang.String): this.type = js.native
  // Additional validator methods
  def not(): this.type = js.native
  def optional(): this.type = js.native
  def optional(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.OptionalOptions): this.type = js.native
  def withMessage(message: CustomMessageBuilder): this.type = js.native
  def withMessage(message: js.Any): this.type = js.native
}


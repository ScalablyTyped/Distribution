package typings.expressDashValidator

import typings.expressDashValidator.expressDashValidatorStrings.ES
import typings.expressDashValidator.expressDashValidatorStrings.any
import typings.expressDashValidator.srcBaseMod.CustomValidator
import typings.expressDashValidator.srcBaseMod.DynamicMessageCreator
import typings.expressDashValidator.srcOptionsMod.AlphaLocale
import typings.expressDashValidator.srcOptionsMod.AlphanumericLocale
import typings.expressDashValidator.srcOptionsMod.HashAlgorithm
import typings.expressDashValidator.srcOptionsMod.IPVersion
import typings.expressDashValidator.srcOptionsMod.IsCurrencyOptions
import typings.expressDashValidator.srcOptionsMod.IsDecimalOptions
import typings.expressDashValidator.srcOptionsMod.IsEmailOptions
import typings.expressDashValidator.srcOptionsMod.IsEmptyOptions
import typings.expressDashValidator.srcOptionsMod.IsFQDNOptions
import typings.expressDashValidator.srcOptionsMod.IsFloatOptions
import typings.expressDashValidator.srcOptionsMod.IsISO8601Options
import typings.expressDashValidator.srcOptionsMod.IsISSNOptions
import typings.expressDashValidator.srcOptionsMod.IsIntOptions
import typings.expressDashValidator.srcOptionsMod.IsMACAddressOptions
import typings.expressDashValidator.srcOptionsMod.IsMobilePhoneOptions
import typings.expressDashValidator.srcOptionsMod.IsNumericOptions
import typings.expressDashValidator.srcOptionsMod.IsURLOptions
import typings.expressDashValidator.srcOptionsMod.MinMaxExtendedOptions
import typings.expressDashValidator.srcOptionsMod.MinMaxOptions
import typings.expressDashValidator.srcOptionsMod.MobilePhoneLocale
import typings.expressDashValidator.srcOptionsMod.PostalCodeLocale
import typings.expressDashValidator.srcOptionsMod.UUIDVersion
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validators", JSImport.Namespace)
@js.native
object srcChainValidatorsMod extends js.Object {
  @js.native
  trait Validators[Return] extends js.Object {
    def contains(elem: js.Any): Return = js.native
    def custom(validator: CustomValidator): Return = js.native
    def equals(comparison: String): Return = js.native
    def exists(): Return = js.native
    def exists(options: Anon_CheckFalsy): Return = js.native
    def isAfter(): Return = js.native
    def isAfter(date: String): Return = js.native
    def isAlpha(): Return = js.native
    def isAlpha(locale: AlphaLocale): Return = js.native
    def isAlphanumeric(): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale): Return = js.native
    def isArray(): Return = js.native
    def isArray(options: Anon_Max): Return = js.native
    def isAscii(): Return = js.native
    def isBase32(): Return = js.native
    def isBase64(): Return = js.native
    def isBefore(): Return = js.native
    def isBefore(date: String): Return = js.native
    def isBoolean(): Return = js.native
    def isByteLength(options: MinMaxExtendedOptions): Return = js.native
    def isCreditCard(): Return = js.native
    def isCurrency(): Return = js.native
    def isCurrency(options: IsCurrencyOptions): Return = js.native
    def isDataURI(): Return = js.native
    def isDecimal(): Return = js.native
    def isDecimal(options: IsDecimalOptions): Return = js.native
    def isDivisibleBy(number: Double): Return = js.native
    def isEmail(): Return = js.native
    def isEmail(options: IsEmailOptions): Return = js.native
    def isEmpty(): Return = js.native
    def isEmpty(options: IsEmptyOptions): Return = js.native
    def isFQDN(): Return = js.native
    def isFQDN(options: IsFQDNOptions): Return = js.native
    def isFloat(): Return = js.native
    def isFloat(options: IsFloatOptions): Return = js.native
    def isFullWidth(): Return = js.native
    def isHalfWidth(): Return = js.native
    def isHash(algorithm: HashAlgorithm): Return = js.native
    def isHexColor(): Return = js.native
    def isHexadecimal(): Return = js.native
    def isIP(): Return = js.native
    def isIP(version: IPVersion): Return = js.native
    def isIPRange(): Return = js.native
    def isISBN(): Return = js.native
    def isISBN(version: Double): Return = js.native
    def isISIN(): Return = js.native
    def isISO31661Alpha2(): Return = js.native
    def isISO31661Alpha3(): Return = js.native
    def isISO8601(): Return = js.native
    def isISO8601(options: IsISO8601Options): Return = js.native
    def isISRC(): Return = js.native
    def isISSN(): Return = js.native
    def isISSN(options: IsISSNOptions): Return = js.native
    def isIdentityCard(): Return = js.native
    @JSName("isIdentityCard")
    def isIdentityCard_ES(locale: js.Array[ES]): Return = js.native
    @JSName("isIdentityCard")
    def isIdentityCard_any(locale: any): Return = js.native
    def isIn(values: js.Array[_]): Return = js.native
    def isInt(): Return = js.native
    def isInt(options: IsIntOptions): Return = js.native
    def isJSON(): Return = js.native
    def isJWT(): Return = js.native
    def isLatLong(): Return = js.native
    def isLength(options: MinMaxOptions): Return = js.native
    def isLowercase(): Return = js.native
    def isMACAddress(): Return = js.native
    def isMACAddress(options: IsMACAddressOptions): Return = js.native
    def isMD5(): Return = js.native
    def isMagnetURI(): Return = js.native
    def isMimeType(): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Return = js.native
    def isMongoId(): Return = js.native
    def isMultibyte(): Return = js.native
    def isNumeric(): Return = js.native
    def isNumeric(options: IsNumericOptions): Return = js.native
    def isPort(): Return = js.native
    def isPostalCode(locale: PostalCodeLocale): Return = js.native
    def isRFC3339(): Return = js.native
    def isString(): Return = js.native
    def isSurrogatePair(): Return = js.native
    def isURL(): Return = js.native
    def isURL(options: IsURLOptions): Return = js.native
    def isUUID(): Return = js.native
    def isUUID(version: UUIDVersion): Return = js.native
    def isUppercase(): Return = js.native
    def isVariableWidth(): Return = js.native
    def isWhitelisted(chars: String): Return = js.native
    def isWhitelisted(chars: js.Array[String]): Return = js.native
    def matches(pattern: String): Return = js.native
    def matches(pattern: String, modifiers: String): Return = js.native
    def matches(pattern: RegExp): Return = js.native
    def matches(pattern: RegExp, modifiers: String): Return = js.native
    def not(): Return = js.native
    def withMessage(message: js.Any): Return = js.native
    def withMessage(message: DynamicMessageCreator): Return = js.native
  }
  
}


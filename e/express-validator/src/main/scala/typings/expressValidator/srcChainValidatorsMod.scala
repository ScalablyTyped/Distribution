package typings.expressValidator

import typings.expressValidator.anon.Max
import typings.expressValidator.anon.Strict
import typings.expressValidator.expressValidatorStrings.`null`
import typings.expressValidator.expressValidatorStrings.falsy
import typings.expressValidator.expressValidatorStrings.undefined
import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.FieldMessageFactory
import typings.expressValidator.srcOptionsMod.AlphaLocale
import typings.expressValidator.srcOptionsMod.AlphanumericLocale
import typings.expressValidator.srcOptionsMod.ContainsOptions
import typings.expressValidator.srcOptionsMod.HashAlgorithm
import typings.expressValidator.srcOptionsMod.IPVersion
import typings.expressValidator.srcOptionsMod.IdentityCardLocale
import typings.expressValidator.srcOptionsMod.IsAfterOptions
import typings.expressValidator.srcOptionsMod.IsAlphaOptions
import typings.expressValidator.srcOptionsMod.IsAlphanumericOptions
import typings.expressValidator.srcOptionsMod.IsBase32Options
import typings.expressValidator.srcOptionsMod.IsBase64Options
import typings.expressValidator.srcOptionsMod.IsBooleanOptions
import typings.expressValidator.srcOptionsMod.IsCreditCard
import typings.expressValidator.srcOptionsMod.IsCurrencyOptions
import typings.expressValidator.srcOptionsMod.IsDateOptions
import typings.expressValidator.srcOptionsMod.IsDecimalOptions
import typings.expressValidator.srcOptionsMod.IsEmailOptions
import typings.expressValidator.srcOptionsMod.IsEmptyOptions
import typings.expressValidator.srcOptionsMod.IsFQDNOptions
import typings.expressValidator.srcOptionsMod.IsFloatOptions
import typings.expressValidator.srcOptionsMod.IsIMEIOptions
import typings.expressValidator.srcOptionsMod.IsISBNOptions
import typings.expressValidator.srcOptionsMod.IsISO8601Options
import typings.expressValidator.srcOptionsMod.IsISSNOptions
import typings.expressValidator.srcOptionsMod.IsIntOptions
import typings.expressValidator.srcOptionsMod.IsJSONOptions
import typings.expressValidator.srcOptionsMod.IsLatLongOptions
import typings.expressValidator.srcOptionsMod.IsLicensePlateLocale
import typings.expressValidator.srcOptionsMod.IsMACAddressOptions
import typings.expressValidator.srcOptionsMod.IsMobilePhoneOptions
import typings.expressValidator.srcOptionsMod.IsNumericOptions
import typings.expressValidator.srcOptionsMod.IsStrongPasswordOptions
import typings.expressValidator.srcOptionsMod.IsTimeOptions
import typings.expressValidator.srcOptionsMod.IsURLOptions
import typings.expressValidator.srcOptionsMod.MinMaxExtendedOptions
import typings.expressValidator.srcOptionsMod.MinMaxOptions
import typings.expressValidator.srcOptionsMod.MobilePhoneLocale
import typings.expressValidator.srcOptionsMod.PassportCountryCode
import typings.expressValidator.srcOptionsMod.PostalCodeLocale
import typings.expressValidator.srcOptionsMod.TaxIDLocale
import typings.expressValidator.srcOptionsMod.UUIDVersion
import typings.expressValidator.srcOptionsMod.VATCountryCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainValidatorsMod {
  
  trait ExistsOptions extends StObject {
    
    /**
      * Whether a field whose value is falsy should be considered non-existent.
      * @default false
      * @deprecated  Use `values` instead
      */
    var checkFalsy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether a field whose value is `null` or `undefined` should be considered non-existent.
      * @default false
      * @deprecated  Use `values` instead
      */
    var checkNull: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines which kind of value makes a field _NOT_ exist.
      *
      * - `undefined`: only `undefined` values; equivalent to `value !== undefined`
      * - `null`: only `undefined` and `null` values; equivalent to `value != null`
      * - `falsy`: all falsy values; equivalent to `!!value`
      *
      * @default 'undefined'
      */
    var values: js.UndefOr[undefined | `null` | falsy] = js.undefined
  }
  object ExistsOptions {
    
    inline def apply(): ExistsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExistsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExistsOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
      
      inline def setCheckFalsyUndefined: Self = StObject.set(x, "checkFalsy", js.undefined)
      
      inline def setCheckNull(value: Boolean): Self = StObject.set(x, "checkNull", value.asInstanceOf[js.Any])
      
      inline def setCheckNullUndefined: Self = StObject.set(x, "checkNull", js.undefined)
      
      inline def setValues(value: undefined | `null` | falsy): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  @js.native
  trait Validators[Return] extends StObject {
    
    def contains(elem: Any): Return = js.native
    def contains(elem: Any, options: ContainsOptions): Return = js.native
    
    /**
      * Adds a custom validator to the validation chain.
      *
      * @param validator the custom validator
      * @returns the current validation chain
      */
    def custom(validator: CustomValidator): Return = js.native
    
    def equals(comparison: String): Return = js.native
    
    /**
      * Adds a validator to check that the fields exist in the request.
      * By default, this means that the value of the fields may not be `undefined`;
      * all other values are acceptable.
      *
      * @param options
      * @returns the current validation chain
      */
    def exists(): Return = js.native
    def exists(options: ExistsOptions): Return = js.native
    
    def isAfter(): Return = js.native
    def isAfter(dateOrOptions: String): Return = js.native
    def isAfter(dateOrOptions: IsAfterOptions): Return = js.native
    
    def isAlpha(): Return = js.native
    def isAlpha(locale: Unit, options: IsAlphaOptions): Return = js.native
    def isAlpha(locale: AlphaLocale): Return = js.native
    def isAlpha(locale: AlphaLocale, options: IsAlphaOptions): Return = js.native
    
    def isAlphanumeric(): Return = js.native
    def isAlphanumeric(locale: Unit, options: IsAlphanumericOptions): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale, options: IsAlphanumericOptions): Return = js.native
    
    /**
      * Adds a validator to check if a value is an array.
      *
      * @param options
      * @returns the current validation chain
      */
    def isArray(): Return = js.native
    def isArray(options: Max): Return = js.native
    
    def isAscii(): Return = js.native
    
    def isBIC(): Return = js.native
    
    def isBase32(): Return = js.native
    def isBase32(options: IsBase32Options): Return = js.native
    
    def isBase58(): Return = js.native
    
    def isBase64(): Return = js.native
    def isBase64(options: IsBase64Options): Return = js.native
    
    def isBefore(): Return = js.native
    def isBefore(date: String): Return = js.native
    
    def isBoolean(): Return = js.native
    def isBoolean(options: IsBooleanOptions): Return = js.native
    
    def isBtcAddress(): Return = js.native
    
    def isByteLength(options: MinMaxExtendedOptions): Return = js.native
    
    def isCreditCard(): Return = js.native
    def isCreditCard(options: IsCreditCard): Return = js.native
    
    def isCurrency(): Return = js.native
    def isCurrency(options: IsCurrencyOptions): Return = js.native
    
    def isDataURI(): Return = js.native
    
    def isDate(): Return = js.native
    def isDate(options: IsDateOptions): Return = js.native
    
    def isDecimal(): Return = js.native
    def isDecimal(options: IsDecimalOptions): Return = js.native
    
    def isDivisibleBy(number: Double): Return = js.native
    
    def isEAN(): Return = js.native
    
    def isEmail(): Return = js.native
    def isEmail(options: IsEmailOptions): Return = js.native
    
    def isEmpty(): Return = js.native
    def isEmpty(options: IsEmptyOptions): Return = js.native
    
    def isEthereumAddress(): Return = js.native
    
    def isFQDN(): Return = js.native
    def isFQDN(options: IsFQDNOptions): Return = js.native
    
    def isFloat(): Return = js.native
    def isFloat(options: IsFloatOptions): Return = js.native
    
    def isFullWidth(): Return = js.native
    
    def isHSL(): Return = js.native
    
    def isHalfWidth(): Return = js.native
    
    def isHash(algorithm: HashAlgorithm): Return = js.native
    
    def isHexColor(): Return = js.native
    
    def isHexadecimal(): Return = js.native
    
    def isIBAN(): Return = js.native
    
    def isIMEI(): Return = js.native
    def isIMEI(options: IsIMEIOptions): Return = js.native
    
    def isIP(): Return = js.native
    def isIP(version: IPVersion): Return = js.native
    
    def isIPRange(): Return = js.native
    def isIPRange(version: IPVersion): Return = js.native
    
    def isISBN(): Return = js.native
    def isISBN(versionOrOptions: Double): Return = js.native
    def isISBN(versionOrOptions: IsISBNOptions): Return = js.native
    
    def isISIN(): Return = js.native
    
    def isISO31661Alpha2(): Return = js.native
    
    def isISO31661Alpha3(): Return = js.native
    
    def isISO4217(): Return = js.native
    
    def isISO6391(): Return = js.native
    
    def isISO8601(): Return = js.native
    def isISO8601(options: IsISO8601Options): Return = js.native
    
    def isISRC(): Return = js.native
    
    def isISSN(): Return = js.native
    def isISSN(options: IsISSNOptions): Return = js.native
    
    def isIdentityCard(): Return = js.native
    def isIdentityCard(locale: IdentityCardLocale): Return = js.native
    
    def isIn(values: js.Array[Any]): Return = js.native
    
    def isInt(): Return = js.native
    def isInt(options: IsIntOptions): Return = js.native
    
    def isJSON(): Return = js.native
    def isJSON(options: IsJSONOptions): Return = js.native
    
    def isJWT(): Return = js.native
    
    def isLatLong(): Return = js.native
    def isLatLong(options: IsLatLongOptions): Return = js.native
    
    def isLength(options: MinMaxOptions): Return = js.native
    
    def isLicensePlate(locale: IsLicensePlateLocale): Return = js.native
    
    def isLocale(): Return = js.native
    
    def isLowercase(): Return = js.native
    
    def isLuhnNumber(): Return = js.native
    
    def isMACAddress(): Return = js.native
    def isMACAddress(options: IsMACAddressOptions): Return = js.native
    
    def isMD5(): Return = js.native
    
    def isMagnetURI(): Return = js.native
    
    def isMimeType(): Return = js.native
    
    def isMobilePhone(locale: js.Array[MobilePhoneLocale]): Return = js.native
    def isMobilePhone(locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Return = js.native
    
    def isMongoId(): Return = js.native
    
    def isMultibyte(): Return = js.native
    
    def isNumeric(): Return = js.native
    def isNumeric(options: IsNumericOptions): Return = js.native
    
    /**
      * Adds a validator to check if a value is an object.
      *
      * @param options
      * @returns the current validation chain
      */
    def isObject(): Return = js.native
    def isObject(options: Strict): Return = js.native
    
    def isOctal(): Return = js.native
    
    def isPassportNumber(): Return = js.native
    def isPassportNumber(countryCode: PassportCountryCode): Return = js.native
    
    def isPort(): Return = js.native
    
    def isPostalCode(locale: PostalCodeLocale): Return = js.native
    
    def isRFC3339(): Return = js.native
    
    def isRgbColor(): Return = js.native
    def isRgbColor(includePercentValues: Boolean): Return = js.native
    
    def isSemVer(): Return = js.native
    
    def isSlug(): Return = js.native
    
    /**
      * Adds a validator to check if a value is a string.
      *
      * @returns the current validation chain
      */
    def isString(): Return = js.native
    
    def isStrongPassword(): Return = js.native
    def isStrongPassword(options: IsStrongPasswordOptions): Return = js.native
    
    def isSurrogatePair(): Return = js.native
    
    def isTaxID(locale: TaxIDLocale): Return = js.native
    
    def isTime(options: IsTimeOptions): Return = js.native
    
    def isURL(): Return = js.native
    def isURL(options: IsURLOptions): Return = js.native
    
    def isUUID(): Return = js.native
    def isUUID(version: UUIDVersion): Return = js.native
    
    def isUppercase(): Return = js.native
    
    def isVAT(countryCode: VATCountryCode): Return = js.native
    
    def isVariableWidth(): Return = js.native
    
    def isWhitelisted(chars: String): Return = js.native
    def isWhitelisted(chars: js.Array[String]): Return = js.native
    
    def matches(pattern: String): Return = js.native
    def matches(pattern: String, modifiers: String): Return = js.native
    def matches(pattern: js.RegExp): Return = js.native
    def matches(pattern: js.RegExp, modifiers: String): Return = js.native
    
    /**
      * Negates the result of the next validator.
      *
      * @example check('weekday').not().isIn(['sunday', 'saturday'])
      * @returns the current validation chain
      */
    def not(): Return = js.native
    
    /**
      * Adds a validator to check if a value is not empty; that is, a string with length of 1 or more.
      *
      * @param options
      * @returns the current validation chain
      */
    def notEmpty(): Return = js.native
    def notEmpty(options: IsEmptyOptions): Return = js.native
    
    def withMessage(message: ErrorMessage): Return = js.native
    /**
      * Sets the error message for the previous validator.
      *
      * @param message the message, which can be any value, or a function for dynamically creating the
      *                error message based on the field value
      * @returns the current validation chain
      */
    def withMessage(message: FieldMessageFactory): Return = js.native
  }
}

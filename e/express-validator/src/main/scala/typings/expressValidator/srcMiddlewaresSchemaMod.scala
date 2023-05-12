package typings.expressValidator

import typings.expressValidator.anon.Options
import typings.expressValidator.anon.`0`
import typings.expressValidator.anon.`1`
import typings.expressValidator.expressValidatorBooleans.`true`
import typings.expressValidator.expressValidatorStrings.blacklist
import typings.expressValidator.expressValidatorStrings.contains
import typings.expressValidator.expressValidatorStrings.custom
import typings.expressValidator.expressValidatorStrings.customSanitizer
import typings.expressValidator.expressValidatorStrings.default
import typings.expressValidator.expressValidatorStrings.equals
import typings.expressValidator.expressValidatorStrings.escape
import typings.expressValidator.expressValidatorStrings.exists
import typings.expressValidator.expressValidatorStrings.in_
import typings.expressValidator.expressValidatorStrings.isAfter
import typings.expressValidator.expressValidatorStrings.isAlpha
import typings.expressValidator.expressValidatorStrings.isAlphanumeric
import typings.expressValidator.expressValidatorStrings.isArray
import typings.expressValidator.expressValidatorStrings.isAscii
import typings.expressValidator.expressValidatorStrings.isBIC
import typings.expressValidator.expressValidatorStrings.isBase32
import typings.expressValidator.expressValidatorStrings.isBase58
import typings.expressValidator.expressValidatorStrings.isBase64
import typings.expressValidator.expressValidatorStrings.isBefore
import typings.expressValidator.expressValidatorStrings.isBoolean
import typings.expressValidator.expressValidatorStrings.isBtcAddress
import typings.expressValidator.expressValidatorStrings.isByteLength
import typings.expressValidator.expressValidatorStrings.isCreditCard
import typings.expressValidator.expressValidatorStrings.isCurrency
import typings.expressValidator.expressValidatorStrings.isDataURI
import typings.expressValidator.expressValidatorStrings.isDate
import typings.expressValidator.expressValidatorStrings.isDecimal
import typings.expressValidator.expressValidatorStrings.isDivisibleBy
import typings.expressValidator.expressValidatorStrings.isEAN
import typings.expressValidator.expressValidatorStrings.isEmail
import typings.expressValidator.expressValidatorStrings.isEmpty
import typings.expressValidator.expressValidatorStrings.isEthereumAddress
import typings.expressValidator.expressValidatorStrings.isFQDN
import typings.expressValidator.expressValidatorStrings.isFloat
import typings.expressValidator.expressValidatorStrings.isFullWidth
import typings.expressValidator.expressValidatorStrings.isHSL
import typings.expressValidator.expressValidatorStrings.isHalfWidth
import typings.expressValidator.expressValidatorStrings.isHash
import typings.expressValidator.expressValidatorStrings.isHexColor
import typings.expressValidator.expressValidatorStrings.isHexadecimal
import typings.expressValidator.expressValidatorStrings.isIBAN
import typings.expressValidator.expressValidatorStrings.isIMEI
import typings.expressValidator.expressValidatorStrings.isIP
import typings.expressValidator.expressValidatorStrings.isIPRange
import typings.expressValidator.expressValidatorStrings.isISBN
import typings.expressValidator.expressValidatorStrings.isISIN
import typings.expressValidator.expressValidatorStrings.isISO31661Alpha2
import typings.expressValidator.expressValidatorStrings.isISO31661Alpha3
import typings.expressValidator.expressValidatorStrings.isISO4217
import typings.expressValidator.expressValidatorStrings.isISO6391
import typings.expressValidator.expressValidatorStrings.isISO8601
import typings.expressValidator.expressValidatorStrings.isISRC
import typings.expressValidator.expressValidatorStrings.isISSN
import typings.expressValidator.expressValidatorStrings.isIdentityCard
import typings.expressValidator.expressValidatorStrings.isIn
import typings.expressValidator.expressValidatorStrings.isInt
import typings.expressValidator.expressValidatorStrings.isJSON
import typings.expressValidator.expressValidatorStrings.isJWT
import typings.expressValidator.expressValidatorStrings.isLatLong
import typings.expressValidator.expressValidatorStrings.isLength
import typings.expressValidator.expressValidatorStrings.isLicensePlate
import typings.expressValidator.expressValidatorStrings.isLocale
import typings.expressValidator.expressValidatorStrings.isLowercase
import typings.expressValidator.expressValidatorStrings.isLuhnNumber
import typings.expressValidator.expressValidatorStrings.isMACAddress
import typings.expressValidator.expressValidatorStrings.isMD5
import typings.expressValidator.expressValidatorStrings.isMagnetURI
import typings.expressValidator.expressValidatorStrings.isMimeType
import typings.expressValidator.expressValidatorStrings.isMobilePhone
import typings.expressValidator.expressValidatorStrings.isMongoId
import typings.expressValidator.expressValidatorStrings.isMultibyte
import typings.expressValidator.expressValidatorStrings.isNumeric
import typings.expressValidator.expressValidatorStrings.isObject
import typings.expressValidator.expressValidatorStrings.isOctal
import typings.expressValidator.expressValidatorStrings.isPassportNumber
import typings.expressValidator.expressValidatorStrings.isPort
import typings.expressValidator.expressValidatorStrings.isPostalCode
import typings.expressValidator.expressValidatorStrings.isRFC3339
import typings.expressValidator.expressValidatorStrings.isRgbColor
import typings.expressValidator.expressValidatorStrings.isSemVer
import typings.expressValidator.expressValidatorStrings.isSlug
import typings.expressValidator.expressValidatorStrings.isString
import typings.expressValidator.expressValidatorStrings.isStrongPassword
import typings.expressValidator.expressValidatorStrings.isSurrogatePair
import typings.expressValidator.expressValidatorStrings.isTaxID
import typings.expressValidator.expressValidatorStrings.isTime
import typings.expressValidator.expressValidatorStrings.isURL
import typings.expressValidator.expressValidatorStrings.isUUID
import typings.expressValidator.expressValidatorStrings.isUppercase
import typings.expressValidator.expressValidatorStrings.isVAT
import typings.expressValidator.expressValidatorStrings.isVariableWidth
import typings.expressValidator.expressValidatorStrings.isWhitelisted
import typings.expressValidator.expressValidatorStrings.ltrim
import typings.expressValidator.expressValidatorStrings.matches
import typings.expressValidator.expressValidatorStrings.normalizeEmail
import typings.expressValidator.expressValidatorStrings.notEmpty
import typings.expressValidator.expressValidatorStrings.replace
import typings.expressValidator.expressValidatorStrings.rtrim
import typings.expressValidator.expressValidatorStrings.stripLow
import typings.expressValidator.expressValidatorStrings.toArray
import typings.expressValidator.expressValidatorStrings.toBoolean
import typings.expressValidator.expressValidatorStrings.toDate
import typings.expressValidator.expressValidatorStrings.toFloat
import typings.expressValidator.expressValidatorStrings.toInt
import typings.expressValidator.expressValidatorStrings.toLowerCase
import typings.expressValidator.expressValidatorStrings.toUpperCase
import typings.expressValidator.expressValidatorStrings.trim
import typings.expressValidator.expressValidatorStrings.unescape
import typings.expressValidator.expressValidatorStrings.whitelist
import typings.expressValidator.srcBaseMod.CustomSanitizer
import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.FieldMessageFactory
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcChainContextHandlerMod.BailOptions
import typings.expressValidator.srcChainContextRunnerMod.ResultWithContext
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import typings.expressValidator.srcChainValidationChainMod.ValidationChainLike
import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewaresSchemaMod {
  
  @JSImport("express-validator/src/middlewares/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkSchema[T /* <: String */](schema: Schema[T]): RunnableValidationChains[ValidationChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[RunnableValidationChains[ValidationChain]]
  inline def checkSchema[T /* <: String */](schema: Schema[T], defaultLocations: js.Array[Location]): RunnableValidationChains[ValidationChain] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any], defaultLocations.asInstanceOf[js.Any])).asInstanceOf[RunnableValidationChains[ValidationChain]]
  
  inline def createCheckSchema[C /* <: ValidationChainLike */](
    createChain: js.Function3[
      /* fields */ js.UndefOr[String | js.Array[String]], 
      /* locations */ js.UndefOr[js.Array[Location]], 
      /* errorMessage */ js.UndefOr[Any], 
      C
    ]
  ): js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCheckSchema")(createChain.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ]]
  inline def createCheckSchema[C /* <: ValidationChainLike */](
    createChain: js.Function3[
      /* fields */ js.UndefOr[String | js.Array[String]], 
      /* locations */ js.UndefOr[js.Array[Location]], 
      /* errorMessage */ js.UndefOr[Any], 
      C
    ],
    extraValidators: js.Array[/* keyof C */ String]
  ): js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckSchema")(createChain.asInstanceOf[js.Any], extraValidators.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ]]
  inline def createCheckSchema[C /* <: ValidationChainLike */](
    createChain: js.Function3[
      /* fields */ js.UndefOr[String | js.Array[String]], 
      /* locations */ js.UndefOr[js.Array[Location]], 
      /* errorMessage */ js.UndefOr[Any], 
      C
    ],
    extraValidators: js.Array[/* keyof C */ String],
    extraSanitizers: js.Array[/* keyof C */ String]
  ): js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckSchema")(createChain.asInstanceOf[js.Any], extraValidators.asInstanceOf[js.Any], extraSanitizers.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ]]
  inline def createCheckSchema[C /* <: ValidationChainLike */](
    createChain: js.Function3[
      /* fields */ js.UndefOr[String | js.Array[String]], 
      /* locations */ js.UndefOr[js.Array[Location]], 
      /* errorMessage */ js.UndefOr[Any], 
      C
    ],
    extraValidators: Unit,
    extraSanitizers: js.Array[/* keyof C */ String]
  ): js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckSchema")(createChain.asInstanceOf[js.Any], extraValidators.asInstanceOf[js.Any], extraSanitizers.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* schema */ Schema[DefaultSchemaKeys], 
    /* defaultLocations */ js.UndefOr[js.Array[Location]], 
    RunnableValidationChains[C]
  ]]
  
  trait BaseParamSchema extends StObject {
    
    /**
      * The general error message in case a validator doesn't specify one,
      * or a function for creating the error message dynamically.
      */
    var errorMessage: js.UndefOr[FieldMessageFactory | Any] = js.undefined
    
    /**
      * Which request location(s) the field to validate is.
      * If unset, the field will be checked in every request location.
      */
    var in: js.UndefOr[Location | js.Array[Location]] = js.undefined
    
    /**
      * Whether this field should be considered optional
      */
    var optional: js.UndefOr[Boolean | `1`] = js.undefined
  }
  object BaseParamSchema {
    
    inline def apply(): BaseParamSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseParamSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseParamSchema] (val x: Self) extends AnyVal {
      
      inline def setErrorMessage(value: FieldMessageFactory | Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageFunction2(value: (/* value */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setIn(value: Location | js.Array[Location]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setInVarargs(value: Location*): Self = StObject.set(x, "in", js.Array(value*))
      
      inline def setOptional(value: Boolean | `1`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
  
  trait BaseValidatorSchemaOptions extends StObject {
    
    /**
      * Whether the validation should bail after running this validator
      */
    var bail: js.UndefOr[Boolean | BailOptions] = js.undefined
    
    /**
      * The error message if there's a validation error,
      * or a function for creating an error message dynamically.
      */
    var errorMessage: js.UndefOr[FieldMessageFactory | ErrorMessage] = js.undefined
    
    /**
      * Specify a condition upon which this validator should run.
      * Can either be a validation chain, or a custom validator function.
      */
    var `if`: js.UndefOr[CustomValidator | ValidationChain] = js.undefined
    
    /**
      * Whether the validation should be reversed.
      */
    var negated: js.UndefOr[Boolean] = js.undefined
  }
  object BaseValidatorSchemaOptions {
    
    inline def apply(): BaseValidatorSchemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseValidatorSchemaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseValidatorSchemaOptions] (val x: Self) extends AnyVal {
      
      inline def setBail(value: Boolean | BailOptions): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setErrorMessage(value: FieldMessageFactory | ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageFunction2(value: (/* value */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorMessageVarargs(value: Any*): Self = StObject.set(x, "errorMessage", js.Array(value*))
      
      inline def setIf(value: CustomValidator | ValidationChain): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def setIfFunction2(value: (/* input */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "if", js.Any.fromFunction2(value))
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setNegatedUndefined: Self = StObject.set(x, "negated", js.undefined)
    }
  }
  
  trait CustomSanitizerSchemaOptions extends StObject {
    
    /**
      * The implementation of a custom sanitizer.
      */
    def customSanitizer(input: Any, meta: Meta): Any
    /**
      * The implementation of a custom sanitizer.
      */
    @JSName("customSanitizer")
    var customSanitizer_Original: CustomSanitizer
  }
  object CustomSanitizerSchemaOptions {
    
    inline def apply(customSanitizer: (/* input */ Any, /* meta */ Meta) => Any): CustomSanitizerSchemaOptions = {
      val __obj = js.Dynamic.literal(customSanitizer = js.Any.fromFunction2(customSanitizer))
      __obj.asInstanceOf[CustomSanitizerSchemaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomSanitizerSchemaOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomSanitizer(value: (/* input */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "customSanitizer", js.Any.fromFunction2(value))
    }
  }
  
  trait CustomValidatorSchemaOptions
    extends StObject
       with BaseValidatorSchemaOptions {
    
    /**
      * The implementation of a custom validator.
      */
    def custom(input: Any, meta: Meta): Any
    /**
      * The implementation of a custom validator.
      */
    @JSName("custom")
    var custom_Original: CustomValidator
  }
  object CustomValidatorSchemaOptions {
    
    inline def apply(custom: (/* input */ Any, /* meta */ Meta) => Any): CustomValidatorSchemaOptions = {
      val __obj = js.Dynamic.literal(custom = js.Any.fromFunction2(custom))
      __obj.asInstanceOf[CustomValidatorSchemaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomValidatorSchemaOptions] (val x: Self) extends AnyVal {
      
      inline def setCustom(value: (/* input */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "custom", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined keyof express-validator.express-validator/src/middlewares/schema.BaseParamSchema | keyof express-validator.express-validator/src/middlewares/schema.ValidatorsSchema | keyof express-validator.express-validator/src/middlewares/schema.SanitizersSchema */
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.expressValidatorStrings.isOctal
    - typings.expressValidator.expressValidatorStrings.isStrongPassword
    - typings.expressValidator.expressValidatorStrings.isVariableWidth
    - typings.expressValidator.expressValidatorStrings.isDivisibleBy
    - typings.expressValidator.expressValidatorStrings.isAfter
    - typings.expressValidator.expressValidatorStrings.isAlpha
    - typings.expressValidator.expressValidatorStrings.isBtcAddress
    - typings.expressValidator.expressValidatorStrings.isDataURI
    - typings.expressValidator.expressValidatorStrings.isDecimal
    - typings.expressValidator.expressValidatorStrings.isISO4217
    - typings.expressValidator.expressValidatorStrings.trim
    - typings.expressValidator.expressValidatorStrings.notEmpty
    - typings.expressValidator.expressValidatorStrings.isBase32
    - typings.expressValidator.expressValidatorStrings.isMACAddress
    - typings.expressValidator.expressValidatorStrings.isISO6391
    - typings.expressValidator.expressValidatorStrings.custom
    - typings.expressValidator.expressValidatorStrings.isHalfWidth
    - typings.expressValidator.expressValidatorStrings.isVAT
    - typings.expressValidator.expressValidatorStrings.isHash
    - typings.expressValidator.expressValidatorStrings.matches
    - typings.expressValidator.expressValidatorStrings.isMultibyte
    - typings.expressValidator.expressValidatorStrings.isSurrogatePair
    - typings.expressValidator.expressValidatorStrings.isLength
    - typings.expressValidator.expressValidatorStrings.toInt
    - typings.expressValidator.expressValidatorStrings.customSanitizer
    - typings.expressValidator.expressValidatorStrings.isLuhnNumber
    - typings.expressValidator.expressValidatorStrings.isMobilePhone
    - typings.expressValidator.expressValidatorStrings.blacklist
    - typings.expressValidator.expressValidatorStrings.isObject
    - typings.expressValidator.expressValidatorStrings.isArray
    - typings.expressValidator.expressValidatorStrings.contains
    - typings.expressValidator.expressValidatorStrings.isBase58
    - typings.expressValidator.expressValidatorStrings.isRgbColor
    - typings.expressValidator.expressValidatorStrings.isEmail
    - typings.expressValidator.expressValidatorStrings.isPassportNumber
    - typings.expressValidator.expressValidatorStrings.isIdentityCard
    - typings.expressValidator.expressValidatorStrings.isURL
    - typings.expressValidator.expressValidatorStrings.errorMessage
    - typings.expressValidator.expressValidatorStrings.in_
    - typings.expressValidator.expressValidatorStrings.toUpperCase
    - typings.expressValidator.expressValidatorStrings.isPostalCode
    - typings.expressValidator.expressValidatorStrings.isHSL
    - typings.expressValidator.expressValidatorStrings.isBIC
    - typings.expressValidator.expressValidatorStrings.isIPRange
    - typings.expressValidator.expressValidatorStrings.isISSN
    - typings.expressValidator.expressValidatorStrings.toLowerCase
    - typings.expressValidator.expressValidatorStrings.optional
    - typings.expressValidator.expressValidatorStrings.isBase64
    - typings.expressValidator.expressValidatorStrings.isISIN
    - typings.expressValidator.expressValidatorStrings.isJSON
    - typings.expressValidator.expressValidatorStrings.normalizeEmail
    - typings.expressValidator.expressValidatorStrings.rtrim
    - typings.expressValidator.expressValidatorStrings.isFQDN
    - typings.expressValidator.expressValidatorStrings.isCreditCard
    - typings.expressValidator.expressValidatorStrings.equals
    - typings.expressValidator.expressValidatorStrings.escape
    - typings.expressValidator.expressValidatorStrings.isCurrency
    - typings.expressValidator.expressValidatorStrings.replace
    - typings.expressValidator.expressValidatorStrings.unescape
    - typings.expressValidator.expressValidatorStrings.isIn
    - typings.expressValidator.expressValidatorStrings.isTime
    - typings.expressValidator.expressValidatorStrings.isInt
    - typings.expressValidator.expressValidatorStrings.isString
    - typings.expressValidator.expressValidatorStrings.isAscii
    - typings.expressValidator.expressValidatorStrings.isFloat
    - typings.expressValidator.expressValidatorStrings.isUUID
    - typings.expressValidator.expressValidatorStrings.isEAN
    - typings.expressValidator.expressValidatorStrings.isWhitelisted
    - typings.expressValidator.expressValidatorStrings.isByteLength
    - typings.expressValidator.expressValidatorStrings.isISO31661Alpha3
    - typings.expressValidator.expressValidatorStrings.isMimeType
    - typings.expressValidator.expressValidatorStrings.isISBN
    - typings.expressValidator.expressValidatorStrings.isLatLong
    - typings.expressValidator.expressValidatorStrings.isEthereumAddress
    - typings.expressValidator.expressValidatorStrings.isPort
    - typings.expressValidator.expressValidatorStrings.isIMEI
    - typings.expressValidator.expressValidatorStrings.isFullWidth
    - typings.expressValidator.expressValidatorStrings.isRFC3339
    - typings.expressValidator.expressValidatorStrings.isIBAN
    - typings.expressValidator.expressValidatorStrings.isLocale
    - typings.expressValidator.expressValidatorStrings.default
    - typings.expressValidator.expressValidatorStrings.isUppercase
    - typings.expressValidator.expressValidatorStrings.isMongoId
    - typings.expressValidator.expressValidatorStrings.isEmpty
    - typings.expressValidator.expressValidatorStrings.isSlug
    - typings.expressValidator.expressValidatorStrings.isTaxID
    - typings.expressValidator.expressValidatorStrings.isISRC
    - typings.expressValidator.expressValidatorStrings.isDate
    - typings.expressValidator.expressValidatorStrings.isISO31661Alpha2
    - typings.expressValidator.expressValidatorStrings.isIP
    - typings.expressValidator.expressValidatorStrings.isJWT
    - typings.expressValidator.expressValidatorStrings.isSemVer
    - typings.expressValidator.expressValidatorStrings.isHexadecimal
    - typings.expressValidator.expressValidatorStrings.isBoolean
    - typings.expressValidator.expressValidatorStrings.exists
    - typings.expressValidator.expressValidatorStrings.ltrim
    - typings.expressValidator.expressValidatorStrings.stripLow
    - typings.expressValidator.expressValidatorStrings.isMD5
    - typings.expressValidator.expressValidatorStrings.isLicensePlate
    - typings.expressValidator.expressValidatorStrings.toDate
    - typings.expressValidator.expressValidatorStrings.toFloat
    - typings.expressValidator.expressValidatorStrings.isLowercase
    - typings.expressValidator.expressValidatorStrings.isHexColor
    - typings.expressValidator.expressValidatorStrings.isAlphanumeric
    - typings.expressValidator.expressValidatorStrings.isISO8601
    - typings.expressValidator.expressValidatorStrings.toBoolean
    - typings.expressValidator.expressValidatorStrings.isNumeric
    - typings.expressValidator.expressValidatorStrings.whitelist
    - typings.expressValidator.expressValidatorStrings.isBefore
    - typings.expressValidator.expressValidatorStrings.toArray
    - typings.expressValidator.expressValidatorStrings.isMagnetURI
  */
  trait DefaultSchemaKeys extends StObject
  object DefaultSchemaKeys {
    
    inline def default: typings.expressValidator.expressValidatorStrings.default = "default".asInstanceOf[typings.expressValidator.expressValidatorStrings.default]
    
    inline def blacklist: typings.expressValidator.expressValidatorStrings.blacklist = "blacklist".asInstanceOf[typings.expressValidator.expressValidatorStrings.blacklist]
    
    inline def contains: typings.expressValidator.expressValidatorStrings.contains = "contains".asInstanceOf[typings.expressValidator.expressValidatorStrings.contains]
    
    inline def custom: typings.expressValidator.expressValidatorStrings.custom = "custom".asInstanceOf[typings.expressValidator.expressValidatorStrings.custom]
    
    inline def customSanitizer: typings.expressValidator.expressValidatorStrings.customSanitizer = "customSanitizer".asInstanceOf[typings.expressValidator.expressValidatorStrings.customSanitizer]
    
    inline def equals: typings.expressValidator.expressValidatorStrings.equals = "equals".asInstanceOf[typings.expressValidator.expressValidatorStrings.equals]
    
    inline def errorMessage: typings.expressValidator.expressValidatorStrings.errorMessage = "errorMessage".asInstanceOf[typings.expressValidator.expressValidatorStrings.errorMessage]
    
    inline def escape: typings.expressValidator.expressValidatorStrings.escape = "escape".asInstanceOf[typings.expressValidator.expressValidatorStrings.escape]
    
    inline def exists: typings.expressValidator.expressValidatorStrings.exists = "exists".asInstanceOf[typings.expressValidator.expressValidatorStrings.exists]
    
    inline def in: in_ = "in".asInstanceOf[in_]
    
    inline def isAfter: typings.expressValidator.expressValidatorStrings.isAfter = "isAfter".asInstanceOf[typings.expressValidator.expressValidatorStrings.isAfter]
    
    inline def isAlpha: typings.expressValidator.expressValidatorStrings.isAlpha = "isAlpha".asInstanceOf[typings.expressValidator.expressValidatorStrings.isAlpha]
    
    inline def isAlphanumeric: typings.expressValidator.expressValidatorStrings.isAlphanumeric = "isAlphanumeric".asInstanceOf[typings.expressValidator.expressValidatorStrings.isAlphanumeric]
    
    inline def isArray: typings.expressValidator.expressValidatorStrings.isArray = "isArray".asInstanceOf[typings.expressValidator.expressValidatorStrings.isArray]
    
    inline def isAscii: typings.expressValidator.expressValidatorStrings.isAscii = "isAscii".asInstanceOf[typings.expressValidator.expressValidatorStrings.isAscii]
    
    inline def isBIC: typings.expressValidator.expressValidatorStrings.isBIC = "isBIC".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBIC]
    
    inline def isBase32: typings.expressValidator.expressValidatorStrings.isBase32 = "isBase32".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBase32]
    
    inline def isBase58: typings.expressValidator.expressValidatorStrings.isBase58 = "isBase58".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBase58]
    
    inline def isBase64: typings.expressValidator.expressValidatorStrings.isBase64 = "isBase64".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBase64]
    
    inline def isBefore: typings.expressValidator.expressValidatorStrings.isBefore = "isBefore".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBefore]
    
    inline def isBoolean: typings.expressValidator.expressValidatorStrings.isBoolean = "isBoolean".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBoolean]
    
    inline def isBtcAddress: typings.expressValidator.expressValidatorStrings.isBtcAddress = "isBtcAddress".asInstanceOf[typings.expressValidator.expressValidatorStrings.isBtcAddress]
    
    inline def isByteLength: typings.expressValidator.expressValidatorStrings.isByteLength = "isByteLength".asInstanceOf[typings.expressValidator.expressValidatorStrings.isByteLength]
    
    inline def isCreditCard: typings.expressValidator.expressValidatorStrings.isCreditCard = "isCreditCard".asInstanceOf[typings.expressValidator.expressValidatorStrings.isCreditCard]
    
    inline def isCurrency: typings.expressValidator.expressValidatorStrings.isCurrency = "isCurrency".asInstanceOf[typings.expressValidator.expressValidatorStrings.isCurrency]
    
    inline def isDataURI: typings.expressValidator.expressValidatorStrings.isDataURI = "isDataURI".asInstanceOf[typings.expressValidator.expressValidatorStrings.isDataURI]
    
    inline def isDate: typings.expressValidator.expressValidatorStrings.isDate = "isDate".asInstanceOf[typings.expressValidator.expressValidatorStrings.isDate]
    
    inline def isDecimal: typings.expressValidator.expressValidatorStrings.isDecimal = "isDecimal".asInstanceOf[typings.expressValidator.expressValidatorStrings.isDecimal]
    
    inline def isDivisibleBy: typings.expressValidator.expressValidatorStrings.isDivisibleBy = "isDivisibleBy".asInstanceOf[typings.expressValidator.expressValidatorStrings.isDivisibleBy]
    
    inline def isEAN: typings.expressValidator.expressValidatorStrings.isEAN = "isEAN".asInstanceOf[typings.expressValidator.expressValidatorStrings.isEAN]
    
    inline def isEmail: typings.expressValidator.expressValidatorStrings.isEmail = "isEmail".asInstanceOf[typings.expressValidator.expressValidatorStrings.isEmail]
    
    inline def isEmpty: typings.expressValidator.expressValidatorStrings.isEmpty = "isEmpty".asInstanceOf[typings.expressValidator.expressValidatorStrings.isEmpty]
    
    inline def isEthereumAddress: typings.expressValidator.expressValidatorStrings.isEthereumAddress = "isEthereumAddress".asInstanceOf[typings.expressValidator.expressValidatorStrings.isEthereumAddress]
    
    inline def isFQDN: typings.expressValidator.expressValidatorStrings.isFQDN = "isFQDN".asInstanceOf[typings.expressValidator.expressValidatorStrings.isFQDN]
    
    inline def isFloat: typings.expressValidator.expressValidatorStrings.isFloat = "isFloat".asInstanceOf[typings.expressValidator.expressValidatorStrings.isFloat]
    
    inline def isFullWidth: typings.expressValidator.expressValidatorStrings.isFullWidth = "isFullWidth".asInstanceOf[typings.expressValidator.expressValidatorStrings.isFullWidth]
    
    inline def isHSL: typings.expressValidator.expressValidatorStrings.isHSL = "isHSL".asInstanceOf[typings.expressValidator.expressValidatorStrings.isHSL]
    
    inline def isHalfWidth: typings.expressValidator.expressValidatorStrings.isHalfWidth = "isHalfWidth".asInstanceOf[typings.expressValidator.expressValidatorStrings.isHalfWidth]
    
    inline def isHash: typings.expressValidator.expressValidatorStrings.isHash = "isHash".asInstanceOf[typings.expressValidator.expressValidatorStrings.isHash]
    
    inline def isHexColor: typings.expressValidator.expressValidatorStrings.isHexColor = "isHexColor".asInstanceOf[typings.expressValidator.expressValidatorStrings.isHexColor]
    
    inline def isHexadecimal: typings.expressValidator.expressValidatorStrings.isHexadecimal = "isHexadecimal".asInstanceOf[typings.expressValidator.expressValidatorStrings.isHexadecimal]
    
    inline def isIBAN: typings.expressValidator.expressValidatorStrings.isIBAN = "isIBAN".asInstanceOf[typings.expressValidator.expressValidatorStrings.isIBAN]
    
    inline def isIMEI: typings.expressValidator.expressValidatorStrings.isIMEI = "isIMEI".asInstanceOf[typings.expressValidator.expressValidatorStrings.isIMEI]
    
    inline def isIP: typings.expressValidator.expressValidatorStrings.isIP = "isIP".asInstanceOf[typings.expressValidator.expressValidatorStrings.isIP]
    
    inline def isIPRange: typings.expressValidator.expressValidatorStrings.isIPRange = "isIPRange".asInstanceOf[typings.expressValidator.expressValidatorStrings.isIPRange]
    
    inline def isISBN: typings.expressValidator.expressValidatorStrings.isISBN = "isISBN".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISBN]
    
    inline def isISIN: typings.expressValidator.expressValidatorStrings.isISIN = "isISIN".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISIN]
    
    inline def isISO31661Alpha2: typings.expressValidator.expressValidatorStrings.isISO31661Alpha2 = "isISO31661Alpha2".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISO31661Alpha2]
    
    inline def isISO31661Alpha3: typings.expressValidator.expressValidatorStrings.isISO31661Alpha3 = "isISO31661Alpha3".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISO31661Alpha3]
    
    inline def isISO4217: typings.expressValidator.expressValidatorStrings.isISO4217 = "isISO4217".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISO4217]
    
    inline def isISO6391: typings.expressValidator.expressValidatorStrings.isISO6391 = "isISO6391".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISO6391]
    
    inline def isISO8601: typings.expressValidator.expressValidatorStrings.isISO8601 = "isISO8601".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISO8601]
    
    inline def isISRC: typings.expressValidator.expressValidatorStrings.isISRC = "isISRC".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISRC]
    
    inline def isISSN: typings.expressValidator.expressValidatorStrings.isISSN = "isISSN".asInstanceOf[typings.expressValidator.expressValidatorStrings.isISSN]
    
    inline def isIdentityCard: typings.expressValidator.expressValidatorStrings.isIdentityCard = "isIdentityCard".asInstanceOf[typings.expressValidator.expressValidatorStrings.isIdentityCard]
    
    inline def isIn: typings.expressValidator.expressValidatorStrings.isIn = "isIn".asInstanceOf[typings.expressValidator.expressValidatorStrings.isIn]
    
    inline def isInt: typings.expressValidator.expressValidatorStrings.isInt = "isInt".asInstanceOf[typings.expressValidator.expressValidatorStrings.isInt]
    
    inline def isJSON: typings.expressValidator.expressValidatorStrings.isJSON = "isJSON".asInstanceOf[typings.expressValidator.expressValidatorStrings.isJSON]
    
    inline def isJWT: typings.expressValidator.expressValidatorStrings.isJWT = "isJWT".asInstanceOf[typings.expressValidator.expressValidatorStrings.isJWT]
    
    inline def isLatLong: typings.expressValidator.expressValidatorStrings.isLatLong = "isLatLong".asInstanceOf[typings.expressValidator.expressValidatorStrings.isLatLong]
    
    inline def isLength: typings.expressValidator.expressValidatorStrings.isLength = "isLength".asInstanceOf[typings.expressValidator.expressValidatorStrings.isLength]
    
    inline def isLicensePlate: typings.expressValidator.expressValidatorStrings.isLicensePlate = "isLicensePlate".asInstanceOf[typings.expressValidator.expressValidatorStrings.isLicensePlate]
    
    inline def isLocale: typings.expressValidator.expressValidatorStrings.isLocale = "isLocale".asInstanceOf[typings.expressValidator.expressValidatorStrings.isLocale]
    
    inline def isLowercase: typings.expressValidator.expressValidatorStrings.isLowercase = "isLowercase".asInstanceOf[typings.expressValidator.expressValidatorStrings.isLowercase]
    
    inline def isLuhnNumber: typings.expressValidator.expressValidatorStrings.isLuhnNumber = "isLuhnNumber".asInstanceOf[typings.expressValidator.expressValidatorStrings.isLuhnNumber]
    
    inline def isMACAddress: typings.expressValidator.expressValidatorStrings.isMACAddress = "isMACAddress".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMACAddress]
    
    inline def isMD5: typings.expressValidator.expressValidatorStrings.isMD5 = "isMD5".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMD5]
    
    inline def isMagnetURI: typings.expressValidator.expressValidatorStrings.isMagnetURI = "isMagnetURI".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMagnetURI]
    
    inline def isMimeType: typings.expressValidator.expressValidatorStrings.isMimeType = "isMimeType".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMimeType]
    
    inline def isMobilePhone: typings.expressValidator.expressValidatorStrings.isMobilePhone = "isMobilePhone".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMobilePhone]
    
    inline def isMongoId: typings.expressValidator.expressValidatorStrings.isMongoId = "isMongoId".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMongoId]
    
    inline def isMultibyte: typings.expressValidator.expressValidatorStrings.isMultibyte = "isMultibyte".asInstanceOf[typings.expressValidator.expressValidatorStrings.isMultibyte]
    
    inline def isNumeric: typings.expressValidator.expressValidatorStrings.isNumeric = "isNumeric".asInstanceOf[typings.expressValidator.expressValidatorStrings.isNumeric]
    
    inline def isObject: typings.expressValidator.expressValidatorStrings.isObject = "isObject".asInstanceOf[typings.expressValidator.expressValidatorStrings.isObject]
    
    inline def isOctal: typings.expressValidator.expressValidatorStrings.isOctal = "isOctal".asInstanceOf[typings.expressValidator.expressValidatorStrings.isOctal]
    
    inline def isPassportNumber: typings.expressValidator.expressValidatorStrings.isPassportNumber = "isPassportNumber".asInstanceOf[typings.expressValidator.expressValidatorStrings.isPassportNumber]
    
    inline def isPort: typings.expressValidator.expressValidatorStrings.isPort = "isPort".asInstanceOf[typings.expressValidator.expressValidatorStrings.isPort]
    
    inline def isPostalCode: typings.expressValidator.expressValidatorStrings.isPostalCode = "isPostalCode".asInstanceOf[typings.expressValidator.expressValidatorStrings.isPostalCode]
    
    inline def isRFC3339: typings.expressValidator.expressValidatorStrings.isRFC3339 = "isRFC3339".asInstanceOf[typings.expressValidator.expressValidatorStrings.isRFC3339]
    
    inline def isRgbColor: typings.expressValidator.expressValidatorStrings.isRgbColor = "isRgbColor".asInstanceOf[typings.expressValidator.expressValidatorStrings.isRgbColor]
    
    inline def isSemVer: typings.expressValidator.expressValidatorStrings.isSemVer = "isSemVer".asInstanceOf[typings.expressValidator.expressValidatorStrings.isSemVer]
    
    inline def isSlug: typings.expressValidator.expressValidatorStrings.isSlug = "isSlug".asInstanceOf[typings.expressValidator.expressValidatorStrings.isSlug]
    
    inline def isString: typings.expressValidator.expressValidatorStrings.isString = "isString".asInstanceOf[typings.expressValidator.expressValidatorStrings.isString]
    
    inline def isStrongPassword: typings.expressValidator.expressValidatorStrings.isStrongPassword = "isStrongPassword".asInstanceOf[typings.expressValidator.expressValidatorStrings.isStrongPassword]
    
    inline def isSurrogatePair: typings.expressValidator.expressValidatorStrings.isSurrogatePair = "isSurrogatePair".asInstanceOf[typings.expressValidator.expressValidatorStrings.isSurrogatePair]
    
    inline def isTaxID: typings.expressValidator.expressValidatorStrings.isTaxID = "isTaxID".asInstanceOf[typings.expressValidator.expressValidatorStrings.isTaxID]
    
    inline def isTime: typings.expressValidator.expressValidatorStrings.isTime = "isTime".asInstanceOf[typings.expressValidator.expressValidatorStrings.isTime]
    
    inline def isURL: typings.expressValidator.expressValidatorStrings.isURL = "isURL".asInstanceOf[typings.expressValidator.expressValidatorStrings.isURL]
    
    inline def isUUID: typings.expressValidator.expressValidatorStrings.isUUID = "isUUID".asInstanceOf[typings.expressValidator.expressValidatorStrings.isUUID]
    
    inline def isUppercase: typings.expressValidator.expressValidatorStrings.isUppercase = "isUppercase".asInstanceOf[typings.expressValidator.expressValidatorStrings.isUppercase]
    
    inline def isVAT: typings.expressValidator.expressValidatorStrings.isVAT = "isVAT".asInstanceOf[typings.expressValidator.expressValidatorStrings.isVAT]
    
    inline def isVariableWidth: typings.expressValidator.expressValidatorStrings.isVariableWidth = "isVariableWidth".asInstanceOf[typings.expressValidator.expressValidatorStrings.isVariableWidth]
    
    inline def isWhitelisted: typings.expressValidator.expressValidatorStrings.isWhitelisted = "isWhitelisted".asInstanceOf[typings.expressValidator.expressValidatorStrings.isWhitelisted]
    
    inline def ltrim: typings.expressValidator.expressValidatorStrings.ltrim = "ltrim".asInstanceOf[typings.expressValidator.expressValidatorStrings.ltrim]
    
    inline def matches: typings.expressValidator.expressValidatorStrings.matches = "matches".asInstanceOf[typings.expressValidator.expressValidatorStrings.matches]
    
    inline def normalizeEmail: typings.expressValidator.expressValidatorStrings.normalizeEmail = "normalizeEmail".asInstanceOf[typings.expressValidator.expressValidatorStrings.normalizeEmail]
    
    inline def notEmpty: typings.expressValidator.expressValidatorStrings.notEmpty = "notEmpty".asInstanceOf[typings.expressValidator.expressValidatorStrings.notEmpty]
    
    inline def optional: typings.expressValidator.expressValidatorStrings.optional = "optional".asInstanceOf[typings.expressValidator.expressValidatorStrings.optional]
    
    inline def replace: typings.expressValidator.expressValidatorStrings.replace = "replace".asInstanceOf[typings.expressValidator.expressValidatorStrings.replace]
    
    inline def rtrim: typings.expressValidator.expressValidatorStrings.rtrim = "rtrim".asInstanceOf[typings.expressValidator.expressValidatorStrings.rtrim]
    
    inline def stripLow: typings.expressValidator.expressValidatorStrings.stripLow = "stripLow".asInstanceOf[typings.expressValidator.expressValidatorStrings.stripLow]
    
    inline def toArray: typings.expressValidator.expressValidatorStrings.toArray = "toArray".asInstanceOf[typings.expressValidator.expressValidatorStrings.toArray]
    
    inline def toBoolean: typings.expressValidator.expressValidatorStrings.toBoolean = "toBoolean".asInstanceOf[typings.expressValidator.expressValidatorStrings.toBoolean]
    
    inline def toDate: typings.expressValidator.expressValidatorStrings.toDate = "toDate".asInstanceOf[typings.expressValidator.expressValidatorStrings.toDate]
    
    inline def toFloat: typings.expressValidator.expressValidatorStrings.toFloat = "toFloat".asInstanceOf[typings.expressValidator.expressValidatorStrings.toFloat]
    
    inline def toInt: typings.expressValidator.expressValidatorStrings.toInt = "toInt".asInstanceOf[typings.expressValidator.expressValidatorStrings.toInt]
    
    inline def toLowerCase: typings.expressValidator.expressValidatorStrings.toLowerCase = "toLowerCase".asInstanceOf[typings.expressValidator.expressValidatorStrings.toLowerCase]
    
    inline def toUpperCase: typings.expressValidator.expressValidatorStrings.toUpperCase = "toUpperCase".asInstanceOf[typings.expressValidator.expressValidatorStrings.toUpperCase]
    
    inline def trim: typings.expressValidator.expressValidatorStrings.trim = "trim".asInstanceOf[typings.expressValidator.expressValidatorStrings.trim]
    
    inline def unescape: typings.expressValidator.expressValidatorStrings.unescape = "unescape".asInstanceOf[typings.expressValidator.expressValidatorStrings.unescape]
    
    inline def whitelist: typings.expressValidator.expressValidatorStrings.whitelist = "whitelist".asInstanceOf[typings.expressValidator.expressValidatorStrings.whitelist]
  }
  
  type ExtensionSanitizerSchemaOptions = `true`
  
  type ExtensionValidatorSchemaOptions = Boolean | BaseValidatorSchemaOptions
  
  type ParamSchema[T /* <: String */] = BaseParamSchema & ValidatorsSchema & SanitizersSchema & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]:? K extends keyof express-validator.express-validator/src/middlewares/schema.BaseParamSchema? express-validator.express-validator/src/middlewares/schema.BaseParamSchema[K] : K extends 'isOctal' | 'isStrongPassword' | 'isVariableWidth' | 'isDivisibleBy' | 'isAfter' | 'isAlpha' | 'isBtcAddress' | 'isDataURI' | 'isDecimal' | 'isISO4217' | 'notEmpty' | 'isBase32' | 'isMACAddress' | 'isISO6391' | 'custom' | 'isHalfWidth' | 'isVAT' | 'isHash' | 'matches' | 'isMultibyte' | 'isSurrogatePair' | 'isLength' | 'isLuhnNumber' | 'isMobilePhone' | 'isObject' | 'isArray' | 'contains' | 'isBase58' | 'isRgbColor' | 'isEmail' | 'isPassportNumber' | 'isIdentityCard' | 'isURL' | 'isPostalCode' | 'isHSL' | 'isBIC' | 'isIPRange' | 'isISSN' | 'isBase64' | 'isISIN' | 'isJSON' | 'isFQDN' | 'isCreditCard' | 'equals' | 'isCurrency' | 'isIn' | 'isTime' | 'isInt' | 'isString' | 'isAscii' | 'isFloat' | 'isUUID' | 'isEAN' | 'isWhitelisted' | 'isByteLength' | 'isISO31661Alpha3' | 'isMimeType' | 'isISBN' | 'isLatLong' | 'isEthereumAddress' | 'isPort' | 'isIMEI' | 'isFullWidth' | 'isRFC3339' | 'isIBAN' | 'isLocale' | 'isUppercase' | 'isMongoId' | 'isEmpty' | 'isSlug' | 'isTaxID' | 'isISRC' | 'isDate' | 'isISO31661Alpha2' | 'isIP' | 'isJWT' | 'isSemVer' | 'isHexadecimal' | 'isBoolean' | 'exists' | 'isMD5' | 'isLicensePlate' | 'isLowercase' | 'isHexColor' | 'isAlphanumeric' | 'isISO8601' | 'isNumeric' | 'isBefore' | 'isMagnetURI'? express-validator.express-validator/src/middlewares/schema.ValidatorsSchema[K] : K extends 'trim' | 'toInt' | 'customSanitizer' | 'blacklist' | 'toUpperCase' | 'toLowerCase' | 'normalizeEmail' | 'rtrim' | 'escape' | 'replace' | 'unescape' | 'default' | 'ltrim' | 'stripLow' | 'toDate' | 'toFloat' | 'toBoolean' | 'whitelist' | 'toArray'? express-validator.express-validator/src/middlewares/schema.SanitizersSchema[K] : express-validator.express-validator/src/middlewares/schema.CustomValidatorSchemaOptions | express-validator.express-validator/src/middlewares/schema.CustomSanitizerSchemaOptions} */ js.Any)
  
  @js.native
  trait RunnableValidationChains[C /* <: ValidationChainLike */]
    extends StObject
       with Array[C] {
    
    def run(req: Request): js.Promise[js.Array[ResultWithContext]] = js.native
  }
  
  type SanitizerSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | default | replace | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | toLowerCase | toUpperCase | trim | whitelist */] = Boolean | `0`[K]
  
  /* Inlined {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>} */
  trait SanitizersSchema extends StObject {
    
    var default: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.default]] = js.undefined
    
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
    
    var replace: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.replace]] = js.undefined
    
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
    
    var toLowerCase: js.UndefOr[
        SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toLowerCase]
      ] = js.undefined
    
    var toUpperCase: js.UndefOr[
        SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.toUpperCase]
      ] = js.undefined
    
    var trim: js.UndefOr[SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.trim]] = js.undefined
    
    var unescape: js.UndefOr[
        SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.unescape]
      ] = js.undefined
    
    var whitelist: js.UndefOr[
        SanitizerSchemaOptions[typings.expressValidator.expressValidatorStrings.whitelist]
      ] = js.undefined
  }
  object SanitizersSchema {
    
    inline def apply(): SanitizersSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SanitizersSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SanitizersSchema] (val x: Self) extends AnyVal {
      
      inline def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      inline def setDefault(value: SanitizerSchemaOptions[default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      inline def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      inline def setReplace(value: SanitizerSchemaOptions[replace]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      inline def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      inline def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      inline def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      inline def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      inline def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      inline def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      inline def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      inline def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      inline def setToLowerCase(value: SanitizerSchemaOptions[toLowerCase]): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
      
      inline def setToLowerCaseUndefined: Self = StObject.set(x, "toLowerCase", js.undefined)
      
      inline def setToUpperCase(value: SanitizerSchemaOptions[toUpperCase]): Self = StObject.set(x, "toUpperCase", value.asInstanceOf[js.Any])
      
      inline def setToUpperCaseUndefined: Self = StObject.set(x, "toUpperCase", js.undefined)
      
      inline def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    }
  }
  
  type Schema[T /* <: String */] = Record[String, ParamSchema[T]]
  
  type ValidatorSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */] = Boolean | (BaseValidatorSchemaOptions & Options[K])
  
  /* Inlined {[ K in std.Exclude<keyof express-validator.express-validator/src/chain/validators.Validators<any>, 'not' | 'withMessage'> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>} */
  trait ValidatorsSchema extends StObject {
    
    var contains: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.contains]
      ] = js.undefined
    
    var custom: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.custom]] = js.undefined
    
    @JSName("equals")
    var equals_FValidatorsSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.undefined
    
    var exists: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.exists]] = js.undefined
    
    var isAfter: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isAfter]] = js.undefined
    
    var isAlpha: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isAlpha]] = js.undefined
    
    var isAlphanumeric: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isAlphanumeric]
      ] = js.undefined
    
    var isArray: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isArray]] = js.undefined
    
    var isAscii: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isAscii]] = js.undefined
    
    var isBIC: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBIC]] = js.undefined
    
    var isBase32: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBase32]
      ] = js.undefined
    
    var isBase58: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBase58]
      ] = js.undefined
    
    var isBase64: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBase64]
      ] = js.undefined
    
    var isBefore: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBefore]
      ] = js.undefined
    
    var isBoolean: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBoolean]
      ] = js.undefined
    
    var isBtcAddress: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isBtcAddress]
      ] = js.undefined
    
    var isByteLength: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isByteLength]
      ] = js.undefined
    
    var isCreditCard: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isCreditCard]
      ] = js.undefined
    
    var isCurrency: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isCurrency]
      ] = js.undefined
    
    var isDataURI: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isDataURI]
      ] = js.undefined
    
    var isDate: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isDate]] = js.undefined
    
    var isDecimal: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isDecimal]
      ] = js.undefined
    
    var isDivisibleBy: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isDivisibleBy]
      ] = js.undefined
    
    var isEAN: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isEAN]] = js.undefined
    
    var isEmail: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isEmail]] = js.undefined
    
    var isEmpty: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isEmpty]] = js.undefined
    
    var isEthereumAddress: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isEthereumAddress]
      ] = js.undefined
    
    var isFQDN: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isFQDN]] = js.undefined
    
    var isFloat: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isFloat]] = js.undefined
    
    var isFullWidth: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isFullWidth]
      ] = js.undefined
    
    var isHSL: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isHSL]] = js.undefined
    
    var isHalfWidth: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isHalfWidth]
      ] = js.undefined
    
    var isHash: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isHash]] = js.undefined
    
    var isHexColor: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isHexColor]
      ] = js.undefined
    
    var isHexadecimal: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isHexadecimal]
      ] = js.undefined
    
    var isIBAN: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isIBAN]] = js.undefined
    
    var isIMEI: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isIMEI]] = js.undefined
    
    var isIP: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isIP]] = js.undefined
    
    var isIPRange: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isIPRange]
      ] = js.undefined
    
    var isISBN: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISBN]] = js.undefined
    
    var isISIN: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISIN]] = js.undefined
    
    var isISO31661Alpha2: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISO31661Alpha2]
      ] = js.undefined
    
    var isISO31661Alpha3: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISO31661Alpha3]
      ] = js.undefined
    
    var isISO4217: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISO4217]
      ] = js.undefined
    
    var isISO6391: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISO6391]
      ] = js.undefined
    
    var isISO8601: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISO8601]
      ] = js.undefined
    
    var isISRC: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISRC]] = js.undefined
    
    var isISSN: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isISSN]] = js.undefined
    
    var isIdentityCard: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isIdentityCard]
      ] = js.undefined
    
    var isIn: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isIn]] = js.undefined
    
    var isInt: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isInt]] = js.undefined
    
    var isJSON: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isJSON]] = js.undefined
    
    var isJWT: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isJWT]] = js.undefined
    
    var isLatLong: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isLatLong]
      ] = js.undefined
    
    var isLength: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isLength]
      ] = js.undefined
    
    var isLicensePlate: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isLicensePlate]
      ] = js.undefined
    
    var isLocale: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isLocale]
      ] = js.undefined
    
    var isLowercase: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isLowercase]
      ] = js.undefined
    
    var isLuhnNumber: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isLuhnNumber]
      ] = js.undefined
    
    var isMACAddress: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMACAddress]
      ] = js.undefined
    
    var isMD5: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMD5]] = js.undefined
    
    var isMagnetURI: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMagnetURI]
      ] = js.undefined
    
    var isMimeType: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMimeType]
      ] = js.undefined
    
    var isMobilePhone: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMobilePhone]
      ] = js.undefined
    
    var isMongoId: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMongoId]
      ] = js.undefined
    
    var isMultibyte: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isMultibyte]
      ] = js.undefined
    
    var isNumeric: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isNumeric]
      ] = js.undefined
    
    var isObject: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isObject]
      ] = js.undefined
    
    var isOctal: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isOctal]] = js.undefined
    
    var isPassportNumber: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isPassportNumber]
      ] = js.undefined
    
    var isPort: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isPort]] = js.undefined
    
    var isPostalCode: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isPostalCode]
      ] = js.undefined
    
    var isRFC3339: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isRFC3339]
      ] = js.undefined
    
    var isRgbColor: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isRgbColor]
      ] = js.undefined
    
    var isSemVer: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isSemVer]
      ] = js.undefined
    
    var isSlug: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isSlug]] = js.undefined
    
    var isString: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isString]
      ] = js.undefined
    
    var isStrongPassword: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isStrongPassword]
      ] = js.undefined
    
    var isSurrogatePair: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isSurrogatePair]
      ] = js.undefined
    
    var isTaxID: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isTaxID]] = js.undefined
    
    var isTime: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isTime]] = js.undefined
    
    var isURL: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isURL]] = js.undefined
    
    var isUUID: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isUUID]] = js.undefined
    
    var isUppercase: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isUppercase]
      ] = js.undefined
    
    var isVAT: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isVAT]] = js.undefined
    
    var isVariableWidth: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isVariableWidth]
      ] = js.undefined
    
    var isWhitelisted: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.isWhitelisted]
      ] = js.undefined
    
    var matches: js.UndefOr[ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.matches]] = js.undefined
    
    var notEmpty: js.UndefOr[
        ValidatorSchemaOptions[typings.expressValidator.expressValidatorStrings.notEmpty]
      ] = js.undefined
  }
  object ValidatorsSchema {
    
    inline def apply(): ValidatorsSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatorsSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatorsSchema] (val x: Self) extends AnyVal {
      
      inline def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      inline def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      inline def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      inline def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      inline def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      inline def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      inline def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      inline def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      inline def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      inline def setIsBase58(value: ValidatorSchemaOptions[isBase58]): Self = StObject.set(x, "isBase58", value.asInstanceOf[js.Any])
      
      inline def setIsBase58Undefined: Self = StObject.set(x, "isBase58", js.undefined)
      
      inline def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      inline def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      inline def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      inline def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      inline def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      inline def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      inline def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      inline def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      inline def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      inline def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      inline def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      inline def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      inline def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      inline def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      inline def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      inline def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      inline def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      inline def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      inline def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      inline def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      inline def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      inline def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      inline def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      inline def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      inline def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      inline def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      inline def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      inline def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      inline def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      inline def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      inline def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      inline def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      inline def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      inline def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      inline def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      inline def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      inline def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      inline def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      inline def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      inline def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      inline def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      inline def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      inline def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      inline def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      inline def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      inline def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      inline def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      inline def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      inline def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      inline def setIsISO4217(value: ValidatorSchemaOptions[isISO4217]): Self = StObject.set(x, "isISO4217", value.asInstanceOf[js.Any])
      
      inline def setIsISO4217Undefined: Self = StObject.set(x, "isISO4217", js.undefined)
      
      inline def setIsISO6391(value: ValidatorSchemaOptions[isISO6391]): Self = StObject.set(x, "isISO6391", value.asInstanceOf[js.Any])
      
      inline def setIsISO6391Undefined: Self = StObject.set(x, "isISO6391", js.undefined)
      
      inline def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      inline def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      inline def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      inline def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      inline def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      inline def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      inline def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      inline def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      inline def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      inline def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      inline def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      inline def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      inline def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      inline def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      inline def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      inline def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      inline def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      inline def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      inline def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      inline def setIsLicensePlate(value: ValidatorSchemaOptions[isLicensePlate]): Self = StObject.set(x, "isLicensePlate", value.asInstanceOf[js.Any])
      
      inline def setIsLicensePlateUndefined: Self = StObject.set(x, "isLicensePlate", js.undefined)
      
      inline def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      inline def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      inline def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      inline def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      inline def setIsLuhnNumber(value: ValidatorSchemaOptions[isLuhnNumber]): Self = StObject.set(x, "isLuhnNumber", value.asInstanceOf[js.Any])
      
      inline def setIsLuhnNumberUndefined: Self = StObject.set(x, "isLuhnNumber", js.undefined)
      
      inline def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      inline def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      inline def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      inline def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      inline def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      inline def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      inline def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      inline def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      inline def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      inline def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      inline def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      inline def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      inline def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      inline def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      inline def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      inline def setIsObject(value: ValidatorSchemaOptions[isObject]): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsObjectUndefined: Self = StObject.set(x, "isObject", js.undefined)
      
      inline def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      inline def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      inline def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      inline def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      inline def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      inline def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      inline def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      inline def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      inline def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      inline def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      inline def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      inline def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      inline def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      inline def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      inline def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      inline def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      inline def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      inline def setIsStrongPassword(value: ValidatorSchemaOptions[isStrongPassword]): Self = StObject.set(x, "isStrongPassword", value.asInstanceOf[js.Any])
      
      inline def setIsStrongPasswordUndefined: Self = StObject.set(x, "isStrongPassword", js.undefined)
      
      inline def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      inline def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      inline def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      inline def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      inline def setIsTime(value: ValidatorSchemaOptions[isTime]): Self = StObject.set(x, "isTime", value.asInstanceOf[js.Any])
      
      inline def setIsTimeUndefined: Self = StObject.set(x, "isTime", js.undefined)
      
      inline def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      inline def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      inline def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      inline def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      inline def setIsVAT(value: ValidatorSchemaOptions[isVAT]): Self = StObject.set(x, "isVAT", value.asInstanceOf[js.Any])
      
      inline def setIsVATUndefined: Self = StObject.set(x, "isVAT", js.undefined)
      
      inline def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      inline def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      inline def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      inline def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
    }
  }
}

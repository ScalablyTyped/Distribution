package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typings.formatjsIntl.anon.FormatsLocale
import typings.formatjsIntl.anon.LocaleOnError
import typings.formatjsIntl.anon.TimeZone
import typings.formatjsIntl.anon.TypeofDateTimeFormat
import typings.formatjsIntl.anon.TypeofDisplayNames
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntl.anon.TypeofPluralRules
import typings.formatjsIntl.anon.TypeofRelativeTimeFormat
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.number
import typings.formatjsIntl.formatjsIntlStrings.relative
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.formatjsIntl.libSrcErrorMod.IntlErrorCode
import typings.formatjsIntl.libSrcMessageMod.FormatMessageFn
import typings.formatjsIntl.libSrcTypesMod.CustomFormats
import typings.formatjsIntl.libSrcTypesMod.FormatDateOptions
import typings.formatjsIntl.libSrcTypesMod.Formatters
import typings.formatjsIntl.libSrcTypesMod.IntlCache
import typings.formatjsIntl.libSrcTypesMod.IntlConfig
import typings.formatjsIntl.libSrcTypesMod.IntlShape
import typings.formatjsIntl.libSrcTypesMod.MessageDescriptor
import typings.formatjsIntl.libSrcTypesMod.MessageIds
import typings.formatjsIntl.libSrcTypesMod.OnErrorFn
import typings.formatjsIntl.libSrcTypesMod.OnWarnFn
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.formatjsIntlListformat.mod.default
import typings.intlMessageformat.mod.FormatError
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.DateTimeFormatPart
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatPart
import typings.std.Intl.PluralRules
import typings.std.Intl.RelativeTimeFormat
import typings.std.Intl.RelativeTimeFormatOptions
import typings.std.Parameters
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/intl/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.ResolvedIntlConfig<any>, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError' | 'onWarn'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    inline def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.fallbackOnEmptyString")
    @js.native
    def fallbackOnEmptyString: js.UndefOr[Boolean] = js.native
    inline def fallbackOnEmptyString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnEmptyString")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    inline def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[MessageIds, js.Array[MessageFormatElement] | String] = js.native
    inline def messages_=(x: Record[MessageIds, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    inline def onError(err: typings.formatjsIntl.libSrcErrorMod.InvalidConfigError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.libSrcErrorMod.MessageFormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.libSrcErrorMod.MissingDataError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.libSrcErrorMod.MissingTranslationError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: FormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onWarn")
    @js.native
    def onWarn: js.UndefOr[OnWarnFn] = js.native
    inline def onWarn_=(x: js.UndefOr[OnWarnFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onWarn")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    inline def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@formatjs/intl/lib", "IntlError")
  @js.native
  open class IntlError[T /* <: IntlErrorCode */] protected ()
    extends typings.formatjsIntl.libSrcErrorMod.IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
    def this(code: T, message: String, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "IntlErrorCode")
  @js.native
  object IntlErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.formatjsIntl.libSrcErrorMod.IntlErrorCode & String] = js.native
    
    /* "FORMAT_ERROR" */ val FORMAT_ERROR: typings.formatjsIntl.libSrcErrorMod.IntlErrorCode.FORMAT_ERROR & String = js.native
    
    /* "INVALID_CONFIG" */ val INVALID_CONFIG: typings.formatjsIntl.libSrcErrorMod.IntlErrorCode.INVALID_CONFIG & String = js.native
    
    /* "MISSING_DATA" */ val MISSING_DATA: typings.formatjsIntl.libSrcErrorMod.IntlErrorCode.MISSING_DATA & String = js.native
    
    /* "MISSING_TRANSLATION" */ val MISSING_TRANSLATION: typings.formatjsIntl.libSrcErrorMod.IntlErrorCode.MISSING_TRANSLATION & String = js.native
    
    /* "UNSUPPORTED_FORMATTER" */ val UNSUPPORTED_FORMATTER: typings.formatjsIntl.libSrcErrorMod.IntlErrorCode.UNSUPPORTED_FORMATTER & String = js.native
  }
  
  @JSImport("@formatjs/intl/lib", "IntlFormatError")
  @js.native
  open class IntlFormatError protected ()
    extends typings.formatjsIntl.libSrcErrorMod.IntlFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, exception: js.Error) = this()
    def this(message: String, locale: String, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "InvalidConfigError")
  @js.native
  open class InvalidConfigError protected ()
    extends typings.formatjsIntl.libSrcErrorMod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MessageFormatError")
  @js.native
  open class MessageFormatError protected ()
    extends typings.formatjsIntl.libSrcErrorMod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: Any) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MissingDataError")
  @js.native
  open class MissingDataError protected ()
    extends typings.formatjsIntl.libSrcErrorMod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MissingTranslationError")
  @js.native
  open class MissingTranslationError protected ()
    extends typings.formatjsIntl.libSrcErrorMod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "UnsupportedFormatterError")
  @js.native
  open class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  inline def createFormatters(): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")().asInstanceOf[Formatters]
  inline def createFormatters(cache: IntlCache): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")(cache.asInstanceOf[js.Any]).asInstanceOf[Formatters]
  
  inline def createIntl[T](config: IntlConfig[T]): IntlShape[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any]).asInstanceOf[IntlShape[T]]
  inline def createIntl[T](config: IntlConfig[T], cache: IntlCache): IntlShape[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[IntlShape[T]]
  
  inline def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  inline def defineMessage[T](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessages")(msgs.asInstanceOf[js.Any]).asInstanceOf[U]
  
  inline def filterProps[T /* <: Record[String, Any] */, K /* <: String */](props: T, allowlist: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], allowlist.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  inline def filterProps[T /* <: Record[String, Any] */, K /* <: String */](props: T, allowlist: js.Array[K], defaults: Partial[T]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], allowlist.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  inline def formatDate(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], hasValueOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateToParts(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateToParts")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], hasValueOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[DateTimeFormatPart]]
  
  inline def formatDisplayName(
    hasLocaleOnError: LocaleOnError,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDisplayName")(hasLocaleOnError.asInstanceOf[js.Any], getDisplayNames.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def formatList_1(
    opts: LocaleOnError,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValuesOpts>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(opts.asInstanceOf[js.Any], getListFormat.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@formatjs/intl/lib", "formatMessage")
  @js.native
  val formatMessage: FormatMessageFn[Any] = js.native
  
  inline def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  inline def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  inline def formatPlural(
    hasLocaleOnError: LocaleOnError,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  inline def formatPlural(
    hasLocaleOnError: LocaleOnError,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  
  inline def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: Unit,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTime(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTime']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], hasValueOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTimeToParts(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeToParts")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], hasValueOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[DateTimeFormatPart]]
  
  inline def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
  
  inline def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
  
  inline def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
  
  inline def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
}

package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsIntl.anon.DefaultFormats
import typings.formatjsIntl.anon.Formats
import typings.formatjsIntl.anon.Locale
import typings.formatjsIntl.anon.OnError
import typings.formatjsIntl.anon.TypeofDateTimeFormat
import typings.formatjsIntl.anon.TypeofDisplayNames
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntl.anon.TypeofIntlRelativeTimeFor
import typings.formatjsIntl.anon.TypeofNumberFormat
import typings.formatjsIntl.anon.TypeofPluralRules
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.number
import typings.formatjsIntl.formatjsIntlStrings.relative
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.formatjsIntl.srcErrorMod.IntlErrorCode
import typings.formatjsIntl.srcTypesMod.CustomFormats
import typings.formatjsIntl.srcTypesMod.FormatDateOptions
import typings.formatjsIntl.srcTypesMod.Formatters
import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.formatjsIntl.srcTypesMod.IntlShape
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.formatjsIntl.srcTypesMod.OptionalIntlConfig
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.formatjsIntlListformat.mod.default
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.ConstructorParameters
import typings.std.Error
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.DateTimeFormatPart
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.NumberFormatPart
import typings.std.Intl.PluralRules
import typings.std.Parameters
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    inline def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    inline def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    inline def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    inline def onError(err: typings.formatjsIntl.srcErrorMod.InvalidConfigError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.srcErrorMod.MessageFormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.srcErrorMod.MissingDataError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.srcErrorMod.MissingTranslationError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: FormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    inline def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@formatjs/intl", "IntlError")
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected ()
    extends typings.formatjsIntl.srcErrorMod.IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typings.formatjsIntl.srcErrorMod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typings.formatjsIntl.srcErrorMod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typings.formatjsIntl.srcErrorMod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typings.formatjsIntl.srcErrorMod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("@formatjs/intl", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  inline def createFormatters(): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")().asInstanceOf[Formatters]
  inline def createFormatters(cache: IntlCache): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")(cache.asInstanceOf[js.Any]).asInstanceOf[Formatters]
  
  inline def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any]).asInstanceOf[IntlShape[T]]
  inline def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[IntlShape[T]]
  
  inline def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  inline def defineMessage[T](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessages")(msgs.asInstanceOf[js.Any]).asInstanceOf[U]
  
  inline def filterProps[T /* <: Record[String, js.Any] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  inline def filterProps[T /* <: Record[String, js.Any] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  inline def formatDate(
    config: Formats,
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
    config: Formats,
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
    hasLocaleOnError: Locale,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDisplayName")(hasLocaleOnError.asInstanceOf[js.Any], getDisplayNames.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def formatList_1(
    hasLocaleOnError: Locale,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCall>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(hasLocaleOnError.asInstanceOf[js.Any], getListFormat.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMessage(config: DefaultFormats, state: Formatters): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: Unit,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMessage(config: DefaultFormats, state: Formatters, messageDescriptor: MessageDescriptor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  inline def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  inline def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  inline def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: Unit,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTime(
    config: Formats,
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
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeToParts")(config.asInstanceOf[js.Any], getDateTimeFormat.asInstanceOf[js.Any], hasValueOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[DateTimeFormatPart]]
  
  inline def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  inline def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  inline def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  inline def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
}

package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsIntl.anon.DefaultLocale
import typings.formatjsIntl.anon.FormatsLocale
import typings.formatjsIntl.anon.LocaleOnError
import typings.formatjsIntl.anon.TimeZone
import typings.formatjsIntl.anon.TypeofDateTimeFormat
import typings.formatjsIntl.anon.TypeofDisplayNames
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntl.anon.TypeofIntlRelativeTimeFor
import typings.formatjsIntl.anon.TypeofNumberFormat
import typings.formatjsIntl.anon.TypeofPluralRules
import typings.formatjsIntl.errorMod.IntlErrorCode
import typings.formatjsIntl.formatjsIntlStrings.date
import typings.formatjsIntl.formatjsIntlStrings.number
import typings.formatjsIntl.formatjsIntlStrings.relative
import typings.formatjsIntl.formatjsIntlStrings.time
import typings.formatjsIntl.typesMod.CustomFormats
import typings.formatjsIntl.typesMod.FormatDateOptions
import typings.formatjsIntl.typesMod.Formatters
import typings.formatjsIntl.typesMod.IntlCache
import typings.formatjsIntl.typesMod.IntlShape
import typings.formatjsIntl.typesMod.MessageDescriptor
import typings.formatjsIntl.typesMod.OnErrorFn
import typings.formatjsIntl.typesMod.OptionalIntlConfig
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

object libMod {
  
  @JSImport("@formatjs/intl/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    @scala.inline
    def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    @scala.inline
    def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    @scala.inline
    def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    @scala.inline
    def onError(err: typings.formatjsIntl.errorMod.InvalidConfigError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: typings.formatjsIntl.errorMod.MessageFormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: typings.formatjsIntl.errorMod.MissingDataError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: typings.formatjsIntl.errorMod.MissingTranslationError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: typings.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError(err: FormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    @scala.inline
    def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@formatjs/intl/lib", "IntlError")
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected ()
    extends typings.formatjsIntl.errorMod.IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typings.formatjsIntl.errorMod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typings.formatjsIntl.errorMod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typings.formatjsIntl.errorMod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typings.formatjsIntl.errorMod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.errorMod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @scala.inline
  def createFormatters(): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")().asInstanceOf[Formatters]
  @scala.inline
  def createFormatters(cache: IntlCache): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")(cache.asInstanceOf[js.Any]).asInstanceOf[Formatters]
  
  @scala.inline
  def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any]).asInstanceOf[IntlShape[T]]
  @scala.inline
  def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[IntlShape[T]]
  
  @scala.inline
  def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  @scala.inline
  def defineMessage[T](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessages")(msgs.asInstanceOf[js.Any]).asInstanceOf[U]
  
  @scala.inline
  def filterProps[T /* <: Record[String, js.Any] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  @scala.inline
  def filterProps[T /* <: Record[String, js.Any] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  @scala.inline
  def formatDate(
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
  
  @scala.inline
  def formatDateToParts(
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
  
  @scala.inline
  def formatDisplayName(
    hasLocaleOnError: LocaleOnError,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDisplayName")(hasLocaleOnError.asInstanceOf[js.Any], getDisplayNames.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def formatList_1(
    hasLocaleOnError: LocaleOnError,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValuesOpts>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatList")(hasLocaleOnError.asInstanceOf[js.Any], getListFormat.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatMessage(config: DefaultLocale, state: Formatters): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: Unit,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(config: DefaultLocale, state: Formatters, messageDescriptor: MessageDescriptor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  @scala.inline
  def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  @scala.inline
  def formatPlural(
    hasLocaleOnError: LocaleOnError,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  @scala.inline
  def formatPlural(
    hasLocaleOnError: LocaleOnError,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  
  @scala.inline
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typings.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: Unit,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatTime(
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
  
  @scala.inline
  def formatTimeToParts(
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
  
  @scala.inline
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  @scala.inline
  def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  @scala.inline
  def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
  
  @scala.inline
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions]]
}

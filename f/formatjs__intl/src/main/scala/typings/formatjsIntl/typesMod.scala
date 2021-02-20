package typings.formatjsIntl

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsIntl.anon.TypeofDateTimeFormat
import typings.formatjsIntl.anon.TypeofDisplayNames
import typings.formatjsIntl.anon.TypeofIntlListFormat
import typings.formatjsIntl.anon.TypeofIntlMessageFormat
import typings.formatjsIntl.anon.TypeofIntlRelativeTimeFor
import typings.formatjsIntl.anon.TypeofNumberFormat
import typings.formatjsIntl.anon.TypeofPluralRules
import typings.formatjsIntl.errorMod.InvalidConfigError
import typings.formatjsIntl.errorMod.MessageFormatError
import typings.formatjsIntl.errorMod.MissingDataError
import typings.formatjsIntl.errorMod.MissingTranslationError
import typings.formatjsIntl.errorMod.UnsupportedFormatterError
import typings.formatjsIntl.formatjsIntlStrings.localeMatcher
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.formatjsIntlListformat.mod.default
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.mod.IntlMessageFormat
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.ConstructorParameters
import typings.std.Exclude
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.DateTimeFormatPart
import typings.std.Intl.LDMLPluralRule
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.NumberFormatPart
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait CustomFormatConfig extends StObject {
    
    var format: js.UndefOr[String] = js.native
  }
  object CustomFormatConfig {
    
    @scala.inline
    def apply(): CustomFormatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomFormatConfig]
    }
    
    @scala.inline
    implicit class CustomFormatConfigMutableBuilder[Self <: CustomFormatConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<intl-messageformat.intl-messageformat.Formats> */
  @js.native
  trait CustomFormats extends StObject {
    
    var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
    
    var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.native
    
    var relative: js.UndefOr[Record[String, IntlRelativeTimeFormatOptions]] = js.native
    
    var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
  }
  object CustomFormats {
    
    @scala.inline
    def apply(): CustomFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomFormats]
    }
    
    @scala.inline
    implicit class CustomFormatsMutableBuilder[Self <: CustomFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setRelative(value: Record[String, IntlRelativeTimeFormatOptions]): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setTime(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  type FormatDateOptions = (Exclude[
    typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions, 
    localeMatcher
  ]) with CustomFormatConfig
  
  /* Inlined std.Exclude<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNamesOptions, 'localeMatcher'> */
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsIntl.formatjsIntlStrings.style
    - typings.formatjsIntl.formatjsIntlStrings.`type`
    - typings.formatjsIntl.formatjsIntlStrings.fallback
  */
  trait FormatDisplayNameOptions extends StObject
  object FormatDisplayNameOptions {
    
    @scala.inline
    def fallback: typings.formatjsIntl.formatjsIntlStrings.fallback = "fallback".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.fallback]
    
    @scala.inline
    def style: typings.formatjsIntl.formatjsIntlStrings.style = "style".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.style]
    
    @scala.inline
    def `type`: typings.formatjsIntl.formatjsIntlStrings.`type` = "type".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.`type`]
  }
  
  /* Inlined std.Exclude<@formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions, 'localeMatcher'> */
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsIntl.formatjsIntlStrings.`type`
    - typings.formatjsIntl.formatjsIntlStrings.style
  */
  trait FormatListOptions extends StObject
  object FormatListOptions {
    
    @scala.inline
    def style: typings.formatjsIntl.formatjsIntlStrings.style = "style".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.style]
    
    @scala.inline
    def `type`: typings.formatjsIntl.formatjsIntlStrings.`type` = "type".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.`type`]
  }
  
  type FormatNumberOptions = (Exclude[typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions, localeMatcher]) with CustomFormatConfig
  
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  
  @js.native
  trait Formatters extends StObject {
    
    def getDateTimeFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[TypeofDateTimeFormat]
    ): DateTimeFormat = js.native
    
    def getDisplayNames(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[TypeofDisplayNames]
    ): DisplayNames = js.native
    
    def getListFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
    ): default = js.native
    
    def getMessageFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
    ): IntlMessageFormat = js.native
    
    def getNumberFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[TypeofNumberFormat]
    ): NumberFormat = js.native
    
    def getPluralRules(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[TypeofPluralRules]
    ): PluralRules = js.native
    
    def getRelativeTimeFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofIntlRelativeTimeFor]
    ): typings.formatjsIntlRelativetimeformat.mod.default = js.native
  }
  object Formatters {
    
    @scala.inline
    def apply(
      getDateTimeFormat: ConstructorParameters[TypeofDateTimeFormat] => DateTimeFormat,
      getDisplayNames: ConstructorParameters[TypeofDisplayNames] => DisplayNames,
      getListFormat: ConstructorParameters[TypeofIntlListFormat] => default,
      getMessageFormat: ConstructorParameters[TypeofIntlMessageFormat] => IntlMessageFormat,
      getNumberFormat: ConstructorParameters[TypeofNumberFormat] => NumberFormat,
      getPluralRules: ConstructorParameters[TypeofPluralRules] => PluralRules,
      getRelativeTimeFormat: ConstructorParameters[TypeofIntlRelativeTimeFor] => typings.formatjsIntlRelativetimeformat.mod.default
    ): Formatters = {
      val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getDisplayNames = js.Any.fromFunction1(getDisplayNames), getListFormat = js.Any.fromFunction1(getListFormat), getMessageFormat = js.Any.fromFunction1(getMessageFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules), getRelativeTimeFormat = js.Any.fromFunction1(getRelativeTimeFormat))
      __obj.asInstanceOf[Formatters]
    }
    
    @scala.inline
    implicit class FormattersMutableBuilder[Self <: Formatters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDateTimeFormat(value: ConstructorParameters[TypeofDateTimeFormat] => DateTimeFormat): Self = StObject.set(x, "getDateTimeFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDisplayNames(value: ConstructorParameters[TypeofDisplayNames] => DisplayNames): Self = StObject.set(x, "getDisplayNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetListFormat(value: ConstructorParameters[TypeofIntlListFormat] => default): Self = StObject.set(x, "getListFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMessageFormat(value: ConstructorParameters[TypeofIntlMessageFormat] => IntlMessageFormat): Self = StObject.set(x, "getMessageFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNumberFormat(value: ConstructorParameters[TypeofNumberFormat] => NumberFormat): Self = StObject.set(x, "getNumberFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPluralRules(value: ConstructorParameters[TypeofPluralRules] => PluralRules): Self = StObject.set(x, "getPluralRules", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRelativeTimeFormat(
        value: ConstructorParameters[TypeofIntlRelativeTimeFor] => typings.formatjsIntlRelativetimeformat.mod.default
      ): Self = StObject.set(x, "getRelativeTimeFormat", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IntlCache extends StObject {
    
    var dateTime: Record[String, DateTimeFormat] = js.native
    
    var displayNames: Record[String, DisplayNames] = js.native
    
    var list: Record[String, default] = js.native
    
    var message: Record[String, IntlMessageFormat] = js.native
    
    var number: Record[String, NumberFormat] = js.native
    
    var pluralRules: Record[String, PluralRules] = js.native
    
    var relativeTime: Record[String, typings.formatjsIntlRelativetimeformat.mod.default] = js.native
  }
  object IntlCache {
    
    @scala.inline
    def apply(
      dateTime: Record[String, DateTimeFormat],
      displayNames: Record[String, DisplayNames],
      list: Record[String, default],
      message: Record[String, IntlMessageFormat],
      number: Record[String, NumberFormat],
      pluralRules: Record[String, PluralRules],
      relativeTime: Record[String, typings.formatjsIntlRelativetimeformat.mod.default]
    ): IntlCache = {
      val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlCache]
    }
    
    @scala.inline
    implicit class IntlCacheMutableBuilder[Self <: IntlCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateTime(value: Record[String, DateTimeFormat]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNames(value: Record[String, DisplayNames]): Self = StObject.set(x, "displayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: Record[String, default]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: Record[String, IntlMessageFormat]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Record[String, NumberFormat]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralRules(value: Record[String, PluralRules]): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeTime(value: Record[String, typings.formatjsIntlRelativetimeformat.mod.default]): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntlConfig[T] extends StObject {
    
    var defaultFormats: CustomFormats = js.native
    
    var defaultLocale: String = js.native
    
    var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.native
    
    var formats: CustomFormats = js.native
    
    var locale: String = js.native
    
    var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    
    def onError(err: InvalidConfigError): Unit = js.native
    def onError(err: MessageFormatError): Unit = js.native
    def onError(err: MissingDataError): Unit = js.native
    def onError(err: MissingTranslationError): Unit = js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait IntlFormatters[T, R] extends StObject {
    
    def formatDate(value: String): String = js.native
    def formatDate(value: String, opts: FormatDateOptions): String = js.native
    
    def formatDateTimeRange(
      from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
      to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[1] */ js.Any
    ): String = js.native
    def formatDateTimeRange(
      from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
      to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallStartDateEndDate>[1] */ js.Any,
      opts: FormatDateOptions
    ): String = js.native
    
    def formatDateToParts(value: String): js.Array[DateTimeFormatPart] = js.native
    def formatDateToParts(value: String, opts: FormatDateOptions): js.Array[DateTimeFormatPart] = js.native
    @JSName("formatDateToParts")
    def formatDateToParts_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
    ): js.Array[DateTimeFormatPart] = js.native
    @JSName("formatDateToParts")
    def formatDateToParts_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
      opts: FormatDateOptions
    ): js.Array[DateTimeFormatPart] = js.native
    
    @JSName("formatDate")
    def formatDate_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
    ): String = js.native
    @JSName("formatDate")
    def formatDate_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
      opts: FormatDateOptions
    ): String = js.native
    
    @JSName("formatDisplayName")
    def formatDisplayName_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallCode>[0] */ js.Any,
      opts: FormatDisplayNameOptions
    ): js.UndefOr[String] = js.native
    
    def formatList(values: js.Array[String]): String = js.native
    def formatList(values: js.Array[String], opts: FormatListOptions): String = js.native
    @JSName("formatList")
    def formatList_Union(values: js.Array[String | T]): T | String | (js.Array[String | T]) = js.native
    @JSName("formatList")
    def formatList_Union(values: js.Array[String | T], opts: FormatListOptions): T | String | (js.Array[String | T]) = js.native
    
    def formatMessage(descriptor: MessageDescriptor): String = js.native
    def formatMessage(
      descriptor: MessageDescriptor,
      values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
    ): String = js.native
    @JSName("formatMessage")
    def formatMessage_R(descriptor: MessageDescriptor): R = js.native
    @JSName("formatMessage")
    def formatMessage_R(
      descriptor: MessageDescriptor,
      values: Record[String, PrimitiveType | T | (FormatXMLElementFn[T, R])]
    ): R = js.native
    
    @JSName("formatNumberToParts")
    def formatNumberToParts_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any
    ): js.Array[NumberFormatPart] = js.native
    @JSName("formatNumberToParts")
    def formatNumberToParts_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any,
      opts: FormatNumberOptions
    ): js.Array[NumberFormatPart] = js.native
    
    @JSName("formatNumber")
    def formatNumber_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any
    ): String = js.native
    @JSName("formatNumber")
    def formatNumber_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValue>[0] */ js.Any,
      opts: FormatNumberOptions
    ): String = js.native
    
    @JSName("formatPlural")
    def formatPlural_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(n : number): std.Intl.LDMLPluralRule>[0] */ js.Any
    ): ReturnType[js.Function1[/* n */ Double, LDMLPluralRule]] = js.native
    @JSName("formatPlural")
    def formatPlural_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(n : number): std.Intl.LDMLPluralRule>[0] */ js.Any,
      opts: FormatPluralOptions
    ): ReturnType[js.Function1[/* n */ Double, LDMLPluralRule]] = js.native
    
    def formatRelativeTime(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any,
      unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[1] */ js.Any
    ): String = js.native
    def formatRelativeTime(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any,
      unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[1] */ js.Any,
      opts: FormatRelativeTimeOptions
    ): String = js.native
    @JSName("formatRelativeTime")
    def formatRelativeTime_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any
    ): String = js.native
    @JSName("formatRelativeTime")
    def formatRelativeTime_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.RelativeTimeFormattableUnit): string>[0] */ js.Any,
      unit: js.UndefOr[scala.Nothing],
      opts: FormatRelativeTimeOptions
    ): String = js.native
    
    def formatTime(value: String): String = js.native
    def formatTime(value: String, opts: FormatDateOptions): String = js.native
    
    def formatTimeToParts(value: String): js.Array[DateTimeFormatPart] = js.native
    def formatTimeToParts(value: String, opts: FormatDateOptions): js.Array[DateTimeFormatPart] = js.native
    @JSName("formatTimeToParts")
    def formatTimeToParts_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
    ): js.Array[DateTimeFormatPart] = js.native
    @JSName("formatTimeToParts")
    def formatTimeToParts_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
      opts: FormatDateOptions
    ): js.Array[DateTimeFormatPart] = js.native
    
    @JSName("formatTime")
    def formatTime_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any
    ): String = js.native
    @JSName("formatTime")
    def formatTime_0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallDate>[0] */ js.Any,
      opts: FormatDateOptions
    ): String = js.native
  }
  
  @js.native
  trait IntlShape[T]
    extends IntlConfig[T]
       with IntlFormatters[js.Any, js.Any] {
    
    var formatters: Formatters = js.native
  }
  
  @js.native
  trait MessageDescriptor extends StObject {
    
    var defaultMessage: js.UndefOr[String | js.Array[MessageFormatElement]] = js.native
    
    var description: js.UndefOr[String | js.Object] = js.native
    
    var id: js.UndefOr[String | Double] = js.native
  }
  object MessageDescriptor {
    
    @scala.inline
    def apply(): MessageDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    @scala.inline
    implicit class MessageDescriptorMutableBuilder[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMessage(value: String | js.Array[MessageFormatElement]): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      @scala.inline
      def setDefaultMessageVarargs(value: MessageFormatElement*): Self = StObject.set(x, "defaultMessage", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String | js.Object): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  type OnErrorFn = js.Function1[
    /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError, 
    Unit
  ]
  
  /* Inlined std.Omit<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<T>, keyof std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'>> & std.Partial<std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
  @js.native
  trait OptionalIntlConfig[T] extends StObject {
    
    var defaultFormats: js.UndefOr[CustomFormats] = js.native
    
    var defaultLocale: js.UndefOr[String] = js.native
    
    var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.native
    
    var formats: js.UndefOr[CustomFormats] = js.native
    
    var locale: String = js.native
    
    var messages: js.UndefOr[Record[String, js.Array[MessageFormatElement] | String]] = js.native
    
    var onError: js.UndefOr[OnErrorFn] = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  object OptionalIntlConfig {
    
    @scala.inline
    def apply[T](locale: String): OptionalIntlConfig[T] = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionalIntlConfig[T]]
    }
    
    @scala.inline
    implicit class OptionalIntlConfigMutableBuilder[Self <: OptionalIntlConfig[_], T] (val x: Self with OptionalIntlConfig[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFormatsUndefined: Self = StObject.set(x, "defaultFormats", js.undefined)
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setDefaultRichTextElements(value: Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
      
      @scala.inline
      def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
}

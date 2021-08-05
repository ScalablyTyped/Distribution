package typings.globalize

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrStatic
import typings.globalize.globalizeStrings.accounting
import typings.globalize.globalizeStrings.cardinal
import typings.globalize.globalizeStrings.ceil
import typings.globalize.globalizeStrings.code
import typings.globalize.globalizeStrings.decimal
import typings.globalize.globalizeStrings.floor
import typings.globalize.globalizeStrings.full
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.medium
import typings.globalize.globalizeStrings.name
import typings.globalize.globalizeStrings.narrow
import typings.globalize.globalizeStrings.ordinal
import typings.globalize.globalizeStrings.percent
import typings.globalize.globalizeStrings.round
import typings.globalize.globalizeStrings.short
import typings.globalize.globalizeStrings.symbol
import typings.globalize.globalizeStrings.truncate
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalizeMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends StObject
       with Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  trait CommonNumberFormatterOptions extends StObject {
    
    /**
      * String `short` or `long` indicating which compact number format should be used to represent the number.
      */
    var compact: js.UndefOr[short | long] = js.undefined
    
    /**
      * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
      * Numbers will be rounded or padded with trailing zeroes if necessary.
      * Either one or both of these properties must be present.
      * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
      */
    var maximumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /**
      * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
      * Either none or both of these properties are present.
      * If they are, they override minimum and maximum integer and fraction digits.
      * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
      */
    var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    /**
      * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
      * Numbers will be rounded or padded with trailing zeroes if necessary.
      * Either one or both of these properties must be present.
      * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
      */
    var minimumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /**
      * Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
      */
    var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
    
    /**
      * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
      * Either none or both of these properties are present
      * If they are, they override minimum and maximum integer and fraction digits.
      * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
      */
    var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    /**
      * String with rounding method ceil, floor, round (default), or truncate.
      */
    var round: js.UndefOr[ceil | floor | typings.globalize.globalizeStrings.round | truncate] = js.undefined
    
    /**
      * Boolean (default is true) value indicating whether a grouping separator should be used.
      */
    var useGrouping: js.UndefOr[Boolean] = js.undefined
  }
  object CommonNumberFormatterOptions {
    
    inline def apply(): CommonNumberFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonNumberFormatterOptions]
    }
    
    extension [Self <: CommonNumberFormatterOptions](x: Self) {
      
      inline def setCompact(value: short | long): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
      
      inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
      
      inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
      
      inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      inline def setRound(value: ceil | floor | round | truncate): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
      
      inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    }
  }
  
  trait CurrencyFormatterOptions
    extends StObject
       with CommonNumberFormatterOptions {
    
    /**
      * symbol (default), accounting, code or name.
      */
    var style: js.UndefOr[symbol | accounting | code | name] = js.undefined
  }
  object CurrencyFormatterOptions {
    
    inline def apply(): CurrencyFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrencyFormatterOptions]
    }
    
    extension [Self <: CurrencyFormatterOptions](x: Self) {
      
      inline def setStyle(value: symbol | accounting | code | name): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DateFormatPart extends StObject {
    
    var `type`: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPartTypes
    
    var value: String
  }
  object DateFormatPart {
    
    inline def apply(
      `type`: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPartTypes,
      value: String
    ): DateFormatPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateFormatPart]
    }
    
    extension [Self <: DateFormatPart](x: Self) {
      
      inline def setType(value: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.globalize.globalizeStrings.day
    - typings.globalize.globalizeStrings.dayperiod
    - typings.globalize.globalizeStrings.era
    - typings.globalize.globalizeStrings.hour
    - typings.globalize.globalizeStrings.literal
    - typings.globalize.globalizeStrings.minute
    - typings.globalize.globalizeStrings.month
    - typings.globalize.globalizeStrings.second
    - typings.globalize.globalizeStrings.zone
    - typings.globalize.globalizeStrings.weekday
    - typings.globalize.globalizeStrings.year
  */
  trait DateFormatPartTypes extends StObject
  object DateFormatPartTypes {
    
    inline def day: typings.globalize.globalizeStrings.day = "day".asInstanceOf[typings.globalize.globalizeStrings.day]
    
    inline def dayperiod: typings.globalize.globalizeStrings.dayperiod = "dayperiod".asInstanceOf[typings.globalize.globalizeStrings.dayperiod]
    
    inline def era: typings.globalize.globalizeStrings.era = "era".asInstanceOf[typings.globalize.globalizeStrings.era]
    
    inline def hour: typings.globalize.globalizeStrings.hour = "hour".asInstanceOf[typings.globalize.globalizeStrings.hour]
    
    inline def literal: typings.globalize.globalizeStrings.literal = "literal".asInstanceOf[typings.globalize.globalizeStrings.literal]
    
    inline def minute: typings.globalize.globalizeStrings.minute = "minute".asInstanceOf[typings.globalize.globalizeStrings.minute]
    
    inline def month: typings.globalize.globalizeStrings.month = "month".asInstanceOf[typings.globalize.globalizeStrings.month]
    
    inline def second: typings.globalize.globalizeStrings.second = "second".asInstanceOf[typings.globalize.globalizeStrings.second]
    
    inline def weekday: typings.globalize.globalizeStrings.weekday = "weekday".asInstanceOf[typings.globalize.globalizeStrings.weekday]
    
    inline def year: typings.globalize.globalizeStrings.year = "year".asInstanceOf[typings.globalize.globalizeStrings.year]
    
    inline def zone: typings.globalize.globalizeStrings.zone = "zone".asInstanceOf[typings.globalize.globalizeStrings.zone]
  }
  
  trait DateFormatterOptions extends StObject {
    
    /**
      * One of the following String values: full, long, medium, or short, eg. { date: "full" }.
      */
    var date: js.UndefOr[full | long | medium | short] = js.undefined
    
    /**
      * One of the following String values: full, long, medium, or short, eg. { datetime: "full" }
      */
    var datetime: js.UndefOr[full | long | medium | short] = js.undefined
    
    /**
      * String value indicating a machine raw pattern (anything in the "Sym." column) eg. { raw: "dd/mm" }.
      * Note this is NOT recommended for i18n in general. Use skeleton instead.
      */
    var raw: js.UndefOr[String] = js.undefined
    
    /**
      * String value indicating a skeleton (see description above), eg. { skeleton: "GyMMMd" }.
      * Skeleton provides a more flexible formatting mechanism than the predefined list full, long, medium, or short represented by date, time, or datetime.
      * Instead, they are an open-ended list of patterns containing only date field information, and in a canonical order.
      */
    var skeleton: js.UndefOr[String] = js.undefined
    
    /**
      * One of the following String values: full, long, medium, or short, eg. { time: "full" }.
      */
    var time: js.UndefOr[full | long | medium | short] = js.undefined
    
    /**
      * String based on the time zone names of the IANA time zone database,
      * such as "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
      */
    var timeZone: js.UndefOr[String] = js.undefined
  }
  object DateFormatterOptions {
    
    inline def apply(): DateFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFormatterOptions]
    }
    
    extension [Self <: DateFormatterOptions](x: Self) {
      
      inline def setDate(value: full | long | medium | short): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDatetime(value: full | long | medium | short): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSkeleton(value: String): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
      
      inline def setTime(value: full | long | medium | short): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
  
  type Globalize = Shared
  
  trait NumberFormatterOptions
    extends StObject
       with CommonNumberFormatterOptions
       with typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions
  object NumberFormatterOptions {
    
    inline def apply(): NumberFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFormatterOptions]
    }
  }
  
  trait NumberParserOptions extends StObject {
    
    /**
      * decimal (default), or percent.
      */
    var style: js.UndefOr[decimal | percent] = js.undefined
  }
  object NumberParserOptions {
    
    inline def apply(): NumberParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberParserOptions]
    }
    
    extension [Self <: NumberParserOptions](x: Self) {
      
      inline def setStyle(value: decimal | percent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait PluralGeneratorOptions extends StObject {
    
    /**
      * cardinal (default), or ordinal.
      */
    var `type`: js.UndefOr[cardinal | ordinal] = js.undefined
  }
  object PluralGeneratorOptions {
    
    inline def apply(): PluralGeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluralGeneratorOptions]
    }
    
    extension [Self <: PluralGeneratorOptions](x: Self) {
      
      inline def setType(value: cardinal | ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RelativeTimeFormatterOptions extends StObject {
    
    /**
      * eg. "short" or "narrow". Or falsy for default long form
      */
    var form: js.UndefOr[short | narrow] = js.undefined
  }
  object RelativeTimeFormatterOptions {
    
    inline def apply(): RelativeTimeFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelativeTimeFormatterOptions]
    }
    
    extension [Self <: RelativeTimeFormatterOptions](x: Self) {
      
      inline def setForm(value: short | narrow): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    }
  }
  
  @js.native
  trait Shared extends StObject {
    
    var cldr: CldrStatic = js.native
    
    /**
      * Return a function that formats a currency according to the given options or locale's defaults.
      * The returned function is invoked with one argument: the Number value to be formatted.
      * @param {string} currency 3-letter currency code as defined by ISO 4217, eg. USD.
      * @param {CurrencyFormatterOptions} options A JSON object including none or any of the following options.
      * @returns {Function} Return a function that formats a currency
      */
    def currencyFormatter(currency: String): js.Function1[/* value */ Double, String] = js.native
    def currencyFormatter(
      currency: String,
      options: typings.globalize.currencyMod.globalizeDistGlobalizeAugmentingMod.CurrencyFormatterOptions
    ): js.Function1[/* value */ Double, String] = js.native
    
    /**
      * .dateFormatter( options )
      * @param {DateFormatterOptions} options see date/expand_pattern for more info.
      * @returns {Function} Return a function that formats a date according to the given `options` and the default/instance locale.
      */
    def dateFormatter(): js.Function1[/* value */ Date, String] = js.native
    def dateFormatter(options: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatterOptions): js.Function1[/* value */ Date, String] = js.native
    
    //Return a function that parses a string representing a date into a JavaScript Date object according to the given options. The default parsing assumes numeric year, month, and day (i.e., { skeleton: "yMd" }).
    def dateParser(): js.Function1[/* value */ String, Date] = js.native
    def dateParser(options: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatterOptions): js.Function1[/* value */ String, Date] = js.native
    
    /**
      * .dateToPartsFormatter( options )
      * @param {DateFormatterOptions} options see date/expand_pattern for more info.
      * @returns {Function} Return a function that formats a date into parts tokens according to the given options. The default formatting is numeric year, month, and day (i.e., `{ skeleton: "yMd" }`).
      */
    def dateToPartsFormatter(): js.Function1[
        /* value */ Date, 
        js.Array[typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPart]
      ] = js.native
    def dateToPartsFormatter(options: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatterOptions): js.Function1[
        /* value */ Date, 
        js.Array[typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPart]
      ] = js.native
    
    /**
      * Return a currency formatted according to the given options or locale's defaults.
      * @param {number} value The value to format.
      * @param {string} currency 3-letter currency code as defined by ISO 4217, eg. USD.
      * @param {CurrencyFormatterOptions} options A JSON object including none or any of the following options.
      * @returns {string} Return a string formatted in the currency according to the value and the options
      */
    def formatCurrency(value: Double, currency: String): String = js.native
    def formatCurrency(
      value: Double,
      currency: String,
      options: typings.globalize.currencyMod.globalizeDistGlobalizeAugmentingMod.CurrencyFormatterOptions
    ): String = js.native
    
    //Alias for .dateFormatter( [options] )( value ).
    def formatDate(value: Date): String = js.native
    def formatDate(
      value: Date,
      options: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatterOptions
    ): String = js.native
    
    //Alias for .dateToPartsFormatter( [options] )( value ).
    def formatDateToParts(value: Date): js.Array[typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPart] = js.native
    def formatDateToParts(
      value: Date,
      options: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatterOptions
    ): js.Array[typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPart] = js.native
    
    /**
      * Formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string
      * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
      * @param variables Variables can be Objects, where each property can be referenced by name inside a message; or Arrays, where each entry of the Array can be used inside a message, using numeric indices. When passing one or more arguments of other types, they're converted to an Array and used as such.
      * @returns {string} Return a user-readable string.
      */
    def formatMessage(path: String): String = js.native
    def formatMessage(path: String, variables: String): String = js.native
    def formatMessage(path: String, variables: js.Array[String]): String = js.native
    def formatMessage(path: String, variables: js.Object): String = js.native
    def formatMessage(path: js.Array[String]): String = js.native
    def formatMessage(path: js.Array[String], variables: String): String = js.native
    def formatMessage(path: js.Array[String], variables: js.Array[String]): String = js.native
    def formatMessage(path: js.Array[String], variables: js.Object): String = js.native
    
    /**
      * Return a number formatted according to the given options or locale's defaults.
      * @param {number} value The number to format
      * @param {NumberFormatterOptions} options A JSON object including none or any of the following options.
      * style Optional String decimal (default), or percent.
      * minimumIntegerDigits Optional Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
      * minimumFractionDigits and maximumFractionDigits Optional Non-negative integer Number values indicating the minimum and maximum fraction digits to be used. Numbers will be rounded or padded with trailing zeroes if necessary. Either one or both of these properties must be present. If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
      * minimumSignificantDigits and maximumSignificantDigits Optional Positive integer Number values indicating the minimum and maximum fraction digits to be shown. Either none or both of these properties are present. If they are, they override minimum and maximum integer and fraction digits. The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
      * round Optional String with rounding method ceil, floor, round (default), or truncate.
      * useGrouping Optional Boolean (default is true) value indicating whether a grouping separator should be used.
      * @returns {string} Return the number formatted
      */
    def formatNumber(value: Double): String = js.native
    def formatNumber(
      value: Double,
      options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions
    ): String = js.native
    
    /**
      * Return a relative time according to the given unit
      * @param {number} value The number to be formatted.
      * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
      * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
      * @returns {string} Return a relative time according to the given unit.
      */
    def formatRelativeTime(value: Double, unit: String): String = js.native
    def formatRelativeTime(
      value: Double,
      unit: String,
      options: typings.globalize.relativeTimeMod.globalizeDistGlobalizeAugmentingMod.RelativeTimeFormatterOptions
    ): String = js.native
    
    /**
      * Alias for .unitFormatter( unit, options )( value ).
      * @param {number} value The number to be formatted.
      * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
      * @param {UnitFormatterOptions} options form: [String] eg. "long", "short" or "narrow".
      * @returns {string} Returns the unit formatted.
      */
    def formatUnit(value: Double, unit: String): String = js.native
    def formatUnit(
      value: Double,
      unit: String,
      options: typings.globalize.unitMod.globalizeDistGlobalizeAugmentingMod.UnitFormatterOptions
    ): String = js.native
    
    /**
      * Return a function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
      * @param path String or Array containing the path of the message content, eg. "greetings/bye", or [ "greetings", "bye" ].
      * @returns {Function} Return A function that formats a message (using ICU message format pattern) given its path and a set of variables into a user-readable string. It supports pluralization and gender inflections.
      */
    def messageFormatter(path: String): js.Function1[/* variables */ js.UndefOr[String | js.Array[String] | js.Object], String] = js.native
    def messageFormatter(path: js.Array[String]): js.Function1[/* variables */ js.UndefOr[String | js.Array[String] | js.Object], String] = js.native
    
    /**
      * Return a function that formats a number according to the given options or locale's defaults.
      * @param {NumberFormatterOptions} options A JSON object including none or any of the following options.
      * style Optional String decimal (default), or percent.
      * minimumIntegerDigits Optional Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
      * minimumFractionDigits and maximumFractionDigits Optional Non-negative integer Number values indicating the minimum and maximum fraction digits to be used. Numbers will be rounded or padded with trailing zeroes if necessary. Either one or both of these properties must be present. If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
      * minimumSignificantDigits and maximumSignificantDigits Optional Positive integer Number values indicating the minimum and maximum fraction digits to be shown. Either none or both of these properties are present. If they are, they override minimum and maximum integer and fraction digits. The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
      * round Optional String with rounding method ceil, floor, round (default), or truncate.
      * useGrouping Optional Boolean (default is true) value indicating whether a grouping separator should be used.
      * @returns {Function} Return a function that formats a number according to the given options.
      */
    def numberFormatter(): js.Function1[/* value */ Double, String] = js.native
    def numberFormatter(options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions): js.Function1[/* value */ Double, String] = js.native
    
    /**
      * Return a function that parses a string representing a number according to the given options or locale's defaults.
      * @param {NumberParserOptions} options A JSON object including none or any of the following options.
      * style Optional String decimal (default), or percent.
      * @returns {Function} Return a function that parses a String representing a number according to the given options. If value is invalid, NaN is returned.
      */
    def numberParser(): js.Function1[/* value */ String, Double] = js.native
    def numberParser(options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions): js.Function1[/* value */ String, Double] = js.native
    
    /**
      * Alias for .dateParser( [options] )( value ).
      * @param {string} value The object whose module id you wish to determine.
      * @param {DateFormatterOptions} options The object whose module id you wish to determine.
      * @returns {Date} Return the value as a Date.
      */
    def parseDate(value: String): Date = js.native
    def parseDate(
      value: String,
      options: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatterOptions
    ): Date = js.native
    
    /**
      * A function that parses a string representing a number according to the given options or locale's defaults.
      * @param {string} value The number as string to parse
      * @param {NumberParserOptions} options A JSON object including none or any of the following options.
      * style Optional String decimal (default), or percent.
      * @returns {number} Return a number according to the given options. If value is invalid, NaN is returned.
      */
    def parseNumber(value: String): Double = js.native
    def parseNumber(
      value: String,
      options: typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions
    ): Double = js.native
    
    /**
      * Returns the value's corresponding plural group: zero, one, two, few, many, or other.
      * @param {number} value A Number for which to return the plural group.
      * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
      * type Optional String cardinal (default), or ordinal.
      * @returns {string} Returns the value's corresponding plural group: zero, one, two, few, many, or other.
      */
    def plural(value: Double): String = js.native
    def plural(
      value: Double,
      options: typings.globalize.pluralMod.globalizeDistGlobalizeAugmentingMod.PluralGeneratorOptions
    ): String = js.native
    
    /**
      * Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
      * The returned function is invoked with one argument: the Number value for which to return the plural group.
      * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
      * type Optional String cardinal (default), or ordinal.
      * @returns {Function} Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
      */
    def pluralGenerator(): js.Function1[/* value */ Double, String] = js.native
    def pluralGenerator(options: typings.globalize.pluralMod.globalizeDistGlobalizeAugmentingMod.PluralGeneratorOptions): js.Function1[/* value */ Double, String] = js.native
    
    /**
      * Returns a function that formats a relative time according to the given unit, options, and the default/instance locale.
      * The returned function is invoked with one argument: the number value to be formatted.
      * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
      * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
      * @returns {Function} Returns a function that formats a relative time according to the given unit.
      */
    def relativeTimeFormatter(unit: String): js.Function1[/* value */ Double, String] = js.native
    def relativeTimeFormatter(
      unit: String,
      options: typings.globalize.relativeTimeMod.globalizeDistGlobalizeAugmentingMod.RelativeTimeFormatterOptions
    ): js.Function1[/* value */ Double, String] = js.native
    
    /**
      * Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
      * The returned function is invoked with one argument: the number value to be formatted.
      * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
      * @param options form: [String] eg. "long", "short" or "narrow".
      * @returns {Function} Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
      */
    def unitFormatter(unit: String): js.Function1[/* value */ Double, String] = js.native
    def unitFormatter(
      unit: String,
      options: typings.globalize.unitMod.globalizeDistGlobalizeAugmentingMod.UnitFormatterOptions
    ): js.Function1[/* value */ Double, String] = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with Shared
       with /**
    * Create a Globalize instance.
    * @param cldr Cldr instance of the instance.
    * @returns {Globalize} A Globalize instance
    */
  /**
    * Create a Globalize instance.
    * @param {string} Locale string of the instance.
    * @returns {Globalize} A Globalize instance
    */
  Instantiable1[(/* cldr */ CldrStatic) | (/* locale */ String), Globalize] {
    
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def apply(cldr: CldrStatic): Globalize = js.native
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def apply(locale: String): Globalize = js.native
    
    /**
      * Globalize.load( json, ... )
      * @param {Object} [JSON]
      * Load resolved or unresolved cldr data.
      * Somewhat equivalent to previous Globalize.addCultureInfo(...).
      */
    def load(json: js.Object): Unit = js.native
    
    /**
      * Load messages data.
      * @param {Object} json JSON object of messages data. Keys can use any character, except /, { and }. Values (i.e., the message content itself) can contain any character.
      * @returns {void}
      */
    def loadMessages(json: js.Object): Unit = js.native
    
    /**
      * Globalize.loadTimeZone ( ianaTzData, ... )
      * This method allows you to load IANA time zone data to enable options.timeZone feature on date formatters and parsers.
      * @param {Object} ianaTzData A JSON object with zdumped IANA timezone data. Get the data via https://github.com/rxaviers/iana-tz-data
      */
    def loadTimeZone(ianaTzData: js.Object): Unit = js.native
    
    /**
      * Globalize.locale()
      * Return the default Cldr instance.
      */
    def locale(): CldrStatic = js.native
    /**
      * Globalize.locale( cldr )
      * @param {Cldr} cldr [Cldr instance]
      * Set default Cldr instance
      * Return the default Cldr instance.
      */
    def locale(cldr: CldrStatic): CldrStatic = js.native
    /**
      * Globalize.locale( [locale] )
      * @param {string} locale
      * Set default Cldr instance
      * Return the default Cldr instance.
      */
    def locale(locale: String): CldrStatic = js.native
  }
  
  trait UnitFormatterOptions extends StObject {
    
    /**
      * form: [String] eg. "long", "short" or "narrow".
      */
    var form: js.UndefOr[long | short | narrow] = js.undefined
    
    /**
      * numberFormatter: [Function] a number formatter function. Defaults to Globalize .numberFormatter() for the current locale using the default options.
      */
    var numberFormatter: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
      ] = js.undefined
  }
  object UnitFormatterOptions {
    
    inline def apply(): UnitFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitFormatterOptions]
    }
    
    extension [Self <: UnitFormatterOptions](x: Self) {
      
      inline def setForm(value: long | short | narrow): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setNumberFormatter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
      ): Self = StObject.set(x, "numberFormatter", value.asInstanceOf[js.Any])
      
      inline def setNumberFormatterUndefined: Self = StObject.set(x, "numberFormatter", js.undefined)
    }
  }
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `globalizeMod.foo` */
  override def _to: js.Object & Static = ^
}

package typings.globalize

import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrStatic
import typings.globalize.distGlobalizeMod.CommonNumberFormatterOptions
import typings.globalize.distGlobalizeMod.Shared
import typings.globalize.distGlobalizeMod.Static
import typings.globalize.globalizeStrings.decimal
import typings.globalize.globalizeStrings.full
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.medium
import typings.globalize.globalizeStrings.percent
import typings.globalize.globalizeStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlobalizeDateMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/date", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/date", JSImport.Namespace)
  @js.native
  open class Class protected ()
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
  
  type _To = js.Object & Static
  
  /* This means you don't have to write `^`, but can instead just say `distGlobalizeDateMod.foo` */
  override def _to: js.Object & Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    trait DateFormatPart extends StObject {
      
      var `type`: DateFormatPartTypes
      
      var value: String
    }
    object DateFormatPart {
      
      inline def apply(`type`: DateFormatPartTypes, value: String): DateFormatPart = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DateFormatPart]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DateFormatPart] (val x: Self) extends AnyVal {
        
        inline def setType(value: DateFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DateFormatterOptions] (val x: Self) extends AnyVal {
        
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
    
    trait NumberFormatPart extends StObject {
      
      var `type`: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPartTypes
      
      var value: String
    }
    object NumberFormatPart {
      
      inline def apply(
        `type`: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPartTypes,
        value: String
      ): NumberFormatPart = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NumberFormatPart]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NumberFormatPart] (val x: Self) extends AnyVal {
        
        inline def setType(
          value: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPartTypes
        ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.globalize.globalizeStrings.decimal
      - typings.globalize.globalizeStrings.fraction
      - typings.globalize.globalizeStrings.group
      - typings.globalize.globalizeStrings.infinity
      - typings.globalize.globalizeStrings.integer
      - typings.globalize.globalizeStrings.literal
      - typings.globalize.globalizeStrings.minusSign
      - typings.globalize.globalizeStrings.nan
      - typings.globalize.globalizeStrings.plusSign
      - typings.globalize.globalizeStrings.percentSign
      - typings.globalize.globalizeStrings.compact
    */
    trait NumberFormatPartTypes extends StObject
    object NumberFormatPartTypes {
      
      inline def compact: typings.globalize.globalizeStrings.compact = "compact".asInstanceOf[typings.globalize.globalizeStrings.compact]
      
      inline def decimal: typings.globalize.globalizeStrings.decimal = "decimal".asInstanceOf[typings.globalize.globalizeStrings.decimal]
      
      inline def fraction: typings.globalize.globalizeStrings.fraction = "fraction".asInstanceOf[typings.globalize.globalizeStrings.fraction]
      
      inline def group: typings.globalize.globalizeStrings.group = "group".asInstanceOf[typings.globalize.globalizeStrings.group]
      
      inline def infinity: typings.globalize.globalizeStrings.infinity = "infinity".asInstanceOf[typings.globalize.globalizeStrings.infinity]
      
      inline def integer: typings.globalize.globalizeStrings.integer = "integer".asInstanceOf[typings.globalize.globalizeStrings.integer]
      
      inline def literal: typings.globalize.globalizeStrings.literal = "literal".asInstanceOf[typings.globalize.globalizeStrings.literal]
      
      inline def minusSign: typings.globalize.globalizeStrings.minusSign = "minusSign".asInstanceOf[typings.globalize.globalizeStrings.minusSign]
      
      inline def nan: typings.globalize.globalizeStrings.nan = "nan".asInstanceOf[typings.globalize.globalizeStrings.nan]
      
      inline def percentSign: typings.globalize.globalizeStrings.percentSign = "percentSign".asInstanceOf[typings.globalize.globalizeStrings.percentSign]
      
      inline def plusSign: typings.globalize.globalizeStrings.plusSign = "plusSign".asInstanceOf[typings.globalize.globalizeStrings.plusSign]
    }
    
    trait NumberFormatterOptions
      extends StObject
         with CommonNumberFormatterOptions
         with typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NumberParserOptions] (val x: Self) extends AnyVal {
        
        inline def setStyle(value: decimal | percent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * .dateFormatter( options )
        * @param {DateFormatterOptions} options see date/expand_pattern for more info.
        * @returns {Function} Return a function that formats a date according to the given `options` and the default/instance locale.
        */
      def dateFormatter(): js.Function1[/* value */ js.Date, String] = js.native
      def dateFormatter(options: DateFormatterOptions): js.Function1[/* value */ js.Date, String] = js.native
      
      //Return a function that parses a string representing a date into a JavaScript Date object according to the given options. The default parsing assumes numeric year, month, and day (i.e., { skeleton: "yMd" }).
      def dateParser(): js.Function1[/* value */ String, js.Date] = js.native
      def dateParser(options: DateFormatterOptions): js.Function1[/* value */ String, js.Date] = js.native
      
      /**
        * .dateToPartsFormatter( options )
        * @param {DateFormatterOptions} options see date/expand_pattern for more info.
        * @returns {Function} Return a function that formats a date into parts tokens according to the given options. The default formatting is numeric year, month, and day (i.e., `{ skeleton: "yMd" }`).
        */
      def dateToPartsFormatter(): js.Function1[/* value */ js.Date, js.Array[DateFormatPart]] = js.native
      def dateToPartsFormatter(options: DateFormatterOptions): js.Function1[/* value */ js.Date, js.Array[DateFormatPart]] = js.native
      
      //Alias for .dateFormatter( [options] )( value ).
      def formatDate(value: js.Date): String = js.native
      def formatDate(value: js.Date, options: DateFormatterOptions): String = js.native
      
      //Alias for .dateToPartsFormatter( [options] )( value ).
      def formatDateToParts(value: js.Date): js.Array[DateFormatPart] = js.native
      def formatDateToParts(value: js.Date, options: DateFormatterOptions): js.Array[DateFormatPart] = js.native
      
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
        options: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions
      ): String = js.native
      
      // Alias for .numberToPartsFormatter( [options] )( value ).
      def formatNumberToParts(value: Double): js.Array[
            typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPart
          ] = js.native
      def formatNumberToParts(
        value: Double,
        options: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions
      ): js.Array[
            typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPart
          ] = js.native
      
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
      def numberFormatter(
        options: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions
      ): js.Function1[/* value */ Double, String] = js.native
      
      /**
        * Return a function that parses a string representing a number according to the given options or locale's defaults.
        * @param {NumberParserOptions} options A JSON object including none or any of the following options.
        * style Optional String decimal (default), or percent.
        * @returns {Function} Return a function that parses a String representing a number according to the given options. If value is invalid, NaN is returned.
        */
      def numberParser(): js.Function1[/* value */ String, Double] = js.native
      def numberParser(
        options: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions
      ): js.Function1[/* value */ String, Double] = js.native
      
      /**
        * Return a function that formats a number into parts tokens according to the given options.
        * @param {NumberFormatterOptions} options A JSON object including none or any of the following options.
        * style Optional String decimal (default), or percent.
        * minimumIntegerDigits Optional Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
        * minimumFractionDigits and maximumFractionDigits Optional Non-negative integer Number values indicating the minimum and maximum fraction digits to be used. Numbers will be rounded or padded with trailing zeroes if necessary. Either one or both of these properties must be present. If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
        * minimumSignificantDigits and maximumSignificantDigits Optional Positive integer Number values indicating the minimum and maximum fraction digits to be shown. Either none or both of these properties are present. If they are, they override minimum and maximum integer and fraction digits. The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
        * round Optional String with rounding method ceil, floor, round (default), or truncate.
        * useGrouping Optional Boolean (default is true) value indicating whether a grouping separator should be used.
        * @returns {Function} Return a function that formats a number into parts tokens according to the given options.
        */
      def numberToPartsFormatter(): js.Function1[
            /* value */ Double, 
            js.Array[
              typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPart
            ]
          ] = js.native
      def numberToPartsFormatter(
        options: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatterOptions
      ): js.Function1[
            /* value */ Double, 
            js.Array[
              typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberFormatPart
            ]
          ] = js.native
      
      /**
        * Alias for .dateParser( [options] )( value ).
        * @param {string} value The object whose module id you wish to determine.
        * @param {DateFormatterOptions} options The object whose module id you wish to determine.
        * @returns {Date} Return the value as a Date.
        */
      def parseDate(value: String): js.Date = js.native
      def parseDate(value: String, options: DateFormatterOptions): js.Date = js.native
      
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
        options: typings.globalize.distGlobalizeNumberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions
      ): Double = js.native
    }
    
    trait Static extends StObject {
      
      /**
        * Globalize.loadTimeZone ( ianaTzData, ... )
        * This method allows you to load IANA time zone data to enable options.timeZone feature on date formatters and parsers.
        * @param {Object} ianaTzData A JSON object with zdumped IANA timezone data. Get the data via https://github.com/rxaviers/iana-tz-data
        */
      def loadTimeZone(ianaTzData: js.Object): Unit
    }
    object Static {
      
      inline def apply(loadTimeZone: js.Object => Unit): typings.globalize.distGlobalizeDateMod.globalizeDistGlobalizeAugmentingMod.Static = {
        val __obj = js.Dynamic.literal(loadTimeZone = js.Any.fromFunction1(loadTimeZone))
        __obj.asInstanceOf[typings.globalize.distGlobalizeDateMod.globalizeDistGlobalizeAugmentingMod.Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.globalize.distGlobalizeDateMod.globalizeDistGlobalizeAugmentingMod.Static] (val x: Self) extends AnyVal {
        
        inline def setLoadTimeZone(value: js.Object => Unit): Self = StObject.set(x, "loadTimeZone", js.Any.fromFunction1(value))
      }
    }
  }
}

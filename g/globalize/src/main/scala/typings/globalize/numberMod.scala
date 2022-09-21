package typings.globalize

import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.mod.CldrStatic
import typings.globalize.globalizeMod.CommonNumberFormatterOptions
import typings.globalize.globalizeMod.Shared
import typings.globalize.globalizeMod.Static
import typings.globalize.globalizeStrings.decimal
import typings.globalize.globalizeStrings.percent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/number", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/number", JSImport.Namespace)
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
  
  /* This means you don't have to write `^`, but can instead just say `numberMod.foo` */
  override def _to: js.Object & Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    trait NumberFormatPart extends StObject {
      
      var `type`: NumberFormatPartTypes
      
      var value: String
    }
    object NumberFormatPart {
      
      inline def apply(`type`: NumberFormatPartTypes, value: String): NumberFormatPart = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NumberFormatPart]
      }
      
      extension [Self <: NumberFormatPart](x: Self) {
        
        inline def setType(value: NumberFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
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
         with NumberParserOptions
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
    
    @js.native
    trait Shared extends StObject {
      
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
      def formatNumber(value: Double, options: NumberFormatterOptions): String = js.native
      
      // Alias for .numberToPartsFormatter( [options] )( value ).
      def formatNumberToParts(value: Double): js.Array[NumberFormatPart] = js.native
      def formatNumberToParts(value: Double, options: NumberFormatterOptions): js.Array[NumberFormatPart] = js.native
      
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
      def numberFormatter(options: NumberFormatterOptions): js.Function1[/* value */ Double, String] = js.native
      
      /**
        * Return a function that parses a string representing a number according to the given options or locale's defaults.
        * @param {NumberParserOptions} options A JSON object including none or any of the following options.
        * style Optional String decimal (default), or percent.
        * @returns {Function} Return a function that parses a String representing a number according to the given options. If value is invalid, NaN is returned.
        */
      def numberParser(): js.Function1[/* value */ String, Double] = js.native
      def numberParser(options: NumberParserOptions): js.Function1[/* value */ String, Double] = js.native
      
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
      def numberToPartsFormatter(): js.Function1[/* value */ Double, js.Array[NumberFormatPart]] = js.native
      def numberToPartsFormatter(options: NumberFormatterOptions): js.Function1[/* value */ Double, js.Array[NumberFormatPart]] = js.native
      
      /**
        * A function that parses a string representing a number according to the given options or locale's defaults.
        * @param {string} value The number as string to parse
        * @param {NumberParserOptions} options A JSON object including none or any of the following options.
        * style Optional String decimal (default), or percent.
        * @returns {number} Return a number according to the given options. If value is invalid, NaN is returned.
        */
      def parseNumber(value: String): Double = js.native
      def parseNumber(value: String, options: NumberParserOptions): Double = js.native
    }
  }
}

package typings.excelStyleDataformatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("excel-style-dataformatter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataFormatter {
    def this(options: FormatterOptions) = this()
  }
  
  @js.native
  trait DataFormatter extends StObject {
    
    /**
      * Defines locales
      * @param  locales
      */
    def defineLocales(locales: js.Array[LocalesOptions]): Unit = js.native
    
    /**
      * Format a value
      * @param value
      * @param type value type
      * @param format format preset
      */
    def format(value: Any, `type`: String, format: String): FormatResult = js.native
    
    /**
      * Sets locale
      * If locale doesn't exist, sets default
      * @param locale
      */
    def setLocale(locale: String): Unit = js.native
    
    /**
      * Sets UTC offset for dates
      * @param offset in minutes
      */
    def setUTCOffset(): Unit = js.native
    def setUTCOffset(offset: Double): Unit = js.native
  }
  
  trait FormatResult extends StObject {
    
    var align: String
    
    var color: String
    
    var pattern: String
    
    var value: String
  }
  object FormatResult {
    
    inline def apply(align: String, color: String, pattern: String, value: String): FormatResult = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatResult]
    }
    
    extension [Self <: FormatResult](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatterOptions extends StObject {
    
    var UTCOffset: js.UndefOr[Double | Null] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[LocalesOptions]] = js.undefined
    
    var transformCode: js.UndefOr[js.Function1[/* code */ Any, Any]] = js.undefined
  }
  object FormatterOptions {
    
    inline def apply(): FormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatterOptions]
    }
    
    extension [Self <: FormatterOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[LocalesOptions]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: LocalesOptions*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setTransformCode(value: /* code */ Any => Any): Self = StObject.set(x, "transformCode", js.Any.fromFunction1(value))
      
      inline def setTransformCodeUndefined: Self = StObject.set(x, "transformCode", js.undefined)
      
      inline def setUTCOffset(value: Double): Self = StObject.set(x, "UTCOffset", value.asInstanceOf[js.Any])
      
      inline def setUTCOffsetNull: Self = StObject.set(x, "UTCOffset", null)
      
      inline def setUTCOffsetUndefined: Self = StObject.set(x, "UTCOffset", js.undefined)
    }
  }
  
  trait LocalesOptions extends StObject {
    
    var days: js.Array[String]
    
    var daysShort: js.Array[String]
    
    var decimalSeparator: String
    
    var formats: StringDictionary[String]
    
    var months: js.Array[String]
    
    var monthsShort: js.Array[String]
    
    var name: String
    
    var thousandSeparator: String
  }
  object LocalesOptions {
    
    inline def apply(
      days: js.Array[String],
      daysShort: js.Array[String],
      decimalSeparator: String,
      formats: StringDictionary[String],
      months: js.Array[String],
      monthsShort: js.Array[String],
      name: String,
      thousandSeparator: String
    ): LocalesOptions = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysShort = daysShort.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thousandSeparator = thousandSeparator.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalesOptions]
    }
    
    extension [Self <: LocalesOptions](x: Self) {
      
      inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysShort(value: js.Array[String]): Self = StObject.set(x, "daysShort", value.asInstanceOf[js.Any])
      
      inline def setDaysShortVarargs(value: String*): Self = StObject.set(x, "daysShort", js.Array(value*))
      
      inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setFormats(value: StringDictionary[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setThousandSeparator(value: String): Self = StObject.set(x, "thousandSeparator", value.asInstanceOf[js.Any])
    }
  }
}

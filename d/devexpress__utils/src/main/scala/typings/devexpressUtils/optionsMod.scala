package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait IDateFormatterOptions extends StObject {
    
    var abbrDayNames: js.Array[String] = js.native
    
    var abbrMonthNames: js.Array[String] = js.native
    
    var am: String = js.native
    
    var dayNames: js.Array[String] = js.native
    
    var ds: String = js.native
    
    var genMonthNames: js.Array[String] = js.native
    
    var longDate: String = js.native
    
    var longTime: String = js.native
    
    var monthDay: String = js.native
    
    var monthNames: js.Array[String] = js.native
    
    var pm: String = js.native
    
    var shortDate: String = js.native
    
    var shortTime: String = js.native
    
    var ts: String = js.native
    
    var twoDigitYearMax: Double = js.native
    
    var yearMonth: String = js.native
  }
  object IDateFormatterOptions {
    
    @scala.inline
    def apply(
      abbrDayNames: js.Array[String],
      abbrMonthNames: js.Array[String],
      am: String,
      dayNames: js.Array[String],
      ds: String,
      genMonthNames: js.Array[String],
      longDate: String,
      longTime: String,
      monthDay: String,
      monthNames: js.Array[String],
      pm: String,
      shortDate: String,
      shortTime: String,
      ts: String,
      twoDigitYearMax: Double,
      yearMonth: String
    ): IDateFormatterOptions = {
      val __obj = js.Dynamic.literal(abbrDayNames = abbrDayNames.asInstanceOf[js.Any], abbrMonthNames = abbrMonthNames.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], ds = ds.asInstanceOf[js.Any], genMonthNames = genMonthNames.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], monthDay = monthDay.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any], yearMonth = yearMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateFormatterOptions]
    }
    
    @scala.inline
    implicit class IDateFormatterOptionsMutableBuilder[Self <: IDateFormatterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbrDayNames(value: js.Array[String]): Self = StObject.set(x, "abbrDayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrDayNamesVarargs(value: String*): Self = StObject.set(x, "abbrDayNames", js.Array(value :_*))
      
      @scala.inline
      def setAbbrMonthNames(value: js.Array[String]): Self = StObject.set(x, "abbrMonthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrMonthNamesVarargs(value: String*): Self = StObject.set(x, "abbrMonthNames", js.Array(value :_*))
      
      @scala.inline
      def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      @scala.inline
      def setDs(value: String): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenMonthNames(value: js.Array[String]): Self = StObject.set(x, "genMonthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenMonthNamesVarargs(value: String*): Self = StObject.set(x, "genMonthNames", js.Array(value :_*))
      
      @scala.inline
      def setLongDate(value: String): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongTime(value: String): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthDay(value: String): Self = StObject.set(x, "monthDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      @scala.inline
      def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDate(value: String): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortTime(value: String): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearMonth(value: String): Self = StObject.set(x, "yearMonth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFormattersOptions
    extends IDateFormatterOptions
       with INumberFormatterOptions
  object IFormattersOptions {
    
    @scala.inline
    def apply(
      abbrDayNames: js.Array[String],
      abbrMonthNames: js.Array[String],
      am: String,
      currDecimalPoint: String,
      currGroupSeparator: String,
      currGroups: js.Array[Double],
      currNegPattern: Double,
      currPosPattern: Double,
      currPrec: Double,
      currency: String,
      dayNames: js.Array[String],
      ds: String,
      genMonthNames: js.Array[String],
      longDate: String,
      longTime: String,
      monthDay: String,
      monthNames: js.Array[String],
      numDecimalPoint: String,
      numGroupSeparator: String,
      numGroups: js.Array[Double],
      numNan: String,
      numNegInf: String,
      numNegPattern: Double,
      numPosInf: String,
      numPrec: Double,
      percentPattern: Double,
      pm: String,
      shortDate: String,
      shortTime: String,
      ts: String,
      twoDigitYearMax: Double,
      yearMonth: String
    ): IFormattersOptions = {
      val __obj = js.Dynamic.literal(abbrDayNames = abbrDayNames.asInstanceOf[js.Any], abbrMonthNames = abbrMonthNames.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], currDecimalPoint = currDecimalPoint.asInstanceOf[js.Any], currGroupSeparator = currGroupSeparator.asInstanceOf[js.Any], currGroups = currGroups.asInstanceOf[js.Any], currNegPattern = currNegPattern.asInstanceOf[js.Any], currPosPattern = currPosPattern.asInstanceOf[js.Any], currPrec = currPrec.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], ds = ds.asInstanceOf[js.Any], genMonthNames = genMonthNames.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], monthDay = monthDay.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], numDecimalPoint = numDecimalPoint.asInstanceOf[js.Any], numGroupSeparator = numGroupSeparator.asInstanceOf[js.Any], numGroups = numGroups.asInstanceOf[js.Any], numNan = numNan.asInstanceOf[js.Any], numNegInf = numNegInf.asInstanceOf[js.Any], numNegPattern = numNegPattern.asInstanceOf[js.Any], numPosInf = numPosInf.asInstanceOf[js.Any], numPrec = numPrec.asInstanceOf[js.Any], percentPattern = percentPattern.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any], yearMonth = yearMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormattersOptions]
    }
  }
  
  @js.native
  trait INumberFormatterOptions extends StObject {
    
    var currDecimalPoint: String = js.native
    
    var currGroupSeparator: String = js.native
    
    var currGroups: js.Array[Double] = js.native
    
    var currNegPattern: Double = js.native
    
    var currPosPattern: Double = js.native
    
    var currPrec: Double = js.native
    
    var currency: String = js.native
    
    var numDecimalPoint: String = js.native
    
    var numGroupSeparator: String = js.native
    
    var numGroups: js.Array[Double] = js.native
    
    var numNan: String = js.native
    
    var numNegInf: String = js.native
    
    var numNegPattern: Double = js.native
    
    var numPosInf: String = js.native
    
    var numPrec: Double = js.native
    
    var percentPattern: Double = js.native
  }
  object INumberFormatterOptions {
    
    @scala.inline
    def apply(
      currDecimalPoint: String,
      currGroupSeparator: String,
      currGroups: js.Array[Double],
      currNegPattern: Double,
      currPosPattern: Double,
      currPrec: Double,
      currency: String,
      numDecimalPoint: String,
      numGroupSeparator: String,
      numGroups: js.Array[Double],
      numNan: String,
      numNegInf: String,
      numNegPattern: Double,
      numPosInf: String,
      numPrec: Double,
      percentPattern: Double
    ): INumberFormatterOptions = {
      val __obj = js.Dynamic.literal(currDecimalPoint = currDecimalPoint.asInstanceOf[js.Any], currGroupSeparator = currGroupSeparator.asInstanceOf[js.Any], currGroups = currGroups.asInstanceOf[js.Any], currNegPattern = currNegPattern.asInstanceOf[js.Any], currPosPattern = currPosPattern.asInstanceOf[js.Any], currPrec = currPrec.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], numDecimalPoint = numDecimalPoint.asInstanceOf[js.Any], numGroupSeparator = numGroupSeparator.asInstanceOf[js.Any], numGroups = numGroups.asInstanceOf[js.Any], numNan = numNan.asInstanceOf[js.Any], numNegInf = numNegInf.asInstanceOf[js.Any], numNegPattern = numNegPattern.asInstanceOf[js.Any], numPosInf = numPosInf.asInstanceOf[js.Any], numPrec = numPrec.asInstanceOf[js.Any], percentPattern = percentPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[INumberFormatterOptions]
    }
    
    @scala.inline
    implicit class INumberFormatterOptionsMutableBuilder[Self <: INumberFormatterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrDecimalPoint(value: String): Self = StObject.set(x, "currDecimalPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrGroupSeparator(value: String): Self = StObject.set(x, "currGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrGroups(value: js.Array[Double]): Self = StObject.set(x, "currGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrGroupsVarargs(value: Double*): Self = StObject.set(x, "currGroups", js.Array(value :_*))
      
      @scala.inline
      def setCurrNegPattern(value: Double): Self = StObject.set(x, "currNegPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrPosPattern(value: Double): Self = StObject.set(x, "currPosPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrPrec(value: Double): Self = StObject.set(x, "currPrec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDecimalPoint(value: String): Self = StObject.set(x, "numDecimalPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumGroupSeparator(value: String): Self = StObject.set(x, "numGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumGroups(value: js.Array[Double]): Self = StObject.set(x, "numGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumGroupsVarargs(value: Double*): Self = StObject.set(x, "numGroups", js.Array(value :_*))
      
      @scala.inline
      def setNumNan(value: String): Self = StObject.set(x, "numNan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumNegInf(value: String): Self = StObject.set(x, "numNegInf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumNegPattern(value: Double): Self = StObject.set(x, "numNegPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumPosInf(value: String): Self = StObject.set(x, "numPosInf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumPrec(value: Double): Self = StObject.set(x, "numPrec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentPattern(value: Double): Self = StObject.set(x, "percentPattern", value.asInstanceOf[js.Any])
    }
  }
}

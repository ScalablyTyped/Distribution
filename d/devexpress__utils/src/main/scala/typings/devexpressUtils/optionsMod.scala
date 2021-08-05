package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait IDateFormatterOptions extends StObject {
    
    var abbrDayNames: js.Array[String]
    
    var abbrMonthNames: js.Array[String]
    
    var am: String
    
    var dayNames: js.Array[String]
    
    var ds: String
    
    var genMonthNames: js.Array[String]
    
    var longDate: String
    
    var longTime: String
    
    var monthDay: String
    
    var monthNames: js.Array[String]
    
    var pm: String
    
    var shortDate: String
    
    var shortTime: String
    
    var ts: String
    
    var twoDigitYearMax: Double
    
    var yearMonth: String
  }
  object IDateFormatterOptions {
    
    inline def apply(
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
    
    extension [Self <: IDateFormatterOptions](x: Self) {
      
      inline def setAbbrDayNames(value: js.Array[String]): Self = StObject.set(x, "abbrDayNames", value.asInstanceOf[js.Any])
      
      inline def setAbbrDayNamesVarargs(value: String*): Self = StObject.set(x, "abbrDayNames", js.Array(value :_*))
      
      inline def setAbbrMonthNames(value: js.Array[String]): Self = StObject.set(x, "abbrMonthNames", value.asInstanceOf[js.Any])
      
      inline def setAbbrMonthNamesVarargs(value: String*): Self = StObject.set(x, "abbrMonthNames", js.Array(value :_*))
      
      inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
      
      inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      inline def setDs(value: String): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
      
      inline def setGenMonthNames(value: js.Array[String]): Self = StObject.set(x, "genMonthNames", value.asInstanceOf[js.Any])
      
      inline def setGenMonthNamesVarargs(value: String*): Self = StObject.set(x, "genMonthNames", js.Array(value :_*))
      
      inline def setLongDate(value: String): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
      
      inline def setLongTime(value: String): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
      
      inline def setMonthDay(value: String): Self = StObject.set(x, "monthDay", value.asInstanceOf[js.Any])
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
      
      inline def setShortDate(value: String): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
      
      inline def setShortTime(value: String): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
      
      inline def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
      
      inline def setYearMonth(value: String): Self = StObject.set(x, "yearMonth", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFormattersOptions
    extends StObject
       with IDateFormatterOptions
       with INumberFormatterOptions
  object IFormattersOptions {
    
    inline def apply(
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
  
  trait INumberFormatterOptions extends StObject {
    
    var currDecimalPoint: String
    
    var currGroupSeparator: String
    
    var currGroups: js.Array[Double]
    
    var currNegPattern: Double
    
    var currPosPattern: Double
    
    var currPrec: Double
    
    var currency: String
    
    var numDecimalPoint: String
    
    var numGroupSeparator: String
    
    var numGroups: js.Array[Double]
    
    var numNan: String
    
    var numNegInf: String
    
    var numNegPattern: Double
    
    var numPosInf: String
    
    var numPrec: Double
    
    var percentPattern: Double
  }
  object INumberFormatterOptions {
    
    inline def apply(
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
    
    extension [Self <: INumberFormatterOptions](x: Self) {
      
      inline def setCurrDecimalPoint(value: String): Self = StObject.set(x, "currDecimalPoint", value.asInstanceOf[js.Any])
      
      inline def setCurrGroupSeparator(value: String): Self = StObject.set(x, "currGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setCurrGroups(value: js.Array[Double]): Self = StObject.set(x, "currGroups", value.asInstanceOf[js.Any])
      
      inline def setCurrGroupsVarargs(value: Double*): Self = StObject.set(x, "currGroups", js.Array(value :_*))
      
      inline def setCurrNegPattern(value: Double): Self = StObject.set(x, "currNegPattern", value.asInstanceOf[js.Any])
      
      inline def setCurrPosPattern(value: Double): Self = StObject.set(x, "currPosPattern", value.asInstanceOf[js.Any])
      
      inline def setCurrPrec(value: Double): Self = StObject.set(x, "currPrec", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setNumDecimalPoint(value: String): Self = StObject.set(x, "numDecimalPoint", value.asInstanceOf[js.Any])
      
      inline def setNumGroupSeparator(value: String): Self = StObject.set(x, "numGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setNumGroups(value: js.Array[Double]): Self = StObject.set(x, "numGroups", value.asInstanceOf[js.Any])
      
      inline def setNumGroupsVarargs(value: Double*): Self = StObject.set(x, "numGroups", js.Array(value :_*))
      
      inline def setNumNan(value: String): Self = StObject.set(x, "numNan", value.asInstanceOf[js.Any])
      
      inline def setNumNegInf(value: String): Self = StObject.set(x, "numNegInf", value.asInstanceOf[js.Any])
      
      inline def setNumNegPattern(value: Double): Self = StObject.set(x, "numNegPattern", value.asInstanceOf[js.Any])
      
      inline def setNumPosInf(value: String): Self = StObject.set(x, "numPosInf", value.asInstanceOf[js.Any])
      
      inline def setNumPrec(value: Double): Self = StObject.set(x, "numPrec", value.asInstanceOf[js.Any])
      
      inline def setPercentPattern(value: Double): Self = StObject.set(x, "percentPattern", value.asInstanceOf[js.Any])
    }
  }
}

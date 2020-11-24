package typings.devexpressUtils.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

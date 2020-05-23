package typings.floreal.dateMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlorealDate extends js.Object {
  def day(): Double
  def dayName(): String
  def dayOfDecade(): Double
  def dayOfMonth(): Double
  def dayOfWeek(): Double
  def dayOfYear(): Double
  def dayTitle(): String
  def decade(): Double
  def firstDayOfYear(): Date
  def isComplementaryDay(): Boolean
  def isYearSextile(): Boolean
  def month(): Double
  def monthName(): String
  def setDate(year: Double, month: Double, day: Double): Unit
  def setDay(day: Double): Unit
  def setMonth(month: Double): Unit
  def setYear(year: String): Unit
  def setYearDecimal(year: Double): Unit
  def toFullDateString(): String
  def toShortDateString(): String
  def year(): String
  def yearDecimal(): Double
}

object FlorealDate {
  @scala.inline
  def apply(
    day: () => Double,
    dayName: () => String,
    dayOfDecade: () => Double,
    dayOfMonth: () => Double,
    dayOfWeek: () => Double,
    dayOfYear: () => Double,
    dayTitle: () => String,
    decade: () => Double,
    firstDayOfYear: () => Date,
    isComplementaryDay: () => Boolean,
    isYearSextile: () => Boolean,
    month: () => Double,
    monthName: () => String,
    setDate: (Double, Double, Double) => Unit,
    setDay: Double => Unit,
    setMonth: Double => Unit,
    setYear: String => Unit,
    setYearDecimal: Double => Unit,
    toFullDateString: () => String,
    toShortDateString: () => String,
    year: () => String,
    yearDecimal: () => Double
  ): FlorealDate = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), dayName = js.Any.fromFunction0(dayName), dayOfDecade = js.Any.fromFunction0(dayOfDecade), dayOfMonth = js.Any.fromFunction0(dayOfMonth), dayOfWeek = js.Any.fromFunction0(dayOfWeek), dayOfYear = js.Any.fromFunction0(dayOfYear), dayTitle = js.Any.fromFunction0(dayTitle), decade = js.Any.fromFunction0(decade), firstDayOfYear = js.Any.fromFunction0(firstDayOfYear), isComplementaryDay = js.Any.fromFunction0(isComplementaryDay), isYearSextile = js.Any.fromFunction0(isYearSextile), month = js.Any.fromFunction0(month), monthName = js.Any.fromFunction0(monthName), setDate = js.Any.fromFunction3(setDate), setDay = js.Any.fromFunction1(setDay), setMonth = js.Any.fromFunction1(setMonth), setYear = js.Any.fromFunction1(setYear), setYearDecimal = js.Any.fromFunction1(setYearDecimal), toFullDateString = js.Any.fromFunction0(toFullDateString), toShortDateString = js.Any.fromFunction0(toShortDateString), year = js.Any.fromFunction0(year), yearDecimal = js.Any.fromFunction0(yearDecimal))
    __obj.asInstanceOf[FlorealDate]
  }
}


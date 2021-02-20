package typings.floreal

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("floreal/date", JSImport.Namespace)
  @js.native
  class ^ () extends FlorealDate {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  @JSImport("floreal/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("floreal/date", "day_names")
  @js.native
  def dayNames: js.Array[String] = js.native
  
  @scala.inline
  def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_names")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("floreal/date", "first_day_of_year")
  @js.native
  def firstDayOfYear(year: js.Any): js.Any = js.native
  
  @js.native
  trait FlorealDate extends StObject {
    
    def day(): Double = js.native
    
    def dayName(): String = js.native
    
    def dayOfDecade(): Double = js.native
    
    def dayOfMonth(): Double = js.native
    
    def dayOfWeek(): Double = js.native
    
    def dayOfYear(): Double = js.native
    
    def dayTitle(): String = js.native
    
    def decade(): Double = js.native
    
    def firstDayOfYear(): Date = js.native
    
    def isComplementaryDay(): Boolean = js.native
    
    def isYearSextile(): Boolean = js.native
    
    def month(): Double = js.native
    
    def monthName(): String = js.native
    
    def setDate(year: Double, month: Double, day: Double): Unit = js.native
    
    def setDay(day: Double): Unit = js.native
    
    def setMonth(month: Double): Unit = js.native
    
    def setYear(year: String): Unit = js.native
    
    def setYearDecimal(year: Double): Unit = js.native
    
    def toFullDateString(): String = js.native
    
    def toShortDateString(): String = js.native
    
    def year(): String = js.native
    
    def yearDecimal(): Double = js.native
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
    
    @scala.inline
    implicit class FlorealDateMutableBuilder[Self <: FlorealDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: () => Double): Self = StObject.set(x, "day", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDayName(value: () => String): Self = StObject.set(x, "dayName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDayOfDecade(value: () => Double): Self = StObject.set(x, "dayOfDecade", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDayOfMonth(value: () => Double): Self = StObject.set(x, "dayOfMonth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDayOfWeek(value: () => Double): Self = StObject.set(x, "dayOfWeek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDayOfYear(value: () => Double): Self = StObject.set(x, "dayOfYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDayTitle(value: () => String): Self = StObject.set(x, "dayTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDecade(value: () => Double): Self = StObject.set(x, "decade", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFirstDayOfYear(value: () => Date): Self = StObject.set(x, "firstDayOfYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsComplementaryDay(value: () => Boolean): Self = StObject.set(x, "isComplementaryDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsYearSextile(value: () => Boolean): Self = StObject.set(x, "isYearSextile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMonth(value: () => Double): Self = StObject.set(x, "month", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMonthName(value: () => String): Self = StObject.set(x, "monthName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetDay(value: Double => Unit): Self = StObject.set(x, "setDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMonth(value: Double => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetYear(value: String => Unit): Self = StObject.set(x, "setYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetYearDecimal(value: Double => Unit): Self = StObject.set(x, "setYearDecimal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToFullDateString(value: () => String): Self = StObject.set(x, "toFullDateString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToShortDateString(value: () => String): Self = StObject.set(x, "toShortDateString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setYear(value: () => String): Self = StObject.set(x, "year", js.Any.fromFunction0(value))
      
      @scala.inline
      def setYearDecimal(value: () => Double): Self = StObject.set(x, "yearDecimal", js.Any.fromFunction0(value))
    }
  }
}

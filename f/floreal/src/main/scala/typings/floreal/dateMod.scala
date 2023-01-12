package typings.floreal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("floreal/date", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FlorealDate {
    def this(value: String) = this()
    def this(value: js.Date) = this()
    def this(value: Double) = this()
    
    /* CompleteClass */
    override def day(): Double = js.native
    
    /* CompleteClass */
    override def dayName(): String = js.native
    
    /* CompleteClass */
    override def dayOfDecade(): Double = js.native
    
    /* CompleteClass */
    override def dayOfMonth(): Double = js.native
    
    /* CompleteClass */
    override def dayOfWeek(): Double = js.native
    
    /* CompleteClass */
    override def dayOfYear(): Double = js.native
    
    /* CompleteClass */
    override def dayTitle(): String = js.native
    
    /* CompleteClass */
    override def decade(): Double = js.native
    
    /* CompleteClass */
    override def firstDayOfYear(): js.Date = js.native
    
    /* CompleteClass */
    override def isComplementaryDay(): Boolean = js.native
    
    /* CompleteClass */
    override def isYearSextile(): Boolean = js.native
    
    /* CompleteClass */
    override def month(): Double = js.native
    
    /* CompleteClass */
    override def monthName(): String = js.native
    
    /* CompleteClass */
    override def setDate(year: Double, month: Double, day: Double): Unit = js.native
    
    /* CompleteClass */
    override def setDay(day: Double): Unit = js.native
    
    /* CompleteClass */
    override def setMonth(month: Double): Unit = js.native
    
    /* CompleteClass */
    override def setYear(year: String): Unit = js.native
    
    /* CompleteClass */
    override def setYearDecimal(year: Double): Unit = js.native
    
    /* CompleteClass */
    override def toDateString(): String = js.native
    /* CompleteClass */
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def toFullDateString(): String = js.native
    
    /* CompleteClass */
    override def toShortDateString(): String = js.native
    
    /* CompleteClass */
    @JSName("toString")
    var toString_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def year(): String = js.native
    
    /* CompleteClass */
    override def yearDecimal(): Double = js.native
  }
  @JSImport("floreal/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("floreal/date", "day_names")
  @js.native
  def dayNames: js.Array[String] = js.native
  
  inline def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_names")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def firstDayOfYear(year: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first_day_of_year")(year.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait FlorealDate extends StObject {
    
    def day(): Double
    
    def dayName(): String
    
    def dayOfDecade(): Double
    
    def dayOfMonth(): Double
    
    def dayOfWeek(): Double
    
    def dayOfYear(): Double
    
    def dayTitle(): String
    
    def decade(): Double
    
    def firstDayOfYear(): js.Date
    
    def isComplementaryDay(): Boolean
    
    def isYearSextile(): Boolean
    
    def month(): Double
    
    def monthName(): String
    
    def setDate(year: Double, month: Double, day: Double): Unit
    
    def setDay(day: Double): Unit
    
    def setMonth(month: Double): Unit
    
    def setYear(year: String): Unit
    
    def setYearDecimal(year: Double): Unit
    
    def toDateString(): String
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String]
    
    def toFullDateString(): String
    
    def toShortDateString(): String
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    def year(): String
    
    def yearDecimal(): Double
  }
  object FlorealDate {
    
    inline def apply(
      day: () => Double,
      dayName: () => String,
      dayOfDecade: () => Double,
      dayOfMonth: () => Double,
      dayOfWeek: () => Double,
      dayOfYear: () => Double,
      dayTitle: () => String,
      decade: () => Double,
      firstDayOfYear: () => js.Date,
      isComplementaryDay: () => Boolean,
      isYearSextile: () => Boolean,
      month: () => Double,
      monthName: () => String,
      setDate: (Double, Double, Double) => Unit,
      setDay: Double => Unit,
      setMonth: Double => Unit,
      setYear: String => Unit,
      setYearDecimal: Double => Unit,
      toDateString: () => String,
      toFullDateString: () => String,
      toShortDateString: () => String,
      toString_ : () => String,
      year: () => String,
      yearDecimal: () => Double
    ): FlorealDate = {
      val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), dayName = js.Any.fromFunction0(dayName), dayOfDecade = js.Any.fromFunction0(dayOfDecade), dayOfMonth = js.Any.fromFunction0(dayOfMonth), dayOfWeek = js.Any.fromFunction0(dayOfWeek), dayOfYear = js.Any.fromFunction0(dayOfYear), dayTitle = js.Any.fromFunction0(dayTitle), decade = js.Any.fromFunction0(decade), firstDayOfYear = js.Any.fromFunction0(firstDayOfYear), isComplementaryDay = js.Any.fromFunction0(isComplementaryDay), isYearSextile = js.Any.fromFunction0(isYearSextile), month = js.Any.fromFunction0(month), monthName = js.Any.fromFunction0(monthName), setDate = js.Any.fromFunction3(setDate), setDay = js.Any.fromFunction1(setDay), setMonth = js.Any.fromFunction1(setMonth), setYear = js.Any.fromFunction1(setYear), setYearDecimal = js.Any.fromFunction1(setYearDecimal), toDateString = js.Any.fromFunction0(toDateString), toFullDateString = js.Any.fromFunction0(toFullDateString), toShortDateString = js.Any.fromFunction0(toShortDateString), year = js.Any.fromFunction0(year), yearDecimal = js.Any.fromFunction0(yearDecimal))
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[FlorealDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlorealDate] (val x: Self) extends AnyVal {
      
      inline def setDay(value: () => Double): Self = StObject.set(x, "day", js.Any.fromFunction0(value))
      
      inline def setDayName(value: () => String): Self = StObject.set(x, "dayName", js.Any.fromFunction0(value))
      
      inline def setDayOfDecade(value: () => Double): Self = StObject.set(x, "dayOfDecade", js.Any.fromFunction0(value))
      
      inline def setDayOfMonth(value: () => Double): Self = StObject.set(x, "dayOfMonth", js.Any.fromFunction0(value))
      
      inline def setDayOfWeek(value: () => Double): Self = StObject.set(x, "dayOfWeek", js.Any.fromFunction0(value))
      
      inline def setDayOfYear(value: () => Double): Self = StObject.set(x, "dayOfYear", js.Any.fromFunction0(value))
      
      inline def setDayTitle(value: () => String): Self = StObject.set(x, "dayTitle", js.Any.fromFunction0(value))
      
      inline def setDecade(value: () => Double): Self = StObject.set(x, "decade", js.Any.fromFunction0(value))
      
      inline def setFirstDayOfYear(value: () => js.Date): Self = StObject.set(x, "firstDayOfYear", js.Any.fromFunction0(value))
      
      inline def setIsComplementaryDay(value: () => Boolean): Self = StObject.set(x, "isComplementaryDay", js.Any.fromFunction0(value))
      
      inline def setIsYearSextile(value: () => Boolean): Self = StObject.set(x, "isYearSextile", js.Any.fromFunction0(value))
      
      inline def setMonth(value: () => Double): Self = StObject.set(x, "month", js.Any.fromFunction0(value))
      
      inline def setMonthName(value: () => String): Self = StObject.set(x, "monthName", js.Any.fromFunction0(value))
      
      inline def setSetDate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction3(value))
      
      inline def setSetDay(value: Double => Unit): Self = StObject.set(x, "setDay", js.Any.fromFunction1(value))
      
      inline def setSetMonth(value: Double => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
      
      inline def setSetYear(value: String => Unit): Self = StObject.set(x, "setYear", js.Any.fromFunction1(value))
      
      inline def setSetYearDecimal(value: Double => Unit): Self = StObject.set(x, "setYearDecimal", js.Any.fromFunction1(value))
      
      inline def setToDateString(value: () => String): Self = StObject.set(x, "toDateString", js.Any.fromFunction0(value))
      
      inline def setToFullDateString(value: () => String): Self = StObject.set(x, "toFullDateString", js.Any.fromFunction0(value))
      
      inline def setToShortDateString(value: () => String): Self = StObject.set(x, "toShortDateString", js.Any.fromFunction0(value))
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setYear(value: () => String): Self = StObject.set(x, "year", js.Any.fromFunction0(value))
      
      inline def setYearDecimal(value: () => Double): Self = StObject.set(x, "yearDecimal", js.Any.fromFunction0(value))
    }
  }
}

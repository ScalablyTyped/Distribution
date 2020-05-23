package typings.floreal.dateMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("floreal/date", JSImport.Namespace)
@js.native
class ^ () extends FlorealDate {
  def this(value: String) = this()
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
  override def firstDayOfYear(): Date = js.native
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
  override def toFullDateString(): String = js.native
  /* CompleteClass */
  override def toShortDateString(): String = js.native
  /* CompleteClass */
  override def year(): String = js.native
  /* CompleteClass */
  override def yearDecimal(): Double = js.native
}

@JSImport("floreal/date", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var day_names: js.Array[String] = js.native
  def first_day_of_year(year: js.Any): js.Any = js.native
}


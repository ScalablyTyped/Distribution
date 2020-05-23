package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSchedulerRecurrenceInfo extends js.Object {
  val instance: js.Any
  def getDayNumber(): Double
  def getDuration(): Double
  def getEnd(): Date
  def getMonth(): Double
  def getOccurrenceCount(): Double
  def getPeriodicity(): Double
  def getRange(): BootstrapSchedulerRecurrenceRange
  def getRecurrenceType(): BootstrapSchedulerRecurrenceType
  def getStart(): Date
  def getWeekDays(): WeekDays
  def getWeekOfMonth(): WeekOfMonth
  def setDayNumber(dayNumber: Double): Unit
  def setDuration(duration: Double): Unit
  def setEnd(end: Date): Unit
  def setMonth(month: Double): Unit
  def setOccurrenceCount(occurrenceCount: Double): Unit
  def setPeriodicity(periodicity: Double): Unit
  def setRange(range: BootstrapSchedulerRecurrenceRange): Unit
  def setRecurrenceType(`type`: BootstrapSchedulerRecurrenceType): Unit
  def setStart(start: Date): Unit
  def setWeekDays(weekDays: WeekDays): Unit
  def setWeekOfMonth(weekOfMonth: WeekOfMonth): Unit
}

object BootstrapSchedulerRecurrenceInfo {
  @scala.inline
  def apply(
    getDayNumber: () => Double,
    getDuration: () => Double,
    getEnd: () => Date,
    getMonth: () => Double,
    getOccurrenceCount: () => Double,
    getPeriodicity: () => Double,
    getRange: () => BootstrapSchedulerRecurrenceRange,
    getRecurrenceType: () => BootstrapSchedulerRecurrenceType,
    getStart: () => Date,
    getWeekDays: () => WeekDays,
    getWeekOfMonth: () => WeekOfMonth,
    instance: js.Any,
    setDayNumber: Double => Unit,
    setDuration: Double => Unit,
    setEnd: Date => Unit,
    setMonth: Double => Unit,
    setOccurrenceCount: Double => Unit,
    setPeriodicity: Double => Unit,
    setRange: BootstrapSchedulerRecurrenceRange => Unit,
    setRecurrenceType: BootstrapSchedulerRecurrenceType => Unit,
    setStart: Date => Unit,
    setWeekDays: WeekDays => Unit,
    setWeekOfMonth: WeekOfMonth => Unit
  ): BootstrapSchedulerRecurrenceInfo = {
    val __obj = js.Dynamic.literal(getDayNumber = js.Any.fromFunction0(getDayNumber), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getMonth = js.Any.fromFunction0(getMonth), getOccurrenceCount = js.Any.fromFunction0(getOccurrenceCount), getPeriodicity = js.Any.fromFunction0(getPeriodicity), getRange = js.Any.fromFunction0(getRange), getRecurrenceType = js.Any.fromFunction0(getRecurrenceType), getStart = js.Any.fromFunction0(getStart), getWeekDays = js.Any.fromFunction0(getWeekDays), getWeekOfMonth = js.Any.fromFunction0(getWeekOfMonth), instance = instance.asInstanceOf[js.Any], setDayNumber = js.Any.fromFunction1(setDayNumber), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setMonth = js.Any.fromFunction1(setMonth), setOccurrenceCount = js.Any.fromFunction1(setOccurrenceCount), setPeriodicity = js.Any.fromFunction1(setPeriodicity), setRange = js.Any.fromFunction1(setRange), setRecurrenceType = js.Any.fromFunction1(setRecurrenceType), setStart = js.Any.fromFunction1(setStart), setWeekDays = js.Any.fromFunction1(setWeekDays), setWeekOfMonth = js.Any.fromFunction1(setWeekOfMonth))
    __obj.asInstanceOf[BootstrapSchedulerRecurrenceInfo]
  }
}


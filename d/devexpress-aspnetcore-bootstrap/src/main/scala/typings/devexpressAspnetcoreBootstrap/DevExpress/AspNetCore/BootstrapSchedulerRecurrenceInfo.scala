package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerRecurrenceInfo extends js.Object {
  val instance: js.Any = js.native
  def getDayNumber(): Double = js.native
  def getDuration(): Double = js.native
  def getEnd(): Date = js.native
  def getMonth(): Double = js.native
  def getOccurrenceCount(): Double = js.native
  def getPeriodicity(): Double = js.native
  def getRange(): BootstrapSchedulerRecurrenceRange = js.native
  def getRecurrenceType(): BootstrapSchedulerRecurrenceType = js.native
  def getStart(): Date = js.native
  def getWeekDays(): WeekDays = js.native
  def getWeekOfMonth(): WeekOfMonth = js.native
  def setDayNumber(dayNumber: Double): Unit = js.native
  def setDuration(duration: Double): Unit = js.native
  def setEnd(end: Date): Unit = js.native
  def setMonth(month: Double): Unit = js.native
  def setOccurrenceCount(occurrenceCount: Double): Unit = js.native
  def setPeriodicity(periodicity: Double): Unit = js.native
  def setRange(range: BootstrapSchedulerRecurrenceRange): Unit = js.native
  def setRecurrenceType(`type`: BootstrapSchedulerRecurrenceType): Unit = js.native
  def setStart(start: Date): Unit = js.native
  def setWeekDays(weekDays: WeekDays): Unit = js.native
  def setWeekOfMonth(weekOfMonth: WeekOfMonth): Unit = js.native
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
  @scala.inline
  implicit class BootstrapSchedulerRecurrenceInfoOps[Self <: BootstrapSchedulerRecurrenceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDayNumber(value: () => Double): Self = this.set("getDayNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnd(value: () => Date): Self = this.set("getEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonth(value: () => Double): Self = this.set("getMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOccurrenceCount(value: () => Double): Self = this.set("getOccurrenceCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPeriodicity(value: () => Double): Self = this.set("getPeriodicity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRange(value: () => BootstrapSchedulerRecurrenceRange): Self = this.set("getRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRecurrenceType(value: () => BootstrapSchedulerRecurrenceType): Self = this.set("getRecurrenceType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStart(value: () => Date): Self = this.set("getStart", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeekDays(value: () => WeekDays): Self = this.set("getWeekDays", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeekOfMonth(value: () => WeekOfMonth): Self = this.set("getWeekOfMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDayNumber(value: Double => Unit): Self = this.set("setDayNumber", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = this.set("setEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMonth(value: Double => Unit): Self = this.set("setMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOccurrenceCount(value: Double => Unit): Self = this.set("setOccurrenceCount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPeriodicity(value: Double => Unit): Self = this.set("setPeriodicity", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRange(value: BootstrapSchedulerRecurrenceRange => Unit): Self = this.set("setRange", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRecurrenceType(value: BootstrapSchedulerRecurrenceType => Unit): Self = this.set("setRecurrenceType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStart(value: Date => Unit): Self = this.set("setStart", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWeekDays(value: WeekDays => Unit): Self = this.set("setWeekDays", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWeekOfMonth(value: WeekOfMonth => Unit): Self = this.set("setWeekOfMonth", js.Any.fromFunction1(value))
  }
  
}


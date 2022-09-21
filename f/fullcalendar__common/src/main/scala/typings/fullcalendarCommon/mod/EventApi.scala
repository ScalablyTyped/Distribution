package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.AllDay
import typings.fullcalendarCommon.anon.CollapseColor
import typings.fullcalendarCommon.anon.Granularity
import typings.fullcalendarCommon.anon.MaintainDuration
import typings.fullcalendarCommon.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "EventApi")
@js.native
open class EventApi protected () extends StObject {
  def this(context: CalendarContext, `def`: EventDef) = this()
  def this(context: CalendarContext, `def`: EventDef, instance: EventInstance) = this()
  
  var _context: CalendarContext = js.native
  
  var _def: EventDef = js.native
  
  var _instance: EventInstance | Null = js.native
  
  def allDay: Boolean = js.native
  
  def allow: AllowFunc = js.native
  
  def backgroundColor: String = js.native
  
  def borderColor: String = js.native
  
  def classNames: js.Array[String] = js.native
  
  def constraint: String | EventStore = js.native
  
  def display: String = js.native
  
  def durationEditable: Boolean = js.native
  
  def end: js.Date | Null = js.native
  
  def endStr: String = js.native
  
  def extendedProps: Dictionary = js.native
  
  def formatRange(formatInput: FormatterInput): String = js.native
  
  def groupId: String = js.native
  
  def id: String = js.native
  
  def moveDates(deltaInput: DurationInput): Unit = js.native
  
  def moveEnd(deltaInput: DurationInput): Unit = js.native
  
  def moveStart(deltaInput: DurationInput): Unit = js.native
  
  def mutate(mutation: EventMutation): Unit = js.native
  
  def overlap: Boolean = js.native
  
  def remove(): Unit = js.native
  
  def setAllDay(allDay: Boolean): Unit = js.native
  def setAllDay(allDay: Boolean, options: MaintainDuration): Unit = js.native
  
  def setDates(startInput: DateInput): Unit = js.native
  def setDates(startInput: DateInput, endInput: Null, options: AllDay): Unit = js.native
  def setDates(startInput: DateInput, endInput: DateInput): Unit = js.native
  def setDates(startInput: DateInput, endInput: DateInput, options: AllDay): Unit = js.native
  
  def setEnd(): Unit = js.native
  def setEnd(endInput: Null, options: `9`): Unit = js.native
  def setEnd(endInput: DateInput): Unit = js.native
  def setEnd(endInput: DateInput, options: `9`): Unit = js.native
  
  def setExtendedProp(name: String, `val`: Any): Unit = js.native
  
  def setProp(name: String, `val`: Any): Unit = js.native
  
  def setStart(startInput: DateInput): Unit = js.native
  def setStart(startInput: DateInput, options: Granularity): Unit = js.native
  
  def source: EventSourceApi | Null = js.native
  
  def start: js.Date | Null = js.native
  
  def startEditable: Boolean = js.native
  
  def startStr: String = js.native
  
  def textColor: String = js.native
  
  def title: String = js.native
  
  def toJSON(): Dictionary = js.native
  
  def toPlainObject(): Dictionary = js.native
  def toPlainObject(settings: CollapseColor): Dictionary = js.native
  
  def url: String = js.native
}

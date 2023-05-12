package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.AllDay
import typings.fullcalendarCore.anon.CollapseColor
import typings.fullcalendarCore.anon.Granularity
import typings.fullcalendarCore.anon.MaintainDuration
import typings.fullcalendarCore.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventApi extends StObject {
  
  var allDay: Boolean = js.native
  
  var allow: Any = js.native
  
  var backgroundColor: String = js.native
  
  var borderColor: String = js.native
  
  var classNames: js.Array[String] = js.native
  
  var constraint: Any = js.native
  
  var display: String = js.native
  
  var durationEditable: Boolean = js.native
  
  var end: js.Date | Null = js.native
  
  var endStr: String = js.native
  
  var extendedProps: Dictionary = js.native
  
  def formatRange(formatInput: FormatterInput): Any = js.native
  
  var groupId: String = js.native
  
  var id: String = js.native
  
  def moveDates(deltaInput: DurationInput): Unit = js.native
  
  def moveEnd(deltaInput: DurationInput): Unit = js.native
  
  def moveStart(deltaInput: DurationInput): Unit = js.native
  
  var overlap: Boolean = js.native
  
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
  
  var source: EventSourceApi | Null = js.native
  
  var start: js.Date | Null = js.native
  
  var startEditable: Boolean = js.native
  
  var startStr: String = js.native
  
  var textColor: String = js.native
  
  var title: String = js.native
  
  def toJSON(): Dictionary = js.native
  
  def toPlainObject(): Dictionary = js.native
  def toPlainObject(settings: CollapseColor): Dictionary = js.native
  
  var url: String = js.native
}

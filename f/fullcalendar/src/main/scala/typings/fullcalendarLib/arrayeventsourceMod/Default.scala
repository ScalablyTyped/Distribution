package typings
package fullcalendarLib.arrayeventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ArrayEventSource", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.eventsourceMod.default {
  def this(calendar: js.Any) = this()
  var currentTimezone: js.Any = js.native
  var eventDefs: js.Any = js.native
  var rawEventDefs: js.Any = js.native
  def addEventDef(eventDef: js.Any): scala.Unit = js.native
  def getPrimitive(): js.Any = js.native
  def setRawEventDefs(rawEventDefs: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/ArrayEventSource", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any) = this()
}

@JSImport("fullcalendar/ArrayEventSource", "Default")
@js.native
object Default extends js.Object {
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/ArrayEventSource", JSImport.Default)
@js.native
object default extends js.Object {
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}


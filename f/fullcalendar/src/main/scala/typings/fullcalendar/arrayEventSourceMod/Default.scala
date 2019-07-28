package typings.fullcalendar.arrayEventSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ArrayEventSource", "Default")
@js.native
class Default protected ()
  extends typings.fullcalendar.eventSourceMod.default {
  def this(calendar: js.Any) = this()
  var currentTimezone: js.Any = js.native
  var eventDefs: js.Any = js.native
  var rawEventDefs: js.Any = js.native
  def addEventDef(eventDef: js.Any): Unit = js.native
  def getPrimitive(): js.Any = js.native
  def setRawEventDefs(rawEventDefs: js.Any): Unit = js.native
}

@JSImport("fullcalendar/ArrayEventSource", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/ArrayEventSource", "Default")
@js.native
object Default extends js.Object {
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

/* static members */
@JSImport("fullcalendar/ArrayEventSource", JSImport.Default)
@js.native
object default extends js.Object {
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}


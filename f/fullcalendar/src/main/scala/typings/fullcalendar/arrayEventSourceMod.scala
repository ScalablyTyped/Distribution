package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ArrayEventSource", JSImport.Namespace)
@js.native
object arrayEventSourceMod extends js.Object {
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
  
  @js.native
  class default protected () extends Default {
    def this(calendar: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object Default extends js.Object {
    def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
  }
  
}


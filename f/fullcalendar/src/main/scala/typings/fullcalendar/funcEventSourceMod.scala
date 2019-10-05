package typings.fullcalendar

import typings.fullcalendar.funcEventSourceMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/FuncEventSource", JSImport.Namespace)
@js.native
object funcEventSourceMod extends js.Object {
  @js.native
  class Default ()
    extends typings.fullcalendar.eventSourceMod.default {
    var func: js.Any = js.native
    def getPrimitive(): js.Any = js.native
  }
  
  @js.native
  class default () extends Default
  
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


package typings.fullcalendar

import typings.fullcalendar.fullcalendarBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDateProfile", JSImport.Namespace)
@js.native
object eventDateProfileMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(start: js.Any, end: js.Any, calendar: js.Any) = this()
    var end: js.Any = js.native
    var start: js.Any = js.native
    var unzonedRange: js.Any = js.native
    def buildUnzonedRange(calendar: js.Any): typings.fullcalendar.unzonedRangeMod.default = js.native
    def getEnd(calendar: js.Any): js.Any = js.native
    def isAllDay(): Boolean = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(start: js.Any, end: js.Any, calendar: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object Default extends js.Object {
    def isStandardProp(propName: js.Any): Boolean = js.native
    def parse(rawProps: js.Any, source: js.Any): `false` | Default = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def isStandardProp(propName: js.Any): Boolean = js.native
    def parse(rawProps: js.Any, source: js.Any): `false` | Default = js.native
  }
  
}


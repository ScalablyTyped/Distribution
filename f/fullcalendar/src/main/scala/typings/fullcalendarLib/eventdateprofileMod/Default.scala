package typings
package fullcalendarLib.eventdateprofileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDateProfile", "Default")
@js.native
class Default protected () extends js.Object {
  def this(start: js.Any, end: js.Any, calendar: js.Any) = this()
  var end: js.Any = js.native
  var start: js.Any = js.native
  var unzonedRange: js.Any = js.native
  def buildUnzonedRange(calendar: js.Any): fullcalendarLib.unzonedrangeMod.default = js.native
  def getEnd(calendar: js.Any): js.Any = js.native
  def isAllDay(): scala.Boolean = js.native
}

@JSImport("fullcalendar/EventDateProfile", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(start: js.Any, end: js.Any, calendar: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/EventDateProfile", "Default")
@js.native
object Default extends js.Object {
  def isStandardProp(propName: js.Any): scala.Boolean = js.native
  def parse(rawProps: js.Any, source: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.eventdateprofileMod.Default = js.native
}

/* static members */
@JSImport("fullcalendar/EventDateProfile", JSImport.Default)
@js.native
object default extends js.Object {
  def isStandardProp(propName: js.Any): scala.Boolean = js.native
  def parse(rawProps: js.Any, source: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.eventdateprofileMod.Default = js.native
}


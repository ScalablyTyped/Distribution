package typings.fullcalendar.businessHourGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/BusinessHourGenerator", "Default")
@js.native
class Default protected () extends js.Object {
  def this(rawComplexDef: js.Any, calendar: js.Any) = this()
  var calendar: js.Any = js.native
  var rawComplexDef: js.Any = js.native
  def buildEventDef(isAllDay: js.Any, rawDef: js.Any): js.Any = js.native
  def buildEventDefs(isAllDay: js.Any): js.Array[_] = js.native
  def buildEventInstanceGroup(isAllDay: js.Any, unzonedRange: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/BusinessHourGenerator", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(rawComplexDef: js.Any, calendar: js.Any) = this()
}


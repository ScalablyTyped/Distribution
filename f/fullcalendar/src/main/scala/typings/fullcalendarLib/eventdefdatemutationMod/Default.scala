package typings
package fullcalendarLib.eventdefdatemutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDefDateMutation", "Default")
@js.native
class Default () extends js.Object {
  var clearEnd: scala.Boolean = js.native
  var dateDelta: js.Any = js.native
  var endDelta: js.Any = js.native
  var forceAllDay: scala.Boolean = js.native
  var forceTimed: scala.Boolean = js.native
  var startDelta: js.Any = js.native
  def buildNewDateProfile(eventDateProfile: js.Any, calendar: js.Any): fullcalendarLib.eventdateprofileMod.default = js.native
  def isEmpty(): scala.Boolean = js.native
  def setDateDelta(dateDelta: js.Any): scala.Unit = js.native
  def setEndDelta(endDelta: js.Any): scala.Unit = js.native
  def setStartDelta(startDelta: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/EventDefDateMutation", JSImport.Default)
@js.native
class default () extends Default

/* static members */
@JSImport("fullcalendar/EventDefDateMutation", "Default")
@js.native
object Default extends js.Object {
  def createFromDiff(dateProfile0: js.Any, dateProfile1: js.Any, largeUnit: js.Any): js.Any = js.native
}

/* static members */
@JSImport("fullcalendar/EventDefDateMutation", JSImport.Default)
@js.native
object default extends js.Object {
  def createFromDiff(dateProfile0: js.Any, dateProfile1: js.Any, largeUnit: js.Any): js.Any = js.native
}


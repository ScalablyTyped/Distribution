package typings.fullcalendar.eventDefDateMutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDefDateMutation", "Default")
@js.native
class Default_ () extends js.Object {
  var clearEnd: Boolean = js.native
  var dateDelta: js.Any = js.native
  var endDelta: js.Any = js.native
  var forceAllDay: Boolean = js.native
  var forceTimed: Boolean = js.native
  var startDelta: js.Any = js.native
  def buildNewDateProfile(eventDateProfile: js.Any, calendar: js.Any): typings.fullcalendar.eventDateProfileMod.default = js.native
  def isEmpty(): Boolean = js.native
  def setDateDelta(dateDelta: js.Any): Unit = js.native
  def setEndDelta(endDelta: js.Any): Unit = js.native
  def setStartDelta(startDelta: js.Any): Unit = js.native
}

/* static members */
@JSImport("fullcalendar/EventDefDateMutation", "Default")
@js.native
object Default_ extends js.Object {
  def createFromDiff(dateProfile0: js.Any, dateProfile1: js.Any, largeUnit: js.Any): js.Any = js.native
}


package typings.fullcalendar

import typings.fullcalendar.eventRangeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/models/event/util", JSImport.Namespace)
@js.native
object srcModelsEventUtilMod extends js.Object {
  def eventDefsToEventInstances(eventDefs: js.Any, unzonedRange: js.Any): js.Array[_] = js.native
  def eventFootprintToComponentFootprint(eventFootprint: js.Any): js.Any = js.native
  def eventInstanceToEventRange(eventInstance: js.Any): default = js.native
  def eventInstanceToUnzonedRange(eventInstance: js.Any): js.Any = js.native
  def eventRangeToEventFootprint(eventRange: js.Any): typings.fullcalendar.eventFootprintMod.default = js.native
}


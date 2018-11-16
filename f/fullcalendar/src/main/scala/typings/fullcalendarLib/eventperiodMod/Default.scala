package typings
package fullcalendarLib.eventperiodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventPeriod", "Default")
@js.native
class Default protected () extends js.Object {
  def this(start: js.Any, end: js.Any, timezone: js.Any) = this()
  var end: momentLib.momentMod.momentNs.Moment = js.native
  var eventDefsById: js.Any = js.native
  var eventDefsByUid: js.Any = js.native
  var eventInstanceGroupsById: js.Any = js.native
  var freezeDepth: scala.Double = js.native
  var hasHandlers: js.Function1[/* type */ js.Any, _] = js.native
  var off: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var on: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var one: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var pendingCnt: scala.Double = js.native
  var releaseCnt: scala.Double = js.native
  var requestsByUid: js.Any = js.native
  var start: momentLib.momentMod.momentNs.Moment = js.native
  var stuntedReleaseCnt: scala.Double = js.native
  var timezone: js.Any = js.native
  var trigger: js.Function2[/* types */ js.Any, /* repeated */js.Any, _] = js.native
  var triggerWith: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  var unzonedRange: fullcalendarLib.unzonedrangeMod.default = js.native
  def addEventDef(eventDef: js.Any): scala.Unit = js.native
  def addEventDefs(eventDefs: js.Any): scala.Unit = js.native
  def addEventInstance(eventInstance: js.Any, eventDefId: js.Any): scala.Unit = js.native
  def freeze(): scala.Unit = js.native
  def getEventDefByUid(eventDefUid: js.Any): js.Any = js.native
  def getEventDefsById(eventDefId: js.Any): js.Any = js.native
  def getEventInstances(): js.Array[_] = js.native
  def getEventInstancesWithId(eventDefId: js.Any): js.Any = js.native
  def getEventInstancesWithoutId(eventDefId: js.Any): js.Array[_] = js.native
  def isWithinRange(start: js.Any, end: js.Any): scala.Boolean = js.native
  def purgeAllSources(): scala.Unit = js.native
  def purgeSource(source: js.Any): scala.Unit = js.native
  def release(): scala.Unit = js.native
  def removeAllEventDefs(): scala.Unit = js.native
  def removeEventDef(eventDef: js.Any): scala.Unit = js.native
  def removeEventDefsById(eventDefId: js.Any): scala.Unit = js.native
  def removeEventInstancesForDef(eventDef: js.Any): scala.Unit = js.native
  def requestSource(source: js.Any): scala.Unit = js.native
  def requestSources(sources: js.Any): scala.Unit = js.native
  def thaw(): scala.Unit = js.native
  def tryRelease(): scala.Unit = js.native
  def whenReleased(): jqueryLib.JQueryPromise[js.Object] = js.native
}

@JSImport("fullcalendar/EventPeriod", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(start: js.Any, end: js.Any, timezone: js.Any) = this()
}


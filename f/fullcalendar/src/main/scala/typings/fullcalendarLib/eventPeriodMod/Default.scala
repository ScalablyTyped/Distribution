package typings
package fullcalendarLib.eventPeriodMod

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
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  @JSName("off")
  var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("on")
  var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("one")
  var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var pendingCnt: scala.Double = js.native
  var releaseCnt: scala.Double = js.native
  var requestsByUid: js.Any = js.native
  var start: momentLib.momentMod.momentNs.Moment = js.native
  var stuntedReleaseCnt: scala.Double = js.native
  var timezone: js.Any = js.native
  @JSName("triggerWith")
  var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
  var unzonedRange: fullcalendarLib.unzonedRangeMod.default = js.native
  def addEventDef(eventDef: js.Any): scala.Unit = js.native
  def addEventDefs(eventDefs: js.Any): scala.Unit = js.native
  def addEventInstance(eventInstance: js.Any, eventDefId: js.Any): scala.Unit = js.native
  def freeze(): scala.Unit = js.native
  def getEventDefByUid(eventDefUid: js.Any): js.Any = js.native
  def getEventDefsById(eventDefId: js.Any): js.Any = js.native
  def getEventInstances(): js.Array[_] = js.native
  def getEventInstancesWithId(eventDefId: js.Any): js.Any = js.native
  def getEventInstancesWithoutId(eventDefId: js.Any): js.Array[_] = js.native
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def isWithinRange(start: js.Any, end: js.Any): scala.Boolean = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
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
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def tryRelease(): scala.Unit = js.native
  def whenReleased(): jqueryLib.JQueryPromise[js.Object] = js.native
}

@JSImport("fullcalendar/EventPeriod", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(start: js.Any, end: js.Any, timezone: js.Any) = this()
}


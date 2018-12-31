package typings
package fullcalendarLib.eventmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventManager", "Default")
@js.native
class Default protected () extends js.Object {
  def this(calendar: js.Any) = this()
  var calendar: js.Any = js.native
  var currentPeriod: js.Any = js.native
  var hasHandlers: js.Function1[/* type */ js.Any, _] = js.native
  var listenTo: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var off: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var on: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var one: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var otherSources: js.Any = js.native
  var stickySource: js.Any = js.native
  var stopListeningTo: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var trigger: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
  var triggerWith: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  def addEventDef(eventDef: js.Any, isSticky: js.Any): scala.Unit = js.native
  def addSource(eventSource: js.Any): scala.Unit = js.native
  def bindPeriod(eventPeriod: js.Any): scala.Unit = js.native
  def buildMutatedEventInstanceGroup(eventDefId: js.Any, eventDefMutation: js.Any): fullcalendarLib.eventinstancegroupMod.default = js.native
  def freeze(): scala.Unit = js.native
  def getEventDefByUid(uid: js.Any): js.Any = js.native
  def getEventDefsById(eventDefId: js.Any): js.Any = js.native
  def getEventInstances(): js.Any = js.native
  def getEventInstancesWithId(eventDefId: js.Any): js.Any = js.native
  def getEventInstancesWithoutId(eventDefId: js.Any): js.Any = js.native
  def getSourceById(id: js.Any): js.Any = js.native
  def getSources(): js.Array[_] = js.native
  def multiQuerySources(matchInputs: js.Any): js.Array[_] = js.native
  def mutateEventsWithId(eventDefId: js.Any, eventDefMutation: js.Any): js.Function0[scala.Unit] = js.native
  def querySources(matchInput: js.Any): js.Array[_] = js.native
  def refetchAllSources(): scala.Unit = js.native
  def refetchSource(eventSource: js.Any): scala.Unit = js.native
  def removeAllEventDefs(): scala.Unit = js.native
  def removeAllSources(): scala.Unit = js.native
  def removeEventDefsById(eventId: js.Any): scala.Unit = js.native
  def removeSource(doomedSource: js.Any): scala.Unit = js.native
  def requestEvents(start: js.Any, end: js.Any, timezone: js.Any, force: js.Any): js.Any = js.native
  def setPeriod(eventPeriod: js.Any): scala.Unit = js.native
  def thaw(): scala.Unit = js.native
  def unbindPeriod(eventPeriod: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/EventManager", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any) = this()
}


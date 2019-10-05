package typings.fullcalendar

import typings.fullcalendar.eventPeriodMod.Default
import typings.jquery.JQueryPromise
import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventPeriod", JSImport.Namespace)
@js.native
object eventPeriodMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(start: js.Any, end: js.Any, timezone: js.Any) = this()
    var end: Moment = js.native
    var eventDefsById: js.Any = js.native
    var eventDefsByUid: js.Any = js.native
    var eventInstanceGroupsById: js.Any = js.native
    var freezeDepth: Double = js.native
    @JSName("hasHandlers")
    var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
    @JSName("off")
    var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
    @JSName("on")
    var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
    @JSName("one")
    var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
    var pendingCnt: Double = js.native
    var releaseCnt: Double = js.native
    var requestsByUid: js.Any = js.native
    var start: Moment = js.native
    var stuntedReleaseCnt: Double = js.native
    var timezone: js.Any = js.native
    @JSName("triggerWith")
    var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
    @JSName("trigger")
    var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
    var unzonedRange: typings.fullcalendar.unzonedRangeMod.default = js.native
    def addEventDef(eventDef: js.Any): Unit = js.native
    def addEventDefs(eventDefs: js.Any): Unit = js.native
    def addEventInstance(eventInstance: js.Any, eventDefId: js.Any): Unit = js.native
    def freeze(): Unit = js.native
    def getEventDefByUid(eventDefUid: js.Any): js.Any = js.native
    def getEventDefsById(eventDefId: js.Any): js.Any = js.native
    def getEventInstances(): js.Array[_] = js.native
    def getEventInstancesWithId(eventDefId: js.Any): js.Any = js.native
    def getEventInstancesWithoutId(eventDefId: js.Any): js.Array[_] = js.native
    def hasHandlers(`type`: js.Any): js.Any = js.native
    def isWithinRange(start: js.Any, end: js.Any): Boolean = js.native
    def off(types: js.Any, handler: js.Any): js.Any = js.native
    def on(types: js.Any, handler: js.Any): js.Any = js.native
    def one(types: js.Any, handler: js.Any): js.Any = js.native
    def purgeAllSources(): Unit = js.native
    def purgeSource(source: js.Any): Unit = js.native
    def release(): Unit = js.native
    def removeAllEventDefs(): Unit = js.native
    def removeEventDef(eventDef: js.Any): Unit = js.native
    def removeEventDefsById(eventDefId: js.Any): Unit = js.native
    def removeEventInstancesForDef(eventDef: js.Any): Unit = js.native
    def requestSource(source: js.Any): Unit = js.native
    def requestSources(sources: js.Any): Unit = js.native
    def thaw(): Unit = js.native
    def trigger(types: js.Any, args: js.Any*): js.Any = js.native
    def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
    def tryRelease(): Unit = js.native
    def whenReleased(): JQueryPromise[js.Object] = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(start: js.Any, end: js.Any, timezone: js.Any) = this()
  }
  
}


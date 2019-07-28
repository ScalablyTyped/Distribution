package typings.fullcalendar.fullcalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar", "EventDef")
@js.native
abstract class EventDef protected ()
  extends typings.fullcalendar.srcMainMod.EventDef {
  def this(source: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar", "EventDef")
@js.native
object EventDef extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: Double = js.native
  def generateId(): String = js.native
  def normalizeId(id: js.Any): String = js.native
  def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
}


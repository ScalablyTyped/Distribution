package typings
package fullcalendarLib.srcExportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/exports", "EventDef")
@js.native
abstract class EventDef protected ()
  extends fullcalendarLib.eventDefMod.default {
  def this(source: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/src/exports", "EventDef")
@js.native
object EventDef extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: scala.Double = js.native
  def generateId(): java.lang.String = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
}


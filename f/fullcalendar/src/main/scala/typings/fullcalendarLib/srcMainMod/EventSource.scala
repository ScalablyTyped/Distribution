package typings
package fullcalendarLib.srcMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/main", "EventSource")
@js.native
class EventSource protected ()
  extends fullcalendarLib.srcExportsMod.EventSource {
  def this(calendar: js.Any) = this()
}

@JSImport("fullcalendar/src/main", "EventSource")
@js.native
object EventSource extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: scala.Double = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.eventsourceMod.Default = js.native
}


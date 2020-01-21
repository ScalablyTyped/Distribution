package typings.fullcalendar.mod

import typings.fullcalendar.eventSourceMod.Default_
import typings.fullcalendar.fullcalendarBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar", "EventSource")
@js.native
class EventSource protected ()
  extends typings.fullcalendar.srcMainMod.EventSource {
  def this(calendar: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar", "EventSource")
@js.native
object EventSource extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: Double = js.native
  def normalizeId(id: js.Any): String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): `false` | Default_ = js.native
}


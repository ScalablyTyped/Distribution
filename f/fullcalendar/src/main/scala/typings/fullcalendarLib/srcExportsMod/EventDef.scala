package typings
package fullcalendarLib.srcExportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/exports", "EventDef")
@js.native
abstract class EventDef protected ()
  extends fullcalendarLib.eventdefMod.default {
  def this(source: js.Any) = this()
}

@JSImport("fullcalendar/src/exports", "EventDef")
@js.native
object EventDef extends js.Object {
  var copyVerbatimStandardProps: js.Any = js.native
  var defineStandardProps: js.Any = js.native
  var uuid: scala.Double = js.native
  def generateId(): java.lang.String = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
}


package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/RecurringEventDef", JSImport.Namespace)
@js.native
object recurringEventDefMod extends js.Object {
  @js.native
  class Default ()
    extends typings.fullcalendar.eventDefMod.default {
    var dowHash: js.Any = js.native
    var endTime: js.Any = js.native
    var startTime: js.Any = js.native
    def setDow(dowNumbers: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
}


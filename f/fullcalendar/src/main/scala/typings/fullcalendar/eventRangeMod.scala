package typings.fullcalendar

import typings.fullcalendar.eventRangeMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventRange", JSImport.Namespace)
@js.native
object eventRangeMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(unzonedRange: js.Any, eventDef: js.Any) = this()
    def this(unzonedRange: js.Any, eventDef: js.Any, eventInstance: js.Any) = this()
    var eventDef: js.Any = js.native
    var eventInstance: js.Any = js.native
    var unzonedRange: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(unzonedRange: js.Any, eventDef: js.Any) = this()
    def this(unzonedRange: js.Any, eventDef: js.Any, eventInstance: js.Any) = this()
  }
  
}


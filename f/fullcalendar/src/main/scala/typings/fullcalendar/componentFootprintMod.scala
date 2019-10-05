package typings.fullcalendar

import typings.fullcalendar.componentFootprintMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ComponentFootprint", JSImport.Namespace)
@js.native
object componentFootprintMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(unzonedRange: js.Any, isAllDay: js.Any) = this()
    var isAllDay: Boolean = js.native
    var unzonedRange: js.Any = js.native
    def toLegacy(calendar: js.Any): Anon_End = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(unzonedRange: js.Any, isAllDay: js.Any) = this()
  }
  
}


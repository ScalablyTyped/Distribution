package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateClicking", JSImport.Namespace)
@js.native
object dateClickingMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.interactionMod.default {
    def this(component: js.Any) = this()
    var dragListener: js.Any = js.native
    def bindToEl(el: js.Any): Unit = js.native
    def buildDragListener(): typings.fullcalendar.hitDragListenerMod.default = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(component: js.Any) = this()
  }
  
}


package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventPointing", JSImport.Namespace)
@js.native
object eventPointingMod extends js.Object {
  @js.native
  class Default ()
    extends typings.fullcalendar.interactionMod.default {
    var mousedOverSeg: js.Any = js.native
    def bindToEl(el: js.Any): Unit = js.native
    def handleClick(seg: js.Any, ev: js.Any): Unit = js.native
    def handleMouseout(seg: js.Any): Unit = js.native
    def handleMouseout(seg: js.Any, ev: js.Any): Unit = js.native
    def handleMouseover(seg: js.Any, ev: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
}


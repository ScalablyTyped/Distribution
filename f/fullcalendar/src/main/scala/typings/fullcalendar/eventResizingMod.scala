package typings.fullcalendar

import typings.fullcalendar.eventResizingMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventResizing", JSImport.Namespace)
@js.native
object eventResizingMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.interactionMod.default {
    def this(component: js.Any, eventPointing: js.Any) = this()
    var dragListener: js.Any = js.native
    var eventPointing: js.Any = js.native
    var isResizing: Boolean = js.native
    def bindToEl(el: js.Any): Unit = js.native
    def buildDragListener(seg: js.Any, isStart: js.Any): typings.fullcalendar.hitDragListenerMod.default = js.native
    def computeEventEndResizeMutation(startFootprint: js.Any, endFootprint: js.Any, origEventFootprint: js.Any): js.Any = js.native
    def computeEventStartResizeMutation(startFootprint: js.Any, endFootprint: js.Any, origEventFootprint: js.Any): js.Any = js.native
    def handleMouseDown(seg: js.Any, ev: js.Any): Unit = js.native
    def handleTouchStart(seg: js.Any, ev: js.Any): Unit = js.native
    def segResizeStart(seg: js.Any, ev: js.Any): Unit = js.native
    def segResizeStop(seg: js.Any, ev: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(component: js.Any, eventPointing: js.Any) = this()
  }
  
}


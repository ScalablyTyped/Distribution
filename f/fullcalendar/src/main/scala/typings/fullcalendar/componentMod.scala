package typings.fullcalendar

import typings.fullcalendar.componentMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class Default ()
    extends typings.fullcalendar.modelMod.default {
    var el: js.Any = js.native
    def bindGlobalHandlers(): Unit = js.native
    def removeElement(): Unit = js.native
    def renderSkeleton(): Unit = js.native
    def setElement(el: js.Any): Unit = js.native
    def unbindGlobalHandlers(): Unit = js.native
    def unrenderSkeleton(): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
}


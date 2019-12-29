package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/BusinessHourRenderer", JSImport.Namespace)
@js.native
object businessHourRendererMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(component: js.Any, fillRenderer: js.Any) = this()
    var component: js.Any = js.native
    var fillRenderer: js.Any = js.native
    var segs: js.Any = js.native
    def getSegs(): js.Any = js.native
    def render(businessHourGenerator: js.Any): Unit = js.native
    def renderEventFootprints(eventFootprints: js.Any): Unit = js.native
    def renderSegs(segs: js.Any): Unit = js.native
    def unrender(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(component: js.Any, fillRenderer: js.Any) = this()
  }
  
}


package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/FillRenderer", JSImport.Namespace)
@js.native
object fillRendererMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(component: js.Any) = this()
    var component: js.Any = js.native
    var elsByFill: js.Any = js.native
    var fillSegTag: String = js.native
    def attachSegEls(`type`: js.Any, segs: js.Any): Unit = js.native
    def buildSegEls(`type`: js.Any, segs: js.Any, props: js.Any): js.Array[_] = js.native
    def buildSegHtml(`type`: js.Any, seg: js.Any, props: js.Any): String = js.native
    def renderFootprint(`type`: js.Any, componentFootprint: js.Any, props: js.Any): Unit = js.native
    def renderSegs(`type`: js.Any, segs: js.Any, props: js.Any): js.Any = js.native
    def reportEls(`type`: js.Any, nodes: js.Any): Unit = js.native
    def unrender(`type`: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(component: js.Any) = this()
  }
  
}


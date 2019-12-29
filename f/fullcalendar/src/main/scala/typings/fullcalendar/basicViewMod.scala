package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/BasicView", JSImport.Namespace)
@js.native
object basicViewMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.viewMod.default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
    var dayGrid: js.Any = js.native
    var dayGridClass: js.Any = js.native
    var scroller: js.Any = js.native
    var weekNumberWidth: js.Any = js.native
    def computeScrollerHeight(totalHeight: js.Any): Double = js.native
    def hasRigidRows(): Boolean = js.native
    def instantiateDayGrid(): js.Any = js.native
    def renderSkeletonHtml(): String = js.native
    def setGridHeight(height: js.Any, isAuto: js.Any): Unit = js.native
    def weekNumberStyleAttr(): String = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
  }
  
}


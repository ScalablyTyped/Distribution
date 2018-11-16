package typings
package fullcalendarLib.basicviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/BasicView", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.viewMod.default {
  def this(calendar: js.Any, viewSpec: js.Any) = this()
  var dayGrid: js.Any = js.native
  var dayGridClass: js.Any = js.native
  var scroller: js.Any = js.native
  var weekNumberWidth: js.Any = js.native
  def computeScrollerHeight(totalHeight: js.Any): scala.Double = js.native
  def hasRigidRows(): scala.Boolean = js.native
  def instantiateDayGrid(): js.Any = js.native
  def renderSkeletonHtml(): java.lang.String = js.native
  def setGridHeight(height: js.Any, isAuto: js.Any): scala.Unit = js.native
  def weekNumberStyleAttr(): java.lang.String = js.native
}

@JSImport("fullcalendar/BasicView", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any, viewSpec: js.Any) = this()
}


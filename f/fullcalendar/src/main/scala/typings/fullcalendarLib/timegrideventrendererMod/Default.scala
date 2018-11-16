package typings
package fullcalendarLib.timegrideventrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/TimeGridEventRenderer", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.eventrendererMod.default {
  def this(timeGrid: js.Any, fillRenderer: js.Any) = this()
  var timeGrid: js.Any = js.native
  def assignFgSegHorizontals(segs: js.Any): scala.Unit = js.native
  def compareForwardSegs(seg1: js.Any, seg2: js.Any): js.Any = js.native
  def computeFgSegForwardBack(seg: js.Any, seriesBackwardPressure: js.Any, seriesBackwardCoord: js.Any): scala.Unit = js.native
  def computeFgSegHorizontals(segs: js.Any): scala.Unit = js.native
  def generateFgSegHorizontalCss(seg: js.Any): js.Any = js.native
  def renderFgSegsIntoContainers(segs: js.Any, containerEls: js.Any): scala.Unit = js.native
  def sortForwardSegs(forwardSegs: js.Any): scala.Unit = js.native
  def unrenderFgSegs(): scala.Unit = js.native
  def updateFgSegCoords(segs: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/TimeGridEventRenderer", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(timeGrid: js.Any, fillRenderer: js.Any) = this()
}


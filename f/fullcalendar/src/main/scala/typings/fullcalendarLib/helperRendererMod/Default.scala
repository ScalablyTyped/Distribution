package typings
package fullcalendarLib.helperRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/HelperRenderer", "Default")
@js.native
class Default protected () extends js.Object {
  def this(component: js.Any, eventRenderer: js.Any) = this()
  var component: js.Any = js.native
  var eventRenderer: js.Any = js.native
  var helperEls: js.Any = js.native
  var view: js.Any = js.native
  def fabricateEventFootprint(componentFootprint: js.Any): fullcalendarLib.eventFootprintMod.default = js.native
  def renderComponentFootprint(componentFootprint: js.Any): scala.Unit = js.native
  def renderEventDraggingFootprints(eventFootprints: js.Any, sourceSeg: js.Any, isTouch: js.Any): scala.Unit = js.native
  def renderEventFootprints(eventFootprints: js.Any): scala.Unit = js.native
  def renderEventFootprints(eventFootprints: js.Any, sourceSeg: js.Any): scala.Unit = js.native
  def renderEventFootprints(eventFootprints: js.Any, sourceSeg: js.Any, extraClassNames: js.Any): scala.Unit = js.native
  def renderEventFootprints(eventFootprints: js.Any, sourceSeg: js.Any, extraClassNames: js.Any, opacity: js.Any): scala.Unit = js.native
  def renderEventResizingFootprints(eventFootprints: js.Any, sourceSeg: js.Any, isTouch: js.Any): scala.Unit = js.native
  def renderSegs(segs: js.Any): scala.Unit = js.native
  def renderSegs(segs: js.Any, sourceSeg: js.Any): scala.Unit = js.native
  def unrender(): scala.Unit = js.native
}

@JSImport("fullcalendar/HelperRenderer", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any, eventRenderer: js.Any) = this()
}


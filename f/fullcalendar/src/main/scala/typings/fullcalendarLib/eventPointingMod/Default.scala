package typings
package fullcalendarLib.eventPointingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventPointing", "Default")
@js.native
class Default ()
  extends fullcalendarLib.interactionMod.default {
  var mousedOverSeg: js.Any = js.native
  def bindToEl(el: js.Any): scala.Unit = js.native
  def handleClick(seg: js.Any, ev: js.Any): scala.Unit = js.native
  def handleMouseout(seg: js.Any): scala.Unit = js.native
  def handleMouseout(seg: js.Any, ev: js.Any): scala.Unit = js.native
  def handleMouseover(seg: js.Any, ev: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/EventPointing", JSImport.Default)
@js.native
class default () extends Default


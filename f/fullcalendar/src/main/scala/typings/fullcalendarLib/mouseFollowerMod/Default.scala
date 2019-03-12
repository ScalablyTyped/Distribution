package typings
package fullcalendarLib.mouseFollowerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/MouseFollower", "Default")
@js.native
class Default protected () extends js.Object {
  def this(sourceEl: js.Any, options: js.Any) = this()
  var el: js.Any = js.native
  var isAnimating: scala.Boolean = js.native
  var isFollowing: scala.Boolean = js.native
  var isHidden: scala.Boolean = js.native
  var left0: js.Any = js.native
  var leftDelta: js.Any = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var options: js.Any = js.native
  var parentEl: js.Any = js.native
  var sourceEl: js.Any = js.native
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var top0: js.Any = js.native
  var topDelta: js.Any = js.native
  var x0: js.Any = js.native
  var y0: js.Any = js.native
  def getEl(): js.Any = js.native
  def handleMove(ev: js.Any): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def removeElement(): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def start(ev: js.Any): scala.Unit = js.native
  def stop(shouldRevert: js.Any, callback: js.Any): scala.Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def updatePosition(): scala.Unit = js.native
}

@JSImport("fullcalendar/MouseFollower", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(sourceEl: js.Any, options: js.Any) = this()
}


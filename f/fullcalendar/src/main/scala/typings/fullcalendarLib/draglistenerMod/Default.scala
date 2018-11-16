package typings
package fullcalendarLib.draglistenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DragListener", "Default")
@js.native
class Default protected () extends js.Object {
  def this(options: js.Any) = this()
  var delay: js.Any = js.native
  var delayTimeoutId: js.Any = js.native
  var isAutoScroll: scala.Boolean = js.native
  var isDelayEnded: scala.Boolean = js.native
  var isDistanceSurpassed: scala.Boolean = js.native
  var isDragging: scala.Boolean = js.native
  var isGeneric: scala.Boolean = js.native
  var isInteracting: scala.Boolean = js.native
  var isTouch: scala.Boolean = js.native
  var listenTo: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var minDistance: js.Any = js.native
  var options: js.Any = js.native
  var originX: js.Any = js.native
  var originY: js.Any = js.native
  var scrollAlwaysKills: scala.Boolean = js.native
  var scrollBounds: js.Any = js.native
  var scrollEl: js.Any = js.native
  var scrollIntervalId: js.Any = js.native
  var scrollIntervalMs: scala.Double = js.native
  var scrollLeftVel: js.Any = js.native
  var scrollSensitivity: scala.Double = js.native
  var scrollSpeed: scala.Double = js.native
  var scrollTopVel: js.Any = js.native
  var shouldCancelTouchScroll: scala.Boolean = js.native
  var stopListeningTo: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var subjectEl: js.Any = js.native
  def bindHandlers(): scala.Unit = js.native
  def computeScrollBounds(): scala.Unit = js.native
  def constrainScrollVel(): scala.Unit = js.native
  def destroyAutoScroll(): scala.Unit = js.native
  def endAutoScroll(): scala.Unit = js.native
  def endDrag(ev: js.Any): scala.Unit = js.native
  def endInteraction(ev: js.Any, isCancelled: js.Any): scala.Unit = js.native
  def handleDebouncedScroll(): scala.Unit = js.native
  def handleDelayEnd(initialEv: js.Any): scala.Unit = js.native
  def handleDistanceSurpassed(ev: js.Any): scala.Unit = js.native
  def handleDrag(dx: js.Any, dy: js.Any, ev: js.Any): scala.Unit = js.native
  def handleDragEnd(ev: js.Any): scala.Unit = js.native
  def handleDragStart(ev: js.Any): scala.Unit = js.native
  def handleInteractionEnd(ev: js.Any, isCancelled: js.Any): scala.Unit = js.native
  def handleInteractionStart(ev: js.Any): scala.Unit = js.native
  def handleMouseMove(ev: js.Any): scala.Unit = js.native
  def handleMove(ev: js.Any): scala.Unit = js.native
  def handleScrollEnd(): scala.Unit = js.native
  def handleTouchMove(ev: js.Any): scala.Unit = js.native
  def handleTouchScroll(ev: js.Any): scala.Unit = js.native
  def initAutoScroll(): scala.Unit = js.native
  def scrollIntervalFunc(): scala.Unit = js.native
  def setScrollVel(topVel: js.Any, leftVel: js.Any): scala.Unit = js.native
  def startDelay(initialEv: js.Any): scala.Unit = js.native
  def startDrag(ev: js.Any): scala.Unit = js.native
  def startDrag(ev: js.Any, extraOptions: js.Any): scala.Unit = js.native
  def startInteraction(ev: js.Any): scala.Unit = js.native
  def startInteraction(ev: js.Any, extraOptions: js.Any): scala.Unit = js.native
  def trigger(name: js.Any, args: js.Any*): scala.Unit = js.native
  def unbindHandlers(): scala.Unit = js.native
  def updateAutoScroll(ev: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/DragListener", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(options: js.Any) = this()
}


package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DragListener", JSImport.Namespace)
@js.native
object dragListenerMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(options: js.Any) = this()
    var delay: js.Any = js.native
    var delayTimeoutId: js.Any = js.native
    var isAutoScroll: Boolean = js.native
    var isDelayEnded: Boolean = js.native
    var isDistanceSurpassed: Boolean = js.native
    var isDragging: Boolean = js.native
    var isGeneric: Boolean = js.native
    var isInteracting: Boolean = js.native
    var isTouch: Boolean = js.native
    @JSName("listenTo")
    var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
    var minDistance: js.Any = js.native
    var options: js.Any = js.native
    var originX: js.Any = js.native
    var originY: js.Any = js.native
    var scrollAlwaysKills: Boolean = js.native
    var scrollBounds: js.Any = js.native
    var scrollEl: js.Any = js.native
    var scrollIntervalId: js.Any = js.native
    var scrollIntervalMs: Double = js.native
    var scrollLeftVel: js.Any = js.native
    var scrollSensitivity: Double = js.native
    var scrollSpeed: Double = js.native
    var scrollTopVel: js.Any = js.native
    var shouldCancelTouchScroll: Boolean = js.native
    @JSName("stopListeningTo")
    var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
    var subjectEl: js.Any = js.native
    def bindHandlers(): Unit = js.native
    def computeScrollBounds(): Unit = js.native
    def constrainScrollVel(): Unit = js.native
    def destroyAutoScroll(): Unit = js.native
    def endAutoScroll(): Unit = js.native
    def endDrag(ev: js.Any): Unit = js.native
    def endInteraction(ev: js.Any, isCancelled: js.Any): Unit = js.native
    def handleDebouncedScroll(): Unit = js.native
    def handleDelayEnd(initialEv: js.Any): Unit = js.native
    def handleDistanceSurpassed(ev: js.Any): Unit = js.native
    def handleDrag(dx: js.Any, dy: js.Any, ev: js.Any): Unit = js.native
    def handleDragEnd(ev: js.Any): Unit = js.native
    def handleDragStart(ev: js.Any): Unit = js.native
    def handleInteractionEnd(ev: js.Any, isCancelled: js.Any): Unit = js.native
    def handleInteractionStart(ev: js.Any): Unit = js.native
    def handleMouseMove(ev: js.Any): Unit = js.native
    def handleMove(ev: js.Any): Unit = js.native
    def handleScrollEnd(): Unit = js.native
    def handleTouchMove(ev: js.Any): Unit = js.native
    def handleTouchScroll(ev: js.Any): Unit = js.native
    def initAutoScroll(): Unit = js.native
    def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
    def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
    def scrollIntervalFunc(): Unit = js.native
    def setScrollVel(topVel: js.Any, leftVel: js.Any): Unit = js.native
    def startDelay(initialEv: js.Any): Unit = js.native
    def startDrag(ev: js.Any): Unit = js.native
    def startDrag(ev: js.Any, extraOptions: js.Any): Unit = js.native
    def startInteraction(ev: js.Any): Unit = js.native
    def startInteraction(ev: js.Any, extraOptions: js.Any): Unit = js.native
    def stopListeningTo(other: js.Any): js.Any = js.native
    def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
    def trigger(name: js.Any, args: js.Any*): Unit = js.native
    def unbindHandlers(): Unit = js.native
    def updateAutoScroll(ev: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(options: js.Any) = this()
  }
  
}


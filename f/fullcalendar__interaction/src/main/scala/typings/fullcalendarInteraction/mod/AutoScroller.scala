package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScroller extends StObject {
  
  /* private */ var animate: Any
  
  /* private */ var buildCaches: Any
  
  /* private */ var computeBestEdge: Any
  
  var edgeThreshold: Double
  
  var everMovedDown: Boolean
  
  var everMovedLeft: Boolean
  
  var everMovedRight: Boolean
  
  var everMovedUp: Boolean
  
  def handleMove(pageX: Double, pageY: Double): Unit
  
  /* private */ var handleSide: Any
  
  var isAnimating: Boolean
  
  var isEnabled: Boolean
  
  var maxVelocity: Double
  
  var msSinceRequest: js.UndefOr[Double] = js.undefined
  
  var pointerScreenX: Double | Null
  
  var pointerScreenY: Double | Null
  
  /* private */ var queryScrollEls: Any
  
  def requestAnimation(now: Double): Unit
  
  var scrollCaches: js.Array[ScrollGeomCache] | Null
  
  var scrollQuery: js.Array[Window | String]
  
  def start(pageX: Double, pageY: Double, scrollStartEl: HTMLElement): Unit
  
  def stop(): Unit
}
object AutoScroller {
  
  inline def apply(
    animate: Any,
    buildCaches: Any,
    computeBestEdge: Any,
    edgeThreshold: Double,
    everMovedDown: Boolean,
    everMovedLeft: Boolean,
    everMovedRight: Boolean,
    everMovedUp: Boolean,
    handleMove: (Double, Double) => Unit,
    handleSide: Any,
    isAnimating: Boolean,
    isEnabled: Boolean,
    maxVelocity: Double,
    queryScrollEls: Any,
    requestAnimation: Double => Unit,
    scrollQuery: js.Array[Window | String],
    start: (Double, Double, HTMLElement) => Unit,
    stop: () => Unit
  ): AutoScroller = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], buildCaches = buildCaches.asInstanceOf[js.Any], computeBestEdge = computeBestEdge.asInstanceOf[js.Any], edgeThreshold = edgeThreshold.asInstanceOf[js.Any], everMovedDown = everMovedDown.asInstanceOf[js.Any], everMovedLeft = everMovedLeft.asInstanceOf[js.Any], everMovedRight = everMovedRight.asInstanceOf[js.Any], everMovedUp = everMovedUp.asInstanceOf[js.Any], handleMove = js.Any.fromFunction2(handleMove), handleSide = handleSide.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], maxVelocity = maxVelocity.asInstanceOf[js.Any], queryScrollEls = queryScrollEls.asInstanceOf[js.Any], requestAnimation = js.Any.fromFunction1(requestAnimation), scrollQuery = scrollQuery.asInstanceOf[js.Any], start = js.Any.fromFunction3(start), stop = js.Any.fromFunction0(stop), pointerScreenX = null, pointerScreenY = null, scrollCaches = null)
    __obj.asInstanceOf[AutoScroller]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoScroller] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setBuildCaches(value: Any): Self = StObject.set(x, "buildCaches", value.asInstanceOf[js.Any])
    
    inline def setComputeBestEdge(value: Any): Self = StObject.set(x, "computeBestEdge", value.asInstanceOf[js.Any])
    
    inline def setEdgeThreshold(value: Double): Self = StObject.set(x, "edgeThreshold", value.asInstanceOf[js.Any])
    
    inline def setEverMovedDown(value: Boolean): Self = StObject.set(x, "everMovedDown", value.asInstanceOf[js.Any])
    
    inline def setEverMovedLeft(value: Boolean): Self = StObject.set(x, "everMovedLeft", value.asInstanceOf[js.Any])
    
    inline def setEverMovedRight(value: Boolean): Self = StObject.set(x, "everMovedRight", value.asInstanceOf[js.Any])
    
    inline def setEverMovedUp(value: Boolean): Self = StObject.set(x, "everMovedUp", value.asInstanceOf[js.Any])
    
    inline def setHandleMove(value: (Double, Double) => Unit): Self = StObject.set(x, "handleMove", js.Any.fromFunction2(value))
    
    inline def setHandleSide(value: Any): Self = StObject.set(x, "handleSide", value.asInstanceOf[js.Any])
    
    inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setMaxVelocity(value: Double): Self = StObject.set(x, "maxVelocity", value.asInstanceOf[js.Any])
    
    inline def setMsSinceRequest(value: Double): Self = StObject.set(x, "msSinceRequest", value.asInstanceOf[js.Any])
    
    inline def setMsSinceRequestUndefined: Self = StObject.set(x, "msSinceRequest", js.undefined)
    
    inline def setPointerScreenX(value: Double): Self = StObject.set(x, "pointerScreenX", value.asInstanceOf[js.Any])
    
    inline def setPointerScreenXNull: Self = StObject.set(x, "pointerScreenX", null)
    
    inline def setPointerScreenY(value: Double): Self = StObject.set(x, "pointerScreenY", value.asInstanceOf[js.Any])
    
    inline def setPointerScreenYNull: Self = StObject.set(x, "pointerScreenY", null)
    
    inline def setQueryScrollEls(value: Any): Self = StObject.set(x, "queryScrollEls", value.asInstanceOf[js.Any])
    
    inline def setRequestAnimation(value: Double => Unit): Self = StObject.set(x, "requestAnimation", js.Any.fromFunction1(value))
    
    inline def setScrollCaches(value: js.Array[ScrollGeomCache]): Self = StObject.set(x, "scrollCaches", value.asInstanceOf[js.Any])
    
    inline def setScrollCachesNull: Self = StObject.set(x, "scrollCaches", null)
    
    inline def setScrollCachesVarargs(value: ScrollGeomCache*): Self = StObject.set(x, "scrollCaches", js.Array(value*))
    
    inline def setScrollQuery(value: js.Array[Window | String]): Self = StObject.set(x, "scrollQuery", value.asInstanceOf[js.Any])
    
    inline def setScrollQueryVarargs(value: (Window | String)*): Self = StObject.set(x, "scrollQuery", js.Array(value*))
    
    inline def setStart(value: (Double, Double, HTMLElement) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}

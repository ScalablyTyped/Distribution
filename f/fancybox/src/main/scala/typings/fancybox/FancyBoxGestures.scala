package typings.fancybox

import typings.fancybox.fancyboxStrings.x
import typings.fancybox.fancyboxStrings.y
import typings.jquery.JQuery.Event
import typings.jquery.JQuery.ScrollEvent
import typings.jquery.JQuery.TouchEndEvent
import typings.jquery.JQuery.TouchMoveEvent
import typings.jquery.JQuery.TouchStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxGestures extends StObject {
  
  @JSName("$bg")
  var $bg: JQuery
  
  @JSName("$container")
  var $container: JQuery
  
  @JSName("$stage")
  var $stage: JQuery
  
  def destroy(): Unit
  
  def endPanning(): Unit
  
  def endSwiping(swiping: x | y, scrolling: Boolean): Unit
  
  def endZooming(): Unit
  
  var instance: FancyBoxInstance
  
  def limitMovement(): Unit
  
  def limitPosition(newOffsetX: Double, newOffsetY: Double, newWidth: Double, newHeight: Double): Unit
  
  def onPan(): Unit
  
  def onSwipe(e: Event): Unit
  
  def onTap(e: Event): Unit
  
  def onZoom(): Unit
  
  def onscroll(e: ScrollEvent[Any, Any, Any, Any]): Unit
  
  def ontouchend(e: TouchEndEvent[Any, Any, Any, Any]): Unit
  
  def ontouchmove(e: TouchMoveEvent[Any, Any, Any, Any]): Unit
  
  def ontouchstart(e: TouchStartEvent[Any, Any, Any, Any]): Unit
}
object FancyBoxGestures {
  
  inline def apply(
    $bg: JQuery,
    $container: JQuery,
    $stage: JQuery,
    destroy: () => Unit,
    endPanning: () => Unit,
    endSwiping: (x | y, Boolean) => Unit,
    endZooming: () => Unit,
    instance: FancyBoxInstance,
    limitMovement: () => Unit,
    limitPosition: (Double, Double, Double, Double) => Unit,
    onPan: () => Unit,
    onSwipe: Event => Unit,
    onTap: Event => Unit,
    onZoom: () => Unit,
    onscroll: ScrollEvent[Any, Any, Any, Any] => Unit,
    ontouchend: TouchEndEvent[Any, Any, Any, Any] => Unit,
    ontouchmove: TouchMoveEvent[Any, Any, Any, Any] => Unit,
    ontouchstart: TouchStartEvent[Any, Any, Any, Any] => Unit
  ): FancyBoxGestures = {
    val __obj = js.Dynamic.literal($bg = $bg.asInstanceOf[js.Any], $container = $container.asInstanceOf[js.Any], $stage = $stage.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), endPanning = js.Any.fromFunction0(endPanning), endSwiping = js.Any.fromFunction2(endSwiping), endZooming = js.Any.fromFunction0(endZooming), instance = instance.asInstanceOf[js.Any], limitMovement = js.Any.fromFunction0(limitMovement), limitPosition = js.Any.fromFunction4(limitPosition), onPan = js.Any.fromFunction0(onPan), onSwipe = js.Any.fromFunction1(onSwipe), onTap = js.Any.fromFunction1(onTap), onZoom = js.Any.fromFunction0(onZoom), onscroll = js.Any.fromFunction1(onscroll), ontouchend = js.Any.fromFunction1(ontouchend), ontouchmove = js.Any.fromFunction1(ontouchmove), ontouchstart = js.Any.fromFunction1(ontouchstart))
    __obj.asInstanceOf[FancyBoxGestures]
  }
  
  extension [Self <: FancyBoxGestures](x: Self) {
    
    inline def set$bg(value: JQuery): Self = StObject.set(x, "$bg", value.asInstanceOf[js.Any])
    
    inline def set$container(value: JQuery): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
    
    inline def set$stage(value: JQuery): Self = StObject.set(x, "$stage", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setEndPanning(value: () => Unit): Self = StObject.set(x, "endPanning", js.Any.fromFunction0(value))
    
    inline def setEndSwiping(value: (typings.fancybox.fancyboxStrings.x | y, Boolean) => Unit): Self = StObject.set(x, "endSwiping", js.Any.fromFunction2(value))
    
    inline def setEndZooming(value: () => Unit): Self = StObject.set(x, "endZooming", js.Any.fromFunction0(value))
    
    inline def setInstance(value: FancyBoxInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setLimitMovement(value: () => Unit): Self = StObject.set(x, "limitMovement", js.Any.fromFunction0(value))
    
    inline def setLimitPosition(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "limitPosition", js.Any.fromFunction4(value))
    
    inline def setOnPan(value: () => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction0(value))
    
    inline def setOnSwipe(value: Event => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
    
    inline def setOnTap(value: Event => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
    
    inline def setOnZoom(value: () => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction0(value))
    
    inline def setOnscroll(value: ScrollEvent[Any, Any, Any, Any] => Unit): Self = StObject.set(x, "onscroll", js.Any.fromFunction1(value))
    
    inline def setOntouchend(value: TouchEndEvent[Any, Any, Any, Any] => Unit): Self = StObject.set(x, "ontouchend", js.Any.fromFunction1(value))
    
    inline def setOntouchmove(value: TouchMoveEvent[Any, Any, Any, Any] => Unit): Self = StObject.set(x, "ontouchmove", js.Any.fromFunction1(value))
    
    inline def setOntouchstart(value: TouchStartEvent[Any, Any, Any, Any] => Unit): Self = StObject.set(x, "ontouchstart", js.Any.fromFunction1(value))
  }
}

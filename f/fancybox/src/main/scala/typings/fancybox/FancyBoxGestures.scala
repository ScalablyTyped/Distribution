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

@js.native
trait FancyBoxGestures extends StObject {
  
  @JSName("$bg")
  var $bg: JQuery = js.native
  
  @JSName("$container")
  var $container: JQuery = js.native
  
  @JSName("$stage")
  var $stage: JQuery = js.native
  
  def destroy(): Unit = js.native
  
  def endPanning(): Unit = js.native
  
  @JSName("endSwiping")
  def endSwiping_x(swiping: x, scrolling: Boolean): Unit = js.native
  @JSName("endSwiping")
  def endSwiping_y(swiping: y, scrolling: Boolean): Unit = js.native
  
  def endZooming(): Unit = js.native
  
  var instance: FancyBoxInstance = js.native
  
  def limitMovement(): Unit = js.native
  
  def limitPosition(newOffsetX: Double, newOffsetY: Double, newWidth: Double, newHeight: Double): Unit = js.native
  
  def onPan(): Unit = js.native
  
  def onSwipe(e: Event): Unit = js.native
  
  def onTap(e: Event): Unit = js.native
  
  def onZoom(): Unit = js.native
  
  def onscroll(e: ScrollEvent[js.Any, js.Any, js.Any, js.Any]): Unit = js.native
  
  def ontouchend(e: TouchEndEvent[js.Any, js.Any, js.Any, js.Any]): Unit = js.native
  
  def ontouchmove(e: TouchMoveEvent[js.Any, js.Any, js.Any, js.Any]): Unit = js.native
  
  def ontouchstart(e: TouchStartEvent[js.Any, js.Any, js.Any, js.Any]): Unit = js.native
}

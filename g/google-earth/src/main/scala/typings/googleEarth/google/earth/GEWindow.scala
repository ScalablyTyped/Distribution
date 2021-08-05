package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEWindow
  extends StObject
     with GEEventEmitter {
  
  /**
    * Removes focus from the Google Earth object.
    */
  def blur(): Unit
  
  /**
    * Gives the Google Earth object focus.
    */
  def focus(): Unit
  
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def getVisibility(): Boolean
  
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def setVisibility(visibility: Boolean): Unit
}
object GEWindow {
  
  inline def apply(
    blur: () => Unit,
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    focus: () => Unit,
    getVisibility: () => Boolean,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    setVisibility: Boolean => Unit
  ): GEWindow = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), focus = js.Any.fromFunction0(focus), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[GEWindow]
  }
  
  extension [Self <: GEWindow](x: Self) {
    
    inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setGetVisibility(value: () => Boolean): Self = StObject.set(x, "getVisibility", js.Any.fromFunction0(value))
    
    inline def setSetVisibility(value: Boolean => Unit): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
  }
}

package typings.fancybox

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxFullScreen extends StObject {
  
  def enabled(): Boolean
  
  def exit(): Unit
  
  def isFullscreen(): Boolean
  
  def request(elem: HTMLElement): Unit
  
  def toggle(elem: HTMLElement): Unit
}
object FancyBoxFullScreen {
  
  @scala.inline
  def apply(
    enabled: () => Boolean,
    exit: () => Unit,
    isFullscreen: () => Boolean,
    request: HTMLElement => Unit,
    toggle: HTMLElement => Unit
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), exit = js.Any.fromFunction0(exit), isFullscreen = js.Any.fromFunction0(isFullscreen), request = js.Any.fromFunction1(request), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
  
  @scala.inline
  implicit class FancyBoxFullScreenMutableBuilder[Self <: FancyBoxFullScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: () => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFullscreen(value: () => Boolean): Self = StObject.set(x, "isFullscreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequest(value: HTMLElement => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: HTMLElement => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
  }
}

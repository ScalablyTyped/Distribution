package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserWindowProxy extends StObject {
  
  // Docs: https://electronjs.org/docs/api/browser-window-proxy
  /**
    * Removes focus from the child window.
    */
  def blur(): Unit = js.native
  
  /**
    * Forcefully closes the child window without calling its unload event.
    */
  def close(): Unit = js.native
  
  var closed: Boolean = js.native
  
  /**
    * Evaluates the code in the child window.
    */
  def eval(code: String): Unit = js.native
  
  /**
    * Focuses the child window (brings the window to front).
    */
  def focus(): Unit = js.native
  
  /**
    * Sends a message to the child window with the specified origin or `*` for no
    * origin preference.
    *
    * In addition to these methods, the child window implements `window.opener` object
    * with no properties and a single method.
    */
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  
  /**
    * Invokes the print dialog on the child window.
    */
  def print(): Unit = js.native
}
object BrowserWindowProxy {
  
  @scala.inline
  def apply(
    blur: () => Unit,
    close: () => Unit,
    closed: Boolean,
    eval: String => Unit,
    focus: () => Unit,
    postMessage: (js.Any, String) => Unit,
    print: () => Unit
  ): BrowserWindowProxy = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any], eval = js.Any.fromFunction1(eval), focus = js.Any.fromFunction0(focus), postMessage = js.Any.fromFunction2(postMessage), print = js.Any.fromFunction0(print))
    __obj.asInstanceOf[BrowserWindowProxy]
  }
  
  @scala.inline
  implicit class BrowserWindowProxyMutableBuilder[Self <: BrowserWindowProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEval(value: String => Unit): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostMessage(value: (js.Any, String) => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrint(value: () => Unit): Self = StObject.set(x, "print", js.Any.fromFunction0(value))
  }
}

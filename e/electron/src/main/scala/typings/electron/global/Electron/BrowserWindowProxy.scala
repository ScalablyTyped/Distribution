package typings.electron.global.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.BrowserWindowProxy")
@js.native
class BrowserWindowProxy ()
  extends StObject
     with typings.electron.Electron.BrowserWindowProxy {
  
  // Docs: https://electronjs.org/docs/api/browser-window-proxy
  /**
    * Removes focus from the child window.
    */
  /* CompleteClass */
  override def blur(): Unit = js.native
  
  /**
    * Forcefully closes the child window without calling its unload event.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  var closed: Boolean = js.native
  
  /**
    * Evaluates the code in the child window.
    */
  /* CompleteClass */
  override def eval(code: String): Unit = js.native
  
  /**
    * Focuses the child window (brings the window to front).
    */
  /* CompleteClass */
  override def focus(): Unit = js.native
  
  /**
    * Sends a message to the child window with the specified origin or `*` for no
    * origin preference.
    *
    * In addition to these methods, the child window implements `window.opener` object
    * with no properties and a single method.
    */
  /* CompleteClass */
  override def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  
  /**
    * Invokes the print dialog on the child window.
    */
  /* CompleteClass */
  override def print(): Unit = js.native
}

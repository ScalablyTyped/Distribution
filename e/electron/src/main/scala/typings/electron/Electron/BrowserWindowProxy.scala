package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserWindowProxy")
@js.native
class BrowserWindowProxy () extends EventEmitter {
  var closed: Boolean = js.native
  // Docs: http://electronjs.org/docs/api/browser-window-proxy
  /**
    * Removes focus from the child window.
    */
  def blur(): Unit = js.native
  /**
    * Forcefully closes the child window without calling its unload event.
    */
  def close(): Unit = js.native
  /**
    * Evaluates the code in the child window.
    */
  def eval(code: String): Unit = js.native
  /**
    * Focuses the child window (brings the window to front).
    */
  def focus(): Unit = js.native
  /**
    * Sends a message to the child window with the specified origin or * for no origin
    * preference. In addition to these methods, the child window implements
    * window.opener object with no properties and a single method.
    */
  def postMessage(message: String, targetOrigin: String): Unit = js.native
  /**
    * Invokes the print dialog on the child window.
    */
  def print(): Unit = js.native
}


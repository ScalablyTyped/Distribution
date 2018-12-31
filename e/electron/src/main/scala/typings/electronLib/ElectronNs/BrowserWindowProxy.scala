package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserWindowProxy")
@js.native
class BrowserWindowProxy () extends EventEmitter {
  var closed: scala.Boolean = js.native
  // Docs: http://electronjs.org/docs/api/browser-window-proxy
  /**
    * Removes focus from the child window.
    */
  def blur(): scala.Unit = js.native
  /**
    * Forcefully closes the child window without calling its unload event.
    */
  def close(): scala.Unit = js.native
  /**
    * Evaluates the code in the child window.
    */
  def eval(code: java.lang.String): scala.Unit = js.native
  /**
    * Focuses the child window (brings the window to front).
    */
  def focus(): scala.Unit = js.native
  /**
    * Sends a message to the child window with the specified origin or * for no origin
    * preference. In addition to these methods, the child window implements
    * window.opener object with no properties and a single method.
    */
  def postMessage(message: java.lang.String, targetOrigin: java.lang.String): scala.Unit = js.native
  /**
    * Invokes the print dialog on the child window.
    */
  def print(): scala.Unit = js.native
}


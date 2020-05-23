package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserWindowProxy extends js.Object {
  var closed: Boolean
  // Docs: http://electronjs.org/docs/api/browser-window-proxy
  /**
    * Removes focus from the child window.
    */
  def blur(): Unit
  /**
    * Forcefully closes the child window without calling its unload event.
    */
  def close(): Unit
  /**
    * Evaluates the code in the child window.
    */
  def eval(code: String): Unit
  /**
    * Focuses the child window (brings the window to front).
    */
  def focus(): Unit
  /**
    * Sends a message to the child window with the specified origin or `*` for no
    * origin preference.
    *
    * In addition to these methods, the child window implements `window.opener` object
    * with no properties and a single method.
    */
  def postMessage(message: js.Any, targetOrigin: String): Unit
  /**
    * Invokes the print dialog on the child window.
    */
  def print(): Unit
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
}


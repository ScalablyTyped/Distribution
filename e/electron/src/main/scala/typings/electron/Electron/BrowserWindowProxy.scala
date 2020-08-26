package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserWindowProxy extends js.Object {
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
  implicit class BrowserWindowProxyOps[Self <: BrowserWindowProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEval(value: String => Unit): Self = this.set("eval", js.Any.fromFunction1(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setPostMessage(value: (js.Any, String) => Unit): Self = this.set("postMessage", js.Any.fromFunction2(value))
    @scala.inline
    def setPrint(value: () => Unit): Self = this.set("print", js.Any.fromFunction0(value))
  }
  
}


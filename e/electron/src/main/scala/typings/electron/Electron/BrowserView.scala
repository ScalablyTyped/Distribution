package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserView extends js.Object {
  var id: Double
  var webContents: WebContents_
  /**
    * Force closing the view, the `unload` and `beforeunload` events won't be emitted
    * for the web page. After you're done with a view, call this function in order to
    * free memory and other resources as soon as possible.
    */
  def destroy(): Unit
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  def getBounds(): Rectangle
  /**
    * Whether the view is destroyed.
    */
  def isDestroyed(): Boolean
  def setAutoResize(options: AutoResizeOptions): Unit
  def setBackgroundColor(color: String): Unit
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  def setBounds(bounds: Rectangle): Unit
}

object BrowserView {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getBounds: () => Rectangle,
    id: Double,
    isDestroyed: () => Boolean,
    setAutoResize: AutoResizeOptions => Unit,
    setBackgroundColor: String => Unit,
    setBounds: Rectangle => Unit,
    webContents: WebContents_
  ): BrowserView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getBounds = js.Any.fromFunction0(getBounds), id = id.asInstanceOf[js.Any], isDestroyed = js.Any.fromFunction0(isDestroyed), setAutoResize = js.Any.fromFunction1(setAutoResize), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setBounds = js.Any.fromFunction1(setBounds), webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserView]
  }
}


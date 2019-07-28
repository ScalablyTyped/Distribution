package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
class BrowserView () extends EventEmitter {
  def this(options: BrowserViewConstructorOptions) = this()
  var id: Double = js.native
  var webContents: WebContents = js.native
  /**
    * Force closing the view, the unload and beforeunload events won't be emitted for
    * the web page. After you're done with a view, call this function in order to free
    * memory and other resources as soon as possible.
    */
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def setAutoResize(options: AutoResizeOptions): Unit = js.native
  def setBackgroundColor(color: String): Unit = js.native
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    */
  def setBounds(bounds: Rectangle): Unit = js.native
}

/* static members */
@JSGlobal("Electron.BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: Double): BrowserView = js.native
  def fromWebContents(webContents: WebContents): BrowserView | Null = js.native
  def getAllViews(): js.Array[BrowserView] = js.native
}


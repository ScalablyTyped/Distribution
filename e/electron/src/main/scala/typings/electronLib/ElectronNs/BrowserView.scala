package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserView")
@js.native
class BrowserView () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/browser-view
  def this(options: BrowserViewConstructorOptions) = this()
  var id: scala.Double = js.native
  var webContents: WebContents = js.native
  /**
       * Force closing the view, the unload and beforeunload events won't be emitted for
       * the web page. After you're done with a view, call this function in order to free
       * memory and other resources as soon as possible.
       */
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def setAutoResize(options: AutoResizeOptions): scala.Unit = js.native
  def setBackgroundColor(color: java.lang.String): scala.Unit = js.native
  /**
       * Resizes and moves the view to the supplied bounds relative to the window.
       */
  def setBounds(bounds: Rectangle): scala.Unit = js.native
}

@JSGlobal("Electron.BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: scala.Double): electronLib.ElectronNs.BrowserView = js.native
  def fromWebContents(webContents: electronLib.ElectronNs.WebContents): electronLib.ElectronNs.BrowserView | scala.Null = js.native
  def getAllViews(): js.Array[electronLib.ElectronNs.BrowserView] = js.native
}


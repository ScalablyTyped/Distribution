package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
class BrowserView () extends js.Object {
  def this(options: BrowserViewConstructorOptions) = this()
  var id: Double = js.native
  var webContents: WebContents_ = js.native
  /**
    * Force closing the view, the `unload` and `beforeunload` events won't be emitted
    * for the web page. After you're done with a view, call this function in order to
    * free memory and other resources as soon as possible.
    */
  def destroy(): Unit = js.native
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  def getBounds(): Rectangle = js.native
  /**
    * Whether the view is destroyed.
    */
  def isDestroyed(): Boolean = js.native
  def setAutoResize(options: AutoResizeOptions): Unit = js.native
  def setBackgroundColor(color: String): Unit = js.native
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  def setBounds(bounds: Rectangle): Unit = js.native
}

/* static members */
@JSGlobal("Electron.BrowserView")
@js.native
object BrowserView extends js.Object {
  /**
    * The view with the given `id`.
    */
  def fromId(id: Double): BrowserView = js.native
  /**
    * The BrowserView that owns the given `webContents` or `null` if the contents are
    * not owned by a BrowserView.
    */
  def fromWebContents(webContents: WebContents_): BrowserView | Null = js.native
  /**
    * An array of all opened BrowserViews.
    */
  def getAllViews(): js.Array[BrowserView] = js.native
}


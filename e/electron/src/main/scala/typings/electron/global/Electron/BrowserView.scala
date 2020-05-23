package typings.electron.global.Electron

import typings.electron.Electron.AutoResizeOptions
import typings.electron.Electron.BrowserViewConstructorOptions
import typings.electron.Electron.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
class BrowserView ()
  extends typings.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var webContents: typings.electron.Electron.WebContents_ = js.native
  /**
    * Force closing the view, the `unload` and `beforeunload` events won't be emitted
    * for the web page. After you're done with a view, call this function in order to
    * free memory and other resources as soon as possible.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  /* CompleteClass */
  override def getBounds(): Rectangle = js.native
  /**
    * Whether the view is destroyed.
    */
  /* CompleteClass */
  override def isDestroyed(): Boolean = js.native
  /* CompleteClass */
  override def setAutoResize(options: AutoResizeOptions): Unit = js.native
  /* CompleteClass */
  override def setBackgroundColor(color: String): Unit = js.native
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  /* CompleteClass */
  override def setBounds(bounds: Rectangle): Unit = js.native
}

/* static members */
@JSGlobal("Electron.BrowserView")
@js.native
object BrowserView extends js.Object {
  /**
    * The view with the given `id`.
    */
  def fromId(id: Double): typings.electron.Electron.BrowserView = js.native
  /**
    * The BrowserView that owns the given `webContents` or `null` if the contents are
    * not owned by a BrowserView.
    */
  def fromWebContents(webContents: typings.electron.Electron.WebContents_): typings.electron.Electron.BrowserView | Null = js.native
  /**
    * An array of all opened BrowserViews.
    */
  def getAllViews(): js.Array[typings.electron.Electron.BrowserView] = js.native
}


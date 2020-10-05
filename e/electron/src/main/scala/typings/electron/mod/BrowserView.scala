package typings.electron.mod

import typings.electron.Electron.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
class BrowserView ()
  extends typings.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "BrowserView")
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


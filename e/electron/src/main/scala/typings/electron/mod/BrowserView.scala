package typings.electron.mod

import typings.electron.Electron.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
class BrowserView ()
  extends typings.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: Double): typings.electron.Electron.BrowserView = js.native
  def fromWebContents(webContents: typings.electron.Electron.WebContents_): typings.electron.Electron.BrowserView | Null = js.native
  def getAllViews(): js.Array[typings.electron.Electron.BrowserView] = js.native
}


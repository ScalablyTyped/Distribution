package typings.electron.electronMod

import typings.electron.ElectronNs.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
class BrowserView ()
  extends typings.electron.ElectronNs.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: Double): typings.electron.ElectronNs.BrowserView = js.native
  def fromWebContents(webContents: typings.electron.ElectronNs.WebContents): typings.electron.ElectronNs.BrowserView | Null = js.native
  def getAllViews(): js.Array[typings.electron.ElectronNs.BrowserView] = js.native
}


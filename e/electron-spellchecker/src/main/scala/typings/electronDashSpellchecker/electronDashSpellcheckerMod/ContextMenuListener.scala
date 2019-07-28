package typings.electronDashSpellchecker.electronDashSpellcheckerMod

import typings.electron.ElectronNs.BrowserWindow
import typings.electron.ElectronNs.ContextMenuParams
import typings.electron.ElectronNs.WebviewTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", "ContextMenuListener")
@js.native
class ContextMenuListener protected () extends js.Object {
  def this(handler: js.Function1[/* info */ ContextMenuParams, Unit]) = this()
  def this(handler: js.Function1[/* info */ ContextMenuParams, Unit], target: BrowserWindow) = this()
  def this(handler: js.Function1[/* info */ ContextMenuParams, Unit], target: WebviewTag) = this()
  def unsubscribe(): Unit = js.native
}


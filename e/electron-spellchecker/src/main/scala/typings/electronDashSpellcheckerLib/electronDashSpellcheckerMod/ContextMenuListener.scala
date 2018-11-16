package typings
package electronDashSpellcheckerLib.electronDashSpellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", "ContextMenuListener")
@js.native
class ContextMenuListener protected () extends js.Object {
  def this(handler: js.Function1[/* info */ electronLib.ElectronNs.ContextMenuParams, scala.Unit]) = this()
  def this(handler: js.Function1[/* info */ electronLib.ElectronNs.ContextMenuParams, scala.Unit], target: electronLib.ElectronNs.BrowserWindow) = this()
  def this(handler: js.Function1[/* info */ electronLib.ElectronNs.ContextMenuParams, scala.Unit], target: electronLib.ElectronNs.WebviewTag) = this()
  def unsubscribe(): scala.Unit = js.native
}


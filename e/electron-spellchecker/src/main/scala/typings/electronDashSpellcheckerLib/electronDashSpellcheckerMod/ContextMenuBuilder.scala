package typings
package electronDashSpellcheckerLib.electronDashSpellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", "ContextMenuBuilder")
@js.native
class ContextMenuBuilder () extends js.Object {
  def this(spellCheckHandler: SpellCheckHandler) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: electronLib.ElectronNs.BrowserWindow) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: electronLib.ElectronNs.WebviewTag) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: electronLib.ElectronNs.BrowserWindow, debugMode: scala.Boolean) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: electronLib.ElectronNs.WebviewTag, debugMode: scala.Boolean) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: scala.Null, debugMode: scala.Boolean) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: electronLib.ElectronNs.BrowserWindow, debugMode: scala.Boolean, processMenu: js.Function1[/* menu */ electronLib.ElectronNs.Menu, electronLib.ElectronNs.Menu]) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: electronLib.ElectronNs.WebviewTag, debugMode: scala.Boolean, processMenu: js.Function1[/* menu */ electronLib.ElectronNs.Menu, electronLib.ElectronNs.Menu]) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: scala.Null, debugMode: scala.Boolean, processMenu: js.Function1[/* menu */ electronLib.ElectronNs.Menu, electronLib.ElectronNs.Menu]) = this()
  def setAlternateStringFormatter(formatter: org.scalablytyped.runtime.StringDictionary[ContextMenuFormatter]): scala.Unit = js.native
  def showPopupMenu(info: electronLib.ElectronNs.ContextMenuParams): scala.Unit = js.native
}


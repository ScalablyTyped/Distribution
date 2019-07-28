package typings.electronDashSpellchecker.electronDashSpellcheckerMod

import org.scalablytyped.runtime.StringDictionary
import typings.electron.ElectronNs.BrowserWindow
import typings.electron.ElectronNs.ContextMenuParams
import typings.electron.ElectronNs.Menu
import typings.electron.ElectronNs.WebviewTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", "ContextMenuBuilder")
@js.native
class ContextMenuBuilder () extends js.Object {
  def this(spellCheckHandler: SpellCheckHandler) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: BrowserWindow) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: WebviewTag) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: Null, debugMode: Boolean) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: BrowserWindow, debugMode: Boolean) = this()
  def this(spellCheckHandler: SpellCheckHandler, target: WebviewTag, debugMode: Boolean) = this()
  def this(
    spellCheckHandler: SpellCheckHandler,
    target: Null,
    debugMode: Boolean,
    processMenu: js.Function1[/* menu */ Menu, Menu]
  ) = this()
  def this(
    spellCheckHandler: SpellCheckHandler,
    target: BrowserWindow,
    debugMode: Boolean,
    processMenu: js.Function1[/* menu */ Menu, Menu]
  ) = this()
  def this(
    spellCheckHandler: SpellCheckHandler,
    target: WebviewTag,
    debugMode: Boolean,
    processMenu: js.Function1[/* menu */ Menu, Menu]
  ) = this()
  def setAlternateStringFormatter(formatter: StringDictionary[ContextMenuFormatter]): Unit = js.native
  def showPopupMenu(info: ContextMenuParams): Unit = js.native
}


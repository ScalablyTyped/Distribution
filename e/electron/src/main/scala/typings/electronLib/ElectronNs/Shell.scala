package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shell extends js.Object {
  // Docs: http://electronjs.org/docs/api/shell
  /**
    * Play the beep sound.
    */
  def beep(): scala.Unit = js.native
  /**
    * Move the given file to trash and returns a boolean status for the operation.
    */
  def moveItemToTrash(fullPath: java.lang.String): scala.Boolean = js.native
  /**
    * Open the given external protocol URL in the desktop's default manner. (For
    * example, mailto: URLs in the user's default mail agent).
    */
  def openExternal(url: java.lang.String): js.Promise[scala.Unit] = js.native
  def openExternal(url: java.lang.String, options: OpenExternalOptions): js.Promise[scala.Unit] = js.native
  /**
    * Open the given external protocol URL in the desktop's default manner. (For
    * example, mailto: URLs in the user's default mail agent).
    */
  def openExternalSync(url: java.lang.String): scala.Boolean = js.native
  def openExternalSync(url: java.lang.String, options: OpenExternalSyncOptions): scala.Boolean = js.native
  /**
    * Open the given file in the desktop's default manner.
    */
  def openItem(fullPath: java.lang.String): scala.Boolean = js.native
  /**
    * Resolves the shortcut link at shortcutPath. An exception will be thrown when any
    * error happens.
    */
  def readShortcutLink(shortcutPath: java.lang.String): ShortcutDetails = js.native
  /**
    * Show the given file in a file manager. If possible, select the file.
    */
  def showItemInFolder(fullPath: java.lang.String): scala.Boolean = js.native
  /**
    * Creates or updates a shortcut link at shortcutPath.
    */
  def writeShortcutLink(shortcutPath: java.lang.String, options: ShortcutDetails): scala.Boolean = js.native
  /**
    * Creates or updates a shortcut link at shortcutPath.
    */
  @JSName("writeShortcutLink")
  def writeShortcutLink_create(
    shortcutPath: java.lang.String,
    operation: electronLib.electronLibStrings.create,
    options: ShortcutDetails
  ): scala.Boolean = js.native
  @JSName("writeShortcutLink")
  def writeShortcutLink_replace(
    shortcutPath: java.lang.String,
    operation: electronLib.electronLibStrings.replace,
    options: ShortcutDetails
  ): scala.Boolean = js.native
  @JSName("writeShortcutLink")
  def writeShortcutLink_update(
    shortcutPath: java.lang.String,
    operation: electronLib.electronLibStrings.update,
    options: ShortcutDetails
  ): scala.Boolean = js.native
}


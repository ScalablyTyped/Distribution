package typings.electron.Electron

import typings.electron.electronStrings.create
import typings.electron.electronStrings.replace
import typings.electron.electronStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shell_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/shell
  /**
    * Play the beep sound.
    */
  def beep(): Unit = js.native
  /**
    * Move the given file to trash and returns a boolean status for the operation.
    */
  def moveItemToTrash(fullPath: String): Boolean = js.native
  /**
    * Open the given external protocol URL in the desktop's default manner. (For
    * example, mailto: URLs in the user's default mail agent).
    */
  def openExternal(url: String): js.Promise[Unit] = js.native
  def openExternal(url: String, options: OpenExternalOptions): js.Promise[Unit] = js.native
  /**
    * Open the given external protocol URL in the desktop's default manner. (For
    * example, mailto: URLs in the user's default mail agent). Deprecated
    */
  def openExternalSync(url: String): Boolean = js.native
  def openExternalSync(url: String, options: OpenExternalSyncOptions): Boolean = js.native
  /**
    * Open the given file in the desktop's default manner.
    */
  def openItem(fullPath: String): Boolean = js.native
  /**
    * Resolves the shortcut link at shortcutPath. An exception will be thrown when any
    * error happens.
    */
  def readShortcutLink(shortcutPath: String): ShortcutDetails = js.native
  /**
    * Show the given file in a file manager. If possible, select the file.
    */
  def showItemInFolder(fullPath: String): Unit = js.native
  /**
    * Creates or updates a shortcut link at shortcutPath.
    */
  def writeShortcutLink(shortcutPath: String, options: ShortcutDetails): Boolean = js.native
  /**
    * Creates or updates a shortcut link at shortcutPath.
    */
  @JSName("writeShortcutLink")
  def writeShortcutLink_create(shortcutPath: String, operation: create, options: ShortcutDetails): Boolean = js.native
  @JSName("writeShortcutLink")
  def writeShortcutLink_replace(shortcutPath: String, operation: replace, options: ShortcutDetails): Boolean = js.native
  @JSName("writeShortcutLink")
  def writeShortcutLink_update(shortcutPath: String, operation: update, options: ShortcutDetails): Boolean = js.native
}


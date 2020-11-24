package typings.electron.Electron

import typings.electron.electronStrings.create
import typings.electron.electronStrings.replace
import typings.electron.electronStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shell extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/shell
  /**
    * Play the beep sound.
    */
  def beep(): Unit = js.native
  
  /**
    * Whether the item was successfully moved to the trash or otherwise deleted.
    * 
  Move the given file to trash and returns a boolean status for the operation.
    */
  def moveItemToTrash(fullPath: String): Boolean = js.native
  def moveItemToTrash(fullPath: String, deleteOnFail: Boolean): Boolean = js.native
  
  /**
    * Open the given external protocol URL in the desktop's default manner. (For
    * example, mailto: URLs in the user's default mail agent).
    */
  def openExternal(url: String): js.Promise[Unit] = js.native
  def openExternal(url: String, options: OpenExternalOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves with a string containing the error message corresponding to the failure
    * if a failure occurred, otherwise "".
    * 
  Open the given file in the desktop's default manner.
    */
  def openPath(path: String): js.Promise[String] = js.native
  
  /**
    * Resolves the shortcut link at `shortcutPath`.
    * 
  An exception will be thrown when any error happens.
    *
    * @platform win32
    */
  def readShortcutLink(shortcutPath: String): ShortcutDetails = js.native
  
  /**
    * Show the given file in a file manager. If possible, select the file.
    */
  def showItemInFolder(fullPath: String): Unit = js.native
  
  /**
    * Whether the shortcut was created successfully.
    * 
  Creates or updates a shortcut link at `shortcutPath`.
    *
    * @platform win32
    */
  def writeShortcutLink(shortcutPath: String, options: ShortcutDetails): Boolean = js.native
  /**
    * Whether the shortcut was created successfully.
    * 
  Creates or updates a shortcut link at `shortcutPath`.
    *
    * @platform win32
    */
  @JSName("writeShortcutLink")
  def writeShortcutLink_create(shortcutPath: String, operation: create, options: ShortcutDetails): Boolean = js.native
  @JSName("writeShortcutLink")
  def writeShortcutLink_replace(shortcutPath: String, operation: replace, options: ShortcutDetails): Boolean = js.native
  @JSName("writeShortcutLink")
  def writeShortcutLink_update(shortcutPath: String, operation: update, options: ShortcutDetails): Boolean = js.native
}

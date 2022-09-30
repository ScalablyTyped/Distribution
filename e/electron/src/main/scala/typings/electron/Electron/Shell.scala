package typings.electron.Electron

import typings.electron.electronStrings.create
import typings.electron.electronStrings.replace
import typings.electron.electronStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shell extends StObject {
  
  // Docs: https://electronjs.org/docs/api/shell
  /**
    * Play the beep sound.
    */
  def beep(): Unit = js.native
  
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
    * Open the given file in the desktop's default manner.
    */
  def openPath(path: String): js.Promise[String] = js.native
  
  /**
    * Resolves the shortcut link at `shortcutPath`.
    *
    * An exception will be thrown when any error happens.
    *
    * @platform win32
    */
  def readShortcutLink(shortcutPath: String): ShortcutDetails = js.native
  
  /**
    * Show the given file in a file manager. If possible, select the file.
    */
  def showItemInFolder(fullPath: String): Unit = js.native
  
  /**
    * Resolves when the operation has been completed. Rejects if there was an error
    * while deleting the requested item.
    *
    * This moves a path to the OS-specific trash location (Trash on macOS, Recycle Bin
    * on Windows, and a desktop-environment-specific location on Linux).
    */
  def trashItem(path: String): js.Promise[Unit] = js.native
  
  /**
    * Whether the shortcut was created successfully.
    *
    * Creates or updates a shortcut link at `shortcutPath`.
    *
    * @platform win32
    */
  def writeShortcutLink(shortcutPath: String, operation: create | update | replace, options: ShortcutDetails): Boolean = js.native
  /**
    * Whether the shortcut was created successfully.
    *
    * Creates or updates a shortcut link at `shortcutPath`.
    *
    * @platform win32
    */
  def writeShortcutLink(shortcutPath: String, options: ShortcutDetails): Boolean = js.native
}

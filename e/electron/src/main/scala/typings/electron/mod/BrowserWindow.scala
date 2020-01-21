package typings.electron.mod

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.DevToolsExtensions
import typings.electron.Electron.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "BrowserWindow")
@js.native
class BrowserWindow ()
  extends typings.electron.Electron.BrowserWindow {
  def this(options: BrowserWindowConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "BrowserWindow")
@js.native
object BrowserWindow extends js.Object {
  /**
    * Adds DevTools extension located at path, and returns extension's name. The
    * extension will be remembered so you only need to call this API once, this API is
    * not for programming use. If you try to add an extension that has already been
    * loaded, this method will not return and instead log a warning to the console.
    * The method will also not return if the extension's manifest is missing or
    * incomplete. Note: This API cannot be called before the ready event of the app
    * module is emitted.
    */
  def addDevToolsExtension(path: String): Unit = js.native
  /**
    * Adds Chrome extension located at path, and returns extension's name. The method
    * will also not return if the extension's manifest is missing or incomplete. Note:
    * This API cannot be called before the ready event of the app module is emitted.
    */
  def addExtension(path: String): Unit = js.native
  def fromBrowserView(browserView: typings.electron.Electron.BrowserView): typings.electron.Electron.BrowserWindow | Null = js.native
  def fromId(id: Double): typings.electron.Electron.BrowserWindow = js.native
  def fromWebContents(webContents: typings.electron.Electron.WebContents_): typings.electron.Electron.BrowserWindow = js.native
  def getAllWindows(): js.Array[typings.electron.Electron.BrowserWindow] = js.native
  /**
    * To check if a DevTools extension is installed you can run the following: Note:
    * This API cannot be called before the ready event of the app module is emitted.
    */
  def getDevToolsExtensions(): DevToolsExtensions = js.native
  /**
    * Note: This API cannot be called before the ready event of the app module is
    * emitted.
    */
  def getExtensions(): Extensions = js.native
  def getFocusedWindow(): typings.electron.Electron.BrowserWindow | Null = js.native
  /**
    * Remove a DevTools extension by name. Note: This API cannot be called before the
    * ready event of the app module is emitted.
    */
  def removeDevToolsExtension(name: String): Unit = js.native
  /**
    * Remove a Chrome extension by name. Note: This API cannot be called before the
    * ready event of the app module is emitted.
    */
  def removeExtension(name: String): Unit = js.native
}


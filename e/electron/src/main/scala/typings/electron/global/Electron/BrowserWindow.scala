package typings.electron.global.Electron

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.ExtensionInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserWindow")
@js.native
/**
  * BrowserWindow
  */
class BrowserWindow ()
  extends typings.electron.Electron.BrowserWindow {
  def this(options: BrowserWindowConstructorOptions) = this()
}

/* static members */
@JSGlobal("Electron.BrowserWindow")
@js.native
object BrowserWindow extends js.Object {
  /**
    * Adds DevTools extension located at `path`, and returns extension's name.
    *
    * The extension will be remembered so you only need to call this API once, this
    * API is not for programming use. If you try to add an extension that has already
    * been loaded, this method will not return and instead log a warning to the
    * console.
    *
    * The method will also not return if the extension's manifest is missing or
    * incomplete.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def addDevToolsExtension(path: String): Unit = js.native
  /**
    * Adds Chrome extension located at `path`, and returns extension's name.
    *
    * The method will also not return if the extension's manifest is missing or
    * incomplete.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def addExtension(path: String): Unit = js.native
  /**
    * The window that owns the given `browserView`. If the given view is not attached
    * to any window, returns `null`.
    */
  def fromBrowserView(browserView: typings.electron.Electron.BrowserView): typings.electron.Electron.BrowserWindow | Null = js.native
  /**
    * The window with the given `id`.
    */
  def fromId(id: Double): typings.electron.Electron.BrowserWindow = js.native
  /**
    * The window that owns the given `webContents` or `null` if the contents are not
    * owned by a window.
    */
  def fromWebContents(webContents: typings.electron.Electron.WebContents_): typings.electron.Electron.BrowserWindow | Null = js.native
  /**
    * An array of all opened browser windows.
    */
  def getAllWindows(): js.Array[typings.electron.Electron.BrowserWindow] = js.native
  /**
    * The keys are the extension names and each value is an Object containing `name`
    * and `version` properties.
    *
    * To check if a DevTools extension is installed you can run the following:
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def getDevToolsExtensions(): Record[String, ExtensionInfo] = js.native
  /**
    * The keys are the extension names and each value is an Object containing `name`
    * and `version` properties.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def getExtensions(): Record[String, ExtensionInfo] = js.native
  /**
    * The window that is focused in this application, otherwise returns `null`.
    */
  def getFocusedWindow(): typings.electron.Electron.BrowserWindow | Null = js.native
  /**
    * Remove a DevTools extension by name.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def removeDevToolsExtension(name: String): Unit = js.native
  /**
    * Remove a Chrome extension by name.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def removeExtension(name: String): Unit = js.native
}


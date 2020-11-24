package typings.electron.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.Electron.BrowserView
import typings.electron.Electron.BrowserWindow
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.ExtensionInfo
import typings.electron.Electron.WebContents_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBrowserWindow
  extends Instantiable0[BrowserWindow]
     with Instantiable1[/* options */ BrowserWindowConstructorOptions, BrowserWindow] {
  
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
    * 
  **Note:** This method is deprecated. Instead, use `ses.loadExtension(path)`.
    *
    * @deprecated
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
    * 
  **Note:** This method is deprecated. Instead, use `ses.loadExtension(path)`.
    *
    * @deprecated
    */
  def addExtension(path: String): Unit = js.native
  
  /**
    * The window that owns the given `browserView`. If the given view is not attached
    * to any window, returns `null`.
    */
  def fromBrowserView(browserView: BrowserView): BrowserWindow | Null = js.native
  
  /**
    * The window with the given `id`.
    */
  def fromId(id: Double): BrowserWindow | Null = js.native
  
  /**
    * The window that owns the given `webContents` or `null` if the contents are not
    * owned by a window.
    */
  def fromWebContents(webContents: WebContents_): BrowserWindow | Null = js.native
  
  /**
    * An array of all opened browser windows.
    */
  def getAllWindows(): js.Array[BrowserWindow] = js.native
  
  /**
    * The keys are the extension names and each value is an Object containing `name`
    * and `version` properties.
    *
    * To check if a DevTools extension is installed you can run the following:
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    * 
  **Note:** This method is deprecated. Instead, use `ses.getAllExtensions()`.
    *
    * @deprecated
    */
  def getDevToolsExtensions(): Record[String, ExtensionInfo] = js.native
  
  /**
    * The keys are the extension names and each value is an Object containing `name`
    * and `version` properties.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    * 
  **Note:** This method is deprecated. Instead, use `ses.getAllExtensions()`.
    *
    * @deprecated
    */
  def getExtensions(): Record[String, ExtensionInfo] = js.native
  
  /**
    * The window that is focused in this application, otherwise returns `null`.
    */
  def getFocusedWindow(): BrowserWindow | Null = js.native
  
  /**
    * Remove a DevTools extension by name.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Note:** This method is deprecated. Instead, use
    * `ses.removeExtension(extension_id)`.
    *
    * @deprecated
    */
  def removeDevToolsExtension(name: String): Unit = js.native
  
  /**
    * Remove a Chrome extension by name.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Note:** This method is deprecated. Instead, use
    * `ses.removeExtension(extension_id)`.
    *
    * @deprecated
    */
  def removeExtension(name: String): Unit = js.native
}

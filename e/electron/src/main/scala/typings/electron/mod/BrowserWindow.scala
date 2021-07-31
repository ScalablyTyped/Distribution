package typings.electron.mod

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.ExtensionInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "BrowserWindow")
@js.native
/**
  * BrowserWindow
  */
class BrowserWindow ()
  extends typings.electron.Electron.BrowserWindow {
  def this(options: BrowserWindowConstructorOptions) = this()
}
object BrowserWindow {
  
  @JSImport("electron", "BrowserWindow")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def addDevToolsExtension(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDevToolsExtension")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  /* static member */
  @scala.inline
  def addExtension(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The window that owns the given `browserView`. If the given view is not attached
    * to any window, returns `null`.
    */
  /* static member */
  @scala.inline
  def fromBrowserView(browserView: typings.electron.Electron.BrowserView): typings.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBrowserView")(browserView.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.BrowserWindow | Null]
  
  /**
    * The window with the given `id`.
    */
  /* static member */
  @scala.inline
  def fromId(id: Double): typings.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.BrowserWindow | Null]
  
  /**
    * The window that owns the given `webContents` or `null` if the contents are not
    * owned by a window.
    */
  /* static member */
  @scala.inline
  def fromWebContents(webContents: typings.electron.Electron.WebContents_): typings.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebContents")(webContents.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.BrowserWindow | Null]
  
  /**
    * An array of all opened browser windows.
    */
  /* static member */
  @scala.inline
  def getAllWindows(): js.Array[typings.electron.Electron.BrowserWindow] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWindows")().asInstanceOf[js.Array[typings.electron.Electron.BrowserWindow]]
  
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
  /* static member */
  @scala.inline
  def getDevToolsExtensions(): Record[String, ExtensionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevToolsExtensions")().asInstanceOf[Record[String, ExtensionInfo]]
  
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
  /* static member */
  @scala.inline
  def getExtensions(): Record[String, ExtensionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensions")().asInstanceOf[Record[String, ExtensionInfo]]
  
  /**
    * The window that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  @scala.inline
  def getFocusedWindow(): typings.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWindow")().asInstanceOf[typings.electron.Electron.BrowserWindow | Null]
  
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
  /* static member */
  @scala.inline
  def removeDevToolsExtension(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDevToolsExtension")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  /* static member */
  @scala.inline
  def removeExtension(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExtension")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

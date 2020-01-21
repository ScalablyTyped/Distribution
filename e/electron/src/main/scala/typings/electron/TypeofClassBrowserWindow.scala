package typings.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.Electron.BrowserView
import typings.electron.Electron.BrowserWindow
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.DevToolsExtensions
import typings.electron.Electron.Extensions
import typings.electron.Electron.WebContents_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBrowserWindow
  extends Instantiable0[BrowserWindow]
     with Instantiable1[/* options */ BrowserWindowConstructorOptions, BrowserWindow] {
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
  def fromBrowserView(browserView: BrowserView): BrowserWindow | Null = js.native
  def fromId(id: Double): BrowserWindow = js.native
  def fromWebContents(webContents: WebContents_): BrowserWindow = js.native
  def getAllWindows(): js.Array[BrowserWindow] = js.native
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
  def getFocusedWindow(): BrowserWindow | Null = js.native
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


package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "BrowserWindow")
@js.native
class BrowserWindow ()
  extends electronLib.ElectronNs.BrowserWindow {
  def this(options: electronLib.ElectronNs.BrowserWindowConstructorOptions) = this()
}

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
  def addDevToolsExtension(path: java.lang.String): scala.Unit = js.native
  /**
       * Adds Chrome extension located at path, and returns extension's name. The method
       * will also not return if the extension's manifest is missing or incomplete. Note:
       * This API cannot be called before the ready event of the app module is emitted.
       */
  def addExtension(path: java.lang.String): scala.Unit = js.native
  def fromBrowserView(browserView: electronLib.ElectronNs.BrowserView): electronLib.ElectronNs.BrowserWindow | scala.Null = js.native
  def fromId(id: scala.Double): electronLib.ElectronNs.BrowserWindow = js.native
  def fromWebContents(webContents: electronLib.ElectronNs.WebContents): electronLib.ElectronNs.BrowserWindow = js.native
  def getAllWindows(): js.Array[electronLib.ElectronNs.BrowserWindow] = js.native
  /**
       * To check if a DevTools extension is installed you can run the following: Note:
       * This API cannot be called before the ready event of the app module is emitted.
       */
  def getDevToolsExtensions(): electronLib.ElectronNs.DevToolsExtensions = js.native
  /**
       * Note: This API cannot be called before the ready event of the app module is
       * emitted.
       */
  def getExtensions(): electronLib.ElectronNs.Extensions = js.native
  def getFocusedWindow(): electronLib.ElectronNs.BrowserWindow | scala.Null = js.native
  /**
       * Remove a DevTools extension by name. Note: This API cannot be called before the
       * ready event of the app module is emitted.
       */
  def removeDevToolsExtension(name: java.lang.String): scala.Unit = js.native
  /**
       * Remove a Chrome extension by name. Note: This API cannot be called before the
       * ready event of the app module is emitted.
       */
  def removeExtension(name: java.lang.String): scala.Unit = js.native
}


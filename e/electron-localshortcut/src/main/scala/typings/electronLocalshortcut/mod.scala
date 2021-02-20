package typings.electronLocalshortcut

import typings.electron.mod.BrowserWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-localshortcut", "disableAll")
  @js.native
  def disableAll(win: BrowserWindow): Unit = js.native
  
  @JSImport("electron-localshortcut", "enableAll")
  @js.native
  def enableAll(win: BrowserWindow): Unit = js.native
  
  @JSImport("electron-localshortcut", "isRegistered")
  @js.native
  def isRegistered(accelerator: String): Boolean = js.native
  @JSImport("electron-localshortcut", "isRegistered")
  @js.native
  def isRegistered(win: BrowserWindow, accelerator: String): Boolean = js.native
  
  @JSImport("electron-localshortcut", "register")
  @js.native
  def register(accelerator: String, callback: js.Function0[Unit]): Unit = js.native
  @JSImport("electron-localshortcut", "register")
  @js.native
  def register(accelerator: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  @JSImport("electron-localshortcut", "register")
  @js.native
  def register(win: BrowserWindow, accelerator: String, callback: js.Function0[Unit]): Unit = js.native
  @JSImport("electron-localshortcut", "register")
  @js.native
  def register(win: BrowserWindow, accelerator: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("electron-localshortcut", "unregister")
  @js.native
  def unregister(accelerator: String): Unit = js.native
  @JSImport("electron-localshortcut", "unregister")
  @js.native
  def unregister(accelerator: js.Array[String]): Unit = js.native
  @JSImport("electron-localshortcut", "unregister")
  @js.native
  def unregister(win: BrowserWindow, accelerator: String): Unit = js.native
  @JSImport("electron-localshortcut", "unregister")
  @js.native
  def unregister(win: BrowserWindow, accelerator: js.Array[String]): Unit = js.native
  
  @JSImport("electron-localshortcut", "unregisterAll")
  @js.native
  def unregisterAll(win: BrowserWindow): Unit = js.native
}

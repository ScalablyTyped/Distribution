package typings.electronLocalshortcut

import typings.electron.mod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-localshortcut", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def disableAll(win: BrowserWindow): Unit = js.native
  def enableAll(win: BrowserWindow): Unit = js.native
  def isRegistered(accelerator: String): Boolean = js.native
  def isRegistered(win: BrowserWindow, accelerator: String): Boolean = js.native
  def register(accelerator: String, callback: js.Function0[Unit]): Unit = js.native
  def register(accelerator: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  def register(win: BrowserWindow, accelerator: String, callback: js.Function0[Unit]): Unit = js.native
  def register(win: BrowserWindow, accelerator: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  def unregister(accelerator: String): Unit = js.native
  def unregister(accelerator: js.Array[String]): Unit = js.native
  def unregister(win: BrowserWindow, accelerator: String): Unit = js.native
  def unregister(win: BrowserWindow, accelerator: js.Array[String]): Unit = js.native
  def unregisterAll(win: BrowserWindow): Unit = js.native
}


package typings.electronLocalshortcut

import typings.electron.mod.BrowserWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-localshortcut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def disableAll(win: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAll")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enableAll(win: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAll")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isRegistered(accelerator: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(accelerator.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isRegistered(win: BrowserWindow, accelerator: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(win.asInstanceOf[js.Any], accelerator.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def register(accelerator: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(accelerator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def register(accelerator: js.Array[String], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(accelerator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def register(win: BrowserWindow, accelerator: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(win.asInstanceOf[js.Any], accelerator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def register(win: BrowserWindow, accelerator: js.Array[String], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(win.asInstanceOf[js.Any], accelerator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unregister(accelerator: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(accelerator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unregister(accelerator: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(accelerator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unregister(win: BrowserWindow, accelerator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(win.asInstanceOf[js.Any], accelerator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unregister(win: BrowserWindow, accelerator: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(win.asInstanceOf[js.Any], accelerator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unregisterAll(win: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAll")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

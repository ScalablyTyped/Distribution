package typings
package electronDashDebugLib.electronDashDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-debug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Install keyboard shortcuts and optionally activate DevTools on each created `BrowserWindow`.
  	@example
  	```
  	import {app, BrowserWindow} from 'electron';
  	import debug = require('electron-debug');
  	debug();
  	let mainWindow;
  	(async () => {
  		await app.whenReady();
  		mainWindow = new BrowserWindow();
  	});
  	```
  	*/
  def apply(): scala.Unit = js.native
  def apply(options: Options): scala.Unit = js.native
  /**
  	Toggle DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  def devTools(): scala.Unit = js.native
  def devTools(window: electronLib.electronMod.BrowserWindow): scala.Unit = js.native
  /**
  	Open DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  def openDevTools(): scala.Unit = js.native
  def openDevTools(window: electronLib.electronMod.BrowserWindow): scala.Unit = js.native
  /**
  	Reload the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  def refresh(): scala.Unit = js.native
  def refresh(window: electronLib.electronMod.BrowserWindow): scala.Unit = js.native
}


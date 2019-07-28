package typings.electronDashDebug.electronDashDebugMod

import typings.electron.electronMod.BrowserWindow
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
  def apply(): Unit = js.native
  def apply(options: Options): Unit = js.native
  /**
  	Toggle DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  def devTools(): Unit = js.native
  def devTools(window: BrowserWindow): Unit = js.native
  /**
  	Open DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  def openDevTools(): Unit = js.native
  def openDevTools(window: BrowserWindow): Unit = js.native
  /**
  	Reload the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  def refresh(): Unit = js.native
  def refresh(window: BrowserWindow): Unit = js.native
}


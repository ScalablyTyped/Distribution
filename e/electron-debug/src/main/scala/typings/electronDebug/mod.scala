package typings.electronDebug

import typings.electron.mod.BrowserWindow
import typings.electronDebug.electronDebugStrings.bottom
import typings.electronDebug.electronDebugStrings.detach
import typings.electronDebug.electronDebugStrings.previous
import typings.electronDebug.electronDebugStrings.right
import typings.electronDebug.electronDebugStrings.undocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Toggle DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  inline def devTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("devTools")().asInstanceOf[Unit]
  inline def devTools(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("devTools")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  	Open DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  inline def openDevTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDevTools")().asInstanceOf[Unit]
  inline def openDevTools(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDevTools")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  	The absolute path to a preload script to use in [`session#setPreloads()`](https://www.electronjs.org/docs/api/session#sessetpreloadspreloads).
  	Use it to enable `devtron` even when [`nodeIntegration`](https://www.electronjs.org/docs/api/browser-window#new-browserwindowoptions) is turned off.
  	*/
  @JSImport("electron-debug", "preloadScriptPath")
  @js.native
  def preloadScriptPath: String = js.native
  inline def preloadScriptPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preloadScriptPath")(x.asInstanceOf[js.Any])
  
  /**
  	Reload the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  inline def refresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[Unit]
  inline def refresh(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    		The dock state to open DevTools in.
    		@default 'previous'
    		*/
    val devToolsMode: js.UndefOr[undocked | right | bottom | previous | detach] = js.undefined
    
    /**
    		Default: [Only in development](https://github.com/sindresorhus/electron-is-dev)
    		*/
    val isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Show DevTools on each created `BrowserWindow`.
    		@default true
    		*/
    val showDevTools: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDevToolsMode(value: undocked | right | bottom | previous | detach): Self = StObject.set(x, "devToolsMode", value.asInstanceOf[js.Any])
      
      inline def setDevToolsModeUndefined: Self = StObject.set(x, "devToolsMode", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setShowDevTools(value: Boolean): Self = StObject.set(x, "showDevTools", value.asInstanceOf[js.Any])
      
      inline def setShowDevToolsUndefined: Self = StObject.set(x, "showDevTools", js.undefined)
    }
  }
}

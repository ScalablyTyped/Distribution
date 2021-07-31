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
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Toggle DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  @scala.inline
  def devTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("devTools")().asInstanceOf[Unit]
  @scala.inline
  def devTools(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("devTools")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  	Open DevTools for the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  @scala.inline
  def openDevTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDevTools")().asInstanceOf[Unit]
  @scala.inline
  def openDevTools(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDevTools")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  	Reload the specified `BrowserWindow` instance or the focused one.
  	@param window - Default: `BrowserWindow.getFocusedWindow()`
  	*/
  @scala.inline
  def refresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[Unit]
  @scala.inline
  def refresh(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevToolsMode(value: undocked | right | bottom | previous | detach): Self = StObject.set(x, "devToolsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevToolsModeUndefined: Self = StObject.set(x, "devToolsMode", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setShowDevTools(value: Boolean): Self = StObject.set(x, "showDevTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDevToolsUndefined: Self = StObject.set(x, "showDevTools", js.undefined)
    }
  }
}

package typings.electronWindowState

import typings.electron.Electron.BrowserWindow
import typings.electronWindowState.mod.ElectronWindowState.WindowState
import typings.electronWindowState.mod.ElectronWindowState.WindowStateKeeperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*
    * Load the previous state with fallback to defaults
    */
  inline def apply(opts: WindowStateKeeperOptions): WindowState = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[WindowState]
  
  @JSImport("electron-window-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ElectronWindowState {
    
    trait WindowState extends StObject {
      
      /*
        * The saved heigth of loaded state.
        * defaultHeight if the state has not been saved yet.
        */
      var height: Double
      
      /*
        * true if the window state was saved while the the window was in full screen
        * mode. undefined if the state has not been saved yet.
        */
      var isFullScreen: Boolean
      
      /*
        * true if the window state was saved while the the window was maximized.
        * undefined if the state has not been saved yet.
        */
      var isMaximized: Boolean
      
      /*
        * Register listeners on the given BrowserWindow for events that are related
        * to size or position changes (resize, move).
        * It will also restore the window's maximized or full screen state.
        * When the window is closed we automatically remove the listeners and save the state.
        */
      def manage(win: BrowserWindow): Unit
      
      /*
        * Saves the current state of the given BrowserWindow.
        * This exists mostly for legacy purposes, and in most cases it's better to just use manage.
        */
      def saveState(win: BrowserWindow): Unit
      
      /*
        * The saved width of loaded state.
        * defaultWidth if the state has not been saved yet.
        */
      var width: Double
      
      /*
        * The saved x coordinate of the loaded state.
        * undefined if the state has not been saved yet.
        */
      var x: Double
      
      /*
        * The saved y coordinate of the loaded state.
        * undefined if the state has not been saved yet.
        */
      var y: Double
    }
    object WindowState {
      
      inline def apply(
        height: Double,
        isFullScreen: Boolean,
        isMaximized: Boolean,
        manage: BrowserWindow => Unit,
        saveState: BrowserWindow => Unit,
        width: Double,
        x: Double,
        y: Double
      ): WindowState = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isMaximized = isMaximized.asInstanceOf[js.Any], manage = js.Any.fromFunction1(manage), saveState = js.Any.fromFunction1(saveState), width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[WindowState]
      }
      
      extension [Self <: WindowState](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
        
        inline def setIsMaximized(value: Boolean): Self = StObject.set(x, "isMaximized", value.asInstanceOf[js.Any])
        
        inline def setManage(value: BrowserWindow => Unit): Self = StObject.set(x, "manage", js.Any.fromFunction1(value))
        
        inline def setSaveState(value: BrowserWindow => Unit): Self = StObject.set(x, "saveState", js.Any.fromFunction1(value))
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    trait WindowStateKeeperOptions extends StObject {
      
      /*
        * The height that should be returned if no file exists yet. Defaults to 600.
        */
      var defaultHeight: js.UndefOr[Double] = js.undefined
      
      /*
        * The width that should be returned if no file exists yet. Defaults to 800.
        */
      var defaultWidth: js.UndefOr[Double] = js.undefined
      
      /*
        * The name of file. Defaults to window-state.json
        */
      var file: js.UndefOr[String] = js.undefined
      
      /*
        * Should we automatically restore the window to full screen,
        * if it was last closed full screen. Defaults to true
        */
      var fullScreen: js.UndefOr[Boolean] = js.undefined
      
      /*
        * Should we automatically maximize the window,
        * if it was last closed maximized. Defaults to true
        */
      var maximize: js.UndefOr[Boolean] = js.undefined
      
      /*
        * The path where the state file should be written to.
        * Defaults to app.getPath('userData')
        */
      var path: js.UndefOr[String] = js.undefined
    }
    object WindowStateKeeperOptions {
      
      inline def apply(): WindowStateKeeperOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WindowStateKeeperOptions]
      }
      
      extension [Self <: WindowStateKeeperOptions](x: Self) {
        
        inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
        
        inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
        
        inline def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
        
        inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
        
        inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
        
        inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
        
        inline def setMaximize(value: Boolean): Self = StObject.set(x, "maximize", value.asInstanceOf[js.Any])
        
        inline def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      }
    }
  }
}

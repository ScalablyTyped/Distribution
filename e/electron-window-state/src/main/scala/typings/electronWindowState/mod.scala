package typings.electronWindowState

import typings.electron.Electron.BrowserWindow
import typings.electronWindowState.mod.ElectronWindowState.WindowState
import typings.electronWindowState.mod.ElectronWindowState.WindowStateKeeperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*
    * Load the previous state with fallback to defaults
    */
  @JSImport("electron-window-state", JSImport.Namespace)
  @js.native
  def apply(opts: WindowStateKeeperOptions): WindowState = js.native
  
  object ElectronWindowState {
    
    @js.native
    trait WindowState extends StObject {
      
      /*
        * The saved heigth of loaded state.
        * defaultHeight if the state has not been saved yet.
        */
      var height: Double = js.native
      
      /*
        * true if the window state was saved while the the window was in full screen
        * mode. undefined if the state has not been saved yet.
        */
      var isFullScreen: Boolean = js.native
      
      /*
        * true if the window state was saved while the the window was maximized.
        * undefined if the state has not been saved yet.
        */
      var isMaximized: Boolean = js.native
      
      /*
        * Register listeners on the given BrowserWindow for events that are related
        * to size or position changes (resize, move).
        * It will also restore the window's maximized or full screen state.
        * When the window is closed we automatically remove the listeners and save the state.
        */
      def manage(win: BrowserWindow): Unit = js.native
      
      /*
        * Saves the current state of the given BrowserWindow.
        * This exists mostly for legacy purposes, and in most cases it's better to just use manage.
        */
      def saveState(win: BrowserWindow): Unit = js.native
      
      /*
        * The saved width of loaded state.
        * defaultWidth if the state has not been saved yet.
        */
      var width: Double = js.native
      
      /*
        * The saved x coordinate of the loaded state.
        * undefined if the state has not been saved yet.
        */
      var x: Double = js.native
      
      /*
        * The saved y coordinate of the loaded state.
        * undefined if the state has not been saved yet.
        */
      var y: Double = js.native
    }
    object WindowState {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class WindowStateMutableBuilder[Self <: WindowState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsMaximized(value: Boolean): Self = StObject.set(x, "isMaximized", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManage(value: BrowserWindow => Unit): Self = StObject.set(x, "manage", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSaveState(value: BrowserWindow => Unit): Self = StObject.set(x, "saveState", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WindowStateKeeperOptions extends StObject {
      
      /*
        * The height that should be returned if no file exists yet. Defaults to 600.
        */
      var defaultHeight: js.UndefOr[Double] = js.native
      
      /*
        * The width that should be returned if no file exists yet. Defaults to 800.
        */
      var defaultWidth: js.UndefOr[Double] = js.native
      
      /*
        * The name of file. Defaults to window-state.json
        */
      var file: js.UndefOr[String] = js.native
      
      /*
        * Should we automatically restore the window to full screen,
        * if it was last closed full screen. Defaults to true
        */
      var fullScreen: js.UndefOr[Boolean] = js.native
      
      /*
        * Should we automatically maximize the window,
        * if it was last closed maximized. Defaults to true
        */
      var maximize: js.UndefOr[Boolean] = js.native
      
      /*
        * The path where the state file should be written to.
        * Defaults to app.getPath('userData')
        */
      var path: js.UndefOr[String] = js.native
    }
    object WindowStateKeeperOptions {
      
      @scala.inline
      def apply(): WindowStateKeeperOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WindowStateKeeperOptions]
      }
      
      @scala.inline
      implicit class WindowStateKeeperOptionsMutableBuilder[Self <: WindowStateKeeperOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
        
        @scala.inline
        def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
        
        @scala.inline
        def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        @scala.inline
        def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
        
        @scala.inline
        def setMaximize(value: Boolean): Self = StObject.set(x, "maximize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      }
    }
  }
}

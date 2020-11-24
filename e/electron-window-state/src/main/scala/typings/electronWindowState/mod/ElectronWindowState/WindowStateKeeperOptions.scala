package typings.electronWindowState.mod.ElectronWindowState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowStateKeeperOptions extends js.Object {
  
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
  implicit class WindowStateKeeperOptionsOps[Self <: WindowStateKeeperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setMaximize(value: Boolean): Self = this.set("maximize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximize: Self = this.set("maximize", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}

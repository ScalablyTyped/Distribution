package typings.electronUtil.mod

import typings.electron.Electron.Size
import typings.electron.mod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWindowBoundsCenteredOptions extends js.Object {
  
  /**
  	Set a new window size.
  	Default: Size of `window`
  	@example
  	```
  	{width: 600, height: 400}
  	```
  	*/
  val size: js.UndefOr[Size] = js.native
  
  /**
  	The window to get the bounds of.
  	Default: Current window
  	*/
  val window: js.UndefOr[BrowserWindow] = js.native
}
object GetWindowBoundsCenteredOptions {
  
  @scala.inline
  def apply(): GetWindowBoundsCenteredOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
  }
  
  @scala.inline
  implicit class GetWindowBoundsCenteredOptionsOps[Self <: GetWindowBoundsCenteredOptions] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setWindow(value: BrowserWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}

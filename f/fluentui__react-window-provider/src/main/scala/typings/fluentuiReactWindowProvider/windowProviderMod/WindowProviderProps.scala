package typings.fluentuiReactWindowProvider.windowProviderMod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowProviderProps extends js.Object {
  
  /**
    * Provide the active window.
    */
  var window: js.UndefOr[Window] = js.native
}
object WindowProviderProps {
  
  @scala.inline
  def apply(): WindowProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowProviderProps]
  }
  
  @scala.inline
  implicit class WindowProviderPropsOps[Self <: WindowProviderProps] (val x: Self) extends AnyVal {
    
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
    def setWindow(value: Window): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}

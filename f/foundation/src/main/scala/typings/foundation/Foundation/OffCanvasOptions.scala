package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/offcanvas.html#optional-javascript-configuration
@js.native
trait OffCanvasOptions extends js.Object {
  
  var close_on_click: js.UndefOr[Boolean] = js.native
  
  var open_method: js.UndefOr[String] = js.native
}
object OffCanvasOptions {
  
  @scala.inline
  def apply(): OffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffCanvasOptions]
  }
  
  @scala.inline
  implicit class OffCanvasOptionsOps[Self <: OffCanvasOptions] (val x: Self) extends AnyVal {
    
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
    def setClose_on_click(value: Boolean): Self = this.set("close_on_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose_on_click: Self = this.set("close_on_click", js.undefined)
    
    @scala.inline
    def setOpen_method(value: String): Self = this.set("open_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen_method: Self = this.set("open_method", js.undefined)
  }
}

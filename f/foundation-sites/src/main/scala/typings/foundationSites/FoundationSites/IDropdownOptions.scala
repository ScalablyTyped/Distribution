package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDropdownOptions extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var hOffset: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[Boolean] = js.native
  
  var hoverDelay: js.UndefOr[Double] = js.native
  
  var hoverPane: js.UndefOr[Boolean] = js.native
  
  var positionClass: js.UndefOr[String] = js.native
  
  var trapFocus: js.UndefOr[Boolean] = js.native
  
  var vOffset: js.UndefOr[Double] = js.native
}
object IDropdownOptions {
  
  @scala.inline
  def apply(): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownOptions]
  }
  
  @scala.inline
  implicit class IDropdownOptionsOps[Self <: IDropdownOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    
    @scala.inline
    def setHOffset(value: Double): Self = this.set("hOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHOffset: Self = this.set("hOffset", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverDelay: Self = this.set("hoverDelay", js.undefined)
    
    @scala.inline
    def setHoverPane(value: Boolean): Self = this.set("hoverPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverPane: Self = this.set("hoverPane", js.undefined)
    
    @scala.inline
    def setPositionClass(value: String): Self = this.set("positionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionClass: Self = this.set("positionClass", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
    
    @scala.inline
    def setVOffset(value: Double): Self = this.set("vOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVOffset: Self = this.set("vOffset", js.undefined)
  }
}

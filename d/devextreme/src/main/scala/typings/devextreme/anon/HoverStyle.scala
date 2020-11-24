package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverStyle extends js.Object {
  
  var border: js.UndefOr[ColorVisible] = js.native
  
  var hoverStyle: js.UndefOr[Border] = js.native
  
  var selectionStyle: js.UndefOr[Border] = js.native
}
object HoverStyle {
  
  @scala.inline
  def apply(): HoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverStyle]
  }
  
  @scala.inline
  implicit class HoverStyleOps[Self <: HoverStyle] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ColorVisible): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: Border): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: Border): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
  }
}

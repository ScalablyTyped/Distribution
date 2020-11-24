package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartSectionCollapsibleDisplaySettings extends js.Object {
  
  var arrowClosed: js.UndefOr[String] = js.native
  
  var arrowColor: js.UndefOr[String] = js.native
  
  var arrowLocation: js.UndefOr[String] = js.native
  
  var arrowOpen: js.UndefOr[String] = js.native
  
  var arrowSize: js.UndefOr[String] = js.native
  
  var arrowStyle: js.UndefOr[String] = js.native
  
  var containerStyle: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[String] = js.native
  
  var onlyArrowIsClickable: js.UndefOr[Boolean] = js.native
  
  var outerLabelAndArrowStyle: js.UndefOr[String] = js.native
}
object SmartSectionCollapsibleDisplaySettings {
  
  @scala.inline
  def apply(): SmartSectionCollapsibleDisplaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartSectionCollapsibleDisplaySettings]
  }
  
  @scala.inline
  implicit class SmartSectionCollapsibleDisplaySettingsOps[Self <: SmartSectionCollapsibleDisplaySettings] (val x: Self) extends AnyVal {
    
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
    def setArrowClosed(value: String): Self = this.set("arrowClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowClosed: Self = this.set("arrowClosed", js.undefined)
    
    @scala.inline
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    
    @scala.inline
    def setArrowLocation(value: String): Self = this.set("arrowLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowLocation: Self = this.set("arrowLocation", js.undefined)
    
    @scala.inline
    def setArrowOpen(value: String): Self = this.set("arrowOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowOpen: Self = this.set("arrowOpen", js.undefined)
    
    @scala.inline
    def setArrowSize(value: String): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    
    @scala.inline
    def setArrowStyle(value: String): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowStyle: Self = this.set("arrowStyle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: String): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: String): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setOnlyArrowIsClickable(value: Boolean): Self = this.set("onlyArrowIsClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyArrowIsClickable: Self = this.set("onlyArrowIsClickable", js.undefined)
    
    @scala.inline
    def setOuterLabelAndArrowStyle(value: String): Self = this.set("outerLabelAndArrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterLabelAndArrowStyle: Self = this.set("outerLabelAndArrowStyle", js.undefined)
  }
}

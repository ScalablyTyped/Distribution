package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeToolbox event.
  */
@js.native
trait ASPxClientReportDesignerCustomizeToolboxEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides information about all controls available in the Toolbox.
    */
  var ControlsFactory: ASPxDesignerControlsFactory = js.native
}
object ASPxClientReportDesignerCustomizeToolboxEventArgs {
  
  @scala.inline
  def apply(ControlsFactory: ASPxDesignerControlsFactory): ASPxClientReportDesignerCustomizeToolboxEventArgs = {
    val __obj = js.Dynamic.literal(ControlsFactory = ControlsFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeToolboxEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerCustomizeToolboxEventArgsOps[Self <: ASPxClientReportDesignerCustomizeToolboxEventArgs] (val x: Self) extends AnyVal {
    
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
    def setControlsFactory(value: ASPxDesignerControlsFactory): Self = this.set("ControlsFactory", value.asInstanceOf[js.Any])
  }
}

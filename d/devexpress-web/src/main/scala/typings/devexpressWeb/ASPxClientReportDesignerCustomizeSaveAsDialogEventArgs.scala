package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveAsDialog event.
  */
@js.native
trait ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs extends ASPxClientEventArgs {
  
  /**
    * Customizes the Save Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save Report dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit = js.native
  
  /**
    * Provides access to the Save Report dialog.
    */
  var Popup: ASPxDesignerSaveAsDialog = js.native
}
object ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs {
  
  @scala.inline
  def apply(Customize: (String, ASPxDesignerDialogModel) => Unit, Popup: ASPxDesignerSaveAsDialog): ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerCustomizeSaveAsDialogEventArgsOps[Self <: ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCustomize(value: (String, ASPxDesignerDialogModel) => Unit): Self = this.set("Customize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopup(value: ASPxDesignerSaveAsDialog): Self = this.set("Popup", value.asInstanceOf[js.Any])
  }
}

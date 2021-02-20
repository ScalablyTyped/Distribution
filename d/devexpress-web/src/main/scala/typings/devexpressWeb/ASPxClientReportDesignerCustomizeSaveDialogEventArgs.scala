package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveDialog event.
  */
@js.native
trait ASPxClientReportDesignerCustomizeSaveDialogEventArgs extends ASPxClientEventArgs {
  
  /**
    * Customizes the Save dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit = js.native
  
  /**
    * Provides access to the Save dialog.
    */
  var Popup: ASPxDesignerSaveDialog = js.native
}
object ASPxClientReportDesignerCustomizeSaveDialogEventArgs {
  
  @scala.inline
  def apply(Customize: (String, ASPxDesignerDialogModel) => Unit, Popup: ASPxDesignerSaveDialog): ASPxClientReportDesignerCustomizeSaveDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveDialogEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerCustomizeSaveDialogEventArgsMutableBuilder[Self <: ASPxClientReportDesignerCustomizeSaveDialogEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomize(value: (String, ASPxDesignerDialogModel) => Unit): Self = StObject.set(x, "Customize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopup(value: ASPxDesignerSaveDialog): Self = StObject.set(x, "Popup", value.asInstanceOf[js.Any])
  }
}

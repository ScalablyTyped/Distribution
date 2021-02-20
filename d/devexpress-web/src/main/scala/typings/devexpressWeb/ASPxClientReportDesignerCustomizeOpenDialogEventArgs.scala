package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeOpenDialog event.
  */
@js.native
trait ASPxClientReportDesignerCustomizeOpenDialogEventArgs extends ASPxClientEventArgs {
  
  /**
    * Customizes the Open Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Open Report dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit = js.native
  
  /**
    * Provides access to the Open Report dialog.
    */
  var Popup: ASPxDesignerOpenDialog = js.native
}
object ASPxClientReportDesignerCustomizeOpenDialogEventArgs {
  
  @scala.inline
  def apply(Customize: (String, ASPxDesignerDialogModel) => Unit, Popup: ASPxDesignerOpenDialog): ASPxClientReportDesignerCustomizeOpenDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeOpenDialogEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerCustomizeOpenDialogEventArgsMutableBuilder[Self <: ASPxClientReportDesignerCustomizeOpenDialogEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomize(value: (String, ASPxDesignerDialogModel) => Unit): Self = StObject.set(x, "Customize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopup(value: ASPxDesignerOpenDialog): Self = StObject.set(x, "Popup", value.asInstanceOf[js.Any])
  }
}

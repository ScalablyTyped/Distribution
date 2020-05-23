package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveAsDialog event.
  */
trait ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the Save Report dialog.
    */
  var Popup: ASPxDesignerSaveAsDialog
  /**
    * Customizes the Save Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save Report dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit
}

object ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs {
  @scala.inline
  def apply(Customize: (String, ASPxDesignerDialogModel) => Unit, Popup: ASPxDesignerSaveAsDialog): ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs]
  }
}


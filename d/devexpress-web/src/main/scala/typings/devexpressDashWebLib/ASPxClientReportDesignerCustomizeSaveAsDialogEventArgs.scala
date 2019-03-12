package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeSaveAsDialog event.
  */
trait ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the Save Report dialog.
    * Value: An object that specifies the  Save Report dialog.
    */
  var Popup: ASPxDesignerSaveAsDialog
  /**
    * Customizes the Save Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save Report dialog.
    */
  def Customize(template: java.lang.String, model: ASPxDesignerDialogModel): scala.Unit
}

object ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs {
  @scala.inline
  def apply(
    Customize: (java.lang.String, ASPxDesignerDialogModel) => scala.Unit,
    Popup: ASPxDesignerSaveAsDialog
  ): ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup)
  
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs]
  }
}


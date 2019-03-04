package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeSaveDialog event.
  */
trait ASPxClientReportDesignerCustomizeSaveDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the Save dialog.
    * Value: An object that specifies the Save dialog.
    */
  var Popup: ASPxDesignerSaveDialog
  /**
    * Customizes the Save dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save dialog.
    */
  def Customize(template: java.lang.String, model: ASPxDesignerDialogModel): scala.Unit
}

object ASPxClientReportDesignerCustomizeSaveDialogEventArgs {
  @scala.inline
  def apply(
    Customize: js.Function2[java.lang.String, ASPxDesignerDialogModel, scala.Unit],
    Popup: ASPxDesignerSaveDialog
  ): ASPxClientReportDesignerCustomizeSaveDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = Customize, Popup = Popup)
  
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveDialogEventArgs]
  }
}


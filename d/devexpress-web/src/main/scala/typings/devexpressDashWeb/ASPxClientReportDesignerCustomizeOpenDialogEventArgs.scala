package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeOpenDialog event.
  */
trait ASPxClientReportDesignerCustomizeOpenDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the Open Report dialog.
    * Value: An object that specifies the Open Report dialog.
    */
  var Popup: ASPxDesignerOpenDialog
  /**
    * Customizes the Open Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Open Report dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit
}

object ASPxClientReportDesignerCustomizeOpenDialogEventArgs {
  @scala.inline
  def apply(Customize: (String, ASPxDesignerDialogModel) => Unit, Popup: ASPxDesignerOpenDialog): ASPxClientReportDesignerCustomizeOpenDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup)
  
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeOpenDialogEventArgs]
  }
}


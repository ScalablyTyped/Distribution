package typings
package devexpressDashWebLib

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
  def Customize(template: java.lang.String, model: ASPxDesignerDialogModel): scala.Unit
}


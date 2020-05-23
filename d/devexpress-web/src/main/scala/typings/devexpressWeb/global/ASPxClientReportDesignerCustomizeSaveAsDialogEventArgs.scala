package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveAsDialog event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs")
@js.native
class ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs class with the specified settings.
    * @param popup An object that specifies the Save Report dialog.
    */
  def this(popup: typings.devexpressWeb.ASPxDesignerSaveAsDialog) = this()
  /**
    * Provides access to the Save Report dialog.
    */
  /* CompleteClass */
  override var Popup: typings.devexpressWeb.ASPxDesignerSaveAsDialog = js.native
  /**
    * Customizes the Save Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save Report dialog.
    */
  /* CompleteClass */
  override def Customize(template: String, model: typings.devexpressWeb.ASPxDesignerDialogModel): Unit = js.native
}


package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeOpenDialog event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeOpenDialogEventArgs")
@js.native
class ASPxClientReportDesignerCustomizeOpenDialogEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientReportDesignerCustomizeOpenDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeOpenDialogEventArgs class with the specified settings.
    * @param popup An object that specifies the Open Report dialog.
    */
  def this(popup: typings.devexpressWeb.ASPxDesignerOpenDialog) = this()
  /**
    * Provides access to the Open Report dialog.
    */
  /* CompleteClass */
  override var Popup: typings.devexpressWeb.ASPxDesignerOpenDialog = js.native
  /**
    * Customizes the Open Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Open Report dialog.
    */
  /* CompleteClass */
  override def Customize(template: String, model: typings.devexpressWeb.ASPxDesignerDialogModel): Unit = js.native
}


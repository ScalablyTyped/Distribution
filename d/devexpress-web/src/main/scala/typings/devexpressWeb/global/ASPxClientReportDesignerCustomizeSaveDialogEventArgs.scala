package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveDialog event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeSaveDialogEventArgs")
@js.native
open class ASPxClientReportDesignerCustomizeSaveDialogEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerCustomizeSaveDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeSaveDialogEventArgs class with the specified settings.
    * @param popup An object that specifies the Save dialog.
    */
  def this(popup: typings.devexpressWeb.ASPxDesignerSaveDialog) = this()
  
  /**
    * Customizes the Save dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save dialog.
    */
  /* CompleteClass */
  override def Customize(template: String, model: typings.devexpressWeb.ASPxDesignerDialogModel): Unit = js.native
  
  /**
    * Provides access to the Save dialog.
    */
  /* CompleteClass */
  var Popup: typings.devexpressWeb.ASPxDesignerSaveDialog = js.native
}

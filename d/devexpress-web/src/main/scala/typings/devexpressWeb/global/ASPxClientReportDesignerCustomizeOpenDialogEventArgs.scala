package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeOpenDialog event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeOpenDialogEventArgs")
@js.native
open class ASPxClientReportDesignerCustomizeOpenDialogEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerCustomizeOpenDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeOpenDialogEventArgs class with the specified settings.
    * @param popup An object that specifies the Open Report dialog.
    */
  def this(popup: typings.devexpressWeb.ASPxDesignerOpenDialog) = this()
  
  /**
    * Customizes the Open Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Open Report dialog.
    */
  /* CompleteClass */
  override def Customize(template: String, model: typings.devexpressWeb.ASPxDesignerDialogModel): Unit = js.native
  
  /**
    * Provides access to the Open Report dialog.
    */
  /* CompleteClass */
  var Popup: typings.devexpressWeb.ASPxDesignerOpenDialog = js.native
}

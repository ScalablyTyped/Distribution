package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeMenuActions, ASPxClientReportDesigner.PreviewCustomizeMenuActions and ASPxClientWebDocumentViewer.CustomizeMenuActions.
  */
@JSGlobal("ASPxClientCustomizeMenuActionsEventArgs")
@js.native
open class ASPxClientCustomizeMenuActionsEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCustomizeMenuActionsEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeMenuActionsEventArgs class with the specified settings.
    * @param actions An array of IAction objects. This array is assigned to the ASPxClientCustomizeMenuActionsEventArgs.Actions property.
    */
  def this(actions: js.Array[typings.devexpressWeb.ASPxClientMenuAction]) = this()
  
  /**
    * Provides access to the collection of actions available in the toolbar and menu.
    */
  /* CompleteClass */
  var Actions: js.Array[typings.devexpressWeb.ASPxClientMenuAction] = js.native
  
  /**
    * Returns a menu action with the specified ID. An IAction object.
    * @param actionId A String value that specifies the action ID.
    */
  /* CompleteClass */
  override def GetById(actionId: String): typings.devexpressWeb.ASPxClientMenuAction = js.native
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeMenuActions, ASPxClientReportDesigner.PreviewCustomizeMenuActions and ASPxClientWebDocumentViewer.CustomizeMenuActions.
  */
trait ASPxClientCustomizeMenuActionsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to the collection of actions available in the toolbar and menu.
    */
  var Actions: js.Array[ASPxClientMenuAction]
  
  /**
    * Returns a menu action with the specified ID. An IAction object.
    * @param actionId A String value that specifies the action ID.
    */
  def GetById(actionId: String): ASPxClientMenuAction
}
object ASPxClientCustomizeMenuActionsEventArgs {
  
  inline def apply(Actions: js.Array[ASPxClientMenuAction], GetById: String => ASPxClientMenuAction): ASPxClientCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeMenuActionsEventArgs]
  }
  
  extension [Self <: ASPxClientCustomizeMenuActionsEventArgs](x: Self) {
    
    inline def setActions(value: js.Array[ASPxClientMenuAction]): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ASPxClientMenuAction*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    inline def setGetById(value: String => ASPxClientMenuAction): Self = StObject.set(x, "GetById", js.Any.fromFunction1(value))
  }
}

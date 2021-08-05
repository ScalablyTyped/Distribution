package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFloatingActionButton.ActionItemClick event.
  */
trait ASPxClientFloatingActionButtonActionItemClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed action.
    */
  var actionName: String
}
object ASPxClientFloatingActionButtonActionItemClickEventArgs {
  
  inline def apply(actionName: String): ASPxClientFloatingActionButtonActionItemClickEventArgs = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionItemClickEventArgs]
  }
  
  extension [Self <: ASPxClientFloatingActionButtonActionItemClickEventArgs](x: Self) {
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}

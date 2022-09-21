package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDialogAction extends StObject {
  
  /**
    * Input only. Status for a request to either invoke or submit a [dialog](https://developers.google.com/chat/how-tos/dialogs). Displays a status and message to users, if necessary. For example, in case of an error or success.
    */
  var actionStatus: js.UndefOr[SchemaActionStatus] = js.undefined
  
  /**
    * Input only. [Dialog](https://developers.google.com/chat/how-tos/dialogs) for the request.
    */
  var dialog: js.UndefOr[SchemaDialog] = js.undefined
}
object SchemaDialogAction {
  
  inline def apply(): SchemaDialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDialogAction]
  }
  
  extension [Self <: SchemaDialogAction](x: Self) {
    
    inline def setActionStatus(value: SchemaActionStatus): Self = StObject.set(x, "actionStatus", value.asInstanceOf[js.Any])
    
    inline def setActionStatusUndefined: Self = StObject.set(x, "actionStatus", js.undefined)
    
    inline def setDialog(value: SchemaDialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
  }
}

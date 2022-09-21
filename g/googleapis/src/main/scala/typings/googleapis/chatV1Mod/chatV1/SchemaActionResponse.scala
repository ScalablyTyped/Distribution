package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActionResponse extends StObject {
  
  /**
    * Input only. A response to an event related to a [dialog](https://developers.google.com/chat/how-tos/dialogs). Must be accompanied by `ResponseType.Dialog`.
    */
  var dialogAction: js.UndefOr[SchemaDialogAction] = js.undefined
  
  /**
    * Input only. The type of Chat app response.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. URL for users to auth or config. (Only for REQUEST_CONFIG response types.)
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaActionResponse {
  
  inline def apply(): SchemaActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionResponse]
  }
  
  extension [Self <: SchemaActionResponse](x: Self) {
    
    inline def setDialogAction(value: SchemaDialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

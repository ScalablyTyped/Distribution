package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActionStatus extends StObject {
  
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The message to send users about the status of their request. If unset, a generic message based on the `status_code` is sent.
    */
  var userFacingMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaActionStatus {
  
  inline def apply(): SchemaActionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionStatus]
  }
  
  extension [Self <: SchemaActionStatus](x: Self) {
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setUserFacingMessage(value: String): Self = StObject.set(x, "userFacingMessage", value.asInstanceOf[js.Any])
    
    inline def setUserFacingMessageNull: Self = StObject.set(x, "userFacingMessage", null)
    
    inline def setUserFacingMessageUndefined: Self = StObject.set(x, "userFacingMessage", js.undefined)
  }
}

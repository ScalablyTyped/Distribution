package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAttachmentConnectedEndpoint extends StObject {
  
  /**
    * The url of a connected endpoint.
    */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The PSC connection id of the connected endpoint.
    */
  var pscConnectionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of a connected endpoint to this service attachment.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAttachmentConnectedEndpoint {
  
  inline def apply(): SchemaServiceAttachmentConnectedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAttachmentConnectedEndpoint]
  }
  
  extension [Self <: SchemaServiceAttachmentConnectedEndpoint](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setPscConnectionId(value: String): Self = StObject.set(x, "pscConnectionId", value.asInstanceOf[js.Any])
    
    inline def setPscConnectionIdNull: Self = StObject.set(x, "pscConnectionId", null)
    
    inline def setPscConnectionIdUndefined: Self = StObject.set(x, "pscConnectionId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

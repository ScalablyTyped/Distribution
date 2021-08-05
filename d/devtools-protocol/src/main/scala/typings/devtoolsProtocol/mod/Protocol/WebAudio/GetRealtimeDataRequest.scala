package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRealtimeDataRequest extends StObject {
  
  var contextId: GraphObjectId
}
object GetRealtimeDataRequest {
  
  inline def apply(contextId: GraphObjectId): GetRealtimeDataRequest = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRealtimeDataRequest]
  }
  
  extension [Self <: GetRealtimeDataRequest](x: Self) {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
  }
}

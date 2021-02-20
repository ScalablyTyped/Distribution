package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRealtimeDataRequest extends StObject {
  
  var contextId: GraphObjectId = js.native
}
object GetRealtimeDataRequest {
  
  @scala.inline
  def apply(contextId: GraphObjectId): GetRealtimeDataRequest = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRealtimeDataRequest]
  }
  
  @scala.inline
  implicit class GetRealtimeDataRequestMutableBuilder[Self <: GetRealtimeDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
  }
}

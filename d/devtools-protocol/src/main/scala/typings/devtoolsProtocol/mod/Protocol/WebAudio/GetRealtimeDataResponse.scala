package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRealtimeDataResponse extends StObject {
  
  var realtimeData: ContextRealtimeData = js.native
}
object GetRealtimeDataResponse {
  
  @scala.inline
  def apply(realtimeData: ContextRealtimeData): GetRealtimeDataResponse = {
    val __obj = js.Dynamic.literal(realtimeData = realtimeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRealtimeDataResponse]
  }
  
  @scala.inline
  implicit class GetRealtimeDataResponseMutableBuilder[Self <: GetRealtimeDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRealtimeData(value: ContextRealtimeData): Self = StObject.set(x, "realtimeData", value.asInstanceOf[js.Any])
  }
}

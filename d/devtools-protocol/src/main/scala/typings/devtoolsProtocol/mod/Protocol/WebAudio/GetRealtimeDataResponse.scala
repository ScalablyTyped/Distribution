package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRealtimeDataResponse extends StObject {
  
  var realtimeData: ContextRealtimeData
}
object GetRealtimeDataResponse {
  
  inline def apply(realtimeData: ContextRealtimeData): GetRealtimeDataResponse = {
    val __obj = js.Dynamic.literal(realtimeData = realtimeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRealtimeDataResponse]
  }
  
  extension [Self <: GetRealtimeDataResponse](x: Self) {
    
    inline def setRealtimeData(value: ContextRealtimeData): Self = StObject.set(x, "realtimeData", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCollectClassNamesResponse extends StObject {
  
  var paramsType: js.Array[CollectClassNamesRequest]
  
  var returnType: CollectClassNamesResponse
}
object ReturnTypeCollectClassNamesResponse {
  
  inline def apply(paramsType: js.Array[CollectClassNamesRequest], returnType: CollectClassNamesResponse): ReturnTypeCollectClassNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCollectClassNamesResponse]
  }
  
  extension [Self <: ReturnTypeCollectClassNamesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[CollectClassNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CollectClassNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CollectClassNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

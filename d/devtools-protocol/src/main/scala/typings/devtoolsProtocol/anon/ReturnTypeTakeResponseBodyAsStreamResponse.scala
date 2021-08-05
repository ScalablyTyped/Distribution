package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Fetch.TakeResponseBodyAsStreamRequest
import typings.devtoolsProtocol.mod.Protocol.Fetch.TakeResponseBodyAsStreamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeTakeResponseBodyAsStreamResponse extends StObject {
  
  var paramsType: js.Array[TakeResponseBodyAsStreamRequest]
  
  var returnType: TakeResponseBodyAsStreamResponse
}
object ReturnTypeTakeResponseBodyAsStreamResponse {
  
  inline def apply(
    paramsType: js.Array[TakeResponseBodyAsStreamRequest],
    returnType: TakeResponseBodyAsStreamResponse
  ): ReturnTypeTakeResponseBodyAsStreamResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakeResponseBodyAsStreamResponse]
  }
  
  extension [Self <: ReturnTypeTakeResponseBodyAsStreamResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[TakeResponseBodyAsStreamRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TakeResponseBodyAsStreamRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: TakeResponseBodyAsStreamResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

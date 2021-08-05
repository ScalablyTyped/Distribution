package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpRequest
import typings.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestMemoryDumpResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[RequestMemoryDumpRequest]]
  
  var returnType: RequestMemoryDumpResponse
}
object ReturnTypeRequestMemoryDumpResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[RequestMemoryDumpRequest]], returnType: RequestMemoryDumpResponse): ReturnTypeRequestMemoryDumpResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestMemoryDumpResponse]
  }
  
  extension [Self <: ReturnTypeRequestMemoryDumpResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[RequestMemoryDumpRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[RequestMemoryDumpRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: RequestMemoryDumpResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

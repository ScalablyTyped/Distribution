package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeBeginFrameResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[BeginFrameRequest]]
  
  var returnType: BeginFrameResponse
}
object ReturnTypeBeginFrameResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[BeginFrameRequest]], returnType: BeginFrameResponse): ReturnTypeBeginFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeBeginFrameResponse]
  }
  
  extension [Self <: ReturnTypeBeginFrameResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[BeginFrameRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[BeginFrameRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: BeginFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

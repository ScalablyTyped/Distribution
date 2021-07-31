package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IO.ReadRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ReadResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeReadResponse extends StObject {
  
  var paramsType: js.Array[ReadRequest]
  
  var returnType: ReadResponse
}
object ReturnTypeReadResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[ReadRequest], returnType: ReadResponse): ReturnTypeReadResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeReadResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeReadResponseMutableBuilder[Self <: ReturnTypeReadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ReadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ReadRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: ReadResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.CompositingReasonsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCompositingReasonsResponse extends StObject {
  
  var paramsType: js.Array[CompositingReasonsRequest]
  
  var returnType: CompositingReasonsResponse
}
object ReturnTypeCompositingReasonsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CompositingReasonsRequest], returnType: CompositingReasonsResponse): ReturnTypeCompositingReasonsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCompositingReasonsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCompositingReasonsResponseMutableBuilder[Self <: ReturnTypeCompositingReasonsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CompositingReasonsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CompositingReasonsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CompositingReasonsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

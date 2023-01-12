package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeDescribeNodeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[DescribeNodeRequest]]
  
  var returnType: DescribeNodeResponse
}
object ReturnTypeDescribeNodeResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[DescribeNodeRequest]], returnType: DescribeNodeResponse): ReturnTypeDescribeNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeDescribeNodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeDescribeNodeResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[DescribeNodeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[DescribeNodeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: DescribeNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

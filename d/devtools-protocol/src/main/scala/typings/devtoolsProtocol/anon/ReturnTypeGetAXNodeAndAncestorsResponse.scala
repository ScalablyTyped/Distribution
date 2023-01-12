package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetAXNodeAndAncestorsRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetAXNodeAndAncestorsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetAXNodeAndAncestorsResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetAXNodeAndAncestorsRequest]]
  
  var returnType: GetAXNodeAndAncestorsResponse
}
object ReturnTypeGetAXNodeAndAncestorsResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[GetAXNodeAndAncestorsRequest]],
    returnType: GetAXNodeAndAncestorsResponse
  ): ReturnTypeGetAXNodeAndAncestorsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetAXNodeAndAncestorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetAXNodeAndAncestorsResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetAXNodeAndAncestorsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetAXNodeAndAncestorsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetAXNodeAndAncestorsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

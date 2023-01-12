package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetQueryingDescendantsForContainerRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetQueryingDescendantsForContainerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetQueryingDescendantsForContainerResponse extends StObject {
  
  var paramsType: js.Array[GetQueryingDescendantsForContainerRequest]
  
  var returnType: GetQueryingDescendantsForContainerResponse
}
object ReturnTypeGetQueryingDescendantsForContainerResponse {
  
  inline def apply(
    paramsType: js.Array[GetQueryingDescendantsForContainerRequest],
    returnType: GetQueryingDescendantsForContainerResponse
  ): ReturnTypeGetQueryingDescendantsForContainerResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetQueryingDescendantsForContainerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetQueryingDescendantsForContainerResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetQueryingDescendantsForContainerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetQueryingDescendantsForContainerRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetQueryingDescendantsForContainerResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

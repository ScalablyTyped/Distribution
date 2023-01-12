package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodesForSubtreeByStyleRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodesForSubtreeByStyleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetNodesForSubtreeByStyleResponse extends StObject {
  
  var paramsType: js.Array[GetNodesForSubtreeByStyleRequest]
  
  var returnType: GetNodesForSubtreeByStyleResponse
}
object ReturnTypeGetNodesForSubtreeByStyleResponse {
  
  inline def apply(
    paramsType: js.Array[GetNodesForSubtreeByStyleRequest],
    returnType: GetNodesForSubtreeByStyleResponse
  ): ReturnTypeGetNodesForSubtreeByStyleResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNodesForSubtreeByStyleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetNodesForSubtreeByStyleResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetNodesForSubtreeByStyleRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetNodesForSubtreeByStyleRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetNodesForSubtreeByStyleResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

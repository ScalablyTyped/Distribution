package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGlobalLexicalScopeNamesResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]]
  
  var returnType: GlobalLexicalScopeNamesResponse
}
object ReturnTypeGlobalLexicalScopeNamesResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]],
    returnType: GlobalLexicalScopeNamesResponse
  ): ReturnTypeGlobalLexicalScopeNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGlobalLexicalScopeNamesResponse]
  }
  
  extension [Self <: ReturnTypeGlobalLexicalScopeNamesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GlobalLexicalScopeNamesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GlobalLexicalScopeNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}

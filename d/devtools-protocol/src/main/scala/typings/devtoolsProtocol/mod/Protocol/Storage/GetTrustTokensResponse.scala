package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrustTokensResponse extends StObject {
  
  var tokens: js.Array[TrustTokens]
}
object GetTrustTokensResponse {
  
  inline def apply(tokens: js.Array[TrustTokens]): GetTrustTokensResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrustTokensResponse]
  }
  
  extension [Self <: GetTrustTokensResponse](x: Self) {
    
    inline def setTokens(value: js.Array[TrustTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: TrustTokens*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}

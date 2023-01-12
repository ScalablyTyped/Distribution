package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTrustTokensRequest extends StObject {
  
  var issuerOrigin: String
}
object ClearTrustTokensRequest {
  
  inline def apply(issuerOrigin: String): ClearTrustTokensRequest = {
    val __obj = js.Dynamic.literal(issuerOrigin = issuerOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTrustTokensRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearTrustTokensRequest] (val x: Self) extends AnyVal {
    
    inline def setIssuerOrigin(value: String): Self = StObject.set(x, "issuerOrigin", value.asInstanceOf[js.Any])
  }
}

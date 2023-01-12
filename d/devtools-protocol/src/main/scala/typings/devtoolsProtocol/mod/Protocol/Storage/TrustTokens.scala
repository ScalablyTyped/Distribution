package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustTokens extends StObject {
  
  var count: Double
  
  var issuerOrigin: String
}
object TrustTokens {
  
  inline def apply(count: Double, issuerOrigin: String): TrustTokens = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], issuerOrigin = issuerOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustTokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustTokens] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setIssuerOrigin(value: String): Self = StObject.set(x, "issuerOrigin", value.asInstanceOf[js.Any])
  }
}

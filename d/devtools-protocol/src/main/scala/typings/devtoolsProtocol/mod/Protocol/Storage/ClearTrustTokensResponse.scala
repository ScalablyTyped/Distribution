package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTrustTokensResponse extends StObject {
  
  /**
    * True if any tokens were deleted, false otherwise.
    */
  var didDeleteTokens: Boolean
}
object ClearTrustTokensResponse {
  
  inline def apply(didDeleteTokens: Boolean): ClearTrustTokensResponse = {
    val __obj = js.Dynamic.literal(didDeleteTokens = didDeleteTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTrustTokensResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearTrustTokensResponse] (val x: Self) extends AnyVal {
    
    inline def setDidDeleteTokens(value: Boolean): Self = StObject.set(x, "didDeleteTokens", value.asInstanceOf[js.Any])
  }
}

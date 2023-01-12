package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.Refresh
import typings.devtoolsProtocol.devtoolsProtocolStrings.UseCached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustTokenParams extends StObject {
  
  /**
    * Origins of issuers from whom to request tokens or redemption
    * records.
    */
  var issuers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Only set for "token-redemption" type and determine whether
    * to request a fresh SRR or use a still valid cached SRR. (TrustTokenParamsRefreshPolicy enum)
    */
  var refreshPolicy: UseCached | Refresh
  
  var `type`: TrustTokenOperationType
}
object TrustTokenParams {
  
  inline def apply(refreshPolicy: UseCached | Refresh, `type`: TrustTokenOperationType): TrustTokenParams = {
    val __obj = js.Dynamic.literal(refreshPolicy = refreshPolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustTokenParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustTokenParams] (val x: Self) extends AnyVal {
    
    inline def setIssuers(value: js.Array[String]): Self = StObject.set(x, "issuers", value.asInstanceOf[js.Any])
    
    inline def setIssuersUndefined: Self = StObject.set(x, "issuers", js.undefined)
    
    inline def setIssuersVarargs(value: String*): Self = StObject.set(x, "issuers", js.Array(value*))
    
    inline def setRefreshPolicy(value: UseCached | Refresh): Self = StObject.set(x, "refreshPolicy", value.asInstanceOf[js.Any])
    
    inline def setType(value: TrustTokenOperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

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
    * Only set for "srr-token-redemption" type and determine whether
    * to request a fresh SRR or use a still valid cached SRR. (TrustTokenParamsRefreshPolicy enum)
    */
  var refreshPolicy: UseCached | Refresh
  
  var `type`: TrustTokenOperationType
}
object TrustTokenParams {
  
  @scala.inline
  def apply(refreshPolicy: UseCached | Refresh, `type`: TrustTokenOperationType): TrustTokenParams = {
    val __obj = js.Dynamic.literal(refreshPolicy = refreshPolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustTokenParams]
  }
  
  @scala.inline
  implicit class TrustTokenParamsMutableBuilder[Self <: TrustTokenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssuers(value: js.Array[String]): Self = StObject.set(x, "issuers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuersUndefined: Self = StObject.set(x, "issuers", js.undefined)
    
    @scala.inline
    def setIssuersVarargs(value: String*): Self = StObject.set(x, "issuers", js.Array(value :_*))
    
    @scala.inline
    def setRefreshPolicy(value: UseCached | Refresh): Self = StObject.set(x, "refreshPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TrustTokenOperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.Refresh
import typings.devtoolsProtocol.devtoolsProtocolStrings.UseCached
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustTokenParams extends js.Object {
  
  /**
    * Origins of issuers from whom to request tokens or redemption
    * records.
    */
  var issuers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Only set for "srr-token-redemption" type and determine whether
    * to request a fresh SRR or use a still valid cached SRR. (TrustTokenParamsRefreshPolicy enum)
    */
  var refreshPolicy: UseCached | Refresh = js.native
  
  var `type`: TrustTokenOperationType = js.native
}
object TrustTokenParams {
  
  @scala.inline
  def apply(refreshPolicy: UseCached | Refresh, `type`: TrustTokenOperationType): TrustTokenParams = {
    val __obj = js.Dynamic.literal(refreshPolicy = refreshPolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustTokenParams]
  }
  
  @scala.inline
  implicit class TrustTokenParamsOps[Self <: TrustTokenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRefreshPolicy(value: UseCached | Refresh): Self = this.set("refreshPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TrustTokenOperationType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuersVarargs(value: String*): Self = this.set("issuers", js.Array(value :_*))
    
    @scala.inline
    def setIssuers(value: js.Array[String]): Self = this.set("issuers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuers: Self = this.set("issuers", js.undefined)
  }
}

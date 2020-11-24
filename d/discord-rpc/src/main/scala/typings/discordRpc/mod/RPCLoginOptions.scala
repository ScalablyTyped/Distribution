package typings.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RPCLoginOptions extends js.Object {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var clientId: String = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var rpcToken: js.UndefOr[String] = js.native
  
  var scopes: js.UndefOr[js.Array[String]] = js.native
  
  var tokenEndpoint: js.UndefOr[String] = js.native
}
object RPCLoginOptions {
  
  @scala.inline
  def apply(clientId: String): RPCLoginOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCLoginOptions]
  }
  
  @scala.inline
  implicit class RPCLoginOptionsOps[Self <: RPCLoginOptions] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    
    @scala.inline
    def setRpcToken(value: String): Self = this.set("rpcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRpcToken: Self = this.set("rpcToken", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setTokenEndpoint(value: String): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenEndpoint: Self = this.set("tokenEndpoint", js.undefined)
  }
}

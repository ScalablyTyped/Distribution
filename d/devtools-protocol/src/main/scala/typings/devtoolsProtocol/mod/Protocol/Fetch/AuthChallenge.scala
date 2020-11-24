package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.devtoolsProtocolStrings.Proxy
import typings.devtoolsProtocol.devtoolsProtocolStrings.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthChallenge extends js.Object {
  
  /**
    * Origin of the challenger.
    */
  var origin: String = js.native
  
  /**
    * The realm of the challenge. May be empty.
    */
  var realm: String = js.native
  
  /**
    * The authentication scheme used, such as basic or digest
    */
  var scheme: String = js.native
  
  /**
    * Source of the authentication challenge. (AuthChallengeSource enum)
    */
  var source: js.UndefOr[Server | Proxy] = js.native
}
object AuthChallenge {
  
  @scala.inline
  def apply(origin: String, realm: String, scheme: String): AuthChallenge = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthChallenge]
  }
  
  @scala.inline
  implicit class AuthChallengeOps[Self <: AuthChallenge] (val x: Self) extends AnyVal {
    
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
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Server | Proxy): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}

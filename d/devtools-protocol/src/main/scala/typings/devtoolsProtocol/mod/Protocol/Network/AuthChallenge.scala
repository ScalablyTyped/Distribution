package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.Proxy
import typings.devtoolsProtocol.devtoolsProtocolStrings.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthChallenge extends StObject {
  
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
  implicit class AuthChallengeMutableBuilder[Self <: AuthChallenge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Server | Proxy): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

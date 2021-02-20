package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCookieRequest extends StObject {
  
  /**
    * Cookie domain.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Cookie expiration date, session cookie if not set
    */
  var expires: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * True if cookie is http-only.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Cookie name.
    */
  var name: String = js.native
  
  /**
    * Cookie path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Cookie Priority type.
    */
  var priority: js.UndefOr[CookiePriority] = js.native
  
  /**
    * Cookie SameSite type.
    */
  var sameSite: js.UndefOr[CookieSameSite] = js.native
  
  /**
    * True if cookie is secure.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the
    * default domain and path values of the created cookie.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Cookie value.
    */
  var value: String = js.native
}
object SetCookieRequest {
  
  @scala.inline
  def apply(name: String, value: String): SetCookieRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieRequest]
  }
  
  @scala.inline
  implicit class SetCookieRequestMutableBuilder[Self <: SetCookieRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpires(value: TimeSinceEpoch): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPriority(value: CookiePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSameSite(value: CookieSameSite): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieParam extends StObject {
  
  /**
    * Cookie domain.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Cookie expiration date, session cookie if not set
    */
  var expires: js.UndefOr[TimeSinceEpoch] = js.undefined
  
  /**
    * True if cookie is http-only.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cookie name.
    */
  var name: String
  
  /**
    * Cookie path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Cookie Priority.
    */
  var priority: js.UndefOr[CookiePriority] = js.undefined
  
  /**
    * Cookie SameSite type.
    */
  var sameSite: js.UndefOr[CookieSameSite] = js.undefined
  
  /**
    * True if cookie is secure.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the
    * default domain and path values of the created cookie.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Cookie value.
    */
  var value: String
}
object CookieParam {
  
  inline def apply(name: String, value: String): CookieParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieParam]
  }
  
  extension [Self <: CookieParam](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: TimeSinceEpoch): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPriority(value: CookiePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSameSite(value: CookieSameSite): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

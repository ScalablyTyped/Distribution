package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  /**
    * Cookie domain.
    */
  var domain: String
  
  /**
    * Cookie expiration date as the number of seconds since the UNIX epoch.
    */
  var expires: Double
  
  /**
    * True if cookie is http-only.
    */
  var httpOnly: Boolean
  
  /**
    * Cookie name.
    */
  var name: String
  
  /**
    * Cookie path.
    */
  var path: String
  
  /**
    * Cookie Priority
    */
  var priority: CookiePriority
  
  /**
    * Cookie SameSite type.
    */
  var sameSite: js.UndefOr[CookieSameSite] = js.undefined
  
  /**
    * True if cookie is secure.
    */
  var secure: Boolean
  
  /**
    * True in case of session cookie.
    */
  var session: Boolean
  
  /**
    * Cookie size.
    */
  var size: integer
  
  /**
    * Cookie value.
    */
  var value: String
}
object Cookie {
  
  @scala.inline
  def apply(
    domain: String,
    expires: Double,
    httpOnly: Boolean,
    name: String,
    path: String,
    priority: CookiePriority,
    secure: Boolean,
    session: Boolean,
    size: integer,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: CookiePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSite(value: CookieSameSite): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

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
    * Cookie partition key. The site of the top-level URL the browser was visiting at the start
    * of the request to the endpoint that set the cookie.
    */
  var partitionKey: js.UndefOr[String] = js.undefined
  
  /**
    * True if cookie partition key is opaque.
    */
  var partitionKeyOpaque: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cookie path.
    */
  var path: String
  
  /**
    * Cookie Priority
    */
  var priority: CookiePriority
  
  /**
    * True if cookie is SameParty.
    */
  var sameParty: Boolean
  
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
    * Cookie source port. Valid values are {-1, [1, 65535]}, -1 indicates an unspecified port.
    * An unspecified port value allows protocol clients to emulate legacy cookie scope for the port.
    * This is a temporary ability and it will be removed in the future.
    */
  var sourcePort: integer
  
  /**
    * Cookie source scheme type.
    */
  var sourceScheme: CookieSourceScheme
  
  /**
    * Cookie value.
    */
  var value: String
}
object Cookie {
  
  inline def apply(
    domain: String,
    expires: Double,
    httpOnly: Boolean,
    name: String,
    path: String,
    priority: CookiePriority,
    sameParty: Boolean,
    secure: Boolean,
    session: Boolean,
    size: integer,
    sourcePort: integer,
    sourceScheme: CookieSourceScheme,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sameParty = sameParty.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourcePort = sourcePort.asInstanceOf[js.Any], sourceScheme = sourceScheme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyOpaque(value: Boolean): Self = StObject.set(x, "partitionKeyOpaque", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyOpaqueUndefined: Self = StObject.set(x, "partitionKeyOpaque", js.undefined)
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: CookiePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setSameParty(value: Boolean): Self = StObject.set(x, "sameParty", value.asInstanceOf[js.Any])
    
    inline def setSameSite(value: CookieSameSite): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSourcePort(value: integer): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourceScheme(value: CookieSourceScheme): Self = StObject.set(x, "sourceScheme", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
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
    * Cookie partition key. The site of the top-level URL the browser was visiting at the start
    * of the request to the endpoint that set the cookie.
    * If not set, the cookie will be set as not partitioned.
    */
  var partitionKey: js.UndefOr[String] = js.undefined
  
  /**
    * Cookie path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Cookie Priority.
    */
  var priority: js.UndefOr[CookiePriority] = js.undefined
  
  /**
    * True if cookie is SameParty.
    */
  var sameParty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cookie SameSite type.
    */
  var sameSite: js.UndefOr[CookieSameSite] = js.undefined
  
  /**
    * True if cookie is secure.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cookie source port. Valid values are {-1, [1, 65535]}, -1 indicates an unspecified port.
    * An unspecified port value allows protocol clients to emulate legacy cookie scope for the port.
    * This is a temporary ability and it will be removed in the future.
    */
  var sourcePort: js.UndefOr[integer] = js.undefined
  
  /**
    * Cookie source scheme type.
    */
  var sourceScheme: js.UndefOr[CookieSourceScheme] = js.undefined
  
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the
    * default domain, path, source port, and source scheme values of the created cookie.
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
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPriority(value: CookiePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSameParty(value: Boolean): Self = StObject.set(x, "sameParty", value.asInstanceOf[js.Any])
    
    inline def setSamePartyUndefined: Self = StObject.set(x, "sameParty", js.undefined)
    
    inline def setSameSite(value: CookieSameSite): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSourcePort(value: integer): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
    
    inline def setSourceScheme(value: CookieSourceScheme): Self = StObject.set(x, "sourceScheme", value.asInstanceOf[js.Any])
    
    inline def setSourceSchemeUndefined: Self = StObject.set(x, "sourceScheme", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

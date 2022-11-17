package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiesSetDetails extends StObject {
  
  /**
    * The domain of the cookie; this will be normalized with a preceding dot so that
    * it's also valid for subdomains. Empty by default if omitted.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * If omitted then the cookie becomes a session cookie and will not be retained
    * between sessions.
    */
  var expirationDate: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the cookie should be marked as HTTP only. Defaults to false.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the cookie. Empty by default if omitted.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The path of the cookie. Empty by default if omitted.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The Same Site policy to apply to this cookie.  Can be `unspecified`,
    * `no_restriction`, `lax` or `strict`.  Default is `lax`.
    */
  var sameSite: js.UndefOr["unspecified" | "no_restriction" | "lax" | "strict"] = js.undefined
  
  /**
    * Whether the cookie should be marked as Secure. Defaults to false unless Same
    * Site=None attribute is used.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL to associate the cookie with. The promise will be rejected if the URL is
    * invalid.
    */
  var url: String
  
  /**
    * The value of the cookie. Empty by default if omitted.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CookiesSetDetails {
  
  inline def apply(url: String): CookiesSetDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesSetDetails]
  }
  
  extension [Self <: CookiesSetDetails](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSameSite(value: "unspecified" | "no_restriction" | "lax" | "strict"): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

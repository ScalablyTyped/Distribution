package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiesGetFilter extends StObject {
  
  /**
    * Retrieves cookies whose domains match or are subdomains of `domains`.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Filters cookies by name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Retrieves cookies whose path matches `path`.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Filters cookies by their Secure property.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filters out session or persistent cookies.
    */
  var session: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Retrieves cookies which are associated with `url`. Empty implies retrieving
    * cookies of all URLs.
    */
  var url: js.UndefOr[String] = js.undefined
}
object CookiesGetFilter {
  
  @scala.inline
  def apply(): CookiesGetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookiesGetFilter]
  }
  
  @scala.inline
  implicit class CookiesGetFilterMutableBuilder[Self <: CookiesGetFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

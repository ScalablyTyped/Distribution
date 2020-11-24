package typings.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information about an HTTP cookie. */
@js.native
trait Cookie extends js.Object {
  
  /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
  var domain: String = js.native
  
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.native
  
  /** The first-party domain of the cookie. */
  var firstPartyDomain: String = js.native
  
  /**
    * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie).
    */
  var hostOnly: Boolean = js.native
  
  /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
  var httpOnly: Boolean = js.native
  
  /** The name of the cookie. */
  var name: String = js.native
  
  /** The path of the cookie. */
  var path: String = js.native
  
  /** The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests). */
  var sameSite: SameSiteStatus = js.native
  
  /**
    * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS).
    */
  var secure: Boolean = js.native
  
  /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
  var session: Boolean = js.native
  
  /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
  var storeId: String = js.native
  
  /** The value of the cookie. */
  var value: String = js.native
}
object Cookie {
  
  @scala.inline
  def apply(
    domain: String,
    firstPartyDomain: String,
    hostOnly: Boolean,
    httpOnly: Boolean,
    name: String,
    path: String,
    sameSite: SameSiteStatus,
    secure: Boolean,
    session: Boolean,
    storeId: String,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPartyDomain(value: String): Self = this.set("firstPartyDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostOnly(value: Boolean): Self = this.set("hostOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSite(value: SameSiteStatus): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: Double): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
  }
}

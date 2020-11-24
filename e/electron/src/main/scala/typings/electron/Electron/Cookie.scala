package typings.electron.Electron

import typings.electron.electronStrings.lax
import typings.electron.electronStrings.no_restriction
import typings.electron.electronStrings.strict
import typings.electron.electronStrings.unspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cookie extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/cookie
  /**
    * The domain of the cookie; this will be normalized with a preceding dot so that
    * it's also valid for subdomains.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.native
  
  /**
    * Whether the cookie is a host-only cookie; this will only be `true` if no domain
    * was passed.
    */
  var hostOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the cookie is marked as HTTP only.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the cookie.
    */
  var name: String = js.native
  
  /**
    * The path of the cookie.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The Same Site policy applied to this cookie.  Can be `unspecified`,
    * `no_restriction`, `lax` or `strict`.
    */
  var sameSite: unspecified | no_restriction | lax | strict = js.native
  
  /**
    * Whether the cookie is marked as secure.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the cookie is a session cookie or a persistent cookie with an expiration
    * date.
    */
  var session: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the cookie.
    */
  var value: String = js.native
}
object Cookie {
  
  @scala.inline
  def apply(name: String, sameSite: unspecified | no_restriction | lax | strict, value: String): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSite(value: unspecified | no_restriction | lax | strict): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Double): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setHostOnly(value: Boolean): Self = this.set("hostOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostOnly: Self = this.set("hostOnly", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}

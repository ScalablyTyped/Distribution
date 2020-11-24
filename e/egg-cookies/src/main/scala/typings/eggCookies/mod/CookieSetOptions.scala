package typings.eggCookies.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieSetOptions extends js.Object {
  
  /**
    * The domain for the cookie
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Encrypt the cookie's value or not
    */
  var encrypt: js.UndefOr[Boolean] = js.native
  
  /**
    * Expire time
    */
  var expires: js.UndefOr[Date] = js.native
  
  /**
    * Is for http only
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Max age for browsers
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * Is overridable
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  
  /**
    * The path for the cookie to be set in
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Is the same site
    */
  var sameSite: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Encrypt the cookie's value or not
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * Is it signed or not.
    */
  var signed: js.UndefOr[Boolean] = js.native
}
object CookieSetOptions {
  
  @scala.inline
  def apply(): CookieSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieSetOptions]
  }
  
  @scala.inline
  implicit class CookieSetOptionsOps[Self <: CookieSetOptions] (val x: Self) extends AnyVal {
    
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
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEncrypt(value: Boolean): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSameSite(value: Boolean | String): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}

package typings.expressSession.mod

import typings.expressSession.expressSessionStrings.auto
import typings.expressSession.expressSessionStrings.lax
import typings.expressSession.expressSessionStrings.none
import typings.expressSession.expressSessionStrings.strict
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieOptions extends js.Object {
  
  /**
    * Specifies the value for the `Domain Set-Cookie` attribute.
    * By default, no domain is set, and most clients will consider the cookie to apply to only the current domain.
    */
  var domain: js.UndefOr[String] = js.native
  
  var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.native
  
  /**
    * Specifies the `Date` object to be the value for the `Expires Set-Cookie` attribute.
    * By default, no expiration is set, and most clients will consider this a "non-persistent cookie" and will delete it on a condition like exiting a web browser application.
    *
    * If both `expires` and `maxAge` are set in the options, then the last one defined in the object is what is used.
    *
    * @deprecated The `expires` option should not be set directly; instead only use the `maxAge` option
    * @see maxAge
    */
  var expires: js.UndefOr[Date] = js.native
  
  /**
    * Specifies the boolean value for the `HttpOnly Set-Cookie` attribute. When truthy, the `HttpOnly` attribute is set, otherwise it is not.
    * By default, the `HttpOnly` attribute is set.
    *
    * Be careful when setting this to `true`, as compliant clients will not allow client-side JavaScript to see the cookie in `document.cookie`.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the number (in milliseconds) to use when calculating the `Expires Set-Cookie` attribute.
    * This is done by taking the current server time and adding `maxAge` milliseconds to the value to calculate an `Expires` datetime. By default, no maximum age is set.
    *
    * If both `expires` and `maxAge` are set in the options, then the last one defined in the object is what is used.
    * `maxAge` should be preferred over `expires`.
    *
    * @see expires
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the value for the `Path Set-Cookie` attribute.
    * By default, this is set to '/', which is the root path of the domain.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Specifies the boolean or string to be the value for the `SameSite Set-Cookie` attribute.
    * - `true` will set the `SameSite` attribute to `Strict` for strict same site enforcement.
    * - `false` will not set the `SameSite` attribute.
    * - `lax` will set the `SameSite` attribute to `Lax` for lax same site enforcement.
    * - `none` will set the `SameSite` attribute to `None` for an explicit cross-site cookie.
    * - `strict` will set the `SameSite` attribute to `Strict` for strict same site enforcement.
    *
    * More information about the different enforcement levels can be found in the specification.
    *
    * **Note:** This is an attribute that has not yet been fully standardized, and may change in the future.
    * This also means many clients may ignore this attribute until they understand it.
    */
  var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.native
  
  /**
    * Specifies the boolean value for the `Secure Set-Cookie` attribute. When truthy, the `Secure` attribute is set, otherwise it is not. By default, the `Secure` attribute is not set.
    * Be careful when setting this to true, as compliant clients will not send the cookie back to the server in the future if the browser does not have an HTTPS connection.
    *
    * Please note that `secure: true` is a **recommended option**.
    * However, it requires an https-enabled website, i.e., HTTPS is necessary for secure cookies.
    * If `secure` is set, and you access your site over HTTP, **the cookie will not be set**.
    *
    * The cookie.secure option can also be set to the special value `auto` to have this setting automatically match the determined security of the connection.
    * Be careful when using this setting if the site is available both as HTTP and HTTPS, as once the cookie is set on HTTPS, it will no longer be visible over HTTP.
    * This is useful when the Express "trust proxy" setting is properly setup to simplify development vs production configuration.
    *
    * If you have your node.js behind a proxy and are using `secure: true`, you need to set "trust proxy" in express. Please see the [README](https://github.com/expressjs/session) for details.
    *
    * Please see the [README](https://github.com/expressjs/session) for an example of using secure cookies in production, but allowing for testing in development based on NODE_ENV.
    */
  var secure: js.UndefOr[Boolean | auto] = js.native
  
  var signed: js.UndefOr[Boolean] = js.native
}
object CookieOptions {
  
  @scala.inline
  def apply(): CookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieOptions]
  }
  
  @scala.inline
  implicit class CookieOptionsOps[Self <: CookieOptions] (val x: Self) extends AnyVal {
    
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
    def setEncode(value: /* val */ String => String): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSameSite(value: Boolean | lax | strict | none): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean | auto): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}

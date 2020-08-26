package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieParam extends js.Object {
  /**
    * Cookie domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Cookie expiration date, session cookie if not set
    */
  var expires: js.UndefOr[TimeSinceEpoch] = js.native
  /**
    * True if cookie is http-only.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  /**
    * Cookie name.
    */
  var name: String = js.native
  /**
    * Cookie path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Cookie Priority.
    */
  var priority: js.UndefOr[CookiePriority] = js.native
  /**
    * Cookie SameSite type.
    */
  var sameSite: js.UndefOr[CookieSameSite] = js.native
  /**
    * True if cookie is secure.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * The request-URI to associate with the setting of the cookie. This value can affect the
    * default domain and path values of the created cookie.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Cookie value.
    */
  var value: String = js.native
}

object CookieParam {
  @scala.inline
  def apply(name: String, value: String): CookieParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieParam]
  }
  @scala.inline
  implicit class CookieParamOps[Self <: CookieParam] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExpires(value: TimeSinceEpoch): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPriority(value: CookiePriority): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSameSite(value: CookieSameSite): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


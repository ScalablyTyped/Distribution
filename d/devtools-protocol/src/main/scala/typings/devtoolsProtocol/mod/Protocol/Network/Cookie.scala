package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  /**
    * Cookie domain.
    */
  var domain: String = js.native
  /**
    * Cookie expiration date as the number of seconds since the UNIX epoch.
    */
  var expires: Double = js.native
  /**
    * True if cookie is http-only.
    */
  var httpOnly: Boolean = js.native
  /**
    * Cookie name.
    */
  var name: String = js.native
  /**
    * Cookie path.
    */
  var path: String = js.native
  /**
    * Cookie Priority
    */
  var priority: CookiePriority = js.native
  /**
    * Cookie SameSite type.
    */
  var sameSite: js.UndefOr[CookieSameSite] = js.native
  /**
    * True if cookie is secure.
    */
  var secure: Boolean = js.native
  /**
    * True in case of session cookie.
    */
  var session: Boolean = js.native
  /**
    * Cookie size.
    */
  var size: integer = js.native
  /**
    * Cookie value.
    */
  var value: String = js.native
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: CookiePriority): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: integer): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setSameSite(value: CookieSameSite): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
  }
  
}


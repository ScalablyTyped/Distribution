package typings.expressSession.mod.global.Express

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionCookieData extends js.Object {
  var domain: js.UndefOr[String] = js.native
  var expires: Date | Boolean = js.native
  var httpOnly: Boolean = js.native
  var maxAge: Double | Null = js.native
  var originalMaxAge: Double = js.native
  var path: String = js.native
  var sameSite: js.UndefOr[Boolean | String] = js.native
  var secure: js.UndefOr[Boolean] = js.native
}

object SessionCookieData {
  @scala.inline
  def apply(expires: Date | Boolean, httpOnly: Boolean, originalMaxAge: Double, path: String): SessionCookieData = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], originalMaxAge = originalMaxAge.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookieData]
  }
  @scala.inline
  implicit class SessionCookieDataOps[Self <: SessionCookieData] (val x: Self) extends AnyVal {
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
    def setExpires(value: Date | Boolean): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalMaxAge(value: Double): Self = this.set("originalMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAgeNull: Self = this.set("maxAge", null)
    @scala.inline
    def setSameSite(value: Boolean | String): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
  
}


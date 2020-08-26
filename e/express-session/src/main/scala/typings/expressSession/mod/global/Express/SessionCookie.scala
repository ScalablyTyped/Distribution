package typings.expressSession.mod.global.Express

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionCookie extends SessionCookieData {
  def serialize(name: String, value: String): String = js.native
}

object SessionCookie {
  @scala.inline
  def apply(
    expires: Date | Boolean,
    httpOnly: Boolean,
    originalMaxAge: Double,
    path: String,
    serialize: (String, String) => String
  ): SessionCookie = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], originalMaxAge = originalMaxAge.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[SessionCookie]
  }
  @scala.inline
  implicit class SessionCookieOps[Self <: SessionCookie] (val x: Self) extends AnyVal {
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
    def setSerialize(value: (String, String) => String): Self = this.set("serialize", js.Any.fromFunction2(value))
  }
  
}


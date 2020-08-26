package typings.expressSession.mod.global.Express

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionData
  extends /* key */ StringDictionary[js.Any] {
  var cookie: SessionCookieData = js.native
}

object SessionData {
  @scala.inline
  def apply(cookie: SessionCookieData): SessionData = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionData]
  }
  @scala.inline
  implicit class SessionDataOps[Self <: SessionData] (val x: Self) extends AnyVal {
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
    def setCookie(value: SessionCookieData): Self = this.set("cookie", value.asInstanceOf[js.Any])
  }
  
}


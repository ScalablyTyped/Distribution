package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.cookies.Cookie
import typings.firefoxWebextBrowser.browser.cookies.OnChangedCause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cause extends js.Object {
  /** The underlying reason behind the cookie's change. */
  var cause: OnChangedCause = js.native
  /** Information about the cookie that was set or removed. */
  var cookie: Cookie = js.native
  /** True if a cookie was removed. */
  var removed: Boolean = js.native
}

object Cause {
  @scala.inline
  def apply(cause: OnChangedCause, cookie: Cookie, removed: Boolean): Cause = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cause]
  }
  @scala.inline
  implicit class CauseOps[Self <: Cause] (val x: Self) extends AnyVal {
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
    def setCause(value: OnChangedCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie(value: Cookie): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}


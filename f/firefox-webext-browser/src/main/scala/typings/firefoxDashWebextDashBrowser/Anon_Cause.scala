package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.cookies.Cookie
import typings.firefoxDashWebextDashBrowser.browser.cookies.OnChangedCause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cause extends js.Object {
  /** The underlying reason behind the cookie's change. */
  var cause: OnChangedCause
  /** Information about the cookie that was set or removed. */
  var cookie: Cookie
  /** True if a cookie was removed. */
  var removed: Boolean
}

object Anon_Cause {
  @scala.inline
  def apply(cause: OnChangedCause, cookie: Cookie, removed: Boolean): Anon_Cause = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cause]
  }
}


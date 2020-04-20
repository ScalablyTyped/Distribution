package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.cookies.Cookie
import typings.firefoxWebextBrowser.browser.cookies.OnChangedCause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCause extends js.Object {
  /** The underlying reason behind the cookie's change. */
  var cause: OnChangedCause
  /** Information about the cookie that was set or removed. */
  var cookie: Cookie
  /** True if a cookie was removed. */
  var removed: Boolean
}

object AnonCause {
  @scala.inline
  def apply(cause: OnChangedCause, cookie: Cookie, removed: Boolean): AnonCause = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCause]
  }
}


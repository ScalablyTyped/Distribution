package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cause extends js.Object {
  /** The underlying reason behind the cookie's change. */
  var cause: firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.OnChangedCause
  /** Information about the cookie that was set or removed. */
  var cookie: firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie
  /** True if a cookie was removed. */
  var removed: scala.Boolean
}

object Anon_Cause {
  @scala.inline
  def apply(
    cause: firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.OnChangedCause,
    cookie: firefoxDashWebextDashBrowserLib.browserNs.cookiesNs.Cookie,
    removed: scala.Boolean
  ): Anon_Cause = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cause")(cause)
    __obj.updateDynamic("cookie")(cookie)
    __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[Anon_Cause]
  }
}


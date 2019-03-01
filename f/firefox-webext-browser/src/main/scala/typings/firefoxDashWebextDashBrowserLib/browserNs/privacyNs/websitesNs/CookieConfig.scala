package typings
package firefoxDashWebextDashBrowserLib.browserNs.privacyNs.websitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The settings for cookies. */
trait CookieConfig extends js.Object {
  /** The type of cookies to allow. */
  var behavior: js.UndefOr[_CookieConfigBehavior] = js.undefined
  /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
  var nonPersistentCookies: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieConfig {
  @scala.inline
  def apply(
    behavior: _CookieConfigBehavior = null,
    nonPersistentCookies: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieConfig = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (!js.isUndefined(nonPersistentCookies)) __obj.updateDynamic("nonPersistentCookies")(nonPersistentCookies)
    __obj.asInstanceOf[CookieConfig]
  }
}


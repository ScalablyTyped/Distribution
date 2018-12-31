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


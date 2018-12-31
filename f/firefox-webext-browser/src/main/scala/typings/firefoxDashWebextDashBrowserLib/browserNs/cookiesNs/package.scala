package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookiesNs {
  /**
    * The underlying reason behind the cookie's change. If a cookie was inserted, or removed via an explicit call to
    * `cookies.remove`, "cause" will be "explicit". If a cookie was automatically removed due to expiry, "cause" will
    * be "expired". If a cookie was removed due to being overwritten with an already-expired expiration date, "cause"
    * will be set to "expired_overwrite". If a cookie was automatically removed due to garbage collection, "cause"
    * will be "evicted". If a cookie was automatically removed due to a "set" call that overwrote it, "cause" will be
    * "overwrite". Plan your response accordingly.
    */
  type OnChangedCause = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.evicted | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.expired | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.explicit | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.expired_overwrite | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.overwrite
  /* cookies types */
  /**
    * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies). 'no_restriction'
    * corresponds to a cookie set without a 'SameSite' attribute, 'lax' to 'SameSite=Lax', and 'strict' to
    * 'SameSite=Strict'.
    */
  type SameSiteStatus = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.no_restriction | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.lax | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.strict
}

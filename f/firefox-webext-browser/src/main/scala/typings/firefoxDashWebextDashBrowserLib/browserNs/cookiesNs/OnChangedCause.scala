package typings
package firefoxDashWebextDashBrowserLib.browserNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The underlying reason behind the cookie's change. If a cookie was inserted, or removed via an explicit call to
  * `cookies.remove`, "cause" will be "explicit". If a cookie was automatically removed due to expiry, "cause" will
  * be "expired". If a cookie was removed due to being overwritten with an already-expired expiration date, "cause"
  * will be set to "expired_overwrite". If a cookie was automatically removed due to garbage collection, "cause"
  * will be "evicted". If a cookie was automatically removed due to a "set" call that overwrote it, "cause" will be
  * "overwrite". Plan your response accordingly.
  */
/* Rewritten from type alias, can be one of: 
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.evicted
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.expired
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.explicit
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.expired_overwrite
  - firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.overwrite
*/
trait OnChangedCause extends js.Object


package typings.firefoxDashWebextDashBrowser.browser.cookies

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
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.evicted
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.expired
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.explicit
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.expired_overwrite
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.overwrite
*/
trait OnChangedCause extends js.Object

object OnChangedCause {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def evicted: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.evicted = this.cast("evicted")
  @scala.inline
  def expired: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.expired = this.cast("expired")
  @scala.inline
  def expired_overwrite: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.expired_overwrite = this.cast("expired_overwrite")
  @scala.inline
  def explicit: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.explicit = this.cast("explicit")
  @scala.inline
  def overwrite: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.overwrite = this.cast("overwrite")
}


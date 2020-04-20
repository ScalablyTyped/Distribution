package typings.firefoxWebextBrowser.browser.cookies

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
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite
*/
trait OnChangedCause extends js.Object

object OnChangedCause {
  @scala.inline
  def evicted: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted = "evicted".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted]
  @scala.inline
  def expired: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired = "expired".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired]
  @scala.inline
  def expired_overwrite: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite = "expired_overwrite".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite]
  @scala.inline
  def explicit: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit = "explicit".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit]
  @scala.inline
  def overwrite: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite = "overwrite".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite]
}


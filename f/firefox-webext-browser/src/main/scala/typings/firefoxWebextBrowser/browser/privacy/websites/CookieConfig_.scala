package typings.firefoxWebextBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The settings for cookies. */
trait CookieConfig_ extends js.Object {
  /** The type of cookies to allow. */
  var behavior: js.UndefOr[CookieConfigBehavior] = js.undefined
  /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
  var nonPersistentCookies: js.UndefOr[Boolean] = js.undefined
}

object CookieConfig_ {
  @scala.inline
  def apply(behavior: CookieConfigBehavior = null, nonPersistentCookies: js.UndefOr[Boolean] = js.undefined): CookieConfig_ = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistentCookies)) __obj.updateDynamic("nonPersistentCookies")(nonPersistentCookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieConfig_]
  }
}


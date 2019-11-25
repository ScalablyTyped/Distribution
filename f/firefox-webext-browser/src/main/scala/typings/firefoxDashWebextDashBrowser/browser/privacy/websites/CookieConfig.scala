package typings.firefoxDashWebextDashBrowser.browser.privacy.websites

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The settings for cookies. */
trait CookieConfig extends js.Object {
  /** The type of cookies to allow. */
  var behavior: js.UndefOr[_CookieConfigBehavior] = js.undefined
  /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
  var nonPersistentCookies: js.UndefOr[Boolean] = js.undefined
}

object CookieConfig {
  @scala.inline
  def apply(behavior: _CookieConfigBehavior = null, nonPersistentCookies: js.UndefOr[Boolean] = js.undefined): CookieConfig = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistentCookies)) __obj.updateDynamic("nonPersistentCookies")(nonPersistentCookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieConfig]
  }
}

/**
  * Allow users to specify the default settings for allowing cookies, as well as whether all cookies should be
  * created as non-persistent cookies. This setting's value is of type CookieConfig.
  */
@JSGlobal("browser.privacy.websites.cookieConfig")
@js.native
object cookieConfig extends TopLevel[Setting]


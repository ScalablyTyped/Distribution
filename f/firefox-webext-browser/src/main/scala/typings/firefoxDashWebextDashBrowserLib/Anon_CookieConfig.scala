package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieConfig extends js.Object {
  /**
    * Allow users to specify the default settings for allowing cookies, as well as whether all cookies should be
    * created as non-persistent cookies. This setting's value is of type CookieConfig.
    */
  val cookieConfig: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * If enabled, the browser will associate all data (including cookies, HSTS data, cached images, and more) for any
    * third party domains with the domain in the address bar. This prevents third party trackers from using directly
    * stored information to identify you across different websites, but may break websites where you login with a
    * third party account (such as a Facebook or Google login.) The value of this preference is of type boolean, and
    * the default value is `false`.
    */
  val firstPartyIsolate: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * If enabled, the browser sends auditing pings when requested by a website (`<a ping>`). The value of this
    * preference is of type boolean, and the default value is `true`.
    */
  val hyperlinkAuditingEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * **Available on Windows and ChromeOS only**: If enabled, the browser provides a unique ID to plugins in order to
    * run protected content. The value of this preference is of type boolean, and the default value is `true`.
    * @deprecated Unsupported on Firefox at this time.
    */
  val protectedContentEnabled: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting] = js.undefined
  /**
    * If enabled, the browser sends `referer` headers with your requests. Yes, the name of this preference doesn't
    * match the misspelled header. No, we're not going to change it. The value of this preference is of type boolean,
    * and the default value is `true`.
    */
  val referrersEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * If enabled, the browser attempts to appear similar to other users by reporting generic information to websites.
    * This can prevent websites from uniquely identifying users. Examples of data that is spoofed include number of
    * CPU cores, precision of JavaScript timers, the local timezone, and disabling features such as GamePad support,
    * and the WebSpeech and Navigator APIs. The value of this preference is of type boolean, and the default value is
    * `false`.
    */
  val resistFingerprinting: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /* privacy.websites properties */
  /**
    * If disabled, the browser blocks third-party sites from setting cookies. The value of this preference is of type
    * boolean, and the default value is `true`.
    * @deprecated Unsupported on Firefox at this time.
    */
  val thirdPartyCookiesAllowed: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting] = js.undefined
  /**
    * Allow users to specify the mode for tracking protection. This setting's value is of type
    * TrackingProtectionModeOption, defaulting to `private_browsing_only`.
    */
  val trackingProtectionMode: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
}

object Anon_CookieConfig {
  @scala.inline
  def apply(
    cookieConfig: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    firstPartyIsolate: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    hyperlinkAuditingEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    referrersEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    resistFingerprinting: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    trackingProtectionMode: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    protectedContentEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting = null,
    thirdPartyCookiesAllowed: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting = null
  ): Anon_CookieConfig = {
    val __obj = js.Dynamic.literal(cookieConfig = cookieConfig, firstPartyIsolate = firstPartyIsolate, hyperlinkAuditingEnabled = hyperlinkAuditingEnabled, referrersEnabled = referrersEnabled, resistFingerprinting = resistFingerprinting, trackingProtectionMode = trackingProtectionMode)
    if (protectedContentEnabled != null) __obj.updateDynamic("protectedContentEnabled")(protectedContentEnabled)
    if (thirdPartyCookiesAllowed != null) __obj.updateDynamic("thirdPartyCookiesAllowed")(thirdPartyCookiesAllowed)
    __obj.asInstanceOf[Anon_CookieConfig]
  }
}


package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwebsites extends js.Object {
  /**
    * Allow users to specify the default settings for allowing cookies, as well as whether all cookies should be
    * created as non-persistent cookies. This setting's value is of type CookieConfig.
    */
  val cookieConfig: Setting
  /**
    * If enabled, the browser will associate all data (including cookies, HSTS data, cached images, and more) for any
    * third party domains with the domain in the address bar. This prevents third party trackers from using directly
    * stored information to identify you across different websites, but may break websites where you login with a
    * third party account (such as a Facebook or Google login.) The value of this preference is of type boolean, and
    * the default value is `false`.
    */
  val firstPartyIsolate: Setting
  /**
    * If enabled, the browser sends auditing pings when requested by a website (`<a ping>`). The value of this
    * preference is of type boolean, and the default value is `true`.
    */
  val hyperlinkAuditingEnabled: Setting
  /**
    * **Available on Windows and ChromeOS only**: If enabled, the browser provides a unique ID to plugins in order to
    * run protected content. The value of this preference is of type boolean, and the default value is `true`.
    * @deprecated Unsupported on Firefox at this time.
    */
  val protectedContentEnabled: js.UndefOr[Setting] = js.undefined
  /**
    * If enabled, the browser sends `referer` headers with your requests. Yes, the name of this preference doesn't
    * match the misspelled header. No, we're not going to change it. The value of this preference is of type boolean,
    * and the default value is `true`.
    */
  val referrersEnabled: Setting
  /**
    * If enabled, the browser attempts to appear similar to other users by reporting generic information to websites.
    * This can prevent websites from uniquely identifying users. Examples of data that is spoofed include number of
    * CPU cores, precision of JavaScript timers, the local timezone, and disabling features such as GamePad support,
    * and the WebSpeech and Navigator APIs. The value of this preference is of type boolean, and the default value is
    * `false`.
    */
  val resistFingerprinting: Setting
  /* privacy.websites properties */
  /**
    * If disabled, the browser blocks third-party sites from setting cookies. The value of this preference is of type
    * boolean, and the default value is `true`.
    * @deprecated Unsupported on Firefox at this time.
    */
  val thirdPartyCookiesAllowed: js.UndefOr[Setting] = js.undefined
  /**
    * Allow users to specify the mode for tracking protection. This setting's value is of type
    * TrackingProtectionModeOption, defaulting to `private_browsing_only`.
    */
  val trackingProtectionMode: Setting
}

object Typeofwebsites {
  @scala.inline
  def apply(
    cookieConfig: Setting,
    firstPartyIsolate: Setting,
    hyperlinkAuditingEnabled: Setting,
    referrersEnabled: Setting,
    resistFingerprinting: Setting,
    trackingProtectionMode: Setting,
    protectedContentEnabled: Setting = null,
    thirdPartyCookiesAllowed: Setting = null
  ): Typeofwebsites = {
    val __obj = js.Dynamic.literal(cookieConfig = cookieConfig.asInstanceOf[js.Any], firstPartyIsolate = firstPartyIsolate.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], resistFingerprinting = resistFingerprinting.asInstanceOf[js.Any], trackingProtectionMode = trackingProtectionMode.asInstanceOf[js.Any])
    if (protectedContentEnabled != null) __obj.updateDynamic("protectedContentEnabled")(protectedContentEnabled.asInstanceOf[js.Any])
    if (thirdPartyCookiesAllowed != null) __obj.updateDynamic("thirdPartyCookiesAllowed")(thirdPartyCookiesAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwebsites]
  }
}


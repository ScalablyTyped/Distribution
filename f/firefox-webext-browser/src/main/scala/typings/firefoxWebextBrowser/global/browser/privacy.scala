package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permissions: `privacy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.privacy")
@js.native
object privacy extends js.Object {
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  @js.native
  object network extends js.Object {
    /* privacy.network properties */
    /**
      * If enabled, the browser attempts to speed up your web browsing experience by pre-resolving DNS entries,
      * prerendering sites (`<link rel='prefetch' ...>`), and preemptively opening TCP and SSL connections to servers.
      * This preference's value is a boolean, defaulting to `true`.
      */
    val networkPredictionEnabled: Setting = js.native
    /** Allow users to enable and disable RTCPeerConnections (aka WebRTC). */
    val peerConnectionEnabled: Setting = js.native
    /**
      * This property controls the minimum and maximum TLS versions. This setting's value is an object of
      * `tlsVersionRestrictionConfig`.
      */
    val tlsVersionRestriction: Setting = js.native
    /**
      * Allow users to specify the media performance/privacy tradeoffs which impacts how WebRTC traffic will be routed
      * and how much local address information is exposed. This preference's value is of type IPHandlingPolicy,
      * defaulting to `default`.
      */
    val webRTCIPHandlingPolicy: Setting = js.native
  }
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  @js.native
  object services extends js.Object {
    /* privacy.services properties */
    /**
      * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
      * defaulting to `true`.
      */
    val passwordSavingEnabled: Setting = js.native
  }
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  @js.native
  object websites extends js.Object {
    /**
      * Allow users to specify the default settings for allowing cookies, as well as whether all cookies should be
      * created as non-persistent cookies. This setting's value is of type CookieConfig.
      */
    val cookieConfig: Setting = js.native
    /**
      * If enabled, the browser will associate all data (including cookies, HSTS data, cached images, and more) for any
      * third party domains with the domain in the address bar. This prevents third party trackers from using directly
      * stored information to identify you across different websites, but may break websites where you login with a
      * third party account (such as a Facebook or Google login.) The value of this preference is of type boolean, and
      * the default value is `false`.
      */
    val firstPartyIsolate: Setting = js.native
    /**
      * If enabled, the browser sends auditing pings when requested by a website (`<a ping>`). The value of this
      * preference is of type boolean, and the default value is `true`.
      */
    val hyperlinkAuditingEnabled: Setting = js.native
    /**
      * **Available on Windows and ChromeOS only**: If enabled, the browser provides a unique ID to plugins in order to
      * run protected content. The value of this preference is of type boolean, and the default value is `true`.
      * @deprecated Unsupported on Firefox at this time.
      */
    val protectedContentEnabled: js.UndefOr[Setting] = js.native
    /**
      * If enabled, the browser sends `referer` headers with your requests. Yes, the name of this preference doesn't
      * match the misspelled header. No, we're not going to change it. The value of this preference is of type boolean,
      * and the default value is `true`.
      */
    val referrersEnabled: Setting = js.native
    /**
      * If enabled, the browser attempts to appear similar to other users by reporting generic information to websites.
      * This can prevent websites from uniquely identifying users. Examples of data that is spoofed include number of
      * CPU cores, precision of JavaScript timers, the local timezone, and disabling features such as GamePad support,
      * and the WebSpeech and Navigator APIs. The value of this preference is of type boolean, and the default value is
      * `false`.
      */
    val resistFingerprinting: Setting = js.native
    /* privacy.websites properties */
    /**
      * If disabled, the browser blocks third-party sites from setting cookies. The value of this preference is of type
      * boolean, and the default value is `true`.
      * @deprecated Unsupported on Firefox at this time.
      */
    val thirdPartyCookiesAllowed: js.UndefOr[Setting] = js.native
    /**
      * Allow users to specify the mode for tracking protection. This setting's value is of type
      * TrackingProtectionModeOption, defaulting to `private_browsing_only`.
      */
    val trackingProtectionMode: Setting = js.native
  }
  
}


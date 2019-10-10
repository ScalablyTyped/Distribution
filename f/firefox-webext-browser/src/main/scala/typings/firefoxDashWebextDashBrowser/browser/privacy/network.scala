package typings.firefoxDashWebextDashBrowser.browser.privacy

import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
  *
  * Permissions: `privacy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.privacy.network")
@js.native
object network extends js.Object {
  /* privacy.network types */
  /** The IP handling policy of WebRTC. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default_public_and_private_interfaces
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default_public_interface_only
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.disable_non_proxied_udp
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.proxy_only
  */
  trait IPHandlingPolicy extends js.Object
  
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
    * Allow users to specify the media performance/privacy tradeoffs which impacts how WebRTC traffic will be routed
    * and how much local address information is exposed. This preference's value is of type IPHandlingPolicy,
    * defaulting to `default`.
    */
  val webRTCIPHandlingPolicy: Setting = js.native
}


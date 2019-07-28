package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.typesNs.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  /* privacy.network properties */
  /**
    * If enabled, the browser attempts to speed up your web browsing experience by pre-resolving DNS entries,
    * prerendering sites (`<link rel='prefetch' ...>`), and preemptively opening TCP and SSL connections to servers.
    * This preference's value is a boolean, defaulting to `true`.
    */
  val networkPredictionEnabled: Setting
  /** Allow users to enable and disable RTCPeerConnections (aka WebRTC). */
  val peerConnectionEnabled: Setting
  /**
    * Allow users to specify the media performance/privacy tradeoffs which impacts how WebRTC traffic will be routed
    * and how much local address information is exposed. This preference's value is of type IPHandlingPolicy,
    * defaulting to `default`.
    */
  val webRTCIPHandlingPolicy: Setting
}

object Typeofnetwork {
  @scala.inline
  def apply(networkPredictionEnabled: Setting, peerConnectionEnabled: Setting, webRTCIPHandlingPolicy: Setting): Typeofnetwork = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled, peerConnectionEnabled = peerConnectionEnabled, webRTCIPHandlingPolicy = webRTCIPHandlingPolicy)
  
    __obj.asInstanceOf[Typeofnetwork]
  }
}


package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnetwork extends js.Object {
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

object Typeofnetwork {
  @scala.inline
  def apply(
    networkPredictionEnabled: Setting,
    peerConnectionEnabled: Setting,
    tlsVersionRestriction: Setting,
    webRTCIPHandlingPolicy: Setting
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled.asInstanceOf[js.Any], peerConnectionEnabled = peerConnectionEnabled.asInstanceOf[js.Any], tlsVersionRestriction = tlsVersionRestriction.asInstanceOf[js.Any], webRTCIPHandlingPolicy = webRTCIPHandlingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetwork]
  }
  @scala.inline
  implicit class TypeofnetworkOps[Self <: Typeofnetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetworkPredictionEnabled(value: Setting): Self = this.set("networkPredictionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerConnectionEnabled(value: Setting): Self = this.set("peerConnectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTlsVersionRestriction(value: Setting): Self = this.set("tlsVersionRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRTCIPHandlingPolicy(value: Setting): Self = this.set("webRTCIPHandlingPolicy", value.asInstanceOf[js.Any])
  }
  
}


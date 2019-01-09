package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  var adunits: AdunitsResource = js.native
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel] = js.native
  /** Get the specified custom channel from the specified ad client. */
  def get(request: gapiDotClientDotAdsenseLib.Anon_AdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for the specified account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAdClientIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AdClientId): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AdClientIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels] = js.native
}


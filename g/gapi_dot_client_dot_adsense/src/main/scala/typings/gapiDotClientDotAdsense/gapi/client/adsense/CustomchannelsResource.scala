package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientId
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientIdAlt
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientIdAltFields
import typings.gapiDotClientDotAdsense.Anon_AdClientId
import typings.gapiDotClientDotAdsense.Anon_AdClientIdAlt
import typings.gapiDotClientDotAdsense.Anon_AdClientIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  var adunits: AdunitsResource = js.native
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(request: Anon_AccountIdAdClientIdAlt): Request[CustomChannel] = js.native
  /** Get the specified custom channel from the specified ad client. */
  def get(request: Anon_AdClientIdAlt): Request[CustomChannel] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: Anon_AccountIdAdClientId): Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for the specified account. */
  def list(request: Anon_AccountIdAdClientIdAltFields): Request[CustomChannels] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: Anon_AdClientId): Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for this AdSense account. */
  def list(request: Anon_AdClientIdAltFields): Request[CustomChannels] = js.native
}


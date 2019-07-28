package typings.gapiDotClientDotAdsense.gapiNs.clientNs.adsenseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdsense.Anon_AccountIdAdClientIdAltFields
import typings.gapiDotClientDotAdsense.Anon_AdClientIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for the specified account. */
  def list(request: Anon_AccountIdAdClientIdAltFields): Request[UrlChannels] = js.native
  /** List all URL channels in the specified ad client for this AdSense account. */
  def list(request: Anon_AdClientIdAltFields): Request[UrlChannels] = js.native
}


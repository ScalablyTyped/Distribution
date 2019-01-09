package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for the specified account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AccountIdAdClientIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannels] = js.native
  /** List all URL channels in the specified ad client for this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AdClientIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannels] = js.native
}


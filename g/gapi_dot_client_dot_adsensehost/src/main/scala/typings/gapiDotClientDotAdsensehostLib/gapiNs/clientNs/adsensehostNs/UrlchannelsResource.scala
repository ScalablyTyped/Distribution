package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UrlchannelsResource extends js.Object {
  /** Delete a URL channel from the host AdSense account. */
  def delete(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrintAdClientIdUrlChannelId): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel]
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrintAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannel]
  /** List all host URL channels in the host AdSense account. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[UrlChannels]
}


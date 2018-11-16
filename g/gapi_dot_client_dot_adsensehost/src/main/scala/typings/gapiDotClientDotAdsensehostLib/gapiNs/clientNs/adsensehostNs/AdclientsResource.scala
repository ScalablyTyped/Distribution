package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** Get information about one of the ad clients in the Host AdSense account. */
  def get(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrintAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[AdClient] = js.native
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrintAdClientIdAccountId): gapiDotClientLib.gapiNs.clientNs.Request[AdClient] = js.native
  /** List all hosted ad clients in the specified hosted account. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[AdClients] = js.native
  /** List all host ad clients in this AdSense account. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_MaxResultsPrettyPrintPageTokenQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[AdClients] = js.native
}


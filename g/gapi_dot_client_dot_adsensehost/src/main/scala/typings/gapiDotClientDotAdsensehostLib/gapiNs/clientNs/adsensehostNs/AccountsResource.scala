package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var reports: ReportsResource
  /** Get information about the selected associated AdSense account. */
  def get(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
}


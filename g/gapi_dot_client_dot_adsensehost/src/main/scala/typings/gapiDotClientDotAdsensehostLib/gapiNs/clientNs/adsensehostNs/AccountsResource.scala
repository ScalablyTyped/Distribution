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
  def get(request: gapiDotClientDotAdsensehostLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** List hosted accounts associated with this AdSense account by ad client id. */
  def list(request: gapiDotClientDotAdsensehostLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    get: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ],
    list: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
    ],
    reports: ReportsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adclients")(adclients)
    __obj.updateDynamic("adunits")(adunits)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("reports")(reports)
    __obj.asInstanceOf[AccountsResource]
  }
}


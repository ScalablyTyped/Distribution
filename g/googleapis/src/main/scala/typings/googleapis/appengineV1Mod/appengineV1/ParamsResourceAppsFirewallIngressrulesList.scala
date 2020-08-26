package typings.googleapis.appengineV1Mod.appengineV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsFirewallIngressrulesList extends StandardParameters {
  /**
    * Part of `parent`. Name of the Firewall collection to retrieve. Example:
    * apps/myapp/firewall/ingressRules.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A valid IP Address. If set, only rules matching this address will be
    * returned. The first returned rule will be the rule that fires on requests
    * from this IP.
    */
  var matchingAddress: js.UndefOr[String] = js.native
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceAppsFirewallIngressrulesList {
  @scala.inline
  def apply(): ParamsResourceAppsFirewallIngressrulesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsFirewallIngressrulesList]
  }
  @scala.inline
  implicit class ParamsResourceAppsFirewallIngressrulesListOps[Self <: ParamsResourceAppsFirewallIngressrulesList] (val x: Self) extends AnyVal {
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
    def setAppsId(value: String): Self = this.set("appsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsId: Self = this.set("appsId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMatchingAddress(value: String): Self = this.set("matchingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchingAddress: Self = this.set("matchingAddress", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}


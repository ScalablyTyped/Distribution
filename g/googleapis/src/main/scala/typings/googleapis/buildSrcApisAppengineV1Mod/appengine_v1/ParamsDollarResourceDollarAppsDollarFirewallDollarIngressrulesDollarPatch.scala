package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarPatch extends StandardParameters {
  /**
    * Part of `name`. Name of the Firewall resource to update. Example:
    * apps/myapp/firewall/ingressRules/100.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var ingressRulesId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$FirewallRule] = js.native
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}


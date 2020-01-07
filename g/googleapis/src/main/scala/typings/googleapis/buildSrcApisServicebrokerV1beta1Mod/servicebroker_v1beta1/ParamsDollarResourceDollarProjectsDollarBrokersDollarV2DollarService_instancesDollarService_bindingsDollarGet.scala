package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name must match
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/service_instances/[INSTANCE_ID]/service_bindings`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Plan id.
    */
  var planId: js.UndefOr[String] = js.native
  /**
    * Service id.
    */
  var serviceId: js.UndefOr[String] = js.native
}


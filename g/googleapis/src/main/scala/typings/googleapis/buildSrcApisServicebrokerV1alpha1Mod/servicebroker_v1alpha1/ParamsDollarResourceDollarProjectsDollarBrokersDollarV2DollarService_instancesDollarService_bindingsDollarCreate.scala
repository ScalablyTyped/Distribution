package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarBrokersDollarV2DollarService_instancesDollarService_bindingsDollarCreate extends StandardParameters {
  /**
    * See CreateServiceInstanceRequest for details.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id of the binding. Must be unique within GCP project. Maximum length
    * is 64, GUID recommended. Required.
    */
  var binding_id: js.UndefOr[String] = js.native
  /**
    * The service instance to which to bind.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The GCP container. Must match
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GoogleCloudServicebrokerV1alpha1__Binding] = js.native
}


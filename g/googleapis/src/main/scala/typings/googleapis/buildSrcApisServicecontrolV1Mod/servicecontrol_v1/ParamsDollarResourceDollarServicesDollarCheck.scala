package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarServicesDollarCheck extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$CheckRequest] = js.native
  /**
    * The service name as specified in its service configuration. For example,
    * `"pubsub.googleapis.com"`.  See
    * [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service)
    * for the definition of a service name.
    */
  var serviceName: js.UndefOr[String] = js.native
}


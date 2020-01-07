package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarServicesDollarConnectionsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The service that is managing peering connectivity for a service
    * producer's organization. For Google services that support this
    * functionality, this value is `services/servicenetworking.googleapis.com`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Connection] = js.native
}


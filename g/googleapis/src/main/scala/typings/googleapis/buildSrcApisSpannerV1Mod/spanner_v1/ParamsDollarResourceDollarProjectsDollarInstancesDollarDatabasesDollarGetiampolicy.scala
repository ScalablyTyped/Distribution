package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetiampolicy extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GetIamPolicyRequest] = js.native
  /**
    * REQUIRED: The Cloud Spanner resource for which the policy is being
    * retrieved. The format is `projects/<project ID>/instances/<instance ID>`
    * for instance resources and `projects/<project ID>/instances/<instance
    * ID>/databases/<database ID>` for database resources.
    */
  var resource: js.UndefOr[String] = js.native
}


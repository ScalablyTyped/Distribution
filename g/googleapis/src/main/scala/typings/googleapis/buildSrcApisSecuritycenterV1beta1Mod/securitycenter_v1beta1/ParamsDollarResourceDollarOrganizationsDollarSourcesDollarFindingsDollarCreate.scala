package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Unique identifier provided by the client within the parent scope. It must
    * be alphanumeric and less than or equal to 32 characters and greater than
    * 0 characters in length.
    */
  var findingId: js.UndefOr[String] = js.native
  /**
    * Resource name of the new finding's parent. Its format should be
    * "organizations/[organization_id]/sources/[source_id]".
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Finding] = js.native
}


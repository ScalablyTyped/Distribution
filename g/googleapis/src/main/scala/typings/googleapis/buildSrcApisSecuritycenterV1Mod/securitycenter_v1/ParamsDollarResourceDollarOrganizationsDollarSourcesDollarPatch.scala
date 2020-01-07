package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOrganizationsDollarSourcesDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The relative resource name of this source. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: "organizations/123/sources/456"
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Source] = js.native
  /**
    * The FieldMask to use when updating the source resource.  If empty all
    * mutable fields will be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}


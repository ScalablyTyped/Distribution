package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarUpdatesecuritymarks extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The relative resource name of the SecurityMarks. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Examples: "organizations/123/assets/456/securityMarks"
    * "organizations/123/sources/456/findings/789/securityMarks".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$SecurityMarks] = js.native
  /**
    * The time at which the updated SecurityMarks take effect.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The FieldMask to use when updating the security marks resource.
    */
  var updateMask: js.UndefOr[String] = js.native
}


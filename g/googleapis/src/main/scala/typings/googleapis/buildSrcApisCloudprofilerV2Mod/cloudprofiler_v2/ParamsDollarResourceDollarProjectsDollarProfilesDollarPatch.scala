package typings.googleapis.buildSrcApisCloudprofilerV2Mod.cloudprofiler_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarProfilesDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. Opaque, server-assigned, unique ID for this profile.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Profile] = js.native
  /**
    * Field mask used to specify the fields to be overwritten. Currently only
    * profile_bytes and labels fields are supported by UpdateProfile, so only
    * those fields can be specified in the mask. When no mask is provided, all
    * fields are overwritten.
    */
  var updateMask: js.UndefOr[String] = js.native
}


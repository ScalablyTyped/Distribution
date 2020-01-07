package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The name of the model.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GoogleCloudMlV1__Version] = js.native
  /**
    * Required. Specifies the path, relative to `Version`, of the field to
    * update. Must be present and non-empty.  For example, to change the
    * description of a version to "foo", the `update_mask` parameter would be
    * specified as `description`, and the `PATCH` request body would specify
    * the new value, as follows:     {       "description": "foo"     }
    * Currently the only supported update mask fields are `description` and
    * `autoScaling.minNodes`.
    */
  var updateMask: js.UndefOr[String] = js.native
}


package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarModelsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The project name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GoogleCloudMlV1__Model] = js.native
  /**
    * Required. Specifies the path, relative to `Model`, of the field to
    * update.  For example, to change the description of a model to "foo" and
    * set its default version to "version_1", the `update_mask` parameter would
    * be specified as `description`, `default_version.name`, and the `PATCH`
    * request body would specify the new value, as follows:     {
    * "description": "foo",       "defaultVersion": { "name":"version_1" } }
    * Currently the supported update masks are `description` and
    * `default_version.name`.
    */
  var updateMask: js.UndefOr[String] = js.native
}


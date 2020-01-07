package typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarGroupsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where group_id is the
    * unique ID assigned to the Group.  Must be left blank while creating a
    * Group.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Group] = js.native
  /**
    * Editable fields: `display_name`, `description`
    */
  var updateMask: js.UndefOr[String] = js.native
}


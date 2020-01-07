package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarGroupsDollarUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. The name of this group. The format is
    * "projects/{project_id_or_number}/groups/{group_id}". When creating a
    * group, this field is ignored and a new name is created consisting of the
    * project specified in the call to CreateGroup and a unique {group_id} that
    * is generated automatically.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Group] = js.native
  /**
    * If true, validate this request but do not update the existing group.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}


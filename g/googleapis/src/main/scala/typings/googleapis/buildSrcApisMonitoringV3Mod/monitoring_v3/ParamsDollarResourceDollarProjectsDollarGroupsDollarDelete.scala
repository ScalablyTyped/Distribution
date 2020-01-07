package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarGroupsDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The group to delete. The format is
    * "projects/{project_id_or_number}/groups/{group_id}".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If this field is true, then the request means to delete a group with all
    * its descendants. Otherwise, the request means to delete a group only when
    * it has no descendants. The default value is false.
    */
  var recursive: js.UndefOr[Boolean] = js.native
}


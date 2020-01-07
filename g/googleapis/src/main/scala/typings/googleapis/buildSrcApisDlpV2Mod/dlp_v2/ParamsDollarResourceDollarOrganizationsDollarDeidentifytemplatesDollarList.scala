package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOrganizationsDollarDeidentifytemplatesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional comma separated list of fields to order by, followed by `asc` or
    * `desc` postfix. This list is case-insensitive, default sorting order is
    * ascending, redundant space characters are insignificant.  Example: `name
    * asc,update_time, create_time desc`  Supported fields are:  -
    * `create_time`: corresponds to time the template was created. -
    * `update_time`: corresponds to time the template was last updated. -
    * `name`: corresponds to template's name. - `display_name`: corresponds to
    * template's display name.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional size of the page, can be limited by server. If zero server
    * returns a page of max size 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional page token to continue retrieval. Comes from previous call to
    * `ListDeidentifyTemplates`.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name, for example projects/my-project-id or
    * organizations/my-org-id.
    */
  var parent: js.UndefOr[String] = js.native
}


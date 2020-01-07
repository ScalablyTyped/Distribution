package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarLiensDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of items to return. This is a suggestion for the
    * server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The `next_page_token` value returned from a previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the resource to list all attached Liens. For example,
    * `projects/1234`.
    */
  var parent: js.UndefOr[String] = js.native
}


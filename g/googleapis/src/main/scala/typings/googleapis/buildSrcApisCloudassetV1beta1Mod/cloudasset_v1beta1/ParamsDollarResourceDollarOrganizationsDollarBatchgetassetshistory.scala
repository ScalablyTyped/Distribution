package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOrganizationsDollarBatchgetassetshistory extends StandardParameters {
  /**
    * A list of the full names of the assets. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more info.  The request becomes a no-op if the asset name list is
    * empty, and the max size of the asset name list is 100 in one request.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The content type.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Required. The relative name of the root asset. It can only be an
    * organization number (such as "organizations/123"), a project ID (such as
    * "projects/my-project-id")", or a project number (such as
    * "projects/12345").
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  @JSName("readTimeWindow.endTime")
  var readTimeWindowDotendTime: js.UndefOr[String] = js.native
  /**
    * Start time of the time window (exclusive).
    */
  @JSName("readTimeWindow.startTime")
  var readTimeWindowDotstartTime: js.UndefOr[String] = js.native
}


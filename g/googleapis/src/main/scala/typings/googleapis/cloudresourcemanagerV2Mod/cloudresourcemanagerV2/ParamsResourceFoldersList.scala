package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFoldersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of Folders to return in the response. This field is
    * optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to `ListFolders` that
    * indicates where this listing should continue from. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The resource name of the Organization or Folder whose Folders are being
    * listed. Must be of the form `folders/{folder_id}` or
    * `organizations/{org_id}`. Access to this method is controlled by checking
    * the `resourcemanager.folders.list` permission on the `parent`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Controls whether Folders in the DELETE_REQUESTED state should be
    * returned. Defaults to false. This field is optional.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
}


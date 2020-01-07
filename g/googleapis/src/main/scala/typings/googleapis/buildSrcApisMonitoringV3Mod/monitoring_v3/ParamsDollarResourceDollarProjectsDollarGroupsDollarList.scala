package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarGroupsDollarList extends StandardParameters {
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups that are ancestors of the specified group. The groups are
    * returned in order, starting with the immediate parent and ending with the
    * most distant ancestor. If the specified group has no immediate parent,
    * the results are empty.
    */
  var ancestorsOfGroup: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups whose parentName field contains the group name. If no
    * groups have this parent, the results are empty.
    */
  var childrenOfGroup: js.UndefOr[String] = js.native
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns the descendants of the specified group. This is a superset of the
    * results returned by the childrenOfGroup filter, and includes
    * children-of-children, and so forth.
    */
  var descendantsOfGroup: js.UndefOr[String] = js.native
  /**
    * The project whose groups are to be listed. The format is
    * "projects/{project_id_or_number}".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}


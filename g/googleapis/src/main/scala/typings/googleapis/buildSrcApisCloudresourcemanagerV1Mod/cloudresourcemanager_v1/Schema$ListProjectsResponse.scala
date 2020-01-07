package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A page of the response received from the ListProjects method.  A paginated
  * response where more pages are available has `next_page_token` set. This
  * token can be used in a subsequent request to retrieve the next request
  * page.
  */
@js.native
trait Schema$ListProjectsResponse extends js.Object {
  /**
    * Pagination token.  If the result set is too large to fit in a single
    * response, this token is returned. It encodes the position of the current
    * result cursor. Feeding this value into a new list request with the
    * `page_token` parameter gives the next page of the results.  When
    * `next_page_token` is not filled in, there is no next page and the list
    * returned is the last page in the result set.  Pagination tokens have a
    * limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Projects that matched the list filter. This list can be
    * paginated.
    */
  var projects: js.UndefOr[js.Array[Schema$Project]] = js.native
}

object Schema$ListProjectsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, projects: js.Array[Schema$Project] = null): Schema$ListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProjectsResponse]
  }
}


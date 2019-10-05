package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsResponse extends js.Object {
  /**
    * Pagination token.
    *
    * If the result set is too large to fit in a single response, this token
    * is returned. It encodes the position of the current result cursor.
    * Feeding this value into a new list request with the `page_token` parameter
    * gives the next page of the results.
    *
    * When `next_page_token` is not filled in, there is no next page and
    * the list returned is the last page in the result set.
    *
    * Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * The list of Projects that matched the list filter. This list can
    * be paginated.
    */
  var projects: js.UndefOr[js.Array[Project]] = js.undefined
}

object ListProjectsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, projects: js.Array[Project] = null): ListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[ListProjectsResponse]
  }
}


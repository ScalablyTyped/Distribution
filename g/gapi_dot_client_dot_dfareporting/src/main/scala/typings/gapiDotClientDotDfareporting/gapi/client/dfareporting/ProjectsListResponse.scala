package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#projectsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Project collection. */
  var projects: js.UndefOr[js.Array[Project]] = js.undefined
}

object ProjectsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, projects: js.Array[Project] = null): ProjectsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListResponse]
  }
}


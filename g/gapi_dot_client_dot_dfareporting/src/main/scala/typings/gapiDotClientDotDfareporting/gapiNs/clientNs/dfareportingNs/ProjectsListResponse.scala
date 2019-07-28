package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

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
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[ProjectsListResponse]
  }
}


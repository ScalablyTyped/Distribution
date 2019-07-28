package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
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


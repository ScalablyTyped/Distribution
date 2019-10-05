package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesListResponse extends js.Object {
  var directorySites: js.UndefOr[js.Array[DirectorySite]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DirectorySitesListResponse {
  @scala.inline
  def apply(directorySites: js.Array[DirectorySite] = null, kind: String = null, nextPageToken: String = null): DirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySites != null) __obj.updateDynamic("directorySites")(directorySites)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[DirectorySitesListResponse]
  }
}


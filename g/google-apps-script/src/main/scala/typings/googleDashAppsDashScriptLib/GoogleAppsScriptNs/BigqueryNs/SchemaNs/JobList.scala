package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var jobs: js.UndefOr[js.Array[JobListJobs]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object JobList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    jobs: js.Array[JobListJobs] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): JobList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[JobList]
  }
}


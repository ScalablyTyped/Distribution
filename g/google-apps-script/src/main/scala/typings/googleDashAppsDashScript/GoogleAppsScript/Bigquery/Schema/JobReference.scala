package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReference extends js.Object {
  var jobId: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
}

object JobReference {
  @scala.inline
  def apply(jobId: String = null, location: String = null, projectId: String = null): JobReference = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (location != null) __obj.updateDynamic("location")(location)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[JobReference]
  }
}


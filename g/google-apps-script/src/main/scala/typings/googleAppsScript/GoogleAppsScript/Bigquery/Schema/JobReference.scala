package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

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
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobReference]
  }
}


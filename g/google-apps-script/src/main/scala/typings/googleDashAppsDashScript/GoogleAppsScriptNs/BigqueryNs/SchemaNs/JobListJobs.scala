package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobListJobs extends js.Object {
  var configuration: js.UndefOr[JobConfiguration] = js.undefined
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var jobReference: js.UndefOr[JobReference] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var statistics: js.UndefOr[JobStatistics] = js.undefined
  var status: js.UndefOr[JobStatus] = js.undefined
  var user_email: js.UndefOr[String] = js.undefined
}

object JobListJobs {
  @scala.inline
  def apply(
    configuration: JobConfiguration = null,
    errorResult: ErrorProto = null,
    id: String = null,
    jobReference: JobReference = null,
    kind: String = null,
    state: String = null,
    statistics: JobStatistics = null,
    status: JobStatus = null,
    user_email: String = null
  ): JobListJobs = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (errorResult != null) __obj.updateDynamic("errorResult")(errorResult)
    if (id != null) __obj.updateDynamic("id")(id)
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (state != null) __obj.updateDynamic("state")(state)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (user_email != null) __obj.updateDynamic("user_email")(user_email)
    __obj.asInstanceOf[JobListJobs]
  }
}


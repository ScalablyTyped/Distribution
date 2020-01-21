package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

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
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (errorResult != null) __obj.updateDynamic("errorResult")(errorResult.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (user_email != null) __obj.updateDynamic("user_email")(user_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobListJobs]
  }
}


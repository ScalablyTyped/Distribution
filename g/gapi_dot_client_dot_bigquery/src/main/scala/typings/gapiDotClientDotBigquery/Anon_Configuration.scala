package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapi.client.bigquery.ErrorProto
import typings.gapiDotClientDotBigquery.gapi.client.bigquery.JobConfiguration
import typings.gapiDotClientDotBigquery.gapi.client.bigquery.JobReference
import typings.gapiDotClientDotBigquery.gapi.client.bigquery.JobStatistics
import typings.gapiDotClientDotBigquery.gapi.client.bigquery.JobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configuration extends js.Object {
  /** [Full-projection-only] Specifies the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.undefined
  /** A result object that will be present only if the job has failed. */
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  /** Unique opaque ID of the job. */
  var id: js.UndefOr[String] = js.undefined
  /** Job reference uniquely identifying the job. */
  var jobReference: js.UndefOr[JobReference] = js.undefined
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed. */
  var state: js.UndefOr[String] = js.undefined
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.undefined
  /** [Full-projection-only] Describes the state of the job. */
  var status: js.UndefOr[JobStatus] = js.undefined
  /** [Full-projection-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.undefined
}

object Anon_Configuration {
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
  ): Anon_Configuration = {
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
    __obj.asInstanceOf[Anon_Configuration]
  }
}


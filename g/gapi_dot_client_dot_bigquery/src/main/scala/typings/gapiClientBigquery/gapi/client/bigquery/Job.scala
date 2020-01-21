package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /** [Required] Describes the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.undefined
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** [Output-only] Opaque ID field of the job */
  var id: js.UndefOr[String] = js.undefined
  /** [Optional] Reference describing the unique-per-user name of the job. */
  var jobReference: js.UndefOr[JobReference] = js.undefined
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.undefined
  /** [Output-only] The status of this job. Examine this value when polling an asynchronous job to see if the job is complete. */
  var status: js.UndefOr[JobStatus] = js.undefined
  /** [Output-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    configuration: JobConfiguration = null,
    etag: String = null,
    id: String = null,
    jobReference: JobReference = null,
    kind: String = null,
    selfLink: String = null,
    statistics: JobStatistics = null,
    status: JobStatus = null,
    user_email: String = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (user_email != null) __obj.updateDynamic("user_email")(user_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}


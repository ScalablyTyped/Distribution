package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /** [Required] Describes the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.undefined
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Opaque ID field of the job */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] Reference describing the unique-per-user name of the job. */
  var jobReference: js.UndefOr[JobReference] = js.undefined
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.undefined
  /** [Output-only] The status of this job. Examine this value when polling an asynchronous job to see if the job is complete. */
  var status: js.UndefOr[JobStatus] = js.undefined
  /** [Output-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[java.lang.String] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    configuration: JobConfiguration = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    jobReference: JobReference = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null,
    statistics: JobStatistics = null,
    status: JobStatus = null,
    user_email: java.lang.String = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    if (user_email != null) __obj.updateDynamic("user_email")(user_email)
    __obj.asInstanceOf[Job]
  }
}


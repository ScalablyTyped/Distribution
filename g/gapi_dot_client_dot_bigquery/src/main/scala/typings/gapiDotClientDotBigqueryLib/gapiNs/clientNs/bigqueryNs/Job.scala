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


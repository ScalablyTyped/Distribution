package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_State extends js.Object {
  /** [Full-projection-only] Specifies the job configuration. */
  var configuration: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JobConfiguration] = js.undefined
  /** A result object that will be present only if the job has failed. */
  var errorResult: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.ErrorProto] = js.undefined
  /** Unique opaque ID of the job. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Job reference uniquely identifying the job. */
  var jobReference: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JobReference] = js.undefined
  /** The resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JobStatistics] = js.undefined
  /** [Full-projection-only] Describes the state of the job. */
  var status: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JobStatus] = js.undefined
  /** [Full-projection-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[java.lang.String] = js.undefined
}


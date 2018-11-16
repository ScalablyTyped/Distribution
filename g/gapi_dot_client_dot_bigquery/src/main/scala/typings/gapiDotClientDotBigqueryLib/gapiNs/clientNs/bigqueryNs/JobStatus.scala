package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JobStatus extends js.Object {
  /** [Output-only] Final error result of the job. If present, indicates that the job has completed and was unsuccessful. */
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  /**
               * [Output-only] The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to
               * stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
               */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  /** [Output-only] Running state of the job. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}


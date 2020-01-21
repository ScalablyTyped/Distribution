package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatus extends js.Object {
  /**
    * [Output-only] Final error result of the job. If present, indicates that
    * the job has completed and was unsuccessful.
    */
  var errorResult: js.UndefOr[SchemaErrorProto] = js.native
  /**
    * [Output-only] The first errors encountered during the running of the job.
    * The final message includes the number of errors that caused the process
    * to stop. Errors here do not necessarily mean that the job has completed
    * or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.native
  /**
    * [Output-only] Running state of the job.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaJobStatus {
  @scala.inline
  def apply(
    errorResult: SchemaErrorProto = null,
    errors: js.Array[SchemaErrorProto] = null,
    state: String = null
  ): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    if (errorResult != null) __obj.updateDynamic("errorResult")(errorResult.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobStatus]
  }
}


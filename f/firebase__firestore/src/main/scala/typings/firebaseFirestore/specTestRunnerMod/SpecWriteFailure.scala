package typings.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecWriteFailure extends js.Object {
  /** The error the backend uses to fail the write. */
  var error: SpecError
  /**
    * Whether we should keep the write in our internal queue. This should be set
    * to 'true' for transient errors or if the client ignores the failure
    * (e.g. a secondary client which ignores write rejections).
    *
    * Defaults to false.
    */
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
}

object SpecWriteFailure {
  @scala.inline
  def apply(error: SpecError, keepInQueue: js.UndefOr[Boolean] = js.undefined): SpecWriteFailure = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInQueue)) __obj.updateDynamic("keepInQueue")(keepInQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWriteFailure]
  }
}


package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to start manual transfer runs.
  */
@js.native
trait SchemaStartManualTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were created.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}

object SchemaStartManualTransferRunsResponse {
  @scala.inline
  def apply(runs: js.Array[SchemaTransferRun] = null): SchemaStartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStartManualTransferRunsResponse]
  }
}


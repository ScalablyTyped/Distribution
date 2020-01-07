package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to start manual transfer runs.
  */
@js.native
trait Schema$StartManualTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were created.
    */
  var runs: js.UndefOr[js.Array[Schema$TransferRun]] = js.native
}

object Schema$StartManualTransferRunsResponse {
  @scala.inline
  def apply(runs: js.Array[Schema$TransferRun] = null): Schema$StartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartManualTransferRunsResponse]
  }
}


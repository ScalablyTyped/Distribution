package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to the worker messages.
  */
@js.native
trait Schema$SendWorkerMessagesResponse extends js.Object {
  /**
    * The servers response to the worker messages.
    */
  var workerMessageResponses: js.UndefOr[js.Array[Schema$WorkerMessageResponse]] = js.native
}

object Schema$SendWorkerMessagesResponse {
  @scala.inline
  def apply(workerMessageResponses: js.Array[Schema$WorkerMessageResponse] = null): Schema$SendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (workerMessageResponses != null) __obj.updateDynamic("workerMessageResponses")(workerMessageResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SendWorkerMessagesResponse]
  }
}


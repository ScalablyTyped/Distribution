package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendWorkerMessagesResponse extends js.Object {
  /** The servers response to the worker messages. */
  var workerMessageResponses: js.UndefOr[js.Array[WorkerMessageResponse]] = js.undefined
}

object SendWorkerMessagesResponse {
  @scala.inline
  def apply(workerMessageResponses: js.Array[WorkerMessageResponse] = null): SendWorkerMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (workerMessageResponses != null) __obj.updateDynamic("workerMessageResponses")(workerMessageResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendWorkerMessagesResponse]
  }
}


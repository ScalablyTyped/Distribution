package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

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
    if (workerMessageResponses != null) __obj.updateDynamic("workerMessageResponses")(workerMessageResponses)
    __obj.asInstanceOf[SendWorkerMessagesResponse]
  }
}


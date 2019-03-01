package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendWorkerMessagesRequest extends js.Object {
  /** The location which contains the job */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The WorkerMessages to send. */
  var workerMessages: js.UndefOr[js.Array[WorkerMessage]] = js.undefined
}

object SendWorkerMessagesRequest {
  @scala.inline
  def apply(location: java.lang.String = null, workerMessages: js.Array[WorkerMessage] = null): SendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (workerMessages != null) __obj.updateDynamic("workerMessages")(workerMessages)
    __obj.asInstanceOf[SendWorkerMessagesRequest]
  }
}


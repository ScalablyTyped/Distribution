package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for sending worker messages to the service.
  */
@js.native
trait Schema$SendWorkerMessagesRequest extends js.Object {
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The WorkerMessages to send.
    */
  var workerMessages: js.UndefOr[js.Array[Schema$WorkerMessage]] = js.native
}

object Schema$SendWorkerMessagesRequest {
  @scala.inline
  def apply(location: String = null, workerMessages: js.Array[Schema$WorkerMessage] = null): Schema$SendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (workerMessages != null) __obj.updateDynamic("workerMessages")(workerMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SendWorkerMessagesRequest]
  }
}


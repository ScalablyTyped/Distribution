package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDebugCaptureRequest extends js.Object {
  /** The internal component id for which debug information is sent. */
  var componentId: js.UndefOr[String] = js.undefined
  /** The encoded debug information. */
  var data: js.UndefOr[String] = js.undefined
  /** The location which contains the job specified by job_id. */
  var location: js.UndefOr[String] = js.undefined
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[String] = js.undefined
}

object SendDebugCaptureRequest {
  @scala.inline
  def apply(componentId: String = null, data: String = null, location: String = null, workerId: String = null): SendDebugCaptureRequest = {
    val __obj = js.Dynamic.literal()
    if (componentId != null) __obj.updateDynamic("componentId")(componentId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDebugCaptureRequest]
  }
}


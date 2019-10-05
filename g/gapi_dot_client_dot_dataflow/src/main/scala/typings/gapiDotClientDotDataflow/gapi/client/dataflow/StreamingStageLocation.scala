package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingStageLocation extends js.Object {
  /**
    * Identifies the particular stream within the streaming Dataflow
    * job.
    */
  var streamId: js.UndefOr[String] = js.undefined
}

object StreamingStageLocation {
  @scala.inline
  def apply(streamId: String = null): StreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    if (streamId != null) __obj.updateDynamic("streamId")(streamId)
    __obj.asInstanceOf[StreamingStageLocation]
  }
}


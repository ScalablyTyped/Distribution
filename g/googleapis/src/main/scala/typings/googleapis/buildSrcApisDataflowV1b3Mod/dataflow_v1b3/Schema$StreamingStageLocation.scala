package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a streaming computation stage, for
  * stage-to-stage communication.
  */
@js.native
trait Schema$StreamingStageLocation extends js.Object {
  /**
    * Identifies the particular stream within the streaming Dataflow job.
    */
  var streamId: js.UndefOr[String] = js.native
}

object Schema$StreamingStageLocation {
  @scala.inline
  def apply(streamId: String = null): Schema$StreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingStageLocation]
  }
}


package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLocation extends js.Object {
  /** The stream is a custom source. */
  var customSourceLocation: js.UndefOr[CustomSourceLocation] = js.native
  /** The stream is a pubsub stream. */
  var pubsubLocation: js.UndefOr[PubsubLocation] = js.native
  /** The stream is a streaming side input. */
  var sideInputLocation: js.UndefOr[StreamingSideInputLocation] = js.native
  /**
    * The stream is part of another computation within the current
    * streaming Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[StreamingStageLocation] = js.native
}

object StreamLocation {
  @scala.inline
  def apply(): StreamLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLocation]
  }
  @scala.inline
  implicit class StreamLocationOps[Self <: StreamLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomSourceLocation(value: CustomSourceLocation): Self = this.set("customSourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSourceLocation: Self = this.set("customSourceLocation", js.undefined)
    @scala.inline
    def setPubsubLocation(value: PubsubLocation): Self = this.set("pubsubLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubsubLocation: Self = this.set("pubsubLocation", js.undefined)
    @scala.inline
    def setSideInputLocation(value: StreamingSideInputLocation): Self = this.set("sideInputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideInputLocation: Self = this.set("sideInputLocation", js.undefined)
    @scala.inline
    def setStreamingStageLocation(value: StreamingStageLocation): Self = this.set("streamingStageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingStageLocation: Self = this.set("streamingStageLocation", js.undefined)
  }
  
}


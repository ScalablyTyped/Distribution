package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseReceivedEvent extends js.Object {
  /**
    * Frame identifier.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId = js.native
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  /**
    * Response data.
    */
  var response: Response = js.native
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
  /**
    * Resource type.
    */
  var `type`: ResourceType = js.native
}

object ResponseReceivedEvent {
  @scala.inline
  def apply(
    loaderId: LoaderId,
    requestId: RequestId,
    response: Response,
    timestamp: MonotonicTime,
    `type`: ResourceType
  ): ResponseReceivedEvent = {
    val __obj = js.Dynamic.literal(loaderId = loaderId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseReceivedEvent]
  }
  @scala.inline
  implicit class ResponseReceivedEventOps[Self <: ResponseReceivedEvent] (val x: Self) extends AnyVal {
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
    def setLoaderId(value: LoaderId): Self = this.set("loaderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
  }
  
}


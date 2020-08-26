package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.Request
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPausedEvent extends js.Object {
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId = js.native
  /**
    * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
    * then this networkId will be the same as the requestId present in the requestWillBeSent event.
    */
  var networkId: js.UndefOr[RequestId] = js.native
  /**
    * The details of the request.
    */
  var request: Request = js.native
  /**
    * Each request the page makes will have a unique id.
    */
  var requestId: RequestId = js.native
  /**
    * How the requested resource will be used.
    */
  var resourceType: ResourceType = js.native
  /**
    * Response error if intercepted at response stage.
    */
  var responseErrorReason: js.UndefOr[ErrorReason] = js.native
  /**
    * Response headers if intercepted at the response stage.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderEntry]] = js.native
  /**
    * Response code if intercepted at response stage.
    */
  var responseStatusCode: js.UndefOr[integer] = js.native
}

object RequestPausedEvent {
  @scala.inline
  def apply(frameId: FrameId, request: Request, requestId: RequestId, resourceType: ResourceType): RequestPausedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPausedEvent]
  }
  @scala.inline
  implicit class RequestPausedEventOps[Self <: RequestPausedEvent] (val x: Self) extends AnyVal {
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkId(value: RequestId): Self = this.set("networkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkId: Self = this.set("networkId", js.undefined)
    @scala.inline
    def setResponseErrorReason(value: ErrorReason): Self = this.set("responseErrorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseErrorReason: Self = this.set("responseErrorReason", js.undefined)
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderEntry*): Self = this.set("responseHeaders", js.Array(value :_*))
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderEntry]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    @scala.inline
    def setResponseStatusCode(value: integer): Self = this.set("responseStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStatusCode: Self = this.set("responseStatusCode", js.undefined)
  }
  
}


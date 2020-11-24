package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestWillBeSentEvent extends js.Object {
  
  /**
    * URL of the document this request is loaded for.
    */
  var documentURL: String = js.native
  
  /**
    * Frame identifier.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  
  /**
    * Whether the request is initiated by a user gesture. Defaults to false.
    */
  var hasUserGesture: js.UndefOr[Boolean] = js.native
  
  /**
    * Request initiator.
    */
  var initiator: Initiator = js.native
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId = js.native
  
  /**
    * Redirect response data.
    */
  var redirectResponse: js.UndefOr[Response] = js.native
  
  /**
    * Request data.
    */
  var request: Request = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
  
  /**
    * Type of this resource.
    */
  var `type`: js.UndefOr[ResourceType] = js.native
  
  /**
    * Timestamp.
    */
  var wallTime: TimeSinceEpoch = js.native
}
object RequestWillBeSentEvent {
  
  @scala.inline
  def apply(
    documentURL: String,
    initiator: Initiator,
    loaderId: LoaderId,
    request: Request,
    requestId: RequestId,
    timestamp: MonotonicTime,
    wallTime: TimeSinceEpoch
  ): RequestWillBeSentEvent = {
    val __obj = js.Dynamic.literal(documentURL = documentURL.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], wallTime = wallTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillBeSentEvent]
  }
  
  @scala.inline
  implicit class RequestWillBeSentEventOps[Self <: RequestWillBeSentEvent] (val x: Self) extends AnyVal {
    
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
    def setDocumentURL(value: String): Self = this.set("documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiator(value: Initiator): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = this.set("loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWallTime(value: TimeSinceEpoch): Self = this.set("wallTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    
    @scala.inline
    def setHasUserGesture(value: Boolean): Self = this.set("hasUserGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasUserGesture: Self = this.set("hasUserGesture", js.undefined)
    
    @scala.inline
    def setRedirectResponse(value: Response): Self = this.set("redirectResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectResponse: Self = this.set("redirectResponse", js.undefined)
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

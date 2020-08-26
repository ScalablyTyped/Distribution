package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.Request
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthRequiredEvent extends js.Object {
  /**
    * Details of the Authorization Challenge encountered.
    * If this is set, client should respond with continueRequest that
    * contains AuthChallengeResponse.
    */
  var authChallenge: AuthChallenge = js.native
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId = js.native
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
}

object AuthRequiredEvent {
  @scala.inline
  def apply(
    authChallenge: AuthChallenge,
    frameId: FrameId,
    request: Request,
    requestId: RequestId,
    resourceType: ResourceType
  ): AuthRequiredEvent = {
    val __obj = js.Dynamic.literal(authChallenge = authChallenge.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthRequiredEvent]
  }
  @scala.inline
  implicit class AuthRequiredEventOps[Self <: AuthRequiredEvent] (val x: Self) extends AnyVal {
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
    def setAuthChallenge(value: AuthChallenge): Self = this.set("authChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
  }
  
}


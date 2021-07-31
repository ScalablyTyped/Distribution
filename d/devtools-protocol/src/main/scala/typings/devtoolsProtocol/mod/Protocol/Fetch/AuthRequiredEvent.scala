package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.Request
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthRequiredEvent extends StObject {
  
  /**
    * Details of the Authorization Challenge encountered.
    * If this is set, client should respond with continueRequest that
    * contains AuthChallengeResponse.
    */
  var authChallenge: AuthChallenge
  
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId
  
  /**
    * The details of the request.
    */
  var request: Request
  
  /**
    * Each request the page makes will have a unique id.
    */
  var requestId: RequestId
  
  /**
    * How the requested resource will be used.
    */
  var resourceType: ResourceType
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
  implicit class AuthRequiredEventMutableBuilder[Self <: AuthRequiredEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthChallenge(value: AuthChallenge): Self = StObject.set(x, "authChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}

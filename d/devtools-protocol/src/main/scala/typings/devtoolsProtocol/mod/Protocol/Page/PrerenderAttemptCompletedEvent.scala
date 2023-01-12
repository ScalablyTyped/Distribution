package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderAttemptCompletedEvent extends StObject {
  
  /**
    * This is used to give users more information about the name of the API call
    * that is incompatible with prerender and has caused the cancellation of the attempt
    */
  var disallowedApiMethod: js.UndefOr[String] = js.undefined
  
  var finalStatus: PrerenderFinalStatus
  
  /**
    * The frame id of the frame initiating prerendering.
    */
  var initiatingFrameId: FrameId
  
  var prerenderingUrl: String
}
object PrerenderAttemptCompletedEvent {
  
  inline def apply(finalStatus: PrerenderFinalStatus, initiatingFrameId: FrameId, prerenderingUrl: String): PrerenderAttemptCompletedEvent = {
    val __obj = js.Dynamic.literal(finalStatus = finalStatus.asInstanceOf[js.Any], initiatingFrameId = initiatingFrameId.asInstanceOf[js.Any], prerenderingUrl = prerenderingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderAttemptCompletedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrerenderAttemptCompletedEvent] (val x: Self) extends AnyVal {
    
    inline def setDisallowedApiMethod(value: String): Self = StObject.set(x, "disallowedApiMethod", value.asInstanceOf[js.Any])
    
    inline def setDisallowedApiMethodUndefined: Self = StObject.set(x, "disallowedApiMethod", js.undefined)
    
    inline def setFinalStatus(value: PrerenderFinalStatus): Self = StObject.set(x, "finalStatus", value.asInstanceOf[js.Any])
    
    inline def setInitiatingFrameId(value: FrameId): Self = StObject.set(x, "initiatingFrameId", value.asInstanceOf[js.Any])
    
    inline def setPrerenderingUrl(value: String): Self = StObject.set(x, "prerenderingUrl", value.asInstanceOf[js.Any])
  }
}

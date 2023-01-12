package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameRequestedNavigationEvent extends StObject {
  
  /**
    * The disposition for the navigation.
    */
  var disposition: ClientNavigationDisposition
  
  /**
    * Id of the frame that is being navigated.
    */
  var frameId: FrameId
  
  /**
    * The reason for the navigation.
    */
  var reason: ClientNavigationReason
  
  /**
    * The destination URL for the requested navigation.
    */
  var url: String
}
object FrameRequestedNavigationEvent {
  
  inline def apply(
    disposition: ClientNavigationDisposition,
    frameId: FrameId,
    reason: ClientNavigationReason,
    url: String
  ): FrameRequestedNavigationEvent = {
    val __obj = js.Dynamic.literal(disposition = disposition.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameRequestedNavigationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameRequestedNavigationEvent] (val x: Self) extends AnyVal {
    
    inline def setDisposition(value: ClientNavigationDisposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: ClientNavigationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

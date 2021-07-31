package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatedWithinDocumentEvent extends StObject {
  
  /**
    * Id of the frame.
    */
  var frameId: FrameId
  
  /**
    * Frame's new url.
    */
  var url: String
}
object NavigatedWithinDocumentEvent {
  
  @scala.inline
  def apply(frameId: FrameId, url: String): NavigatedWithinDocumentEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatedWithinDocumentEvent]
  }
  
  @scala.inline
  implicit class NavigatedWithinDocumentEventMutableBuilder[Self <: NavigatedWithinDocumentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

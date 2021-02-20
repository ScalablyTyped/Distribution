package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreencastFrameEvent extends StObject {
  
  /**
    * Base64-encoded compressed image.
    */
  var data: String = js.native
  
  /**
    * Screencast frame metadata.
    */
  var metadata: ScreencastFrameMetadata = js.native
  
  /**
    * Frame number.
    */
  var sessionId: integer = js.native
}
object ScreencastFrameEvent {
  
  @scala.inline
  def apply(data: String, metadata: ScreencastFrameMetadata, sessionId: integer): ScreencastFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameEvent]
  }
  
  @scala.inline
  implicit class ScreencastFrameEventMutableBuilder[Self <: ScreencastFrameEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ScreencastFrameMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: integer): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}

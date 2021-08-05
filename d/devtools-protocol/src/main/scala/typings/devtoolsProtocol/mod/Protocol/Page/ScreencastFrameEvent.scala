package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreencastFrameEvent extends StObject {
  
  /**
    * Base64-encoded compressed image.
    */
  var data: String
  
  /**
    * Screencast frame metadata.
    */
  var metadata: ScreencastFrameMetadata
  
  /**
    * Frame number.
    */
  var sessionId: integer
}
object ScreencastFrameEvent {
  
  inline def apply(data: String, metadata: ScreencastFrameMetadata, sessionId: integer): ScreencastFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameEvent]
  }
  
  extension [Self <: ScreencastFrameEvent](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ScreencastFrameMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: integer): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}

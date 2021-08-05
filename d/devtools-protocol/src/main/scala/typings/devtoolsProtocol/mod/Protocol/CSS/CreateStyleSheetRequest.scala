package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStyleSheetRequest extends StObject {
  
  /**
    * Identifier of the frame where "via-inspector" stylesheet should be created.
    */
  var frameId: FrameId
}
object CreateStyleSheetRequest {
  
  inline def apply(frameId: FrameId): CreateStyleSheetRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStyleSheetRequest]
  }
  
  extension [Self <: CreateStyleSheetRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}

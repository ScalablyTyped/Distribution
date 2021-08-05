package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.selectMultiple
import typings.devtoolsProtocol.devtoolsProtocolStrings.selectSingle
import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileChooserOpenedEvent extends StObject {
  
  /**
    * Input node id.
    */
  var backendNodeId: BackendNodeId
  
  /**
    * Id of the frame containing input node.
    */
  var frameId: FrameId
  
  /**
    * Input mode. (FileChooserOpenedEventMode enum)
    */
  var mode: selectSingle | selectMultiple
}
object FileChooserOpenedEvent {
  
  inline def apply(backendNodeId: BackendNodeId, frameId: FrameId, mode: selectSingle | selectMultiple): FileChooserOpenedEvent = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChooserOpenedEvent]
  }
  
  extension [Self <: FileChooserOpenedEvent](x: Self) {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setMode(value: selectSingle | selectMultiple): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}

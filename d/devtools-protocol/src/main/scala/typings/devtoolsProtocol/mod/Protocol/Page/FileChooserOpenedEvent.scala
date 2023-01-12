package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.selectMultiple
import typings.devtoolsProtocol.devtoolsProtocolStrings.selectSingle
import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileChooserOpenedEvent extends StObject {
  
  /**
    * Input node id. Only present for file choosers opened via an <input type="file"> element.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
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
  
  inline def apply(frameId: FrameId, mode: selectSingle | selectMultiple): FileChooserOpenedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChooserOpenedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileChooserOpenedEvent] (val x: Self) extends AnyVal {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setMode(value: selectSingle | selectMultiple): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}

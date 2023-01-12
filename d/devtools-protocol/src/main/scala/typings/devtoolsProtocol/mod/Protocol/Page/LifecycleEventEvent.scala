package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import typings.devtoolsProtocol.mod.Protocol.Network.MonotonicTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleEventEvent extends StObject {
  
  /**
    * Id of the frame.
    */
  var frameId: FrameId
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId
  
  var name: String
  
  var timestamp: MonotonicTime
}
object LifecycleEventEvent {
  
  inline def apply(frameId: FrameId, loaderId: LoaderId, name: String, timestamp: MonotonicTime): LifecycleEventEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleEventEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleEventEvent] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

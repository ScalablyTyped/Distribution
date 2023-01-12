package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameResourceTree extends StObject {
  
  /**
    * Child frames.
    */
  var childFrames: js.UndefOr[js.Array[FrameResourceTree]] = js.undefined
  
  /**
    * Frame information for this tree item.
    */
  var frame: Frame
  
  /**
    * Information about frame resources.
    */
  var resources: js.Array[FrameResource]
}
object FrameResourceTree {
  
  inline def apply(frame: Frame, resources: js.Array[FrameResource]): FrameResourceTree = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameResourceTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameResourceTree] (val x: Self) extends AnyVal {
    
    inline def setChildFrames(value: js.Array[FrameResourceTree]): Self = StObject.set(x, "childFrames", value.asInstanceOf[js.Any])
    
    inline def setChildFramesUndefined: Self = StObject.set(x, "childFrames", js.undefined)
    
    inline def setChildFramesVarargs(value: FrameResourceTree*): Self = StObject.set(x, "childFrames", js.Array(value*))
    
    inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[FrameResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: FrameResource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}

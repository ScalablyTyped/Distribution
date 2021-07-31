package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameTree extends StObject {
  
  /**
    * Child frames.
    */
  var childFrames: js.UndefOr[js.Array[FrameTree]] = js.undefined
  
  /**
    * Frame information for this tree item.
    */
  var frame: Frame
}
object FrameTree {
  
  @scala.inline
  def apply(frame: Frame): FrameTree = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameTree]
  }
  
  @scala.inline
  implicit class FrameTreeMutableBuilder[Self <: FrameTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildFrames(value: js.Array[FrameTree]): Self = StObject.set(x, "childFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildFramesUndefined: Self = StObject.set(x, "childFrames", js.undefined)
    
    @scala.inline
    def setChildFramesVarargs(value: FrameTree*): Self = StObject.set(x, "childFrames", js.Array(value :_*))
    
    @scala.inline
    def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}

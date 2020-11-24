package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameResourceTree extends js.Object {
  
  /**
    * Child frames.
    */
  var childFrames: js.UndefOr[js.Array[FrameResourceTree]] = js.native
  
  /**
    * Frame information for this tree item.
    */
  var frame: Frame = js.native
  
  /**
    * Information about frame resources.
    */
  var resources: js.Array[FrameResource] = js.native
}
object FrameResourceTree {
  
  @scala.inline
  def apply(frame: Frame, resources: js.Array[FrameResource]): FrameResourceTree = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameResourceTree]
  }
  
  @scala.inline
  implicit class FrameResourceTreeOps[Self <: FrameResourceTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrame(value: Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: FrameResource*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[FrameResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildFramesVarargs(value: FrameResourceTree*): Self = this.set("childFrames", js.Array(value :_*))
    
    @scala.inline
    def setChildFrames(value: js.Array[FrameResourceTree]): Self = this.set("childFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildFrames: Self = this.set("childFrames", js.undefined)
  }
}

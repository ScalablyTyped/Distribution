package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceTreeResponse extends js.Object {
  
  /**
    * Present frame / resource tree structure.
    */
  var frameTree: FrameResourceTree = js.native
}
object GetResourceTreeResponse {
  
  @scala.inline
  def apply(frameTree: FrameResourceTree): GetResourceTreeResponse = {
    val __obj = js.Dynamic.literal(frameTree = frameTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceTreeResponse]
  }
  
  @scala.inline
  implicit class GetResourceTreeResponseOps[Self <: GetResourceTreeResponse] (val x: Self) extends AnyVal {
    
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
    def setFrameTree(value: FrameResourceTree): Self = this.set("frameTree", value.asInstanceOf[js.Any])
  }
}

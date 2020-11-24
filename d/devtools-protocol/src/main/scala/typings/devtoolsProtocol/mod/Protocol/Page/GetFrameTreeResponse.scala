package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFrameTreeResponse extends js.Object {
  
  /**
    * Present frame tree structure.
    */
  var frameTree: FrameTree = js.native
}
object GetFrameTreeResponse {
  
  @scala.inline
  def apply(frameTree: FrameTree): GetFrameTreeResponse = {
    val __obj = js.Dynamic.literal(frameTree = frameTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameTreeResponse]
  }
  
  @scala.inline
  implicit class GetFrameTreeResponseOps[Self <: GetFrameTreeResponse] (val x: Self) extends AnyVal {
    
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
    def setFrameTree(value: FrameTree): Self = this.set("frameTree", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceTreeResponse extends StObject {
  
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
  implicit class GetResourceTreeResponseMutableBuilder[Self <: GetResourceTreeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameTree(value: FrameResourceTree): Self = StObject.set(x, "frameTree", value.asInstanceOf[js.Any])
  }
}

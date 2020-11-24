package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGridHighlightObjectsForTestResponse extends js.Object {
  
  /**
    * Grid Highlight data for the node ids provided.
    */
  var highlights: js.Any = js.native
}
object GetGridHighlightObjectsForTestResponse {
  
  @scala.inline
  def apply(highlights: js.Any): GetGridHighlightObjectsForTestResponse = {
    val __obj = js.Dynamic.literal(highlights = highlights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGridHighlightObjectsForTestResponse]
  }
  
  @scala.inline
  implicit class GetGridHighlightObjectsForTestResponseOps[Self <: GetGridHighlightObjectsForTestResponse] (val x: Self) extends AnyVal {
    
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
    def setHighlights(value: js.Any): Self = this.set("highlights", value.asInstanceOf[js.Any])
  }
}

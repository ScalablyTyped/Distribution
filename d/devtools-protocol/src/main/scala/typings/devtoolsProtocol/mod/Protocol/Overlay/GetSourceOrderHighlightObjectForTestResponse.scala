package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSourceOrderHighlightObjectForTestResponse extends js.Object {
  
  /**
    * Source order highlight data for the node id provided.
    */
  var highlight: js.Any = js.native
}
object GetSourceOrderHighlightObjectForTestResponse {
  
  @scala.inline
  def apply(highlight: js.Any): GetSourceOrderHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceOrderHighlightObjectForTestResponse]
  }
  
  @scala.inline
  implicit class GetSourceOrderHighlightObjectForTestResponseOps[Self <: GetSourceOrderHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
    
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
    def setHighlight(value: js.Any): Self = this.set("highlight", value.asInstanceOf[js.Any])
  }
}

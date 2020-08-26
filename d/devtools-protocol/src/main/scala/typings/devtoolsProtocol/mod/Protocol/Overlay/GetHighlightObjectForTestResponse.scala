package typings.devtoolsProtocol.mod.Protocol.Overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHighlightObjectForTestResponse extends js.Object {
  /**
    * Highlight data for the node.
    */
  var highlight: js.Any = js.native
}

object GetHighlightObjectForTestResponse {
  @scala.inline
  def apply(highlight: js.Any): GetHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHighlightObjectForTestResponse]
  }
  @scala.inline
  implicit class GetHighlightObjectForTestResponseOps[Self <: GetHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
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


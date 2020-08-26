package typings.devtoolsProtocol.mod.Protocol.Memory

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDOMCountersResponse extends js.Object {
  var documents: integer = js.native
  var jsEventListeners: integer = js.native
  var nodes: integer = js.native
}

object GetDOMCountersResponse {
  @scala.inline
  def apply(documents: integer, jsEventListeners: integer, nodes: integer): GetDOMCountersResponse = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], jsEventListeners = jsEventListeners.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDOMCountersResponse]
  }
  @scala.inline
  implicit class GetDOMCountersResponseOps[Self <: GetDOMCountersResponse] (val x: Self) extends AnyVal {
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
    def setDocuments(value: integer): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsEventListeners(value: integer): Self = this.set("jsEventListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: integer): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}


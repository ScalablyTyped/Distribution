package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchInResponseBodyResponse extends js.Object {
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch] = js.native
}

object SearchInResponseBodyResponse {
  @scala.inline
  def apply(result: js.Array[SearchMatch]): SearchInResponseBodyResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInResponseBodyResponse]
  }
  @scala.inline
  implicit class SearchInResponseBodyResponseOps[Self <: SearchInResponseBodyResponse] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: SearchMatch*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[SearchMatch]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}


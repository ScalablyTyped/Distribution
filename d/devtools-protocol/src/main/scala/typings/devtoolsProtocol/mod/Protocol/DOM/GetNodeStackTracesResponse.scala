package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNodeStackTracesResponse extends js.Object {
  /**
    * Creation stack trace, if available.
    */
  var creation: js.UndefOr[StackTrace] = js.native
}

object GetNodeStackTracesResponse {
  @scala.inline
  def apply(): GetNodeStackTracesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeStackTracesResponse]
  }
  @scala.inline
  implicit class GetNodeStackTracesResponseOps[Self <: GetNodeStackTracesResponse] (val x: Self) extends AnyVal {
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
    def setCreation(value: StackTrace): Self = this.set("creation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreation: Self = this.set("creation", js.undefined)
  }
  
}


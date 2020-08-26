package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnregisterRequest extends js.Object {
  var scopeURL: String = js.native
}

object UnregisterRequest {
  @scala.inline
  def apply(scopeURL: String): UnregisterRequest = {
    val __obj = js.Dynamic.literal(scopeURL = scopeURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisterRequest]
  }
  @scala.inline
  implicit class UnregisterRequestOps[Self <: UnregisterRequest] (val x: Self) extends AnyVal {
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
    def setScopeURL(value: String): Self = this.set("scopeURL", value.asInstanceOf[js.Any])
  }
  
}


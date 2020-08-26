package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExposeDevToolsProtocolRequest extends js.Object {
  /**
    * Binding name, 'cdp' if not specified.
    */
  var bindingName: js.UndefOr[String] = js.native
  var targetId: TargetID = js.native
}

object ExposeDevToolsProtocolRequest {
  @scala.inline
  def apply(targetId: TargetID): ExposeDevToolsProtocolRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposeDevToolsProtocolRequest]
  }
  @scala.inline
  implicit class ExposeDevToolsProtocolRequestOps[Self <: ExposeDevToolsProtocolRequest] (val x: Self) extends AnyVal {
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
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindingName(value: String): Self = this.set("bindingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingName: Self = this.set("bindingName", js.undefined)
  }
  
}


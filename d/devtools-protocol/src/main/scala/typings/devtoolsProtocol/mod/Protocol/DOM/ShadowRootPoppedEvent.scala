package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowRootPoppedEvent extends js.Object {
  /**
    * Host element id.
    */
  var hostId: NodeId = js.native
  /**
    * Shadow root id.
    */
  var rootId: NodeId = js.native
}

object ShadowRootPoppedEvent {
  @scala.inline
  def apply(hostId: NodeId, rootId: NodeId): ShadowRootPoppedEvent = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootPoppedEvent]
  }
  @scala.inline
  implicit class ShadowRootPoppedEventOps[Self <: ShadowRootPoppedEvent] (val x: Self) extends AnyVal {
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
    def setHostId(value: NodeId): Self = this.set("hostId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootId(value: NodeId): Self = this.set("rootId", value.asInstanceOf[js.Any])
  }
  
}


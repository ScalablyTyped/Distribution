package typings.devtoolsProtocol.mod.Protocol.DOMDebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventListenersResponse extends js.Object {
  /**
    * Array of relevant listeners.
    */
  var listeners: js.Array[EventListener] = js.native
}

object GetEventListenersResponse {
  @scala.inline
  def apply(listeners: js.Array[EventListener]): GetEventListenersResponse = {
    val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventListenersResponse]
  }
  @scala.inline
  implicit class GetEventListenersResponseOps[Self <: GetEventListenersResponse] (val x: Self) extends AnyVal {
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
    def setListenersVarargs(value: EventListener*): Self = this.set("listeners", js.Array(value :_*))
    @scala.inline
    def setListeners(value: js.Array[EventListener]): Self = this.set("listeners", value.asInstanceOf[js.Any])
  }
  
}


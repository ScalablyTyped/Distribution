package typings.devtoolsProtocol.mod.Protocol.WebAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextWillBeDestroyedEvent extends js.Object {
  var contextId: GraphObjectId = js.native
}

object ContextWillBeDestroyedEvent {
  @scala.inline
  def apply(contextId: GraphObjectId): ContextWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextWillBeDestroyedEvent]
  }
  @scala.inline
  implicit class ContextWillBeDestroyedEventOps[Self <: ContextWillBeDestroyedEvent] (val x: Self) extends AnyVal {
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
    def setContextId(value: GraphObjectId): Self = this.set("contextId", value.asInstanceOf[js.Any])
  }
  
}


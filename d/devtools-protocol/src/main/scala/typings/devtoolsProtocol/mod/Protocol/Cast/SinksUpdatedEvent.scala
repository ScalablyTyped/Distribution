package typings.devtoolsProtocol.mod.Protocol.Cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinksUpdatedEvent extends js.Object {
  var sinks: js.Array[Sink] = js.native
}

object SinksUpdatedEvent {
  @scala.inline
  def apply(sinks: js.Array[Sink]): SinksUpdatedEvent = {
    val __obj = js.Dynamic.literal(sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinksUpdatedEvent]
  }
  @scala.inline
  implicit class SinksUpdatedEventOps[Self <: SinksUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setSinksVarargs(value: Sink*): Self = this.set("sinks", js.Array(value :_*))
    @scala.inline
    def setSinks(value: js.Array[Sink]): Self = this.set("sinks", value.asInstanceOf[js.Any])
  }
  
}


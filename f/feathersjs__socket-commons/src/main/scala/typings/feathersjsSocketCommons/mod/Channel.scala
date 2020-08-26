package typings.feathersjsSocketCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  def filter(callback: js.Function1[/* connection */ Connection, Boolean]): Channel = js.native
  def join(connections: Connection*): this.type = js.native
  def leave(connections: Connection*): this.type = js.native
  def send(data: js.Any): this.type = js.native
}

object Channel {
  @scala.inline
  def apply(
    filter: js.Function1[/* connection */ Connection, Boolean] => Channel,
    join: /* repeated */ Connection => Channel,
    leave: /* repeated */ Connection => Channel,
    send: js.Any => Channel
  ): Channel = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setFilter(value: js.Function1[/* connection */ Connection, Boolean] => Channel): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: /* repeated */ Connection => Channel): Self = this.set("join", js.Any.fromFunction1(value))
    @scala.inline
    def setLeave(value: /* repeated */ Connection => Channel): Self = this.set("leave", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: js.Any => Channel): Self = this.set("send", js.Any.fromFunction1(value))
  }
  
}


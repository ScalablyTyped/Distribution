package typings.ebml.mod.Decoder

import typings.ebml.mod.StateAndTagData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerMap extends js.Object {
  def close(): Unit = js.native
  def data(chunk: StateAndTagData): Unit = js.native
  def end(): Unit = js.native
  def error(err: Error): Unit = js.native
  def readable(): Unit = js.native
}

object EventListenerMap {
  @scala.inline
  def apply(
    close: () => Unit,
    data: StateAndTagData => Unit,
    end: () => Unit,
    error: Error => Unit,
    readable: () => Unit
  ): EventListenerMap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction1(data), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
    __obj.asInstanceOf[EventListenerMap]
  }
  @scala.inline
  implicit class EventListenerMapOps[Self <: EventListenerMap] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: StateAndTagData => Unit): Self = this.set("data", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setError(value: Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setReadable(value: () => Unit): Self = this.set("readable", js.Any.fromFunction0(value))
  }
  
}


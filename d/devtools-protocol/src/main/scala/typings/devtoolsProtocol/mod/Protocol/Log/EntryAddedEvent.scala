package typings.devtoolsProtocol.mod.Protocol.Log

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryAddedEvent extends js.Object {
  /**
    * The entry.
    */
  var entry: LogEntry = js.native
}

object EntryAddedEvent {
  @scala.inline
  def apply(entry: LogEntry): EntryAddedEvent = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryAddedEvent]
  }
  @scala.inline
  implicit class EntryAddedEventOps[Self <: EntryAddedEvent] (val x: Self) extends AnyVal {
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
    def setEntry(value: LogEntry): Self = this.set("entry", value.asInstanceOf[js.Any])
  }
  
}


package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexedDBListUpdatedEvent extends js.Object {
  /**
    * Origin to update.
    */
  var origin: String = js.native
}

object IndexedDBListUpdatedEvent {
  @scala.inline
  def apply(origin: String): IndexedDBListUpdatedEvent = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedDBListUpdatedEvent]
  }
  @scala.inline
  implicit class IndexedDBListUpdatedEventOps[Self <: IndexedDBListUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
  
}


package typings.devtoolsProtocol.mod.Protocol.DOMStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomStorageItemUpdatedEvent extends js.Object {
  var key: String = js.native
  var newValue: String = js.native
  var oldValue: String = js.native
  var storageId: StorageId = js.native
}

object DomStorageItemUpdatedEvent {
  @scala.inline
  def apply(key: String, newValue: String, oldValue: String, storageId: StorageId): DomStorageItemUpdatedEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomStorageItemUpdatedEvent]
  }
  @scala.inline
  implicit class DomStorageItemUpdatedEventOps[Self <: DomStorageItemUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageId(value: StorageId): Self = this.set("storageId", value.asInstanceOf[js.Any])
  }
  
}


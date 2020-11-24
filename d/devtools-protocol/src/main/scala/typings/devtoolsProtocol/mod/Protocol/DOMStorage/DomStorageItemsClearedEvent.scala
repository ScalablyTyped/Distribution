package typings.devtoolsProtocol.mod.Protocol.DOMStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomStorageItemsClearedEvent extends js.Object {
  
  var storageId: StorageId = js.native
}
object DomStorageItemsClearedEvent {
  
  @scala.inline
  def apply(storageId: StorageId): DomStorageItemsClearedEvent = {
    val __obj = js.Dynamic.literal(storageId = storageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomStorageItemsClearedEvent]
  }
  
  @scala.inline
  implicit class DomStorageItemsClearedEventOps[Self <: DomStorageItemsClearedEvent] (val x: Self) extends AnyVal {
    
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
    def setStorageId(value: StorageId): Self = this.set("storageId", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.DOMStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveDOMStorageItemRequest extends js.Object {
  
  var key: String = js.native
  
  var storageId: StorageId = js.native
}
object RemoveDOMStorageItemRequest {
  
  @scala.inline
  def apply(key: String, storageId: StorageId): RemoveDOMStorageItemRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveDOMStorageItemRequest]
  }
  
  @scala.inline
  implicit class RemoveDOMStorageItemRequestOps[Self <: RemoveDOMStorageItemRequest] (val x: Self) extends AnyVal {
    
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
    def setStorageId(value: StorageId): Self = this.set("storageId", value.asInstanceOf[js.Any])
  }
}

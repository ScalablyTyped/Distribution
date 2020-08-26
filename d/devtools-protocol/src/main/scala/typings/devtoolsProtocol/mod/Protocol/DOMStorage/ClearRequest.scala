package typings.devtoolsProtocol.mod.Protocol.DOMStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearRequest extends js.Object {
  var storageId: StorageId = js.native
}

object ClearRequest {
  @scala.inline
  def apply(storageId: StorageId): ClearRequest = {
    val __obj = js.Dynamic.literal(storageId = storageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearRequest]
  }
  @scala.inline
  implicit class ClearRequestOps[Self <: ClearRequest] (val x: Self) extends AnyVal {
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


package typings.devtoolsProtocol.mod.Protocol.DOMStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageId extends js.Object {
  /**
    * Whether the storage is local storage (not session storage).
    */
  var isLocalStorage: Boolean = js.native
  /**
    * Security origin for the storage.
    */
  var securityOrigin: String = js.native
}

object StorageId {
  @scala.inline
  def apply(isLocalStorage: Boolean, securityOrigin: String): StorageId = {
    val __obj = js.Dynamic.literal(isLocalStorage = isLocalStorage.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageId]
  }
  @scala.inline
  implicit class StorageIdOps[Self <: StorageId] (val x: Self) extends AnyVal {
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
    def setIsLocalStorage(value: Boolean): Self = this.set("isLocalStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
  }
  
}


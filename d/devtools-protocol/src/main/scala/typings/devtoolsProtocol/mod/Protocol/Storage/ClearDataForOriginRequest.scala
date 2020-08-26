package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearDataForOriginRequest extends js.Object {
  /**
    * Security origin.
    */
  var origin: String = js.native
  /**
    * Comma separated list of StorageType to clear.
    */
  var storageTypes: String = js.native
}

object ClearDataForOriginRequest {
  @scala.inline
  def apply(origin: String, storageTypes: String): ClearDataForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], storageTypes = storageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDataForOriginRequest]
  }
  @scala.inline
  implicit class ClearDataForOriginRequestOps[Self <: ClearDataForOriginRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStorageTypes(value: String): Self = this.set("storageTypes", value.asInstanceOf[js.Any])
  }
  
}


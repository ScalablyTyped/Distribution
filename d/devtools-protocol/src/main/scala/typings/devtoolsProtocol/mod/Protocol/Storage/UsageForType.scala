package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageForType extends js.Object {
  /**
    * Name of storage type.
    */
  var storageType: StorageType = js.native
  /**
    * Storage usage (bytes).
    */
  var usage: Double = js.native
}

object UsageForType {
  @scala.inline
  def apply(storageType: StorageType, usage: Double): UsageForType = {
    val __obj = js.Dynamic.literal(storageType = storageType.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageForType]
  }
  @scala.inline
  implicit class UsageForTypeOps[Self <: UsageForType] (val x: Self) extends AnyVal {
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
    def setStorageType(value: StorageType): Self = this.set("storageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
  }
  
}


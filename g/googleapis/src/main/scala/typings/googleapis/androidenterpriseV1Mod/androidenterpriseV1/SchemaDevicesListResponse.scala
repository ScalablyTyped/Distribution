package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device resources for the user.
  */
@js.native
trait SchemaDevicesListResponse extends js.Object {
  /**
    * A managed device.
    */
  var device: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#devicesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDevicesListResponse {
  @scala.inline
  def apply(): SchemaDevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicesListResponse]
  }
  @scala.inline
  implicit class SchemaDevicesListResponseOps[Self <: SchemaDevicesListResponse] (val x: Self) extends AnyVal {
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
    def setDeviceVarargs(value: SchemaDevice*): Self = this.set("device", js.Array(value :_*))
    @scala.inline
    def setDevice(value: js.Array[SchemaDevice]): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


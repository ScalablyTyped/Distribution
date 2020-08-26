package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing found devices.
  */
@js.native
trait SchemaFindDevicesByDeviceIdentifierResponse extends js.Object {
  /**
    * Found devices.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaFindDevicesByDeviceIdentifierResponse {
  @scala.inline
  def apply(): SchemaFindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindDevicesByDeviceIdentifierResponse]
  }
  @scala.inline
  implicit class SchemaFindDevicesByDeviceIdentifierResponseOps[Self <: SchemaFindDevicesByDeviceIdentifierResponse] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: SchemaDevice*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[SchemaDevice]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}


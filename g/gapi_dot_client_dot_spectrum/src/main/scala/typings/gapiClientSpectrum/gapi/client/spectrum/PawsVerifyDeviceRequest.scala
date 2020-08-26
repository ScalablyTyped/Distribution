package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsVerifyDeviceRequest extends js.Object {
  /** A list of device descriptors, which specifies the slave devices to be validated, is required. */
  var deviceDescs: js.UndefOr[js.Array[DeviceDescriptor]] = js.native
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.native
}

object PawsVerifyDeviceRequest {
  @scala.inline
  def apply(): PawsVerifyDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsVerifyDeviceRequest]
  }
  @scala.inline
  implicit class PawsVerifyDeviceRequestOps[Self <: PawsVerifyDeviceRequest] (val x: Self) extends AnyVal {
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
    def setDeviceDescsVarargs(value: DeviceDescriptor*): Self = this.set("deviceDescs", js.Array(value :_*))
    @scala.inline
    def setDeviceDescs(value: js.Array[DeviceDescriptor]): Self = this.set("deviceDescs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDescs: Self = this.set("deviceDescs", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


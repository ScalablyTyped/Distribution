package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsRegisterRequest extends js.Object {
  /** Antenna characteristics, including its height and height type. */
  var antenna: js.UndefOr[AntennaCharacteristics] = js.native
  /** A DeviceDescriptor is required. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /** Device owner information is required. */
  var deviceOwner: js.UndefOr[DeviceOwner] = js.native
  /** A device's geolocation is required. */
  var location: js.UndefOr[GeoLocation] = js.native
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

object PawsRegisterRequest {
  @scala.inline
  def apply(): PawsRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsRegisterRequest]
  }
  @scala.inline
  implicit class PawsRegisterRequestOps[Self <: PawsRegisterRequest] (val x: Self) extends AnyVal {
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
    def setAntenna(value: AntennaCharacteristics): Self = this.set("antenna", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntenna: Self = this.set("antenna", js.undefined)
    @scala.inline
    def setDeviceDesc(value: DeviceDescriptor): Self = this.set("deviceDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDesc: Self = this.set("deviceDesc", js.undefined)
    @scala.inline
    def setDeviceOwner(value: DeviceOwner): Self = this.set("deviceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceOwner: Self = this.set("deviceOwner", js.undefined)
    @scala.inline
    def setLocation(value: GeoLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
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


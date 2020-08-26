package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsNotifySpectrumUseRequest extends js.Object {
  /** Device descriptor information is required in the spectrum-use notification message. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /**
    * The geolocation of the master device (the device that is sending the spectrum-use notification) to the database is required in the spectrum-use
    * notification message.
    */
  var location: js.UndefOr[GeoLocation] = js.native
  /**
    * A spectrum list is required in the spectrum-use notification. The list specifies the spectrum that the device expects to use, which includes frequency
    * ranges and maximum power levels. The list may be empty if the device decides not to use any of spectrum. For consistency, the psdBandwidthHz value
    * should match that from one of the spectrum elements in the corresponding available spectrum response previously sent to the device by the database.
    * Note that maximum power levels in the spectrum element must be expressed as power spectral density over the specified psdBandwidthHz value. The actual
    * bandwidth to be used (as computed from the start and stop frequencies) may be different from the psdBandwidthHz value. As an example, when regulatory
    * rules express maximum power spectral density in terms of maximum power over any 100 kHz band, then the psdBandwidthHz value should be set to 100 kHz,
    * even though the actual bandwidth used can be 20 kHz.
    */
  var spectra: js.UndefOr[js.Array[SpectrumMessage]] = js.native
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

object PawsNotifySpectrumUseRequest {
  @scala.inline
  def apply(): PawsNotifySpectrumUseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsNotifySpectrumUseRequest]
  }
  @scala.inline
  implicit class PawsNotifySpectrumUseRequestOps[Self <: PawsNotifySpectrumUseRequest] (val x: Self) extends AnyVal {
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
    def setDeviceDesc(value: DeviceDescriptor): Self = this.set("deviceDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDesc: Self = this.set("deviceDesc", js.undefined)
    @scala.inline
    def setLocation(value: GeoLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSpectraVarargs(value: SpectrumMessage*): Self = this.set("spectra", js.Array(value :_*))
    @scala.inline
    def setSpectra(value: js.Array[SpectrumMessage]): Self = this.set("spectra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectra: Self = this.set("spectra", js.undefined)
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


package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsGetSpectrumRequest extends js.Object {
  /** Depending on device type and regulatory domain, the characteristics of the antenna may be required. */
  var antenna: js.UndefOr[AntennaCharacteristics] = js.native
  /**
    * The master device may include its device capabilities to limit the available-spectrum response to the spectrum that is compatible with its
    * capabilities. The database should not return spectrum that is incompatible with the specified capabilities.
    */
  var capabilities: js.UndefOr[DeviceCapabilities] = js.native
  /**
    * When the available spectrum request is made on behalf of a specific device (a master or slave device), device descriptor information for that device is
    * required (in such cases, the requestType parameter must be empty). When a requestType value is specified, device descriptor information may be optional
    * or required according to the rules of the applicable regulatory domain.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /**
    * The geolocation of the master device (a device with geolocation capability that makes an available spectrum request) is required whether the master
    * device is making the request on its own behalf or on behalf of a slave device (one without geolocation capability). The location must be the location
    * of the radiation center of the master device's antenna. To support mobile devices, a regulatory domain may allow the anticipated position of the master
    * device to be given instead. If the location specifies a region, rather than a point, the database may return an UNIMPLEMENTED error code if it does not
    * support query by region.
    */
  var location: js.UndefOr[GeoLocation] = js.native
  /**
    * When an available spectrum request is made by the master device (a device with geolocation capability) on behalf of a slave device (a device without
    * geolocation capability), the rules of the applicable regulatory domain may require the master device to provide its own device descriptor information
    * (in addition to device descriptor information for the slave device, which is provided in a separate parameter).
    */
  var masterDeviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /**
    * Depending on device type and regulatory domain, device owner information may be included in an available spectrum request. This allows the device to
    * register and get spectrum-availability information in a single request.
    */
  var owner: js.UndefOr[DeviceOwner] = js.native
  /**
    * The request type parameter is an optional parameter that can be used to modify an available spectrum request, but its use depends on applicable
    * regulatory rules. It may be used, for example, to request generic slave device parameters without having to specify the device descriptor for a
    * specific device. When the requestType parameter is missing, the request is for a specific device (master or slave), and the deviceDesc parameter for
    * the device on whose behalf the request is made is required.
    */
  var requestType: js.UndefOr[String] = js.native
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

object PawsGetSpectrumRequest {
  @scala.inline
  def apply(): PawsGetSpectrumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsGetSpectrumRequest]
  }
  @scala.inline
  implicit class PawsGetSpectrumRequestOps[Self <: PawsGetSpectrumRequest] (val x: Self) extends AnyVal {
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
    def setCapabilities(value: DeviceCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setDeviceDesc(value: DeviceDescriptor): Self = this.set("deviceDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDesc: Self = this.set("deviceDesc", js.undefined)
    @scala.inline
    def setLocation(value: GeoLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMasterDeviceDesc(value: DeviceDescriptor): Self = this.set("masterDeviceDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterDeviceDesc: Self = this.set("masterDeviceDesc", js.undefined)
    @scala.inline
    def setOwner(value: DeviceOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
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


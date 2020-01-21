package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsGetSpectrumRequest extends js.Object {
  /** Depending on device type and regulatory domain, the characteristics of the antenna may be required. */
  var antenna: js.UndefOr[AntennaCharacteristics] = js.undefined
  /**
    * The master device may include its device capabilities to limit the available-spectrum response to the spectrum that is compatible with its
    * capabilities. The database should not return spectrum that is incompatible with the specified capabilities.
    */
  var capabilities: js.UndefOr[DeviceCapabilities] = js.undefined
  /**
    * When the available spectrum request is made on behalf of a specific device (a master or slave device), device descriptor information for that device is
    * required (in such cases, the requestType parameter must be empty). When a requestType value is specified, device descriptor information may be optional
    * or required according to the rules of the applicable regulatory domain.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /**
    * The geolocation of the master device (a device with geolocation capability that makes an available spectrum request) is required whether the master
    * device is making the request on its own behalf or on behalf of a slave device (one without geolocation capability). The location must be the location
    * of the radiation center of the master device's antenna. To support mobile devices, a regulatory domain may allow the anticipated position of the master
    * device to be given instead. If the location specifies a region, rather than a point, the database may return an UNIMPLEMENTED error code if it does not
    * support query by region.
    */
  var location: js.UndefOr[GeoLocation] = js.undefined
  /**
    * When an available spectrum request is made by the master device (a device with geolocation capability) on behalf of a slave device (a device without
    * geolocation capability), the rules of the applicable regulatory domain may require the master device to provide its own device descriptor information
    * (in addition to device descriptor information for the slave device, which is provided in a separate parameter).
    */
  var masterDeviceDesc: js.UndefOr[DeviceDescriptor] = js.undefined
  /**
    * Depending on device type and regulatory domain, device owner information may be included in an available spectrum request. This allows the device to
    * register and get spectrum-availability information in a single request.
    */
  var owner: js.UndefOr[DeviceOwner] = js.undefined
  /**
    * The request type parameter is an optional parameter that can be used to modify an available spectrum request, but its use depends on applicable
    * regulatory rules. It may be used, for example, to request generic slave device parameters without having to specify the device descriptor for a
    * specific device. When the requestType parameter is missing, the request is for a specific device (master or slave), and the deviceDesc parameter for
    * the device on whose behalf the request is made is required.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PawsGetSpectrumRequest {
  @scala.inline
  def apply(
    antenna: AntennaCharacteristics = null,
    capabilities: DeviceCapabilities = null,
    deviceDesc: DeviceDescriptor = null,
    location: GeoLocation = null,
    masterDeviceDesc: DeviceDescriptor = null,
    owner: DeviceOwner = null,
    requestType: String = null,
    `type`: String = null,
    version: String = null
  ): PawsGetSpectrumRequest = {
    val __obj = js.Dynamic.literal()
    if (antenna != null) __obj.updateDynamic("antenna")(antenna.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (deviceDesc != null) __obj.updateDynamic("deviceDesc")(deviceDesc.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (masterDeviceDesc != null) __obj.updateDynamic("masterDeviceDesc")(masterDeviceDesc.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PawsGetSpectrumRequest]
  }
}


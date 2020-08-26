package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDescriptor extends js.Object {
  /**
    * Specifies the ETSI white space device category. Valid values are the strings master and slave. This field is case-insensitive. Consult the ETSI
    * documentation for details about the device types.
    */
  var etsiEnDeviceCategory: js.UndefOr[String] = js.native
  /**
    * Specifies the ETSI white space device emissions class. The values are represented by numeric strings, such as 1, 2, etc. Consult the ETSI documentation
    * for details about the device types.
    */
  var etsiEnDeviceEmissionsClass: js.UndefOr[String] = js.native
  /**
    * Specifies the ETSI white space device type. Valid values are single-letter strings, such as A, B, etc. Consult the ETSI documentation for details about
    * the device types.
    */
  var etsiEnDeviceType: js.UndefOr[String] = js.native
  /**
    * Specifies the ETSI white space device technology identifier. The string value must not exceed 64 characters in length. Consult the ETSI documentation
    * for details about the device types.
    */
  var etsiEnTechnologyId: js.UndefOr[String] = js.native
  /**
    * Specifies the device's FCC certification identifier. The value is an identifier string whose length should not exceed 32 characters. Note that, in
    * practice, a valid FCC ID may be limited to 19 characters.
    */
  var fccId: js.UndefOr[String] = js.native
  /** Specifies the TV Band White Space device type, as defined by the FCC. Valid values are FIXED, MODE_1, MODE_2. */
  var fccTvbdDeviceType: js.UndefOr[String] = js.native
  /**
    * The manufacturer's ID may be required by the regulatory domain. This should represent the name of the device manufacturer, should be consistent across
    * all devices from the same manufacturer, and should be distinct from that of other manufacturers. The string value must not exceed 64 characters in
    * length.
    */
  var manufacturerId: js.UndefOr[String] = js.native
  /** The device's model ID may be required by the regulatory domain. The string value must not exceed 64 characters in length. */
  var modelId: js.UndefOr[String] = js.native
  /**
    * The list of identifiers for rulesets supported by the device. A database may require that the device provide this list before servicing the device
    * requests. If the database does not support any of the rulesets specified in the list, the database may refuse to service the device requests. If
    * present, the list must contain at least one entry.
    *
    * For information about the valid requests, see section 9.2 of the PAWS specification. Currently, FccTvBandWhiteSpace-2010 is the only supported ruleset.
    */
  var rulesetIds: js.UndefOr[js.Array[String]] = js.native
  /** The manufacturer's device serial number; required by the applicable regulatory domain. The length of the value must not exceed 64 characters. */
  var serialNumber: js.UndefOr[String] = js.native
}

object DeviceDescriptor {
  @scala.inline
  def apply(): DeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescriptor]
  }
  @scala.inline
  implicit class DeviceDescriptorOps[Self <: DeviceDescriptor] (val x: Self) extends AnyVal {
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
    def setEtsiEnDeviceCategory(value: String): Self = this.set("etsiEnDeviceCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtsiEnDeviceCategory: Self = this.set("etsiEnDeviceCategory", js.undefined)
    @scala.inline
    def setEtsiEnDeviceEmissionsClass(value: String): Self = this.set("etsiEnDeviceEmissionsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtsiEnDeviceEmissionsClass: Self = this.set("etsiEnDeviceEmissionsClass", js.undefined)
    @scala.inline
    def setEtsiEnDeviceType(value: String): Self = this.set("etsiEnDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtsiEnDeviceType: Self = this.set("etsiEnDeviceType", js.undefined)
    @scala.inline
    def setEtsiEnTechnologyId(value: String): Self = this.set("etsiEnTechnologyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtsiEnTechnologyId: Self = this.set("etsiEnTechnologyId", js.undefined)
    @scala.inline
    def setFccId(value: String): Self = this.set("fccId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFccId: Self = this.set("fccId", js.undefined)
    @scala.inline
    def setFccTvbdDeviceType(value: String): Self = this.set("fccTvbdDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFccTvbdDeviceType: Self = this.set("fccTvbdDeviceType", js.undefined)
    @scala.inline
    def setManufacturerId(value: String): Self = this.set("manufacturerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturerId: Self = this.set("manufacturerId", js.undefined)
    @scala.inline
    def setModelId(value: String): Self = this.set("modelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelId: Self = this.set("modelId", js.undefined)
    @scala.inline
    def setRulesetIdsVarargs(value: String*): Self = this.set("rulesetIds", js.Array(value :_*))
    @scala.inline
    def setRulesetIds(value: js.Array[String]): Self = this.set("rulesetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesetIds: Self = this.set("rulesetIds", js.undefined)
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
  }
  
}


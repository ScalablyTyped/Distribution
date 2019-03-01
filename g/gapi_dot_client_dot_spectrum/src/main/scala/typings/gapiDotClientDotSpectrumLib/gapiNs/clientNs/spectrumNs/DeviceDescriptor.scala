package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDescriptor extends js.Object {
  /**
    * Specifies the ETSI white space device category. Valid values are the strings master and slave. This field is case-insensitive. Consult the ETSI
    * documentation for details about the device types.
    */
  var etsiEnDeviceCategory: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the ETSI white space device emissions class. The values are represented by numeric strings, such as 1, 2, etc. Consult the ETSI documentation
    * for details about the device types.
    */
  var etsiEnDeviceEmissionsClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the ETSI white space device type. Valid values are single-letter strings, such as A, B, etc. Consult the ETSI documentation for details about
    * the device types.
    */
  var etsiEnDeviceType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the ETSI white space device technology identifier. The string value must not exceed 64 characters in length. Consult the ETSI documentation
    * for details about the device types.
    */
  var etsiEnTechnologyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the device's FCC certification identifier. The value is an identifier string whose length should not exceed 32 characters. Note that, in
    * practice, a valid FCC ID may be limited to 19 characters.
    */
  var fccId: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the TV Band White Space device type, as defined by the FCC. Valid values are FIXED, MODE_1, MODE_2. */
  var fccTvbdDeviceType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The manufacturer's ID may be required by the regulatory domain. This should represent the name of the device manufacturer, should be consistent across
    * all devices from the same manufacturer, and should be distinct from that of other manufacturers. The string value must not exceed 64 characters in
    * length.
    */
  var manufacturerId: js.UndefOr[java.lang.String] = js.undefined
  /** The device's model ID may be required by the regulatory domain. The string value must not exceed 64 characters in length. */
  var modelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of identifiers for rulesets supported by the device. A database may require that the device provide this list before servicing the device
    * requests. If the database does not support any of the rulesets specified in the list, the database may refuse to service the device requests. If
    * present, the list must contain at least one entry.
    *
    * For information about the valid requests, see section 9.2 of the PAWS specification. Currently, FccTvBandWhiteSpace-2010 is the only supported ruleset.
    */
  var rulesetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The manufacturer's device serial number; required by the applicable regulatory domain. The length of the value must not exceed 64 characters. */
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceDescriptor {
  @scala.inline
  def apply(
    etsiEnDeviceCategory: java.lang.String = null,
    etsiEnDeviceEmissionsClass: java.lang.String = null,
    etsiEnDeviceType: java.lang.String = null,
    etsiEnTechnologyId: java.lang.String = null,
    fccId: java.lang.String = null,
    fccTvbdDeviceType: java.lang.String = null,
    manufacturerId: java.lang.String = null,
    modelId: java.lang.String = null,
    rulesetIds: js.Array[java.lang.String] = null,
    serialNumber: java.lang.String = null
  ): DeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (etsiEnDeviceCategory != null) __obj.updateDynamic("etsiEnDeviceCategory")(etsiEnDeviceCategory)
    if (etsiEnDeviceEmissionsClass != null) __obj.updateDynamic("etsiEnDeviceEmissionsClass")(etsiEnDeviceEmissionsClass)
    if (etsiEnDeviceType != null) __obj.updateDynamic("etsiEnDeviceType")(etsiEnDeviceType)
    if (etsiEnTechnologyId != null) __obj.updateDynamic("etsiEnTechnologyId")(etsiEnTechnologyId)
    if (fccId != null) __obj.updateDynamic("fccId")(fccId)
    if (fccTvbdDeviceType != null) __obj.updateDynamic("fccTvbdDeviceType")(fccTvbdDeviceType)
    if (manufacturerId != null) __obj.updateDynamic("manufacturerId")(manufacturerId)
    if (modelId != null) __obj.updateDynamic("modelId")(modelId)
    if (rulesetIds != null) __obj.updateDynamic("rulesetIds")(rulesetIds)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.asInstanceOf[DeviceDescriptor]
  }
}


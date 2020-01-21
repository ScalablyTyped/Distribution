package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates hardware and product IDs to identify a manufactured device. To
  * understand requirements on identifier sets, read
  * [Identifiers](/zero-touch/guides/identifiers).
  */
@js.native
trait SchemaDeviceIdentifier extends js.Object {
  /**
    * The device’s IMEI number. Validated on input.
    */
  var imei: js.UndefOr[String] = js.native
  /**
    * The device manufacturer’s name. Matches the device&#39;s built-in value
    * returned from `android.os.Build.MANUFACTURER`. Allowed values are listed
    * in
    * [manufacturers](/zero-touch/resources/manufacturer-names#manufacturers-names).
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The device’s MEID number.
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * The device model&#39;s name. Matches the device&#39;s built-in value
    * returned from `android.os.Build.MODEL`. Allowed values are listed in
    * [models](/zero-touch/resources/manufacturer-names#model-names).
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The manufacturer&#39;s serial number for the device. This value might not
    * be unique across different device models.
    */
  var serialNumber: js.UndefOr[String] = js.native
}

object SchemaDeviceIdentifier {
  @scala.inline
  def apply(
    imei: String = null,
    manufacturer: String = null,
    meid: String = null,
    model: String = null,
    serialNumber: String = null
  ): SchemaDeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceIdentifier]
  }
}


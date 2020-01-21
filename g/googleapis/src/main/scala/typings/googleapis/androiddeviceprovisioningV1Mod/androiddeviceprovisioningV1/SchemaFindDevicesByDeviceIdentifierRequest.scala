package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to find devices.
  */
@js.native
trait SchemaFindDevicesByDeviceIdentifierRequest extends js.Object {
  /**
    * Required. The device identifier to search for.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  /**
    * Required. The maximum number of devices to show in a page of results.
    * Must be between 1 and 100 inclusive.
    */
  var limit: js.UndefOr[String] = js.native
  /**
    * A token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SchemaFindDevicesByDeviceIdentifierRequest {
  @scala.inline
  def apply(deviceIdentifier: SchemaDeviceIdentifier = null, limit: String = null, pageToken: String = null): SchemaFindDevicesByDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindDevicesByDeviceIdentifierRequest]
  }
}


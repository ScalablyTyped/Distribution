package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDevicesByOwnerRequest extends js.Object {
  /** List of customer IDs to search for. */
  var customerId: js.UndefOr[js.Array[String]] = js.undefined
  /** The number of devices to show in the result. */
  var limit: js.UndefOr[String] = js.undefined
  /** Page token. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** The section type. */
  var sectionType: js.UndefOr[String] = js.undefined
}

object FindDevicesByOwnerRequest {
  @scala.inline
  def apply(
    customerId: js.Array[String] = null,
    limit: String = null,
    pageToken: String = null,
    sectionType: String = null
  ): FindDevicesByOwnerRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindDevicesByOwnerRequest]
  }
}


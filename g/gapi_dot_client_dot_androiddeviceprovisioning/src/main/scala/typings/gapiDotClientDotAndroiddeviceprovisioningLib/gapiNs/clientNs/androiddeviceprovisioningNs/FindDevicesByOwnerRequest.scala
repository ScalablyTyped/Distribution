package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDevicesByOwnerRequest extends js.Object {
  /** List of customer IDs to search for. */
  var customerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The number of devices to show in the result. */
  var limit: js.UndefOr[java.lang.String] = js.undefined
  /** Page token. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The section type. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

object FindDevicesByOwnerRequest {
  @scala.inline
  def apply(
    customerId: js.Array[java.lang.String] = null,
    limit: java.lang.String = null,
    pageToken: java.lang.String = null,
    sectionType: java.lang.String = null
  ): FindDevicesByOwnerRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType)
    __obj.asInstanceOf[FindDevicesByOwnerRequest]
  }
}


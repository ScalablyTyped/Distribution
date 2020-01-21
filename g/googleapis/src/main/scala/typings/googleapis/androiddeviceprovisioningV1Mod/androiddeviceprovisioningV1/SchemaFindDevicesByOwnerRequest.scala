package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to find devices by customers.
  */
@js.native
trait SchemaFindDevicesByOwnerRequest extends js.Object {
  /**
    * Required. The list of customer IDs to search for.
    */
  var customerId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The maximum number of devices to show in a page of results.
    * Must be between 1 and 100 inclusive.
    */
  var limit: js.UndefOr[String] = js.native
  /**
    * A token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object SchemaFindDevicesByOwnerRequest {
  @scala.inline
  def apply(
    customerId: js.Array[String] = null,
    limit: String = null,
    pageToken: String = null,
    sectionType: String = null
  ): SchemaFindDevicesByOwnerRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindDevicesByOwnerRequest]
  }
}


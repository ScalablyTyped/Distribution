package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing my customers.
  */
@js.native
trait Schema$CustomerListCustomersResponse extends js.Object {
  /**
    * The customer accounts the calling user is a member of.
    */
  var customers: js.UndefOr[js.Array[Schema$Company]] = js.native
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CustomerListCustomersResponse {
  @scala.inline
  def apply(customers: js.Array[Schema$Company] = null, nextPageToken: String = null): Schema$CustomerListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    if (customers != null) __obj.updateDynamic("customers")(customers.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerListCustomersResponse]
  }
}


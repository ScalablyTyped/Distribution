package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing my customers.
  */
@js.native
trait SchemaCustomerListCustomersResponse extends js.Object {
  /**
    * The customer accounts the calling user is a member of.
    */
  var customers: js.UndefOr[js.Array[SchemaCompany]] = js.native
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCustomerListCustomersResponse {
  @scala.inline
  def apply(customers: js.Array[SchemaCompany] = null, nextPageToken: String = null): SchemaCustomerListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    if (customers != null) __obj.updateDynamic("customers")(customers.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerListCustomersResponse]
  }
}


package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to create a customer.
  */
@js.native
trait SchemaCreateCustomerRequest extends js.Object {
  /**
    * Required. The company data to populate the new customer. Must contain a
    * value for `companyName` and at least one `owner_email` that&#39;s
    * associated with a Google Account. The values for `companyId` and `name`
    * must be empty.
    */
  var customer: js.UndefOr[SchemaCompany] = js.native
}

object SchemaCreateCustomerRequest {
  @scala.inline
  def apply(customer: SchemaCompany = null): SchemaCreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateCustomerRequest]
  }
}


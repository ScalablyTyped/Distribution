package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to create a customer.
  */
@js.native
trait Schema$CreateCustomerRequest extends js.Object {
  /**
    * Required. The company data to populate the new customer. Must contain a
    * value for `companyName` and at least one `owner_email` that&#39;s
    * associated with a Google Account. The values for `companyId` and `name`
    * must be empty.
    */
  var customer: js.UndefOr[Schema$Company] = js.native
}

object Schema$CreateCustomerRequest {
  @scala.inline
  def apply(customer: Schema$Company = null): Schema$CreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateCustomerRequest]
  }
}


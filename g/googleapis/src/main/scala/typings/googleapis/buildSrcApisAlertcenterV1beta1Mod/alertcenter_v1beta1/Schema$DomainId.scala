package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Domain ID of Gmail phishing alerts.
  */
@js.native
trait Schema$DomainId extends js.Object {
  /**
    * The primary domain for the customer.
    */
  var customerPrimaryDomain: js.UndefOr[String] = js.native
}

object Schema$DomainId {
  @scala.inline
  def apply(customerPrimaryDomain: String = null): Schema$DomainId = {
    val __obj = js.Dynamic.literal()
    if (customerPrimaryDomain != null) __obj.updateDynamic("customerPrimaryDomain")(customerPrimaryDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainId]
  }
}


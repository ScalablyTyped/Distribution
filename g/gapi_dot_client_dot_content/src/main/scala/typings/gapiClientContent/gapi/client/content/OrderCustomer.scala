package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCustomer extends js.Object {
  /** Email address of the customer. */
  var email: js.UndefOr[String] = js.native
  /**
    * If set, this indicates the user explicitly chose to opt in or out of providing marketing rights to the merchant. If unset, this indicates the user has
    * already made this choice in a previous purchase, and was thus not shown the marketing right opt in/out checkbox during the checkout flow.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  /** Full name of the customer. */
  var fullName: js.UndefOr[String] = js.native
}

object OrderCustomer {
  @scala.inline
  def apply(): OrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomer]
  }
  @scala.inline
  implicit class OrderCustomerOps[Self <: OrderCustomer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setExplicitMarketingPreference(value: Boolean): Self = this.set("explicitMarketingPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitMarketingPreference: Self = this.set("explicitMarketingPreference", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
  }
  
}


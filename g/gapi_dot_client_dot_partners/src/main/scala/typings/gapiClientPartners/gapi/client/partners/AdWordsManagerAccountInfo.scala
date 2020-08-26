package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsManagerAccountInfo extends js.Object {
  /** Name of the customer this account represents. */
  var customerName: js.UndefOr[String] = js.native
  /** The AdWords Manager Account id. */
  var id: js.UndefOr[String] = js.native
}

object AdWordsManagerAccountInfo {
  @scala.inline
  def apply(): AdWordsManagerAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsManagerAccountInfo]
  }
  @scala.inline
  implicit class AdWordsManagerAccountInfoOps[Self <: AdWordsManagerAccountInfo] (val x: Self) extends AnyVal {
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
    def setCustomerName(value: String): Self = this.set("customerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerName: Self = this.set("customerName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}


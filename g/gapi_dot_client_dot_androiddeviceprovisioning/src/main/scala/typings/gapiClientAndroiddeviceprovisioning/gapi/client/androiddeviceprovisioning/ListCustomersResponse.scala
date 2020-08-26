package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomersResponse extends js.Object {
  /** List of customers related to this partner. */
  var customers: js.UndefOr[js.Array[Company]] = js.native
}

object ListCustomersResponse {
  @scala.inline
  def apply(): ListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomersResponse]
  }
  @scala.inline
  implicit class ListCustomersResponseOps[Self <: ListCustomersResponse] (val x: Self) extends AnyVal {
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
    def setCustomersVarargs(value: Company*): Self = this.set("customers", js.Array(value :_*))
    @scala.inline
    def setCustomers(value: js.Array[Company]): Self = this.set("customers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomers: Self = this.set("customers", js.undefined)
  }
  
}


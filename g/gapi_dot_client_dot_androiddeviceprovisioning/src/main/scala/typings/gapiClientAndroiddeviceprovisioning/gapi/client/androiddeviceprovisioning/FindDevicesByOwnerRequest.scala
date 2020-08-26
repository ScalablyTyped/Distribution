package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindDevicesByOwnerRequest extends js.Object {
  /** List of customer IDs to search for. */
  var customerId: js.UndefOr[js.Array[String]] = js.native
  /** The number of devices to show in the result. */
  var limit: js.UndefOr[String] = js.native
  /** Page token. */
  var pageToken: js.UndefOr[String] = js.native
  /** The section type. */
  var sectionType: js.UndefOr[String] = js.native
}

object FindDevicesByOwnerRequest {
  @scala.inline
  def apply(): FindDevicesByOwnerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByOwnerRequest]
  }
  @scala.inline
  implicit class FindDevicesByOwnerRequestOps[Self <: FindDevicesByOwnerRequest] (val x: Self) extends AnyVal {
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
    def setCustomerIdVarargs(value: String*): Self = this.set("customerId", js.Array(value :_*))
    @scala.inline
    def setCustomerId(value: js.Array[String]): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
  }
  
}


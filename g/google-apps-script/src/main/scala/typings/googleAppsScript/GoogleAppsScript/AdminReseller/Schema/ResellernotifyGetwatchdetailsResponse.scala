package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResellernotifyGetwatchdetailsResponse extends js.Object {
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  var topicName: js.UndefOr[String] = js.native
}

object ResellernotifyGetwatchdetailsResponse {
  @scala.inline
  def apply(): ResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
  }
  @scala.inline
  implicit class ResellernotifyGetwatchdetailsResponseOps[Self <: ResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
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
    def setServiceAccountEmailAddressesVarargs(value: String*): Self = this.set("serviceAccountEmailAddresses", js.Array(value :_*))
    @scala.inline
    def setServiceAccountEmailAddresses(value: js.Array[String]): Self = this.set("serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountEmailAddresses: Self = this.set("serviceAccountEmailAddresses", js.undefined)
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
  
}


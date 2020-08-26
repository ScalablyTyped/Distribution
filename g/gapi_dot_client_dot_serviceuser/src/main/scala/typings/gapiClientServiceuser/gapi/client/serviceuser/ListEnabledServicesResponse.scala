package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListEnabledServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Services enabled for the specified parent. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.native
}

object ListEnabledServicesResponse {
  @scala.inline
  def apply(): ListEnabledServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledServicesResponse]
  }
  @scala.inline
  implicit class ListEnabledServicesResponseOps[Self <: ListEnabledServicesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setServicesVarargs(value: PublishedService*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[PublishedService]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}


package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListAvailableServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Services available publicly or available to the authenticated caller. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.native
}

object SearchServicesResponse {
  @scala.inline
  def apply(): SearchServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchServicesResponse]
  }
  @scala.inline
  implicit class SearchServicesResponseOps[Self <: SearchServicesResponse] (val x: Self) extends AnyVal {
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


package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsListResourcesResponse extends js.Object {
  /** The formatted JSON that is requested by the user. */
  var items: js.UndefOr[js.Array[ListResourceResponseItem]] = js.native
  /** The URL of a Compute Engine network to which the resources in the view belong. */
  var network: js.UndefOr[String] = js.native
  /** A token used for pagination. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ZoneViewsListResourcesResponse {
  @scala.inline
  def apply(): ZoneViewsListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneViewsListResourcesResponse]
  }
  @scala.inline
  implicit class ZoneViewsListResourcesResponseOps[Self <: ZoneViewsListResourcesResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: ListResourceResponseItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ListResourceResponseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


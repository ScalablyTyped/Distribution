package typings.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The circles in this page of results. */
  var items: js.UndefOr[js.Array[Circle]] = js.native
  /** Identifies this resource as a collection of circles. Value: "plus#circleFeed". */
  var kind: js.UndefOr[String] = js.native
  /** Link to the next page of circles. */
  var nextLink: js.UndefOr[String] = js.native
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Link to this page of circles. */
  var selfLink: js.UndefOr[String] = js.native
  /** The title of this list of resources. */
  var title: js.UndefOr[String] = js.native
  /** The total number of circles. The number of circles in this response may be smaller due to paging. */
  var totalItems: js.UndefOr[Double] = js.native
}

object CircleFeed {
  @scala.inline
  def apply(): CircleFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleFeed]
  }
  @scala.inline
  implicit class CircleFeedOps[Self <: CircleFeed] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Circle*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Circle]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}


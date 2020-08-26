package typings.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The ID of this collection of activities. Deprecated. */
  var id: js.UndefOr[String] = js.native
  /** The activities in this page of results. */
  var items: js.UndefOr[js.Array[Activity]] = js.native
  /** Identifies this resource as a collection of activities. Value: "plus#activityFeed". */
  var kind: js.UndefOr[String] = js.native
  /** Link to the next page of activities. */
  var nextLink: js.UndefOr[String] = js.native
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Link to this activity resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** The title of this collection of activities, which is a truncated portion of the content. */
  var title: js.UndefOr[String] = js.native
  /** The time at which this collection of activities was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.native
}

object ActivityFeed {
  @scala.inline
  def apply(): ActivityFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityFeed]
  }
  @scala.inline
  implicit class ActivityFeedOps[Self <: ActivityFeed] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Activity*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Activity]): Self = this.set("items", value.asInstanceOf[js.Any])
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
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}


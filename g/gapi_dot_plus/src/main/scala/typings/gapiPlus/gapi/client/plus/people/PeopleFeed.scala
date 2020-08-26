package typings.gapiPlus.gapi.client.plus.people

import typings.gapiPlus.gapiPlusStrings.plusNumbersignpeopleFeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search response
@js.native
trait PeopleFeed extends js.Object {
  var etag: String = js.native
  var items: js.Array[Person] = js.native
  var kind: plusNumbersignpeopleFeed = js.native
  var nextPageToken: String = js.native
  var selfLink: String = js.native
  var title: String = js.native
  var totalItems: Double = js.native
}

object PeopleFeed {
  @scala.inline
  def apply(
    etag: String,
    items: js.Array[Person],
    kind: plusNumbersignpeopleFeed,
    nextPageToken: String,
    selfLink: String,
    title: String,
    totalItems: Double
  ): PeopleFeed = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeopleFeed]
  }
  @scala.inline
  implicit class PeopleFeedOps[Self <: PeopleFeed] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Person*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Person]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: plusNumbersignpeopleFeed): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
  }
  
}


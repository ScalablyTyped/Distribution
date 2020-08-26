package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeList extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Change]] = js.native
  var kind: js.UndefOr[String] = js.native
  var largestChangeId: js.UndefOr[String] = js.native
  var newStartPageToken: js.UndefOr[String] = js.native
  var nextLink: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
}

object ChangeList {
  @scala.inline
  def apply(): ChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeList]
  }
  @scala.inline
  implicit class ChangeListOps[Self <: ChangeList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Change*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Change]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLargestChangeId(value: String): Self = this.set("largestChangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargestChangeId: Self = this.set("largestChangeId", js.undefined)
    @scala.inline
    def setNewStartPageToken(value: String): Self = this.set("newStartPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewStartPageToken: Self = this.set("newStartPageToken", js.undefined)
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
  }
  
}


package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListsListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Remarketing list collection. */
  var remarketingLists: js.UndefOr[js.Array[RemarketingList]] = js.native
}

object RemarketingListsListResponse {
  @scala.inline
  def apply(): RemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingListsListResponse]
  }
  @scala.inline
  implicit class RemarketingListsListResponseOps[Self <: RemarketingListsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setRemarketingListsVarargs(value: RemarketingList*): Self = this.set("remarketingLists", js.Array(value :_*))
    @scala.inline
    def setRemarketingLists(value: js.Array[RemarketingList]): Self = this.set("remarketingLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarketingLists: Self = this.set("remarketingLists", js.undefined)
  }
  
}


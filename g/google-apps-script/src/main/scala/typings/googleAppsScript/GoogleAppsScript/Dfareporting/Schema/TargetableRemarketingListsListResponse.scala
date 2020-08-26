package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetableRemarketingListsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var targetableRemarketingLists: js.UndefOr[js.Array[TargetableRemarketingList]] = js.native
}

object TargetableRemarketingListsListResponse {
  @scala.inline
  def apply(): TargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetableRemarketingListsListResponse]
  }
  @scala.inline
  implicit class TargetableRemarketingListsListResponseOps[Self <: TargetableRemarketingListsListResponse] (val x: Self) extends AnyVal {
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
    def setTargetableRemarketingListsVarargs(value: TargetableRemarketingList*): Self = this.set("targetableRemarketingLists", js.Array(value :_*))
    @scala.inline
    def setTargetableRemarketingLists(value: js.Array[TargetableRemarketingList]): Self = this.set("targetableRemarketingLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetableRemarketingLists: Self = this.set("targetableRemarketingLists", js.undefined)
  }
  
}


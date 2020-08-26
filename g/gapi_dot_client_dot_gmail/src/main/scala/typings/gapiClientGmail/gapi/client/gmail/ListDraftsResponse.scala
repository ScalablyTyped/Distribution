package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDraftsResponse extends js.Object {
  /** List of drafts. */
  var drafts: js.UndefOr[js.Array[Draft]] = js.native
  /** Token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object ListDraftsResponse {
  @scala.inline
  def apply(): ListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDraftsResponse]
  }
  @scala.inline
  implicit class ListDraftsResponseOps[Self <: ListDraftsResponse] (val x: Self) extends AnyVal {
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
    def setDraftsVarargs(value: Draft*): Self = this.set("drafts", js.Array(value :_*))
    @scala.inline
    def setDrafts(value: js.Array[Draft]): Self = this.set("drafts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrafts: Self = this.set("drafts", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResultSizeEstimate(value: Double): Self = this.set("resultSizeEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultSizeEstimate: Self = this.set("resultSizeEstimate", js.undefined)
  }
  
}


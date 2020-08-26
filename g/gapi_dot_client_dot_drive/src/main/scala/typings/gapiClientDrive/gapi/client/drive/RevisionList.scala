package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#revisionList". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of revisions. This will be absent if the end of the revisions list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of revisions. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var revisions: js.UndefOr[js.Array[Revision]] = js.native
}

object RevisionList {
  @scala.inline
  def apply(): RevisionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionList]
  }
  @scala.inline
  implicit class RevisionListOps[Self <: RevisionList] (val x: Self) extends AnyVal {
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
    def setRevisionsVarargs(value: Revision*): Self = this.set("revisions", js.Array(value :_*))
    @scala.inline
    def setRevisions(value: js.Array[Revision]): Self = this.set("revisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisions: Self = this.set("revisions", js.undefined)
  }
  
}


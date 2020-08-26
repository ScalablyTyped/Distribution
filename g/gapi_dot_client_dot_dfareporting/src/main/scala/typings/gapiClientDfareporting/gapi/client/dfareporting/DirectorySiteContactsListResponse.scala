package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySiteContactsListResponse extends js.Object {
  /** Directory site contact collection */
  var directorySiteContacts: js.UndefOr[js.Array[DirectorySiteContact]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySiteContactsListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object DirectorySiteContactsListResponse {
  @scala.inline
  def apply(): DirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySiteContactsListResponse]
  }
  @scala.inline
  implicit class DirectorySiteContactsListResponseOps[Self <: DirectorySiteContactsListResponse] (val x: Self) extends AnyVal {
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
    def setDirectorySiteContactsVarargs(value: DirectorySiteContact*): Self = this.set("directorySiteContacts", js.Array(value :_*))
    @scala.inline
    def setDirectorySiteContacts(value: js.Array[DirectorySiteContact]): Self = this.set("directorySiteContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteContacts: Self = this.set("directorySiteContacts", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


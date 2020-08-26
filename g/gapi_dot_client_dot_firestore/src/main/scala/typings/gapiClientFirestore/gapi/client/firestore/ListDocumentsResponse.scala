package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentsResponse extends js.Object {
  /** The Documents found. */
  var documents: js.UndefOr[js.Array[Document]] = js.native
  /** The next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDocumentsResponse {
  @scala.inline
  def apply(): ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsResponse]
  }
  @scala.inline
  implicit class ListDocumentsResponseOps[Self <: ListDocumentsResponse] (val x: Self) extends AnyVal {
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
    def setDocumentsVarargs(value: Document*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[Document]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


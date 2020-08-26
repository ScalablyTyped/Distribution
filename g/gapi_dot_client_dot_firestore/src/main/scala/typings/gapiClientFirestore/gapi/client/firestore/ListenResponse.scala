package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenResponse extends js.Object {
  /** A Document has changed. */
  var documentChange: js.UndefOr[DocumentChange] = js.native
  /** A Document has been deleted. */
  var documentDelete: js.UndefOr[DocumentDelete] = js.native
  /**
    * A Document has been removed from a target (because it is no longer
    * relevant to that target).
    */
  var documentRemove: js.UndefOr[DocumentRemove] = js.native
  /**
    * A filter to apply to the set of documents previously returned for the
    * given target.
    *
    * Returned when documents may have been removed from the given target, but
    * the exact documents are unknown.
    */
  var filter: js.UndefOr[ExistenceFilter] = js.native
  /** Targets have changed. */
  var targetChange: js.UndefOr[TargetChange] = js.native
}

object ListenResponse {
  @scala.inline
  def apply(): ListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenResponse]
  }
  @scala.inline
  implicit class ListenResponseOps[Self <: ListenResponse] (val x: Self) extends AnyVal {
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
    def setDocumentChange(value: DocumentChange): Self = this.set("documentChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentChange: Self = this.set("documentChange", js.undefined)
    @scala.inline
    def setDocumentDelete(value: DocumentDelete): Self = this.set("documentDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentDelete: Self = this.set("documentDelete", js.undefined)
    @scala.inline
    def setDocumentRemove(value: DocumentRemove): Self = this.set("documentRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentRemove: Self = this.set("documentRemove", js.undefined)
    @scala.inline
    def setFilter(value: ExistenceFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setTargetChange(value: TargetChange): Self = this.set("targetChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetChange: Self = this.set("targetChange", js.undefined)
  }
  
}


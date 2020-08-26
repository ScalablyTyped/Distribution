package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChange extends js.Object {
  /**
    * The new state of the Document.
    *
    * If `mask` is set, contains only fields that were updated or added.
    */
  var document: js.UndefOr[Document] = js.native
  /** A set of target IDs for targets that no longer match this document. */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
  /** A set of target IDs of targets that match this document. */
  var targetIds: js.UndefOr[js.Array[Double]] = js.native
}

object DocumentChange {
  @scala.inline
  def apply(): DocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentChange]
  }
  @scala.inline
  implicit class DocumentChangeOps[Self <: DocumentChange] (val x: Self) extends AnyVal {
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
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setRemovedTargetIdsVarargs(value: Double*): Self = this.set("removedTargetIds", js.Array(value :_*))
    @scala.inline
    def setRemovedTargetIds(value: js.Array[Double]): Self = this.set("removedTargetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedTargetIds: Self = this.set("removedTargetIds", js.undefined)
    @scala.inline
    def setTargetIdsVarargs(value: Double*): Self = this.set("targetIds", js.Array(value :_*))
    @scala.inline
    def setTargetIds(value: js.Array[Double]): Self = this.set("targetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIds: Self = this.set("targetIds", js.undefined)
  }
  
}


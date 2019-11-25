package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentChange extends js.Object {
  /**
    * The new state of the Document.
    *
    * If `mask` is set, contains only fields that were updated or added.
    */
  var document: js.UndefOr[Document] = js.undefined
  /** A set of target IDs for targets that no longer match this document. */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
  /** A set of target IDs of targets that match this document. */
  var targetIds: js.UndefOr[js.Array[Double]] = js.undefined
}

object DocumentChange {
  @scala.inline
  def apply(
    document: Document = null,
    removedTargetIds: js.Array[Double] = null,
    targetIds: js.Array[Double] = null
  ): DocumentChange = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds.asInstanceOf[js.Any])
    if (targetIds != null) __obj.updateDynamic("targetIds")(targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
}


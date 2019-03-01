package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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
  var removedTargetIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** A set of target IDs of targets that match this document. */
  var targetIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object DocumentChange {
  @scala.inline
  def apply(
    document: Document = null,
    removedTargetIds: js.Array[scala.Double] = null,
    targetIds: js.Array[scala.Double] = null
  ): DocumentChange = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds)
    if (targetIds != null) __obj.updateDynamic("targetIds")(targetIds)
    __obj.asInstanceOf[DocumentChange]
  }
}


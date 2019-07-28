package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenResponse extends js.Object {
  /** A Document has changed. */
  var documentChange: js.UndefOr[DocumentChange] = js.undefined
  /** A Document has been deleted. */
  var documentDelete: js.UndefOr[DocumentDelete] = js.undefined
  /**
    * A Document has been removed from a target (because it is no longer
    * relevant to that target).
    */
  var documentRemove: js.UndefOr[DocumentRemove] = js.undefined
  /**
    * A filter to apply to the set of documents previously returned for the
    * given target.
    *
    * Returned when documents may have been removed from the given target, but
    * the exact documents are unknown.
    */
  var filter: js.UndefOr[ExistenceFilter] = js.undefined
  /** Targets have changed. */
  var targetChange: js.UndefOr[TargetChange] = js.undefined
}

object ListenResponse {
  @scala.inline
  def apply(
    documentChange: DocumentChange = null,
    documentDelete: DocumentDelete = null,
    documentRemove: DocumentRemove = null,
    filter: ExistenceFilter = null,
    targetChange: TargetChange = null
  ): ListenResponse = {
    val __obj = js.Dynamic.literal()
    if (documentChange != null) __obj.updateDynamic("documentChange")(documentChange)
    if (documentDelete != null) __obj.updateDynamic("documentDelete")(documentDelete)
    if (documentRemove != null) __obj.updateDynamic("documentRemove")(documentRemove)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (targetChange != null) __obj.updateDynamic("targetChange")(targetChange)
    __obj.asInstanceOf[ListenResponse]
  }
}


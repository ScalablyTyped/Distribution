package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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


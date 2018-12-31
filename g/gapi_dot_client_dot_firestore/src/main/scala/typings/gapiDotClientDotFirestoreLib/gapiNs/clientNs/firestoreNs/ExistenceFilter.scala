package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistenceFilter extends js.Object {
  /**
    * The total count of documents that match target_id.
    *
    * If different from the count of documents in the client that match, the
    * client must manually determine which documents no longer match the target.
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** The target ID to which this filter applies. */
  var targetId: js.UndefOr[scala.Double] = js.undefined
}


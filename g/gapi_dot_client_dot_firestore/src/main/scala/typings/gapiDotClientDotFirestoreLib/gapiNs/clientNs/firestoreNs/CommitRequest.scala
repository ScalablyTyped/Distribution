package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequest extends js.Object {
  /**
    * If non-empty, applies all writes in this transaction, and commits it.
    * Otherwise, applies the writes as if they were in their own transaction.
    */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The writes to apply.
    *
    * Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}


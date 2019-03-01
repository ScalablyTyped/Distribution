package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackRequest extends js.Object {
  /** The transaction to roll back. */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

object RollbackRequest {
  @scala.inline
  def apply(transaction: java.lang.String = null): RollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[RollbackRequest]
  }
}


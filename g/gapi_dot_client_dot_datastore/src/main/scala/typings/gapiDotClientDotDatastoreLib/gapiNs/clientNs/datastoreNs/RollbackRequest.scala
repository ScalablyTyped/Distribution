package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackRequest extends js.Object {
  /**
    * The transaction identifier, returned by a call to
    * Datastore.BeginTransaction.
    */
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


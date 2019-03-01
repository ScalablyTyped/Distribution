package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  /**
    * The non-transactional read consistency to use.
    * Cannot be set to `STRONG` for global queries.
    */
  var readConsistency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier of the transaction in which to read. A
    * transaction identifier is returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(readConsistency: java.lang.String = null, transaction: java.lang.String = null): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (readConsistency != null) __obj.updateDynamic("readConsistency")(readConsistency)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[ReadOptions]
  }
}


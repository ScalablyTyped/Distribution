package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequest extends js.Object {
  /** The type of commit to perform. Defaults to `TRANSACTIONAL`. */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mutations to perform.
    *
    * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
    * applied in order. The following sequences of mutations affecting a single
    * entity are not permitted in a single `Commit` request:
    *
    * - `insert` followed by `insert`
    * - `update` followed by `insert`
    * - `upsert` followed by `insert`
    * - `delete` followed by `update`
    *
    * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
    * entity.
    */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.undefined
  /**
    * The identifier of the transaction associated with the commit. A
    * transaction identifier is returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

object CommitRequest {
  @scala.inline
  def apply(
    mode: java.lang.String = null,
    mutations: js.Array[Mutation] = null,
    transaction: java.lang.String = null
  ): CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (mutations != null) __obj.updateDynamic("mutations")(mutations)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[CommitRequest]
  }
}


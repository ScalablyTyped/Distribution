package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequest extends js.Object {
  /**
    * The mutations to be executed when this transaction commits. All
    * mutations are applied atomically, in the order they appear in
    * this list.
    */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.undefined
  /**
    * Execute mutations in a temporary transaction. Note that unlike
    * commit of a previously-started transaction, commit with a
    * temporary transaction is non-idempotent. That is, if the
    * `CommitRequest` is sent to Cloud Spanner more than once (for
    * instance, due to retries in the application, or in the
    * transport library), it is possible that the mutations are
    * executed more than once. If this is undesirable, use
    * BeginTransaction and
    * Commit instead.
    */
  var singleUseTransaction: js.UndefOr[TransactionOptions] = js.undefined
  /** Commit a previously-started transaction. */
  var transactionId: js.UndefOr[String] = js.undefined
}

object CommitRequest {
  @scala.inline
  def apply(
    mutations: js.Array[Mutation] = null,
    singleUseTransaction: TransactionOptions = null,
    transactionId: String = null
  ): CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (mutations != null) __obj.updateDynamic("mutations")(mutations)
    if (singleUseTransaction != null) __obj.updateDynamic("singleUseTransaction")(singleUseTransaction)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[CommitRequest]
  }
}


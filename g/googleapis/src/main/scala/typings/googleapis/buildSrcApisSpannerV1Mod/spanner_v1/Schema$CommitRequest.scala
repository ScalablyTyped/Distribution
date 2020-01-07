package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Commit.
  */
@js.native
trait Schema$CommitRequest extends js.Object {
  /**
    * The mutations to be executed when this transaction commits. All mutations
    * are applied atomically, in the order they appear in this list.
    */
  var mutations: js.UndefOr[js.Array[Schema$Mutation]] = js.native
  /**
    * Execute mutations in a temporary transaction. Note that unlike commit of
    * a previously-started transaction, commit with a temporary transaction is
    * non-idempotent. That is, if the `CommitRequest` is sent to Cloud Spanner
    * more than once (for instance, due to retries in the application, or in
    * the transport library), it is possible that the mutations are executed
    * more than once. If this is undesirable, use BeginTransaction and Commit
    * instead.
    */
  var singleUseTransaction: js.UndefOr[Schema$TransactionOptions] = js.native
  /**
    * Commit a previously-started transaction.
    */
  var transactionId: js.UndefOr[String] = js.native
}

object Schema$CommitRequest {
  @scala.inline
  def apply(
    mutations: js.Array[Schema$Mutation] = null,
    singleUseTransaction: Schema$TransactionOptions = null,
    transactionId: String = null
  ): Schema$CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (mutations != null) __obj.updateDynamic("mutations")(mutations.asInstanceOf[js.Any])
    if (singleUseTransaction != null) __obj.updateDynamic("singleUseTransaction")(singleUseTransaction.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommitRequest]
  }
}


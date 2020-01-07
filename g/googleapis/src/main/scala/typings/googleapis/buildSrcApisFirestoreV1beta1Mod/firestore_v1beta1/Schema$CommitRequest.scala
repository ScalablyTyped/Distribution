package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.Commit.
  */
@js.native
trait Schema$CommitRequest extends js.Object {
  /**
    * If set, applies all writes in this transaction, and commits it.
    */
  var transaction: js.UndefOr[String] = js.native
  /**
    * The writes to apply.  Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[Schema$Write]] = js.native
}

object Schema$CommitRequest {
  @scala.inline
  def apply(transaction: String = null, writes: js.Array[Schema$Write] = null): Schema$CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommitRequest]
  }
}


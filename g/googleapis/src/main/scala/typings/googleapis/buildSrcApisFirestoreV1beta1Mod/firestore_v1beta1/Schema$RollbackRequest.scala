package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.Rollback.
  */
@js.native
trait Schema$RollbackRequest extends js.Object {
  /**
    * The transaction to roll back.
    */
  var transaction: js.UndefOr[String] = js.native
}

object Schema$RollbackRequest {
  @scala.inline
  def apply(transaction: String = null): Schema$RollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RollbackRequest]
  }
}


package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.Rollback.
  */
@js.native
trait Schema$RollbackRequest extends js.Object {
  /**
    * The transaction identifier, returned by a call to
    * Datastore.BeginTransaction.
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


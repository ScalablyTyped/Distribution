package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequest extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var transaction: js.UndefOr[String] = js.undefined
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}

object CommitRequest {
  @scala.inline
  def apply(database: String = null, transaction: String = null, writes: js.Array[Write] = null): CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitRequest]
  }
}


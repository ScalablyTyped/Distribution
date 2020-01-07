package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for beginning a new transaction.  Transactions can be created
  * explicitly with calls to Datastore.BeginTransaction or implicitly by
  * setting ReadOptions.new_transaction in read requests.
  */
@js.native
trait Schema$TransactionOptions extends js.Object {
  /**
    * The transaction should only allow reads.
    */
  var readOnly: js.UndefOr[Schema$ReadOnly] = js.native
  /**
    * The transaction should allow both reads and writes.
    */
  var readWrite: js.UndefOr[Schema$ReadWrite] = js.native
}

object Schema$TransactionOptions {
  @scala.inline
  def apply(readOnly: Schema$ReadOnly = null, readWrite: Schema$ReadWrite = null): Schema$TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readWrite != null) __obj.updateDynamic("readWrite")(readWrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransactionOptions]
  }
}


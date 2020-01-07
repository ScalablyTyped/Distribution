package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is used to select the transaction in which a Read or
  * ExecuteSql call runs.  See TransactionOptions for more information about
  * transactions.
  */
@js.native
trait Schema$TransactionSelector extends js.Object {
  /**
    * Begin a new transaction and execute this read or SQL query in it. The
    * transaction ID of the new transaction is returned in
    * ResultSetMetadata.transaction, which is a Transaction.
    */
  var begin: js.UndefOr[Schema$TransactionOptions] = js.native
  /**
    * Execute the read or SQL query in a previously-started transaction.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Execute the read or SQL query in a temporary transaction. This is the
    * most efficient way to execute a transaction that consists of a single SQL
    * query.
    */
  var singleUse: js.UndefOr[Schema$TransactionOptions] = js.native
}

object Schema$TransactionSelector {
  @scala.inline
  def apply(
    begin: Schema$TransactionOptions = null,
    id: String = null,
    singleUse: Schema$TransactionOptions = null
  ): Schema$TransactionSelector = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (singleUse != null) __obj.updateDynamic("singleUse")(singleUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransactionSelector]
  }
}


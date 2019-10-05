package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadRequest extends js.Object {
  /**
    * The columns of table to be returned for each row matching
    * this request.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If non-empty, the name of an index on table. This index is
    * used instead of the table primary key when interpreting key_set
    * and sorting result rows. See key_set for further information.
    */
  var index: js.UndefOr[String] = js.undefined
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names the
    * primary keys of the rows in table to be yielded, unless index
    * is present. If index is present, then key_set instead names
    * index keys in index.
    *
    * Rows are yielded in table primary key order (if index is empty)
    * or index key order (if index is non-empty).
    *
    * It is not an error for the `key_set` to name rows that do not
    * exist in the database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[KeySet] = js.undefined
  /**
    * If greater than zero, only the first `limit` rows are yielded. If `limit`
    * is zero, the default is no limit.
    * A limit cannot be specified if partition_token is set.
    */
  var limit: js.UndefOr[String] = js.undefined
  /**
    * If this request is resuming a previously interrupted read,
    * `resume_token` should be copied from the last
    * PartialResultSet yielded before the interruption. Doing this
    * enables the new read to resume where the last read left off. The
    * rest of the request parameters must exactly match the request
    * that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.undefined
  /** Required. The name of the table in the database to be read. */
  var table: js.UndefOr[String] = js.undefined
  /**
    * The transaction to use. If none is provided, the default is a
    * temporary read-only transaction with strong concurrency.
    */
  var transaction: js.UndefOr[TransactionSelector] = js.undefined
}

object ReadRequest {
  @scala.inline
  def apply(
    columns: js.Array[String] = null,
    index: String = null,
    keySet: KeySet = null,
    limit: String = null,
    resumeToken: String = null,
    table: String = null,
    transaction: TransactionSelector = null
  ): ReadRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (index != null) __obj.updateDynamic("index")(index)
    if (keySet != null) __obj.updateDynamic("keySet")(keySet)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken)
    if (table != null) __obj.updateDynamic("table")(table)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[ReadRequest]
  }
}


package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mutation extends js.Object {
  /**
    * Delete rows from a table. Succeeds whether or not the named
    * rows were present.
    */
  var delete: js.UndefOr[Delete] = js.undefined
  /**
    * Insert new rows in a table. If any of the rows already exist,
    * the write or transaction fails with error `ALREADY_EXISTS`.
    */
  var insert: js.UndefOr[Write] = js.undefined
  /**
    * Like insert, except that if the row already exists, then
    * its column values are overwritten with the ones provided. Any
    * column values not explicitly written are preserved.
    */
  var insertOrUpdate: js.UndefOr[Write] = js.undefined
  /**
    * Like insert, except that if the row already exists, it is
    * deleted, and the column values provided are inserted
    * instead. Unlike insert_or_update, this means any values not
    * explicitly written become `NULL`.
    */
  var replace: js.UndefOr[Write] = js.undefined
  /**
    * Update existing rows in a table. If any of the rows does not
    * already exist, the transaction fails with error `NOT_FOUND`.
    */
  var update: js.UndefOr[Write] = js.undefined
}

object Mutation {
  @scala.inline
  def apply(
    delete: Delete = null,
    insert: Write = null,
    insertOrUpdate: Write = null,
    replace: Write = null,
    update: Write = null
  ): Mutation = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (insertOrUpdate != null) __obj.updateDynamic("insertOrUpdate")(insertOrUpdate)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Mutation]
  }
}


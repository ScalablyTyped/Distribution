package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A modification to one or more Cloud Spanner rows.  Mutations can be applied
  * to a Cloud Spanner database by sending them in a Commit call.
  */
@js.native
trait Schema$Mutation extends js.Object {
  /**
    * Delete rows from a table. Succeeds whether or not the named rows were
    * present.
    */
  var delete: js.UndefOr[Schema$Delete] = js.native
  /**
    * Insert new rows in a table. If any of the rows already exist, the write
    * or transaction fails with error `ALREADY_EXISTS`.
    */
  var insert: js.UndefOr[Schema$Write] = js.native
  /**
    * Like insert, except that if the row already exists, then its column
    * values are overwritten with the ones provided. Any column values not
    * explicitly written are preserved.
    */
  var insertOrUpdate: js.UndefOr[Schema$Write] = js.native
  /**
    * Like insert, except that if the row already exists, it is deleted, and
    * the column values provided are inserted instead. Unlike insert_or_update,
    * this means any values not explicitly written become `NULL`.
    */
  var replace: js.UndefOr[Schema$Write] = js.native
  /**
    * Update existing rows in a table. If any of the rows does not already
    * exist, the transaction fails with error `NOT_FOUND`.
    */
  var update: js.UndefOr[Schema$Write] = js.native
}

object Schema$Mutation {
  @scala.inline
  def apply(
    delete: Schema$Delete = null,
    insert: Schema$Write = null,
    insertOrUpdate: Schema$Write = null,
    replace: Schema$Write = null,
    update: Schema$Write = null
  ): Schema$Mutation = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (insertOrUpdate != null) __obj.updateDynamic("insertOrUpdate")(insertOrUpdate.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Mutation]
  }
}


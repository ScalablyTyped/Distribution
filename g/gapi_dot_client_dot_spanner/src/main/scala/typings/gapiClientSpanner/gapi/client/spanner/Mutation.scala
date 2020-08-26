package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mutation extends js.Object {
  /**
    * Delete rows from a table. Succeeds whether or not the named
    * rows were present.
    */
  var delete: js.UndefOr[Delete] = js.native
  /**
    * Insert new rows in a table. If any of the rows already exist,
    * the write or transaction fails with error `ALREADY_EXISTS`.
    */
  var insert: js.UndefOr[Write] = js.native
  /**
    * Like insert, except that if the row already exists, then
    * its column values are overwritten with the ones provided. Any
    * column values not explicitly written are preserved.
    */
  var insertOrUpdate: js.UndefOr[Write] = js.native
  /**
    * Like insert, except that if the row already exists, it is
    * deleted, and the column values provided are inserted
    * instead. Unlike insert_or_update, this means any values not
    * explicitly written become `NULL`.
    */
  var replace: js.UndefOr[Write] = js.native
  /**
    * Update existing rows in a table. If any of the rows does not
    * already exist, the transaction fails with error `NOT_FOUND`.
    */
  var update: js.UndefOr[Write] = js.native
}

object Mutation {
  @scala.inline
  def apply(): Mutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutation]
  }
  @scala.inline
  implicit class MutationOps[Self <: Mutation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Delete): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setInsert(value: Write): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setInsertOrUpdate(value: Write): Self = this.set("insertOrUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertOrUpdate: Self = this.set("insertOrUpdate", js.undefined)
    @scala.inline
    def setReplace(value: Write): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setUpdate(value: Write): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}


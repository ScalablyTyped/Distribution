package typings.documentdb.mod

import typings.documentdb.documentdbStrings.all_
import typings.documentdb.documentdbStrings.create_
import typings.documentdb.documentdbStrings.delete_
import typings.documentdb.documentdbStrings.replace_
import typings.documentdb.documentdbStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.All
  - typings.documentdb.documentdbStrings.Create
  - typings.documentdb.documentdbStrings.Update
  - typings.documentdb.documentdbStrings.Delete
  - typings.documentdb.documentdbStrings.Replace
  - typings.documentdb.documentdbStrings.all_
  - typings.documentdb.documentdbStrings.create_
  - typings.documentdb.documentdbStrings.update_
  - typings.documentdb.documentdbStrings.delete_
  - typings.documentdb.documentdbStrings.replace_
*/
trait TriggerOperation extends js.Object

object TriggerOperation {
  @scala.inline
  def All: typings.documentdb.documentdbStrings.All = this.cast("All")
  @scala.inline
  def Create: typings.documentdb.documentdbStrings.Create = this.cast("Create")
  @scala.inline
  def Delete: typings.documentdb.documentdbStrings.Delete = this.cast("Delete")
  @scala.inline
  def Replace: typings.documentdb.documentdbStrings.Replace = this.cast("Replace")
  @scala.inline
  def Update: typings.documentdb.documentdbStrings.Update = this.cast("Update")
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: create_ = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def replace: replace_ = this.cast("replace")
  @scala.inline
  def update: update_ = this.cast("update")
}

